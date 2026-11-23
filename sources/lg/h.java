package lg;

import android.animation.ValueAnimator;
import hi.j3;
public final class h {
    public final int f19860a;
    public int f19861b;
    public float f19862c;
    public float d;
    public ValueAnimator f19863e;
    public float f19864f = 0.0f;
    public final j f19865g;

    public h(j jVar, int i7) {
        this.f19865g = jVar;
        this.f19860a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19863e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19863e.setInterpolator(g.D1);
        this.f19863e.addUpdateListener(new j3(this, 8));
        this.f19863e.start();
    }
}
