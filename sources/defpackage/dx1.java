package defpackage;

import android.animation.AnimatorSet;
import android.os.SystemClock;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dx1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public dx1(ChatActivityEnterView chatActivityEnterView, byte b) {
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
                dx1 dx1Var = chatActivityEnterView.g4;
                if ((!chatActivityEnterView.K0() || !chatActivityEnterView.A()) && !e.hasSheets(chatActivityEnterView.E3) && !chatActivityEnterView.N2 && chatActivityEnterView.F0 != null && chatActivityEnterView.Z3 && !chatActivityEnterView.o3 && !hl.D && !hl.E) {
                    xy1 xy1Var = chatActivityEnterView.O3;
                    if (xy1Var != null) {
                        xy1Var.X0();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    hl.E3(chatActivityEnterView.F0);
                    hl.r(dx1Var);
                    hl.d3(dx1Var, 100L);
                    return;
                }
                return;
            case 1:
                sn3 sn3Var = chatActivityEnterView.z6;
                if (sn3Var != null && sn3Var.d) {
                    long j4 = sn3Var.e;
                    if (j4 == 0) {
                        j3 = 0;
                    } else {
                        long j5 = j4 + sn3Var.a;
                        if (sn3Var.C) {
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
                    hl.d3(this, j + 16);
                    return;
                }
                chatActivityEnterView.D6 = null;
                chatActivityEnterView.B6 = false;
                chatActivityEnterView.C6 = true;
                chatActivityEnterView.E6 = SystemClock.uptimeMillis();
                sn3 sn3Var2 = chatActivityEnterView.z6;
                if (sn3Var2 != null) {
                    sn3Var2.c();
                }
                try {
                    chatActivityEnterView.E1();
                    return;
                } finally {
                    chatActivityEnterView.C6 = false;
                    hl.d3(new fw1(chatActivityEnterView, (byte) 26), 450L);
                }
            case 2:
                bx1 bx1Var = chatActivityEnterView.K0;
                if (!chatActivityEnterView.N2 && !chatActivityEnterView.u3 && chatActivityEnterView.F0 != null && bx1Var != null) {
                    bn3 bn3Var = chatActivityEnterView.j1;
                    if (bn3Var == null || !bn3Var.s()) {
                        if (chatActivityEnterView.F0.length() != 0) {
                            if (bx1Var.getVisibility() == 0 && bx1Var.getAlpha() >= 0.99f && chatActivityEnterView.p2.getVisibility() == 0 && chatActivityEnterView.g3 == null) {
                                chatActivityEnterView.k1(bx1Var);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    int i = chatActivityEnterView.Y6 + 1;
                    chatActivityEnterView.Y6 = i;
                    if (i < 40) {
                        hl.d3(this, 50L);
                        return;
                    }
                    return;
                }
                return;
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
