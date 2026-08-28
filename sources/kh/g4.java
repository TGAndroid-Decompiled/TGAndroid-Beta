package kh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.fh1;
import org.telegram.ui.qn;
import org.telegram.ui.ws0;
public final class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15265a;
    public final Object f15266b;

    public g4(fa.c cVar, View view) {
        this.f15265a = 17;
        this.f15266b = cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i9 = this.f15265a;
        Object obj = this.f15266b;
        switch (i9) {
            case 0:
                ((m4) obj).invalidate();
                return;
            case 1:
                k6 k6Var = (k6) obj;
                k6Var.getClass();
                k6Var.f15525n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.e();
                return;
            case 2:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidate();
                return;
            case 3:
                e7 e7Var = (e7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.A = floatValue;
                d7 d7Var = e7Var.f15153a;
                d7Var.setScaleX(1.0f - floatValue);
                d7Var.setScaleY(1.0f - e7Var.A);
                e7Var.invalidate();
                return;
            case 4:
                n8 n8Var = (n8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.f15763r = floatValue2;
                Utilities.Callback callback = n8Var.f15766x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                n8Var.f15757a.invalidate();
                return;
            case 5:
                ((n9) obj).f15776x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                q9 q9Var = (q9) obj;
                q9Var.getClass();
                q9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) obj;
                p0Var.getClass();
                p0Var.f33746i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                fh1 fh1Var = (fh1) obj;
                fh1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = fh1Var.f33427c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * fh1Var.A));
                y0Var.requestLayout();
                return;
            case 9:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                s1Var.getClass();
                s1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) obj;
                l2Var.getClass();
                l2Var.f33659s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.f33653b.invalidate();
                return;
            case 12:
                ih.z2 z2Var = (ih.z2) obj;
                ((ih.d4) z2Var.f12366b).f31328a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                return;
            case 13:
                org.telegram.ui.web.q1 q1Var = (org.telegram.ui.web.q1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.Q = floatValue3;
                q1Var.R.setAlpha(floatValue3);
                q1Var.invalidate();
                return;
            case 14:
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.T = floatValue4;
                n0Var.j(floatValue4);
                n0Var.U.setAlpha(n0Var.T);
                n0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.T);
                n0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.T);
                n0Var.invalidate();
                return;
            case 15:
                qf.h hVar = (qf.h) obj;
                hVar.f46239f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f46240g.f46241a.invalidate();
                return;
            case 16:
                qh.l4 l4Var = (qh.l4) obj;
                l4Var.getClass();
                l4Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l4Var.requestLayout();
                l4Var.invalidate();
                return;
            case 17:
                ((View) ((g.a0) ((fa.c) obj).f6034b).d.getParent()).invalidate();
                return;
            case 18:
                rh.m mVar = (rh.m) obj;
                qn qnVar = mVar.F;
                if (qnVar != null) {
                    qnVar.r9();
                    if (qnVar.F8 != null) {
                        qnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                mVar.G.invalidate();
                return;
            case 19:
                ((ws0) ((yf.v0) obj)).G.f35580a0.invalidate();
                return;
            case 20:
                yf.r1 r1Var = (yf.r1) obj;
                r1Var.getClass();
                r1Var.f50094n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 21:
                yf.y1 y1Var = (yf.y1) obj;
                y1Var.getClass();
                y1Var.f50194x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 22:
                xf.n nVar = (xf.n) obj;
                nVar.f50194x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 23:
                yf.m2 m2Var = (yf.m2) obj;
                m2Var.getClass();
                m2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 24:
                yf.t2 t2Var = (yf.t2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f50120y = floatValue5;
                gh.m mVar2 = t2Var.f50112c;
                mVar2.setAlpha(floatValue5);
                mVar2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f50120y));
                mVar2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f50120y));
                t2Var.f50111b.invalidate();
                return;
            case 25:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f26446h0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f10 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.U = f10;
                return;
            case 26:
                zf.p0 p0Var2 = (zf.p0) obj;
                p0Var2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var2.d.invalidate();
                zf.o0 o0Var = p0Var2.f50648e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            default:
                ((zf.w1) obj).f50764a.f50745o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }

    public g4(Object obj, int i9) {
        this.f15265a = i9;
        this.f15266b = obj;
    }
}
