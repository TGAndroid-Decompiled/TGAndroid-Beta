package defpackage;

import android.animation.AnimatorSet;
import android.os.SystemClock;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qw1 implements Runnable {
    public final byte a;
    public final ChatActivityEnterView b;

    public qw1(ChatActivityEnterView chatActivityEnterView, byte b) {
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
                qw1 qw1Var = chatActivityEnterView.h4;
                if ((!chatActivityEnterView.G0() || !chatActivityEnterView.z()) && !d.hasSheets(chatActivityEnterView.F3) && !chatActivityEnterView.O2 && chatActivityEnterView.F0 != null && chatActivityEnterView.a4 && !chatActivityEnterView.p3 && !gl.D && !gl.E) {
                    hy1 hy1Var = chatActivityEnterView.P3;
                    if (hy1Var != null) {
                        hy1Var.K0();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    gl.F3(chatActivityEnterView.F0);
                    gl.r(qw1Var);
                    gl.e3(qw1Var, 100L);
                    return;
                }
                return;
            case 1:
                bn3 bn3Var = chatActivityEnterView.n6;
                if (bn3Var != null && bn3Var.d) {
                    long j4 = bn3Var.e;
                    if (j4 == 0) {
                        j3 = 0;
                    } else {
                        long j5 = j4 + bn3Var.a;
                        if (bn3Var.C) {
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
                    gl.e3(this, j + 16);
                    return;
                }
                chatActivityEnterView.r6 = null;
                chatActivityEnterView.p6 = false;
                chatActivityEnterView.q6 = true;
                chatActivityEnterView.s6 = SystemClock.uptimeMillis();
                bn3 bn3Var2 = chatActivityEnterView.n6;
                if (bn3Var2 != null) {
                    bn3Var2.c();
                }
                try {
                    chatActivityEnterView.u1();
                    return;
                } finally {
                    chatActivityEnterView.q6 = false;
                    gl.e3(new uv1(chatActivityEnterView, (byte) 17), 450L);
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
