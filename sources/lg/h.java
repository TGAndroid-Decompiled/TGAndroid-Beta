package lg;

import android.animation.ValueAnimator;
import hi.j3;
public final class h {
    public final int f19465a;
    public int f19466b;
    public float f19467c;
    public float d;
    public ValueAnimator f19468e;
    public float f19469f = 0.0f;
    public final j f19470g;

    public h(j jVar, int i7) {
        this.f19470g = jVar;
        this.f19465a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19468e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19468e.setInterpolator(g.D1);
        this.f19468e.addUpdateListener(new j3(this, 8));
        this.f19468e.start();
    }
}
