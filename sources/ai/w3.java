package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w3 extends AnimatorListenerAdapter {
    public final int f1851a;
    public final f6 f1852b;

    public w3(f6 f6Var, int i10) {
        this.f1851a = i10;
        this.f1852b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d4 d4Var;
        Runnable runnable;
        switch (this.f1851a) {
            case 0:
                f6 f6Var = this.f1852b;
                f6Var.f1008t3 = 0.0f;
                f6Var.f1002r3.setAlpha(1.0f);
                f6Var.f1002r3.setVisibility(8);
                f6Var.f1002r3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.f1852b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.f992o2;
                b4 b4Var = f6Var2.f952b2;
                if (b4Var != null && (runnable = b4Var.f24005w) != null) {
                    runnable.run();
                    b4Var.f24005w = null;
                }
                if (f6Var2.K1 && !f6Var2.f1013v2) {
                    kc kcVar = ((bc) f6Var2.Q1).d;
                    if (kcVar.f1306x) {
                        kcVar.f1306x = false;
                        kcVar.P();
                    }
                }
                if (!f6Var2.f1013v2 && (d4Var = f6Var2.f961d3) != null) {
                    d4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                return;
        }
    }
}
