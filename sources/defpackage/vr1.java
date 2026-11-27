package defpackage;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class vr1 implements Runnable {
    public final byte a;
    public final zu1 b;

    public vr1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void run() {
        wz1 wz1Var;
        FrameLayout frameLayout;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = zu1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    zu1Var.sa.start();
                    return;
                }
                return;
            default:
                if (zu1Var.d3 == this && (wz1Var = zu1Var.b1) != null && (frameLayout = zu1Var.c3) != null) {
                    wz1Var.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
