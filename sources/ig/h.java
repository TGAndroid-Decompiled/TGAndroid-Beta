package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f11165a;
    public int f11166b;
    public float f11167c;
    public float d;
    public ValueAnimator e;
    public float f11168f = 0.0f;
    public final j f11169g;

    public h(j jVar, int i10) {
        this.f11169g = jVar;
        this.f11165a = i10;
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
