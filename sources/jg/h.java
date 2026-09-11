package jg;

import ah.d0;
import android.animation.ValueAnimator;
public final class h {
    public final int f13700a;
    public int f13701b;
    public float f13702c;
    public float d;
    public ValueAnimator f13703e;
    public float f13704f = 0.0f;
    public final j f13705g;

    public h(j jVar, int i10) {
        this.f13705g = jVar;
        this.f13700a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13703e = ofFloat;
        ofFloat.setDuration(600L);
        this.f13703e.setInterpolator(g.C1);
        this.f13703e.addUpdateListener(new d0(this, 28));
        this.f13703e.start();
    }
}
