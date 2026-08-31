package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l2 extends AnimatorListenerAdapter {
    public final int f17390a;
    public final f4 f17391b;

    public l2(f4 f4Var, int i10) {
        this.f17390a = i10;
        this.f17391b = f4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        r2 r2Var;
        Runnable runnable;
        switch (this.f17390a) {
            case 0:
                f4 f4Var = this.f17391b;
                f4Var.f17100q3 = 0.0f;
                f4Var.f17094o3.setAlpha(1.0f);
                f4Var.f17094o3.setVisibility(8);
                f4Var.f17094o3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f4 f4Var2 = this.f17391b;
                f4Var2.K2.unlock();
                f4Var2.E2 = f4Var2.f17084l2;
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null && (runnable = p2Var.f24692w) != null) {
                    runnable.run();
                    p2Var.f24692w = null;
                }
                if (f4Var2.H1 && !f4Var2.f17105s2) {
                    i9 i9Var = ((z8) f4Var2.N1).d;
                    if (i9Var.f17302x) {
                        i9Var.f17302x = false;
                        i9Var.P();
                    }
                }
                if (!f4Var2.f17105s2 && (r2Var = f4Var2.f17053a3) != null) {
                    r2Var.setVisibility(8);
                }
                f4Var2.S2 = true;
                f4Var2.invalidate();
                return;
        }
    }
}
