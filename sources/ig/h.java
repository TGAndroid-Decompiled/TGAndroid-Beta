package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f12202a;
    public int f12203b;
    public float f12204c;
    public float d;
    public ValueAnimator f12205e;
    public float f12206f = 0.0f;
    public final j f12207g;

    public h(j jVar, int i10) {
        this.f12207g = jVar;
        this.f12202a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12205e = ofFloat;
        ofFloat.setDuration(600L);
        this.f12205e.setInterpolator(g.C1);
        this.f12205e.addUpdateListener(new ai.a(this, 27));
        this.f12205e.start();
    }
}
