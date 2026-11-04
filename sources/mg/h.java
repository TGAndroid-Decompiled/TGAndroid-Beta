package mg;

import android.animation.ValueAnimator;
import gi.j3;
public final class h {
    public final int f19371a;
    public int f19372b;
    public float f19373c;
    public float d;
    public ValueAnimator f19374e;
    public float f19375f = 0.0f;
    public final j f19376g;

    public h(j jVar, int i3) {
        this.f19376g = jVar;
        this.f19371a = i3;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19374e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19374e.setInterpolator(g.D1);
        this.f19374e.addUpdateListener(new j3(this, 8));
        this.f19374e.start();
    }
}
