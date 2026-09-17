package jg;

import ah.d0;
import android.animation.ValueAnimator;
public final class h {
    public final int f13726a;
    public int f13727b;
    public float f13728c;
    public float d;
    public ValueAnimator f13729e;
    public float f13730f = 0.0f;
    public final j f13731g;

    public h(j jVar, int i10) {
        this.f13731g = jVar;
        this.f13726a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13729e = ofFloat;
        ofFloat.setDuration(600L);
        this.f13729e.setInterpolator(g.C1);
        this.f13729e.addUpdateListener(new d0(this, 28));
        this.f13729e.start();
    }
}
