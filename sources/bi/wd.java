package bi;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.h10;
public final class wd implements ValueAnimator.AnimatorUpdateListener {
    public final int f4997a;
    public final int f4998b;
    public final int f4999c;
    public final int d;
    public final int f5000e;
    public final View f5001f;

    public wd(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f4997a = i13;
        this.f5001f = view;
        this.f4998b = i7;
        this.f4999c = i10;
        this.d = i11;
        this.f5000e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f4997a;
        int i10 = this.f5000e;
        int i11 = this.d;
        int i12 = this.f4999c;
        int i13 = this.f4998b;
        View view = this.f5001f;
        switch (i7) {
            case 0:
                zd zdVar = (zd) view;
                zdVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.f5209r = i0.a.f(floatValue, i13, i12);
                zdVar.f5210s = i0.a.f(floatValue, i11, i10);
                zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.f5209r, zdVar.f5210s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                zdVar.invalidate();
                return;
            case 1:
                h10 h10Var = (h10) view;
                h10Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                h10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                h10Var.F.setColorFilter(new PorterDuffColorFilter(h10Var.L, PorterDuff.Mode.MULTIPLY));
                h10Var.E.setColor(h10Var.L);
                h10Var.f34145r.setColor(h10Var.M);
                h10Var.J.d(i0.a.o(h10Var.M, 38));
                h10Var.invalidate();
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
