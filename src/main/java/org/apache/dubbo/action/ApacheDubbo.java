package org.apache.dubbo.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

/**
 * @author zhaoyunxing
 * @date 2022-02-07 16:01:48
 */
public class ApacheDubbo extends AnAction {

    public void actionPerformed(@NotNull AnActionEvent event) {

//        JBPopup popup = JBPopupFactory.getInstance().createMessage("Hello apache dubbo");
//
//        popup.showInBestPositionFor(event.getDataContext());

        Hello hello = new Hello();

        hello.pack();
        hello.setVisible(true);
    }
}
