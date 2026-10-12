package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f12200a;
    public int f12201b;
    public float f12202c;
    public float d;
    public ValueAnimator f12203e;
    public float f12204f = 0.0f;
    public final j f12205g;

    public h(j jVar, int i10) {
        this.f12205g = jVar;
        this.f12200a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12203e = ofFloat;
        ofFloat.setDuration(600L);
        this.f12203e.setInterpolator(g.C1);
        this.f12203e.addUpdateListener(new ai.a(this, 27));
        this.f12203e.start();
    }
}
