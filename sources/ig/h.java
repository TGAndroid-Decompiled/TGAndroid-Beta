package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f11172a;
    public int f11173b;
    public float f11174c;
    public float d;
    public ValueAnimator e;
    public float f11175f = 0.0f;
    public final j f11176g;

    public h(j jVar, int i10) {
        this.f11176g = jVar;
        this.f11172a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new ai.a(this, 27));
        this.e.start();
    }
}
