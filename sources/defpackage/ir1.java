package defpackage;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ir1 implements Runnable {
    public final byte a;
    public final mu1 b;

    public ir1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void run() {
        ez1 ez1Var;
        FrameLayout frameLayout;
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = mu1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    mu1Var.sa.start();
                    return;
                }
                return;
            default:
                if (mu1Var.d3 == this && (ez1Var = mu1Var.b1) != null && (frameLayout = mu1Var.c3) != null) {
                    ez1Var.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
