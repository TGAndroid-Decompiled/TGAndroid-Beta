package bg;

import android.animation.ValueAnimator;
public final class l {
    public final int f2755a;
    public int f2756b;
    public float f2757c;
    public float d;
    public ValueAnimator e;
    public float f2758f = 0.0f;
    public final n f2759g;

    public l(n nVar, int i10) {
        this.f2759g = nVar;
        this.f2755a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(i.C1);
        this.e.addUpdateListener(new k(this, 0));
        this.e.start();
    }
}
