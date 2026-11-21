package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x5 extends AnimatorListenerAdapter {
    public final int f10039a;
    public final z5 f10040b;

    public x5(z5 z5Var, int i7) {
        this.f10039a = i7;
        this.f10040b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10039a) {
            case 0:
                this.f10040b.f10155k0 = false;
                return;
            case 1:
                this.f10040b.f10155k0 = false;
                return;
            case 2:
                this.f10040b.P.setVisibility(4);
                return;
            case 3:
                z5 z5Var = this.f10040b;
                z5Var.f10175z0 = z5Var.f10174y0;
                z5Var.d(z5Var.f10143b0);
                return;
            default:
                z5 z5Var2 = this.f10040b;
                z5Var2.A0 = 1.0f;
                z5Var2.f10142b.setScaleX(1.0f);
                z5Var2.f10142b.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                return;
        }
    }
}
