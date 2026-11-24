package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
public final class ux1 implements Runnable {
    public final k27 a;
    public final long b;
    public final TL_keyboard.KeyboardButtonProto c;
    public final k27 d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f;

    public ux1(ChatActivityEnterView chatActivityEnterView, k27 k27Var, long j, TL_keyboard.KeyboardButtonProto keyboardButtonProto, k27 k27Var2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = k27Var;
        this.b = j;
        this.c = keyboardButtonProto;
        this.d = k27Var2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i;
        long c7;
        String C1;
        ChatActivityEnterView chatActivityEnterView = this.f;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (chatActivityEnterView.c2.Q() <= gl.L(20.0f) && !chatActivityEnterView.Q0()) {
            if (mu1Var != null) {
                int i2 = chatActivityEnterView.R;
                long j = this.a.k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c = jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                k27 k27Var = this.d;
                if (k27Var != null) {
                    i = k27Var.k.id;
                } else {
                    i = 0;
                }
                if (mu1Var == null) {
                    c7 = 0;
                } else {
                    c7 = mu1Var.c7();
                }
                quc b = quc.b(i2, j, this.b, text, url, c ? 1 : 0, i, c7, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
                    ep0 ep0Var = chatActivityEnterView.m0;
                    if (ep0Var != null) {
                        ep0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.e;
                if (user == null) {
                    C1 = null;
                } else {
                    C1 = na7.q1(chatActivityEnterView.R).C1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(C1)) {
                    na7.q1(chatActivityEnterView.R);
                    na7.X4(C1, mu1Var);
                    return;
                }
                ow0 ow0Var = new ow0(chatActivityEnterView.getContext(), chatActivityEnterView.L4);
                ow0Var.m0 = chatActivityEnterView.E3;
                ow0Var.x(mu1Var, b);
                ow0Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.J0(false);
        gl.t1(chatActivityEnterView);
        gl.d3(this, 150L);
    }
}
