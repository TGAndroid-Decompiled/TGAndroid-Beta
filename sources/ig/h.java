package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f11162a;
    public int f11163b;
    public float f11164c;
    public float d;
    public ValueAnimator e;
    public float f11165f = 0.0f;
    public final j f11166g;

    public h(j jVar, int i10) {
        this.f11166g = jVar;
        this.f11162a = i10;
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
