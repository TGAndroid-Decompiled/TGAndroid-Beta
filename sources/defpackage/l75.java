package defpackage;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
public final class l75 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final View f;

    public l75(View view, int i, int i2, int i3, int i4, byte b) {
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
                m75 m75Var = (m75) view;
                m75Var.M = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i4, i3);
                m75Var.N = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                m75Var.G.setColorFilter(new PorterDuffColorFilter(m75Var.M, PorterDuff.Mode.MULTIPLY));
                m75Var.F.setColor(m75Var.M);
                m75Var.r.setColor(m75Var.N);
                m75Var.K.d(bm2.o(m75Var.N, 38));
                m75Var.invalidate();
                return;
            case 1:
                h85 h85Var = (h85) view;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h85Var.B0 = bm2.f(floatValue, i4, i3);
                int f = bm2.f(floatValue, i2, i);
                h85Var.D0 = f;
                h85Var.T.setColor(f);
                if (h85Var.S > 0.0f) {
                    h85Var.invalidate();
                    return;
                }
                return;
            default:
                yva yvaVar = (yva) view;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yvaVar.r = bm2.f(floatValue2, i4, i3);
                yvaVar.s = bm2.f(floatValue2, i2, i);
                yvaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{yvaVar.r, yvaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                yvaVar.invalidate();
                return;
        }
    }
}
