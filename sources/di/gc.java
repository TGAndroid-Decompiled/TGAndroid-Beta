package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.s10;
public final class gc implements ValueAnimator.AnimatorUpdateListener {
    public final int f8875a;
    public final int f8876b;
    public final int f8877c;
    public final int d;
    public final int f8878e;
    public final View f8879f;

    public gc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f8875a = i13;
        this.f8879f = view;
        this.f8876b = i7;
        this.f8877c = i10;
        this.d = i11;
        this.f8878e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f8875a;
        int i10 = this.f8878e;
        int i11 = this.d;
        int i12 = this.f8877c;
        int i13 = this.f8876b;
        View view = this.f8879f;
        switch (i7) {
            case 0:
                jc jcVar = (jc) view;
                jcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.f9110r = i0.a.f(floatValue, i13, i12);
                jcVar.f9111s = i0.a.f(floatValue, i11, i10);
                jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9110r, jcVar.f9111s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jcVar.invalidate();
                return;
            case 1:
                s10 s10Var = (s10) view;
                s10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                s10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                s10Var.G.setColorFilter(new PorterDuffColorFilter(s10Var.M, PorterDuff.Mode.MULTIPLY));
                s10Var.F.setColor(s10Var.M);
                s10Var.f39459r.setColor(s10Var.N);
                s10Var.K.d(i0.a.o(s10Var.N, 38));
                s10Var.invalidate();
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
