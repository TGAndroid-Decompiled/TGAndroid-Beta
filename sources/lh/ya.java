package lh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.t20;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f13396a;
    public final int f13397b;
    public final int f13398c;
    public final int d;
    public final int e;
    public final View f13399f;

    public ya(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f13396a = i14;
        this.f13399f = view;
        this.f13397b = i10;
        this.f13398c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f13396a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f13398c;
        int i14 = this.f13397b;
        View view = this.f13399f;
        switch (i10) {
            case 0:
                bb bbVar = (bb) view;
                bbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.f12176r = i0.a.d(floatValue, i14, i13);
                bbVar.f12177s = i0.a.d(floatValue, i12, i11);
                bbVar.f12180y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f12176r, bbVar.f12177s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                bbVar.invalidate();
                return;
            case 1:
                t20 t20Var = (t20) view;
                t20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                t20Var.J = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                t20Var.C.setColorFilter(new PorterDuffColorFilter(t20Var.I, PorterDuff.Mode.MULTIPLY));
                t20Var.B.setColor(t20Var.I);
                t20Var.f28877r.setColor(t20Var.J);
                t20Var.G.d(i0.a.k(t20Var.J, 38));
                t20Var.invalidate();
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
