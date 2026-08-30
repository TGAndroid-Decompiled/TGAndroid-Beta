package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.th1;
import org.telegram.ui.xn;
public final class e5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15307a;
    public final Object f15308b;

    public e5(a3.c cVar, View view) {
        this.f15307a = 24;
        this.f15308b = cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15307a) {
            case 0:
                m5 m5Var = (m5) this.f15308b;
                m5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.e.setTranslationY(((-m5Var.d) + m5Var.getMeasuredHeight()) - m5Var.v);
                return;
            case 1:
                x6 x6Var = (x6) this.f15308b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = x6Var.f16059a;
                w6 w6Var = (w6) arrayList.get(x6Var.d);
                w6Var.f16036n = floatValue;
                w6Var.invalidate();
                int i10 = x6Var.f16061c;
                if (i10 != -1) {
                    w6 w6Var2 = (w6) arrayList.get(i10);
                    w6Var2.f16036n = 1.0f - floatValue;
                    w6Var2.invalidate();
                    return;
                }
                return;
            case 2:
                z7 z7Var = (z7) this.f15308b;
                z7Var.getClass();
                z7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                return;
            case 3:
                oh.v vVar = (oh.v) this.f15308b;
                vVar.f16622w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f16620r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f16622w));
                vVar.f16619n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f16622w));
                return;
            case 4:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.f15308b;
                p0Var.getClass();
                p0Var.f29850i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                th1 th1Var = (th1) this.f15308b;
                th1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = th1Var.f29555c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * th1Var.B));
                y0Var.requestLayout();
                return;
            case 6:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f15308b;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f15308b;
                s1Var.getClass();
                s1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.f15308b;
                m2Var.getClass();
                m2Var.f29778s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f29773b.invalidate();
                return;
            case 9:
                y2 y2Var = (y2) this.f15308b;
                ((y3) y2Var.f16073b).f27785a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y2Var.invalidate();
                return;
            case 10:
                org.telegram.ui.web.s1 s1Var2 = (org.telegram.ui.web.s1) this.f15308b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var2.R = floatValue2;
                s1Var2.S.setAlpha(floatValue2);
                s1Var2.invalidate();
                return;
            case 11:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f15308b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U = floatValue3;
                m0Var.j(floatValue3);
                m0Var.V.setAlpha(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                return;
            case 12:
                ph.k kVar = (ph.k) this.f15308b;
                kVar.f41816l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph.f fVar = kVar.f41809f;
                fVar.getEditText().setTranslationX(AndroidUtilities.lerp(kVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), kVar.f41816l0));
                FrameLayout frameLayout = kVar.f41824s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), kVar.f41816l0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, kVar.f41816l0));
                fVar.getEmojiButton().setAlpha(kVar.f41816l0);
                kVar.f41822r.setAlpha((float) Math.pow(kVar.f41816l0, 16.0d));
                kVar.u(kVar.f41816l0);
                zh zhVar = kVar.J;
                if (zhVar != null) {
                    zhVar.setAlpha((float) Math.pow(kVar.f41816l0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 13:
                ph.u uVar = (ph.u) this.f15308b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f42375a.invalidate();
                return;
            case 14:
                ph.d2 d2Var = (ph.d2) this.f15308b;
                d2Var.getClass();
                d2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.i();
                return;
            case 15:
                ((ph.d3) this.f15308b).f41437b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ph.f3 f3Var = (ph.f3) this.f15308b;
                f3Var.getClass();
                f3Var.f41620l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                return;
            case 17:
                ((ph.r3) this.f15308b).invalidate();
                return;
            case 18:
                ph.f5 f5Var = (ph.f5) this.f15308b;
                f5Var.getClass();
                f5Var.f41647n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.e();
                return;
            case 19:
                ph.e5 e5Var = (ph.e5) this.f15308b;
                e5Var.getClass();
                e5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.invalidate();
                return;
            case 20:
                ph.y5 y5Var = (ph.y5) this.f15308b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.B = floatValue4;
                ph.x5 x5Var = y5Var.f42619a;
                x5Var.setScaleX(1.0f - floatValue4);
                x5Var.setScaleY(1.0f - y5Var.B);
                y5Var.invalidate();
                return;
            case 21:
                ph.g7 g7Var = (ph.g7) this.f15308b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g7Var.f41692r = floatValue5;
                Utilities.Callback callback = g7Var.f41695x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                g7Var.f41687a.invalidate();
                return;
            case 22:
                ((ph.z7) this.f15308b).f42668x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                ph.c8 c8Var = (ph.c8) this.f15308b;
                c8Var.getClass();
                c8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                ((View) ((g.a0) ((a3.c) this.f15308b).f46b).d.getParent()).invalidate();
                return;
            case 25:
                vf.h hVar = (vf.h) this.f15308b;
                hVar.f45749f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f45750g.f45751a.invalidate();
                return;
            case 26:
                vh.o4 o4Var = (vh.o4) this.f15308b;
                o4Var.getClass();
                o4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.requestLayout();
                o4Var.invalidate();
                return;
            default:
                wh.n nVar = (wh.n) this.f15308b;
                xn xnVar = nVar.F;
                if (xnVar != null) {
                    xnVar.r9();
                    if (xnVar.G8 != null) {
                        xnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }

    public e5(Object obj, int i10) {
        this.f15307a = i10;
        this.f15308b = obj;
    }
}
