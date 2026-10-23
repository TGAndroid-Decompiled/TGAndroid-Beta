package jg;

import android.animation.ValueAnimator;
import ei.i6;
public final class h {
    public final int f14535a;
    public int f14536b;
    public float f14537c;
    public float d;
    public ValueAnimator e;
    public float f14538f = 0.0f;
    public final j f14539g;

    public h(j jVar, int i10) {
        this.f14539g = jVar;
        this.f14535a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new i6(this, 5));
        this.e.start();
    }
}
