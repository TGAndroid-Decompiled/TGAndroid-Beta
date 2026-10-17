package jg;

import android.animation.ValueAnimator;
import ei.i6;
public final class h {
    public final int f14485a;
    public int f14486b;
    public float f14487c;
    public float d;
    public ValueAnimator e;
    public float f14488f = 0.0f;
    public final j f14489g;

    public h(j jVar, int i10) {
        this.f14489g = jVar;
        this.f14485a = i10;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = ofFloat;
        ofFloat.setDuration(600L);
        this.e.setInterpolator(g.C1);
        this.e.addUpdateListener(new i6(this, 5));
        this.e.start();
    }
}
