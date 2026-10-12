package jg;

import ah.c0;
import android.animation.ValueAnimator;
public final class h {
    public final int f13074a;
    public int f13075b;
    public float f13076c;
    public float d;
    public ValueAnimator e;
    public float f13077f = 0.0f;
    public final j f13078g;

    public h(j jVar, int i10) {
        this.f13078g = jVar;
        this.f13074a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new c0(this, 28));
        this.e.start();
    }
}
