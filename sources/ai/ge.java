package ai;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.x20;
public final class ge implements ValueAnimator.AnimatorUpdateListener {
    public final int f1371a;
    public final int f1372b;
    public final int f1373c;
    public final int d;
    public final int e;
    public final View f1374f;

    public ge(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f1371a = i14;
        this.f1374f = view;
        this.f1372b = i10;
        this.f1373c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f1371a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f1373c;
        int i14 = this.f1372b;
        View view = this.f1374f;
        switch (i10) {
            case 0:
                je jeVar = (je) view;
                jeVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jeVar.f1590r = i0.a.f(floatValue, i14, i13);
                jeVar.f1591s = i0.a.f(floatValue, i12, i11);
                jeVar.f1594y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jeVar.f1590r, jeVar.f1591s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jeVar.invalidate();
                return;
            case 1:
                x20 x20Var = (x20) view;
                x20Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                x20Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                x20Var.F.setColorFilter(new PorterDuffColorFilter(x20Var.L, PorterDuff.Mode.MULTIPLY));
                x20Var.E.setColor(x20Var.L);
                x20Var.f32489r.setColor(x20Var.M);
                x20Var.J.d(i0.a.o(x20Var.M, 38));
                x20Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.D0 = i0.a.f(floatValue2, i14, i13);
                int f7 = i0.a.f(floatValue2, i12, i11);
                tVar.F0 = f7;
                tVar.T.setColor(f7);
                if (tVar.S > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
        }
    }
}
