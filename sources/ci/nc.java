package ci;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.d10;
public final class nc implements ValueAnimator.AnimatorUpdateListener {
    public final int f5656a;
    public final int f5657b;
    public final int f5658c;
    public final int d;
    public final int f5659e;
    public final View f5660f;

    public nc(View view, int i3, int i10, int i11, int i12, int i13) {
        this.f5656a = i13;
        this.f5660f = view;
        this.f5657b = i3;
        this.f5658c = i10;
        this.d = i11;
        this.f5659e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f5656a;
        int i10 = this.f5659e;
        int i11 = this.d;
        int i12 = this.f5658c;
        int i13 = this.f5657b;
        View view = this.f5660f;
        switch (i3) {
            case 0:
                qc qcVar = (qc) view;
                qcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.f5874r = i0.a.f(floatValue, i13, i12);
                qcVar.f5875s = i0.a.f(floatValue, i11, i10);
                qcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{qcVar.f5874r, qcVar.f5875s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                qcVar.invalidate();
                return;
            case 1:
                d10 d10Var = (d10) view;
                d10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                d10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                d10Var.G.setColorFilter(new PorterDuffColorFilter(d10Var.M, PorterDuff.Mode.MULTIPLY));
                d10Var.F.setColor(d10Var.M);
                d10Var.f32898r.setColor(d10Var.N);
                d10Var.K.d(i0.a.o(d10Var.N, 38));
                d10Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
                rVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.E0 = i0.a.f(floatValue2, i13, i12);
                int f10 = i0.a.f(floatValue2, i11, i10);
                rVar.G0 = f10;
                rVar.U.setColor(f10);
                if (rVar.T > 0.0f) {
                    rVar.invalidate();
                    return;
                }
                return;
        }
    }
}
