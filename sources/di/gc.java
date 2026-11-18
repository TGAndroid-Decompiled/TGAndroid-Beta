package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.r10;
public final class gc implements ValueAnimator.AnimatorUpdateListener {
    public final int f8882a;
    public final int f8883b;
    public final int f8884c;
    public final int d;
    public final int f8885e;
    public final View f8886f;

    public gc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f8882a = i13;
        this.f8886f = view;
        this.f8883b = i7;
        this.f8884c = i10;
        this.d = i11;
        this.f8885e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f8882a;
        int i10 = this.f8885e;
        int i11 = this.d;
        int i12 = this.f8884c;
        int i13 = this.f8883b;
        View view = this.f8886f;
        switch (i7) {
            case 0:
                jc jcVar = (jc) view;
                jcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.f9123r = i0.a.f(floatValue, i13, i12);
                jcVar.f9124s = i0.a.f(floatValue, i11, i10);
                jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9123r, jcVar.f9124s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jcVar.invalidate();
                return;
            case 1:
                r10 r10Var = (r10) view;
                r10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                r10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                r10Var.G.setColorFilter(new PorterDuffColorFilter(r10Var.M, PorterDuff.Mode.MULTIPLY));
                r10Var.F.setColor(r10Var.M);
                r10Var.f38977r.setColor(r10Var.N);
                r10Var.K.d(i0.a.o(r10Var.N, 38));
                r10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) view;
                yVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                yVar.G0 = f10;
                yVar.U.setColor(f10);
                if (yVar.T > 0.0f) {
                    yVar.invalidate();
                    return;
                }
                return;
        }
    }
}
