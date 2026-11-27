package defpackage;

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ew1 implements lq0, fd, vt3, l8 {
    public final ChatActivityEnterView a;

    public ew1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override
    public final void c() {
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.d1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nx1 nx1Var;
        int i = ChatActivityEnterView.X7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nx1Var = (chatActivityEnterView = this.a).O0) != null && nx1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override
    public final void w(id idVar, int i) {
        int i2 = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.T();
        tx1 tx1Var = chatActivityEnterView.F0;
        if (tx1Var != null) {
            tx1Var.setText("");
        }
    }
}
