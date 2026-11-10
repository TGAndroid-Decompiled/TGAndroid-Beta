package lg;

import android.animation.ValueAnimator;
import fi.v3;
public final class h {
    public final int f18335a;
    public int f18336b;
    public float f18337c;
    public float d;
    public ValueAnimator f18338e;
    public float f18339f = 0.0f;
    public final j f18340g;

    public h(j jVar, int i7) {
        this.f18340g = jVar;
        this.f18335a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18338e = ofFloat;
        ofFloat.setDuration(600L);
        this.f18338e.setInterpolator(g.C1);
        this.f18338e.addUpdateListener(new v3(this, 7));
        this.f18338e.start();
    }
}
