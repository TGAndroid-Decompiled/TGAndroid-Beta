package bi;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.g10;
public final class wd implements ValueAnimator.AnimatorUpdateListener {
    public final int f4999a;
    public final int f5000b;
    public final int f5001c;
    public final int d;
    public final int f5002e;
    public final View f5003f;

    public wd(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f4999a = i13;
        this.f5003f = view;
        this.f5000b = i7;
        this.f5001c = i10;
        this.d = i11;
        this.f5002e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f4999a;
        int i10 = this.f5002e;
        int i11 = this.d;
        int i12 = this.f5001c;
        int i13 = this.f5000b;
        View view = this.f5003f;
        switch (i7) {
            case 0:
                zd zdVar = (zd) view;
                zdVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.f5211r = i0.a.f(floatValue, i13, i12);
                zdVar.f5212s = i0.a.f(floatValue, i11, i10);
                zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.f5211r, zdVar.f5212s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                zdVar.invalidate();
                return;
            case 1:
                g10 g10Var = (g10) view;
                g10Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                g10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                g10Var.F.setColorFilter(new PorterDuffColorFilter(g10Var.L, PorterDuff.Mode.MULTIPLY));
                g10Var.E.setColor(g10Var.L);
                g10Var.f33717r.setColor(g10Var.M);
                g10Var.J.d(i0.a.o(g10Var.M, 38));
                g10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) view;
                yVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.D0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                yVar.F0 = f10;
                yVar.T.setColor(f10);
                if (yVar.S > 0.0f) {
                    yVar.invalidate();
                    return;
                }
                return;
        }
    }
}
