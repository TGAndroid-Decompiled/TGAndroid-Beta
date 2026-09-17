package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f11175a;
    public int f11176b;
    public float f11177c;
    public float d;
    public ValueAnimator e;
    public float f11178f = 0.0f;
    public final j f11179g;

    public h(j jVar, int i10) {
        this.f11179g = jVar;
        this.f11175a = i10;
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
