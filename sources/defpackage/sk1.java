package defpackage;

import android.animation.ValueAnimator;
public final class sk1 {
    public final byte a;
    public int b;
    public float c;
    public float d;
    public ValueAnimator e;
    public float f = 0.0f;
    public final uk1 g;

    public sk1(uk1 uk1Var, int i) {
        this.g = uk1Var;
        this.a = i;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(pf0.D1);
        this.e.addUpdateListener(new g0(this, (byte) 27));
        this.e.start();
    }
}
