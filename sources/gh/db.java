package gh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.b20;
public final class db implements ValueAnimator.AnimatorUpdateListener {
    public final int f7993a;
    public final int f7994b;
    public final int f7995c;
    public final int d;
    public final int f7996e;
    public final View f7997f;

    public db(View view, int i9, int i10, int i11, int i12, int i13) {
        this.f7993a = i13;
        this.f7997f = view;
        this.f7994b = i9;
        this.f7995c = i10;
        this.d = i11;
        this.f7996e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f7993a;
        int i10 = this.f7996e;
        int i11 = this.d;
        int i12 = this.f7995c;
        int i13 = this.f7994b;
        View view = this.f7997f;
        switch (i9) {
            case 0:
                gb gbVar = (gb) view;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.f8179r = i0.a.d(floatValue, i13, i12);
                gbVar.f8180s = i0.a.d(floatValue, i11, i10);
                gbVar.f8183y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.f8179r, gbVar.f8180s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gbVar.invalidate();
                return;
            case 1:
                b20 b20Var = (b20) view;
                b20Var.H = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                b20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                b20Var.B.setColorFilter(new PorterDuffColorFilter(b20Var.H, PorterDuff.Mode.MULTIPLY));
                b20Var.A.setColor(b20Var.H);
                b20Var.f26993r.setColor(b20Var.I);
                b20Var.F.d(i0.a.k(b20Var.I, 38));
                b20Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f33856z0 = i0.a.d(floatValue2, i13, i12);
                int d = i0.a.d(floatValue2, i11, i10);
                tVar.B0 = d;
                tVar.P.setColor(d);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
        }
    }
}
