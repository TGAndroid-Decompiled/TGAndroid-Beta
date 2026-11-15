package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.k10;
public final class cc implements ValueAnimator.AnimatorUpdateListener {
    public final int f8374a;
    public final int f8375b;
    public final int f8376c;
    public final int d;
    public final int f8377e;
    public final View f8378f;

    public cc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f8374a = i13;
        this.f8378f = view;
        this.f8375b = i7;
        this.f8376c = i10;
        this.d = i11;
        this.f8377e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f8374a;
        int i10 = this.f8377e;
        int i11 = this.d;
        int i12 = this.f8376c;
        int i13 = this.f8375b;
        View view = this.f8378f;
        switch (i7) {
            case 0:
                fc fcVar = (fc) view;
                fcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fcVar.f8587r = i0.a.f(floatValue, i13, i12);
                fcVar.f8588s = i0.a.f(floatValue, i11, i10);
                fcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{fcVar.f8587r, fcVar.f8588s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fcVar.invalidate();
                return;
            case 1:
                k10 k10Var = (k10) view;
                k10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                k10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                k10Var.G.setColorFilter(new PorterDuffColorFilter(k10Var.M, PorterDuff.Mode.MULTIPLY));
                k10Var.F.setColor(k10Var.M);
                k10Var.f36221r.setColor(k10Var.N);
                k10Var.K.d(i0.a.o(k10Var.N, 38));
                k10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) view;
                zVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                zVar.G0 = f10;
                zVar.U.setColor(f10);
                if (zVar.T > 0.0f) {
                    zVar.invalidate();
                    return;
                }
                return;
        }
    }
}
