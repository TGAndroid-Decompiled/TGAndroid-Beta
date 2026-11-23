package lg;

import android.animation.ValueAnimator;
import hi.j3;
public final class h {
    public final int f19826a;
    public int f19827b;
    public float f19828c;
    public float d;
    public ValueAnimator f19829e;
    public float f19830f = 0.0f;
    public final j f19831g;

    public h(j jVar, int i7) {
        this.f19831g = jVar;
        this.f19826a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19829e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19829e.setInterpolator(g.D1);
        this.f19829e.addUpdateListener(new j3(this, 8));
        this.f19829e.start();
    }
}
