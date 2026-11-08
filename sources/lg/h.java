package lg;

import android.animation.ValueAnimator;
import fi.v3;
public final class h {
    public final int f18332a;
    public int f18333b;
    public float f18334c;
    public float d;
    public ValueAnimator f18335e;
    public float f18336f = 0.0f;
    public final j f18337g;

    public h(j jVar, int i7) {
        this.f18337g = jVar;
        this.f18332a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18335e = ofFloat;
        ofFloat.setDuration(600L);
        this.f18335e.setInterpolator(g.C1);
        this.f18335e.addUpdateListener(new v3(this, 7));
        this.f18335e.start();
    }
}
