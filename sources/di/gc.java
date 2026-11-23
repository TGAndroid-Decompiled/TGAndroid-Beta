package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.u10;
public final class gc implements ValueAnimator.AnimatorUpdateListener {
    public final int f8879a;
    public final int f8880b;
    public final int f8881c;
    public final int d;
    public final int f8882e;
    public final View f8883f;

    public gc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f8879a = i13;
        this.f8883f = view;
        this.f8880b = i7;
        this.f8881c = i10;
        this.d = i11;
        this.f8882e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f8879a;
        int i10 = this.f8882e;
        int i11 = this.d;
        int i12 = this.f8881c;
        int i13 = this.f8880b;
        View view = this.f8883f;
        switch (i7) {
            case 0:
                jc jcVar = (jc) view;
                jcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.f9114r = i0.a.f(floatValue, i13, i12);
                jcVar.f9115s = i0.a.f(floatValue, i11, i10);
                jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9114r, jcVar.f9115s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jcVar.invalidate();
                return;
            case 1:
                u10 u10Var = (u10) view;
                u10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                u10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                u10Var.G.setColorFilter(new PorterDuffColorFilter(u10Var.M, PorterDuff.Mode.MULTIPLY));
                u10Var.F.setColor(u10Var.M);
                u10Var.f40181r.setColor(u10Var.N);
                u10Var.K.d(i0.a.o(u10Var.N, 38));
                u10Var.invalidate();
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
