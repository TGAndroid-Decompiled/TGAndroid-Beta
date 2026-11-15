package di;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.k10;
public final class dc implements ValueAnimator.AnimatorUpdateListener {
    public final int f8425a;
    public final int f8426b;
    public final int f8427c;
    public final int d;
    public final int f8428e;
    public final View f8429f;

    public dc(View view, int i7, int i10, int i11, int i12, int i13) {
        this.f8425a = i13;
        this.f8429f = view;
        this.f8426b = i7;
        this.f8427c = i10;
        this.d = i11;
        this.f8428e = i12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f8425a;
        int i10 = this.f8428e;
        int i11 = this.d;
        int i12 = this.f8427c;
        int i13 = this.f8426b;
        View view = this.f8429f;
        switch (i7) {
            case 0:
                gc gcVar = (gc) view;
                gcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gcVar.f8643r = i0.a.f(floatValue, i13, i12);
                gcVar.f8644s = i0.a.f(floatValue, i11, i10);
                gcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gcVar.f8643r, gcVar.f8644s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gcVar.invalidate();
                return;
            case 1:
                k10 k10Var = (k10) view;
                k10Var.M = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i13, i12);
                k10Var.N = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                k10Var.G.setColorFilter(new PorterDuffColorFilter(k10Var.M, PorterDuff.Mode.MULTIPLY));
                k10Var.F.setColor(k10Var.M);
                k10Var.f36231r.setColor(k10Var.N);
                k10Var.K.d(i0.a.o(k10Var.N, 38));
                k10Var.invalidate();
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
