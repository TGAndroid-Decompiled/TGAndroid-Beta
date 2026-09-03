package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.bi1;
import org.telegram.ui.zn;
public final class e5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15287a;
    public final Object f15288b;

    public e5(bb.b bVar, View view) {
        this.f15287a = 24;
        this.f15288b = bVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15287a) {
            case 0:
                m5 m5Var = (m5) this.f15288b;
                m5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.e.setTranslationY(((-m5Var.d) + m5Var.getMeasuredHeight()) - m5Var.v);
                return;
            case 1:
                x6 x6Var = (x6) this.f15288b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = x6Var.f16039a;
                w6 w6Var = (w6) arrayList.get(x6Var.d);
                w6Var.f16016n = floatValue;
                w6Var.invalidate();
                int i10 = x6Var.f16041c;
                if (i10 != -1) {
                    w6 w6Var2 = (w6) arrayList.get(i10);
                    w6Var2.f16016n = 1.0f - floatValue;
                    w6Var2.invalidate();
                    return;
                }
                return;
            case 2:
                z7 z7Var = (z7) this.f15288b;
                z7Var.getClass();
                z7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                return;
            case 3:
                oh.v vVar = (oh.v) this.f15288b;
                vVar.f16602w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f16600r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f16602w));
                vVar.f16599n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f16602w));
                return;
            case 4:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.f15288b;
                p0Var.getClass();
                p0Var.f29822i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                bi1 bi1Var = (bi1) this.f15288b;
                bi1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = bi1Var.f29527c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * bi1Var.B));
                y0Var.requestLayout();
                return;
            case 6:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f15288b;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f15288b;
                s1Var.getClass();
                s1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.f15288b;
                m2Var.getClass();
                m2Var.f29750s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f29745b.invalidate();
                return;
            case 9:
                y2 y2Var = (y2) this.f15288b;
                ((y3) y2Var.f16053b).f27801a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y2Var.invalidate();
                return;
            case 10:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.f15288b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.R = floatValue2;
                u1Var.S.setAlpha(floatValue2);
                u1Var.invalidate();
                return;
            case 11:
                org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this.f15288b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.U = floatValue3;
                o0Var.j(floatValue3);
                o0Var.V.setAlpha(o0Var.U);
                o0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.U);
                o0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.U);
                o0Var.invalidate();
                return;
            case 12:
                ph.k kVar = (ph.k) this.f15288b;
                kVar.f41849l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph.f fVar = kVar.f41842f;
                fVar.getEditText().setTranslationX(AndroidUtilities.lerp(kVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), kVar.f41849l0));
                FrameLayout frameLayout = kVar.f41857s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), kVar.f41849l0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, kVar.f41849l0));
                fVar.getEmojiButton().setAlpha(kVar.f41849l0);
                kVar.f41855r.setAlpha((float) Math.pow(kVar.f41849l0, 16.0d));
                kVar.u(kVar.f41849l0);
                zh zhVar = kVar.J;
                if (zhVar != null) {
                    zhVar.setAlpha((float) Math.pow(kVar.f41849l0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 13:
                ph.u uVar = (ph.u) this.f15288b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f42456a.invalidate();
                return;
            case 14:
                ph.d2 d2Var = (ph.d2) this.f15288b;
                d2Var.getClass();
                d2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.i();
                return;
            case 15:
                ((ph.d3) this.f15288b).f41487b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ph.f3 f3Var = (ph.f3) this.f15288b;
                f3Var.getClass();
                f3Var.f41665l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                return;
            case 17:
                ((ph.r3) this.f15288b).invalidate();
                return;
            case 18:
                ph.f5 f5Var = (ph.f5) this.f15288b;
                f5Var.getClass();
                f5Var.f41692n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.e();
                return;
            case 19:
                ph.e5 e5Var = (ph.e5) this.f15288b;
                e5Var.getClass();
                e5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.invalidate();
                return;
            case 20:
                ph.x5 x5Var = (ph.x5) this.f15288b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.B = floatValue4;
                ph.w5 w5Var = x5Var.f42592a;
                w5Var.setScaleX(1.0f - floatValue4);
                w5Var.setScaleY(1.0f - x5Var.B);
                x5Var.invalidate();
                return;
            case 21:
                ph.f7 f7Var = (ph.f7) this.f15288b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f7Var.f41702r = floatValue5;
                Utilities.Callback callback = f7Var.f41705x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                f7Var.f41697a.invalidate();
                return;
            case 22:
                ((ph.y7) this.f15288b).f42666x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                ph.b8 b8Var = (ph.b8) this.f15288b;
                b8Var.getClass();
                b8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                ((View) ((g.a0) ((bb.b) this.f15288b).f1772b).d.getParent()).invalidate();
                return;
            case 25:
                vf.h hVar = (vf.h) this.f15288b;
                hVar.f45827f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f45828g.f45829a.invalidate();
                return;
            case 26:
                vh.p4 p4Var = (vh.p4) this.f15288b;
                p4Var.getClass();
                p4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.requestLayout();
                p4Var.invalidate();
                return;
            default:
                wh.n nVar = (wh.n) this.f15288b;
                zn znVar = nVar.F;
                if (znVar != null) {
                    znVar.r9();
                    if (znVar.G8 != null) {
                        znVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }

    public e5(Object obj, int i10) {
        this.f15287a = i10;
        this.f15288b = obj;
    }
}
