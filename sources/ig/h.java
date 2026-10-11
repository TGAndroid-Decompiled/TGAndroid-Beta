package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f12201a;
    public int f12202b;
    public float f12203c;
    public float d;
    public ValueAnimator f12204e;
    public float f12205f = 0.0f;
    public final j f12206g;

    public h(j jVar, int i10) {
        this.f12206g = jVar;
        this.f12201a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12204e = ofFloat;
        ofFloat.setDuration(600L);
        this.f12204e.setInterpolator(g.C1);
        this.f12204e.addUpdateListener(new ai.a(this, 27));
        this.f12204e.start();
    }
}
