package hg;

import android.animation.ValueAnimator;
public final class h {
    public final int f9392a;
    public int f9393b;
    public float f9394c;
    public float d;
    public ValueAnimator e;
    public float f9395f = 0.0f;
    public final j f9396g;

    public h(j jVar, int i10) {
        this.f9396g = jVar;
        this.f9392a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new ai.a(this, 13));
        this.e.start();
    }
}
