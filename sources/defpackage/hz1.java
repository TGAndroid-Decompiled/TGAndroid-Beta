package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
public final class hz1 implements Runnable {
    public final k47 a;
    public final long b;
    public final TL_keyboard.KeyboardButtonProto c;
    public final k47 d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f;

    public hz1(ChatActivityEnterView chatActivityEnterView, k47 k47Var, long j, TL_keyboard.KeyboardButtonProto keyboardButtonProto, k47 k47Var2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = k47Var;
        this.b = j;
        this.c = keyboardButtonProto;
        this.d = k47Var2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i;
        long k7;
        String D1;
        ChatActivityEnterView chatActivityEnterView = this.f;
        yv1 yv1Var = chatActivityEnterView.F3;
        if (chatActivityEnterView.c2.Q() <= gm.L(20.0f) && !chatActivityEnterView.R0()) {
            if (yv1Var != null) {
                int i2 = chatActivityEnterView.R;
                long j = this.a.k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c = kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                k47 k47Var = this.d;
                if (k47Var != null) {
                    i = k47Var.k.id;
                } else {
                    i = 0;
                }
                if (yv1Var == null) {
                    k7 = 0;
                } else {
                    k7 = yv1Var.k7();
                }
                rwc b = rwc.b(i2, j, this.b, text, url, c ? 1 : 0, i, k7, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
                    eq0 eq0Var = chatActivityEnterView.m0;
                    if (eq0Var != null) {
                        eq0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.e;
                if (user == null) {
                    D1 = null;
                } else {
                    D1 = oc7.r1(chatActivityEnterView.R).D1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(D1)) {
                    oc7.r1(chatActivityEnterView.R);
                    oc7.Z4(D1, yv1Var);
                    return;
                }
                wx0 wx0Var = new wx0(chatActivityEnterView.getContext(), chatActivityEnterView.L4);
                wx0Var.m0 = chatActivityEnterView.E3;
                wx0Var.x(yv1Var, b);
                wx0Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.J0(false);
        gm.t1(chatActivityEnterView);
        gm.d3(this, 150L);
    }
}
