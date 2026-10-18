package jg;

import android.animation.ValueAnimator;
import ei.i6;
public final class h {
    public final int f14490a;
    public int f14491b;
    public float f14492c;
    public float d;
    public ValueAnimator e;
    public float f14493f = 0.0f;
    public final j f14494g;

    public h(j jVar, int i10) {
        this.f14494g = jVar;
        this.f14490a = i10;
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
