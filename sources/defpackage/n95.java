package defpackage;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class n95 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final View f;

    public n95(View view, int i, int i2, int i3, int i4, byte b) {
        this.a = b;
        this.f = view;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        int i4 = this.b;
        View view = this.f;
        switch (b) {
            case 0:
                o95 o95Var = (o95) view;
                o95Var.M = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i4, i3);
                o95Var.N = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                o95Var.G.setColorFilter(new PorterDuffColorFilter(o95Var.M, PorterDuff.Mode.MULTIPLY));
                o95Var.F.setColor(o95Var.M);
                o95Var.r.setColor(o95Var.N);
                o95Var.K.d(vm2.o(o95Var.N, 38));
                o95Var.invalidate();
                return;
            case 1:
                ka5 ka5Var = (ka5) view;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ka5Var.B0 = vm2.f(floatValue, i4, i3);
                int f = vm2.f(floatValue, i2, i);
                ka5Var.D0 = f;
                ka5Var.T.setColor(f);
                if (ka5Var.S > 0.0f) {
                    ka5Var.invalidate();
                    return;
                }
                return;
            default:
                b0b b0bVar = (b0b) view;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0bVar.r = vm2.f(floatValue2, i4, i3);
                b0bVar.s = vm2.f(floatValue2, i2, i);
                b0bVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{b0bVar.r, b0bVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                b0bVar.invalidate();
                return;
        }
    }
}
