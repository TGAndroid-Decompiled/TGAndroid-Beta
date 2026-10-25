package bi;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.b30;
public final class vd implements ValueAnimator.AnimatorUpdateListener {
    public final int f5580a;
    public final int f5581b;
    public final int f5582c;
    public final int d;
    public final int e;
    public final View f5583f;

    public vd(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f5580a = i14;
        this.f5583f = view;
        this.f5581b = i10;
        this.f5582c = i11;
        this.d = i12;
        this.e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5580a;
        int i11 = this.e;
        int i12 = this.d;
        int i13 = this.f5582c;
        int i14 = this.f5581b;
        View view = this.f5583f;
        switch (i10) {
            case 0:
                yd ydVar = (yd) view;
                ydVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ydVar.f5808r = i0.a.f(floatValue, i14, i13);
                ydVar.f5809s = i0.a.f(floatValue, i12, i11);
                ydVar.f5812y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ydVar.f5808r, ydVar.f5809s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                ydVar.invalidate();
                return;
            case 1:
                b30 b30Var = (b30) view;
                b30Var.L = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                b30Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                b30Var.F.setColorFilter(new PorterDuffColorFilter(b30Var.L, PorterDuff.Mode.MULTIPLY));
                b30Var.E.setColor(b30Var.L);
                b30Var.f26733r.setColor(b30Var.M);
                b30Var.J.d(i0.a.o(b30Var.M, 38));
                b30Var.invalidate();
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
