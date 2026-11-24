package defpackage;

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dx1 implements lr0, ee, ou3, k8 {
    public final ChatActivityEnterView a;

    public dx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void m() {
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.c1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        my1 my1Var;
        int i = ChatActivityEnterView.z7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (my1Var = (chatActivityEnterView = this.a).O0) != null && my1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override
    public final void r(he heVar, int i) {
        int i2 = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.Q();
        sy1 sy1Var = chatActivityEnterView.F0;
        if (sy1Var != null) {
            sy1Var.setText("");
        }
    }
}
