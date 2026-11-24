package defpackage;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class us1 implements Runnable {
    public final byte a;
    public final yv1 b;

    public us1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        r02 r02Var;
        FrameLayout frameLayout;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = yv1Var.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    yv1Var.sa.start();
                    return;
                }
                return;
            default:
                if (yv1Var.d3 == this && (r02Var = yv1Var.b1) != null && (frameLayout = yv1Var.c3) != null) {
                    r02Var.j(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
