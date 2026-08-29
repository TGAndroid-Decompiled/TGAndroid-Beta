package jh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.n20;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f13092a;
    public final int f13093b;
    public final int f13094c;
    public final int d;
    public final int f13095e;
    public final View f13096f;

    public xa(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f13092a = i14;
        this.f13096f = view;
        this.f13093b = i10;
        this.f13094c = i11;
        this.d = i12;
        this.f13095e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f13092a;
        int i11 = this.f13095e;
        int i12 = this.d;
        int i13 = this.f13094c;
        int i14 = this.f13093b;
        View view = this.f13096f;
        switch (i10) {
            case 0:
                ab abVar = (ab) view;
                abVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abVar.f11762r = i0.a.d(floatValue, i14, i13);
                abVar.f11763s = i0.a.d(floatValue, i12, i11);
                abVar.f11766y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{abVar.f11762r, abVar.f11763s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                abVar.invalidate();
                return;
            case 1:
                n20 n20Var = (n20) view;
                n20Var.H = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                n20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                n20Var.B.setColorFilter(new PorterDuffColorFilter(n20Var.H, PorterDuff.Mode.MULTIPLY));
                n20Var.A.setColor(n20Var.H);
                n20Var.f30832r.setColor(n20Var.I);
                n20Var.F.d(i0.a.k(n20Var.I, 38));
                n20Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f34049z0 = i0.a.d(floatValue2, i14, i13);
                int d = i0.a.d(floatValue2, i12, i11);
                uVar.B0 = d;
                uVar.P.setColor(d);
                if (uVar.O > 0.0f) {
                    uVar.invalidate();
                    return;
                }
                return;
        }
    }
}
