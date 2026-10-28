package kg;

import android.animation.ValueAnimator;
import fi.e4;
public final class i {
    public final int f16627a;
    public int f16628b;
    public float f16629c;
    public float d;
    public ValueAnimator e;
    public float f16630f = 0.0f;
    public final k f16631g;

    public i(k kVar, int i10) {
        this.f16631g = kVar;
        this.f16627a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(h.C1);
        this.e.addUpdateListener(new e4(this, 8));
        this.e.start();
    }
}
