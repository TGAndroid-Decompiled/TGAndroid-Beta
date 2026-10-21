package ai;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.z20;
public final class fe implements ValueAnimator.AnimatorUpdateListener {
    public final int f1329a;
    public final int f1330b;
    public final int f1331c;
    public final int d;
    public final int e;
    public final View f1332f;

    public fe(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f1329a = i14;
        this.f1332f = view;
        this.f1330b = i10;
        this.f1331c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f1329a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f1331c;
        int i14 = this.f1330b;
        View view = this.f1332f;
        switch (i10) {
            case 0:
                ie ieVar = (ie) view;
                ieVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ieVar.f1533r = i0.a.f(floatValue, i14, i13);
                ieVar.f1534s = i0.a.f(floatValue, i12, i11);
                ieVar.f1537y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.f1533r, ieVar.f1534s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                ieVar.invalidate();
                return;
            case 1:
                z20 z20Var = (z20) view;
                z20Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                z20Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                z20Var.F.setColorFilter(new PorterDuffColorFilter(z20Var.L, PorterDuff.Mode.MULTIPLY));
                z20Var.E.setColor(z20Var.L);
                z20Var.f32813r.setColor(z20Var.M);
                z20Var.J.d(i0.a.o(z20Var.M, 38));
                z20Var.invalidate();
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
