package defpackage;

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qv1 implements lq0, ed, et3, k8 {
    public final ChatActivityEnterView a;

    public qv1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void m() {
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.P0(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        zw1 zw1Var;
        int i = ChatActivityEnterView.r7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zw1Var = (chatActivityEnterView = this.a).O0) != null && zw1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2 = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.R();
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var != null) {
            ex1Var.setText("");
        }
    }
}
