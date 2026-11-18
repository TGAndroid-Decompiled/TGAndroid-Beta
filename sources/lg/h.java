package lg;

import android.animation.ValueAnimator;
import hi.k3;
public final class h {
    public final int f19832a;
    public int f19833b;
    public float f19834c;
    public float d;
    public ValueAnimator f19835e;
    public float f19836f = 0.0f;
    public final j f19837g;

    public h(j jVar, int i7) {
        this.f19837g = jVar;
        this.f19832a = i7;
    }

    public final void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19835e = ofFloat;
        ofFloat.setDuration(600L);
        this.f19835e.setInterpolator(g.D1);
        this.f19835e.addUpdateListener(new k3(this, 8));
        this.f19835e.start();
    }
}
