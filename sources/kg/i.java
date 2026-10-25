package kg;

import android.animation.ValueAnimator;
import fi.e4;
public final class i {
    public final int f16628a;
    public int f16629b;
    public float f16630c;
    public float d;
    public ValueAnimator e;
    public float f16631f = 0.0f;
    public final k f16632g;

    public i(k kVar, int i10) {
        this.f16632g = kVar;
        this.f16628a = i10;
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
