package lg;

import android.animation.ValueAnimator;
import fi.v3;
public final class h {
    public final int f18329a;
    public int f18330b;
    public float f18331c;
    public float d;
    public ValueAnimator f18332e;
    public float f18333f = 0.0f;
    public final j f18334g;

    public h(j jVar, int i7) {
        this.f18334g = jVar;
        this.f18329a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18332e = ofFloat;
        ofFloat.setDuration(600L);
        this.f18332e.setInterpolator(g.C1);
        this.f18332e.addUpdateListener(new v3(this, 7));
        this.f18332e.start();
    }
}
