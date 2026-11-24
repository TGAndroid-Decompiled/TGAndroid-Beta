package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PasscodeActivity;
public final class ni4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public ni4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                oi4 oi4Var = (oi4) obj;
                oi4Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oi4Var.invalidate();
                return;
            case 1:
                ((sj4) obj).m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((wr4) obj).l1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                h75 h75Var = (h75) obj;
                h75Var.O2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h75Var.J1(true);
                h75Var.o1.invalidate();
                h75Var.J1.invalidate();
                return;
            case 4:
                v65 v65Var = (v65) obj;
                v65Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v65Var.a.invalidate();
                return;
            case 5:
                x65 x65Var = (x65) obj;
                x65Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h75 h75Var2 = x65Var.L;
                h75Var2.J1.invalidate();
                h75Var2.T3.invalidate();
                h75Var2.b.invalidate();
                h75Var2.F1();
                return;
            case 6:
                o85 o85Var = (o85) obj;
                m85 m85Var = o85Var.a;
                if (!o85Var.H) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    o85Var.d0 = floatValue;
                    o85Var.W.setPinnedProgress(floatValue);
                    m85Var.setScaleX(1.0f - (o85Var.d0 * 0.6f));
                    m85Var.setScaleY(1.0f - (o85Var.d0 * 0.6f));
                    if (o85Var.Y) {
                        o85Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                w85 w85Var = (w85) obj;
                w85Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w85Var.d();
                return;
            case 8:
                za5 za5Var = (za5) obj;
                be0 be0Var = za5Var.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (za5Var.I) {
                    f = 1.0f - (0.18f * floatValue2);
                } else {
                    f = 0.82f + (0.18f * floatValue2);
                }
                be0Var.setScaleX(f);
                be0Var.setScaleY(f);
                if (!za5Var.I) {
                    floatValue2 = 1.0f - floatValue2;
                }
                za5Var.J = floatValue2;
                za5Var.invalidate();
                return;
            case 9:
                je5 je5Var = (je5) obj;
                je5Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                je5Var.invalidate();
                return;
            case 10:
                xl5 xl5Var = (xl5) obj;
                xl5Var.getClass();
                xl5Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 11:
                jr5 jr5Var = (jr5) obj;
                jr5Var.b2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jr5Var.b.invalidate();
                return;
            case 12:
                jr5 jr5Var2 = ((ir5) obj).e;
                jr5Var2.e2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                jr5Var2.b.invalidate();
                return;
            case 13:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zr5 zr5Var = ((cs5) obj).x;
                if (zr5Var != null) {
                    zr5Var.setProgress(floatValue3);
                    return;
                }
                return;
            case 14:
                ((zr5) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                ju5 ju5Var = (ju5) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ju5Var.s = floatValue4;
                ju5Var.d(floatValue4);
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i = LimitPreviewView.p0;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue5 < 0.5f) {
                    f2 = (floatValue5 / 0.5f) * (-7.0f);
                } else {
                    f2 = (1.0f - ((floatValue5 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.c0 = f2;
                return;
            case 17:
                r66 r66Var = (r66) obj;
                r66Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r66Var.invalidateSelf();
                return;
            case 18:
                ((k76) obj).invalidate();
                return;
            case 19:
                l18 l18Var = (l18) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l18Var.c.setAlpha(floatValue6);
                l18Var.a.setAlpha(gl.R1(0.0f, 0.5f, floatValue6));
                l18Var.invalidate();
                return;
            case 20:
                d76 d76Var = (d76) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = d76Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (gl.R1(d76Var.f, 1.0f, floatValue7) * 255.0f));
                    d76Var.h.invalidate();
                    return;
                }
                return;
            case 21:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d76 d76Var2 = (d76) ((v85) obj).b;
                Drawable drawable2 = d76Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (gl.R1(1.0f, d76Var2.f, floatValue8) * 255.0f));
                    d76Var2.h.invalidate();
                    return;
                }
                return;
            case 22:
                ((qa6) obj).u0();
                return;
            case 23:
                ((p88) ((dj6) obj)).L.f0.invalidate();
                return;
            case 24:
                ((dh7) obj).invalidate();
                return;
            case 25:
                sl7 sl7Var = (sl7) obj;
                sl7Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                sl7Var.invalidate();
                return;
            case 26:
                vr7 vr7Var = (vr7) obj;
                vr7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vr7Var.invalidate();
                return;
            case 27:
                ks7 ks7Var = (ks7) obj;
                ks7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ks7Var.invalidate();
                return;
            case 28:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue9);
                passcodeActivity.w.setTranslationY((1.0f - floatValue9) * gl.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            default:
                yv7 yv7Var = ((rv7) obj).d;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv7Var.b0 = floatValue10;
                yv7Var.h(floatValue10);
                return;
        }
    }
}
