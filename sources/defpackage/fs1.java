package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class fs1 implements LayoutTransition.TransitionListener {
    public es1 a;
    public int b;
    public final s6 c;
    public final zu1 d;

    public fs1(zu1 zu1Var, s6 s6Var) {
        this.d = zu1Var;
        this.c = s6Var;
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
            this.a = new es1(this, (byte) 0);
            this.c.getViewTreeObserver().addOnPreDrawListener(this.a);
        }
        this.b++;
    }
}
