package defpackage;

import android.animation.AnimatorSet;
import android.os.SystemClock;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dy1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public dy1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        long j;
        long j2;
        long j3;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                dy1 dy1Var = chatActivityEnterView.h4;
                if ((!chatActivityEnterView.G0() || !chatActivityEnterView.y()) && !d.hasSheets(chatActivityEnterView.F3) && !chatActivityEnterView.O2 && chatActivityEnterView.F0 != null && chatActivityEnterView.a4 && !chatActivityEnterView.p3 && !gm.D && !gm.E) {
                    uz1 uz1Var = chatActivityEnterView.P3;
                    if (uz1Var != null) {
                        uz1Var.W0();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    gm.E3(chatActivityEnterView.F0);
                    gm.r(dy1Var);
                    gm.d3(dy1Var, 100L);
                    return;
                }
                return;
            case 1:
                lo3 lo3Var = chatActivityEnterView.n6;
                if (lo3Var != null && lo3Var.d) {
                    long j4 = lo3Var.e;
                    if (j4 == 0) {
                        j3 = 0;
                    } else {
                        long j5 = j4 + lo3Var.a;
                        if (lo3Var.C) {
                            j2 = 180;
                        } else {
                            j2 = 0;
                        }
                        j3 = j5 + j2;
                    }
                    j = j3 - SystemClock.uptimeMillis();
                } else {
                    j = 0;
                }
                if (j > 0) {
                    gm.d3(this, j + 16);
                    return;
                }
                chatActivityEnterView.r6 = null;
                chatActivityEnterView.p6 = false;
                chatActivityEnterView.q6 = true;
                chatActivityEnterView.s6 = SystemClock.uptimeMillis();
                lo3 lo3Var2 = chatActivityEnterView.n6;
                if (lo3Var2 != null) {
                    lo3Var2.c();
                }
                try {
                    chatActivityEnterView.w1();
                    return;
                } finally {
                    chatActivityEnterView.q6 = false;
                    gm.d3(new gx1(chatActivityEnterView, (byte) 18), 450L);
                }
            default:
                AnimatorSet animatorSet = chatActivityEnterView.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView.W0.start();
                    return;
                }
                return;
        }
    }
}
