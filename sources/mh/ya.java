package mh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import org.telegram.ui.Components.t20;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f15117a;
    public final int f15118b;
    public final int f15119c;
    public final int d;
    public final int f15120e;
    public final View f15121f;

    public ya(View view, int i10, int i11, int i12, int i13, int i14) {
        this.f15117a = i14;
        this.f15121f = view;
        this.f15118b = i10;
        this.f15119c = i11;
        this.d = i12;
        this.f15120e = i13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f15117a;
        int i11 = this.f15120e;
        int i12 = this.d;
        int i13 = this.f15119c;
        int i14 = this.f15118b;
        View view = this.f15121f;
        switch (i10) {
            case 0:
                bb bbVar = (bb) view;
                bbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.f13780r = i0.a.d(floatValue, i14, i13);
                bbVar.f13781s = i0.a.d(floatValue, i12, i11);
                bbVar.f13784y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f13780r, bbVar.f13781s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                bbVar.invalidate();
                return;
            case 1:
                t20 t20Var = (t20) view;
                t20Var.I = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i14, i13);
                t20Var.J = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                t20Var.C.setColorFilter(new PorterDuffColorFilter(t20Var.I, PorterDuff.Mode.MULTIPLY));
                t20Var.B.setColor(t20Var.I);
                t20Var.f31248r.setColor(t20Var.J);
                t20Var.G.d(i0.a.k(t20Var.J, 38));
                t20Var.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) view;
                uVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.A0 = i0.a.d(floatValue2, i14, i13);
                int d = i0.a.d(floatValue2, i12, i11);
                uVar.C0 = d;
                uVar.Q.setColor(d);
                if (uVar.P > 0.0f) {
                    uVar.invalidate();
                    return;
                }
                return;
        }
    }
}
