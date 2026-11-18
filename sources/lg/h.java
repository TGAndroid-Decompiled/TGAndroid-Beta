package lg;

import android.animation.ValueAnimator;
import hi.k3;
public final class h {
    public final int f19829a;
    public int f19830b;
    public float f19831c;
    public float d;
    public ValueAnimator f19832e;
    public float f19833f = 0.0f;
    public final j f19834g;

    public h(j jVar, int i7) {
        this.f19834g = jVar;
        this.f19829a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19832e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19832e.setInterpolator(g.D1);
        this.f19832e.addUpdateListener(new k3(this, 8));
        this.f19832e.start();
    }
}
