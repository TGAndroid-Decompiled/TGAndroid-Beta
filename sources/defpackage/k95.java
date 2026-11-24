package defpackage;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class k95 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final View f;

    public k95(View view, int i, int i2, int i3, int i4, byte b) {
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
                l95 l95Var = (l95) view;
                l95Var.M = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i4, i3);
                l95Var.N = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                l95Var.G.setColorFilter(new PorterDuffColorFilter(l95Var.M, PorterDuff.Mode.MULTIPLY));
                l95Var.F.setColor(l95Var.M);
                l95Var.r.setColor(l95Var.N);
                l95Var.K.d(on2.p(l95Var.N, 38));
                l95Var.invalidate();
                return;
            case 1:
                ha5 ha5Var = (ha5) view;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ha5Var.B0 = on2.f(floatValue, i4, i3);
                int f = on2.f(floatValue, i2, i);
                ha5Var.D0 = f;
                ha5Var.T.setColor(f);
                if (ha5Var.S > 0.0f) {
                    ha5Var.invalidate();
                    return;
                }
                return;
            default:
                bya byaVar = (bya) view;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                byaVar.r = on2.f(floatValue2, i4, i3);
                byaVar.s = on2.f(floatValue2, i2, i);
                byaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{byaVar.r, byaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                byaVar.invalidate();
                return;
        }
    }
}
