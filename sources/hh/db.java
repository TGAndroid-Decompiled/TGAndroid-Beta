package hh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.e20;

public final class db implements ValueAnimator.AnimatorUpdateListener {

    public final int f9149a;

    public final int f9150b;

    public final int f9151c;
    public final int d;

    public final int f9152e;

    public final View f9153f;

    public db(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f9149a = i14;
        this.f9153f = view;
        this.f9150b = i10;
        this.f9151c = i11;
        this.d = i12;
        this.f9152e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f9149a;
        int i11 = this.f9152e;
        int i12 = this.d;
        int i13 = this.f9151c;
        int i14 = this.f9150b;
        View view = this.f9153f;
        switch (i10) {
            case 0:
                gb gbVar = (gb) view;
                gbVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.f9357r = i0.b.d(fFloatValue, i14, i13);
                gbVar.f9358s = i0.b.d(fFloatValue, i12, i11);
                gbVar.f9361y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.f9357r, gbVar.f9358s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gbVar.invalidate();
                break;
            case 1:
                e20 e20Var = (e20) view;
                e20Var.H = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                e20Var.I = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                e20Var.B.setColorFilter(new PorterDuffColorFilter(e20Var.H, PorterDuff.Mode.MULTIPLY));
                e20Var.A.setColor(e20Var.H);
                e20Var.f27937r.setColor(e20Var.I);
                e20Var.F.d(i0.b.k(e20Var.I, 38));
                e20Var.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) view;
                tVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f33906z0 = i0.b.d(fFloatValue2, i14, i13);
                int iD = i0.b.d(fFloatValue2, i12, i11);
                tVar.B0 = iD;
                tVar.P.setColor(iD);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                }
                break;
        }
    }
}
