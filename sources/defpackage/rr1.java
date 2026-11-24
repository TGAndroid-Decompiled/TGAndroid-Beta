package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class rr1 implements LayoutTransition.TransitionListener {
    public qr1 a;
    public int b;
    public final r6 c;
    public final mu1 d;

    public rr1(mu1 mu1Var, r6 r6Var) {
        this.d = mu1Var;
        this.c = r6Var;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0 && this.a != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this.a);
            this.a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        if (this.b == 0 && this.a == null) {
            this.a = new qr1(this, (byte) 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
