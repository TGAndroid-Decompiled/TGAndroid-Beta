package defpackage;

import android.animation.ValueAnimator;
public final class d3b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final k3b b;
    public final float c;
    public final float d;

    public d3b(k3b k3bVar, float f, float f2, byte b) {
        this.a = b;
        this.b = k3bVar;
        this.c = f;
        this.d = f2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        k3b k3bVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3bVar.setScrollY((int) gl.R1(f2, 0.0f, floatValue));
                j3b j3bVar = k3bVar.b0;
                j3bVar.x = gl.R1(f, 0.0f, floatValue);
                j3bVar.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3bVar.setScrollY((int) gl.R1(f2, Math.min((k3bVar.getMeasuredHeight() - k3bVar.u0) - gl.L(64.0f), k3bVar.r0.getBottom() - k3bVar.getMeasuredHeight()), floatValue2));
                j3b j3bVar2 = k3bVar.b0;
                j3bVar2.x = gl.R1(f, 1.0f, floatValue2);
                j3bVar2.invalidate();
                return;
        }
    }
}
