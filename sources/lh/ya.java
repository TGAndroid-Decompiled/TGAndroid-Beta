package lh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.s20;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f13412a;
    public final int f13413b;
    public final int f13414c;
    public final int d;
    public final int e;
    public final View f13415f;

    public ya(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f13412a = i14;
        this.f13415f = view;
        this.f13413b = i10;
        this.f13414c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f13412a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f13414c;
        int i14 = this.f13413b;
        View view = this.f13415f;
        switch (i10) {
            case 0:
                bb bbVar = (bb) view;
                bbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.f12192r = i0.a.d(floatValue, i14, i13);
                bbVar.f12193s = i0.a.d(floatValue, i12, i11);
                bbVar.f12196y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f12192r, bbVar.f12193s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                bbVar.invalidate();
                return;
            case 1:
                s20 s20Var = (s20) view;
                s20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                s20Var.J = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                s20Var.C.setColorFilter(new PorterDuffColorFilter(s20Var.I, PorterDuff.Mode.MULTIPLY));
                s20Var.B.setColor(s20Var.I);
                s20Var.f28609r.setColor(s20Var.J);
                s20Var.G.d(i0.a.k(s20Var.J, 38));
                s20Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.A0 = i0.a.d(floatValue2, i14, i13);
                int d = i0.a.d(floatValue2, i12, i11);
                tVar.C0 = d;
                tVar.Q.setColor(d);
                if (tVar.P > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
        }
    }
}
