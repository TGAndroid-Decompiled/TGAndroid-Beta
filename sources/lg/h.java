package lg;

import android.animation.ValueAnimator;
import hi.j3;
public final class h {
    public final int f19857a;
    public int f19858b;
    public float f19859c;
    public float d;
    public ValueAnimator f19860e;
    public float f19861f = 0.0f;
    public final j f19862g;

    public h(j jVar, int i7) {
        this.f19862g = jVar;
        this.f19857a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19860e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19860e.setInterpolator(g.D1);
        this.f19860e.addUpdateListener(new j3(this, 8));
        this.f19860e.start();
    }
}
