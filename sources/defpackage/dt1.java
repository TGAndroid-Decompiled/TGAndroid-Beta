package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class dt1 implements LayoutTransition.TransitionListener {
    public cc a;
    public int b;
    public final r6 c;
    public final yv1 d;

    public dt1(yv1 yv1Var, r6 r6Var) {
        this.d = yv1Var;
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
            this.a = new cc(this, (byte) 1);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
