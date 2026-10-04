package ig;

import android.animation.ValueAnimator;
public final class h {
    public final int f12155a;
    public int f12156b;
    public float f12157c;
    public float d;
    public ValueAnimator f12158e;
    public float f12159f = 0.0f;
    public final j f12160g;

    public h(j jVar, int i10) {
        this.f12160g = jVar;
        this.f12155a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12158e = ofFloat;
        ofFloat.setDuration(600L);
        this.f12158e.setInterpolator(g.C1);
        this.f12158e.addUpdateListener(new ai.a(this, 27));
        this.f12158e.start();
    }
}
