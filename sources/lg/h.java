package lg;

import android.animation.ValueAnimator;
import hi.s3;
public final class h {
    public final int f19926a;
    public int f19927b;
    public float f19928c;
    public float d;
    public ValueAnimator f19929e;
    public float f19930f = 0.0f;
    public final j f19931g;

    public h(j jVar, int i7) {
        this.f19931g = jVar;
        this.f19926a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19929e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19929e.setInterpolator(g.D1);
        this.f19929e.addUpdateListener(new s3(this, 8));
        this.f19929e.start();
    }
}
