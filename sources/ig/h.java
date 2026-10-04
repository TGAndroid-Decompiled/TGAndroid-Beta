package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f12154a;
    public int f12155b;
    public float f12156c;
    public float d;
    public ValueAnimator f12157e;
    public float f12158f = 0.0f;
    public final j f12159g;

    public h(j jVar, int i10) {
        this.f12159g = jVar;
        this.f12154a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12157e = ofFloat;
        ofFloat.setDuration(600L);
        this.f12157e.setInterpolator(g.C1);
        this.f12157e.addUpdateListener(new ai.a(this, 27));
        this.f12157e.start();
    }
}
