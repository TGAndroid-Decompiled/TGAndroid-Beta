package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.gh1;
import org.telegram.ui.ht0;
import org.telegram.ui.sn;
public final class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9208a;
    public final Object f9209b;

    public i6(Object obj, int i10) {
        this.f9208a = i10;
        this.f9209b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        int i10 = this.f9208a;
        Object obj = this.f9209b;
        switch (i10) {
            case 0:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.invalidate();
                return;
            case 1:
                e7 e7Var = (e7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.E = floatValue;
                d7 d7Var = e7Var.f8972a;
                d7Var.setScaleX(1.0f - floatValue);
                d7Var.setScaleY(1.0f - e7Var.E);
                e7Var.invalidate();
                return;
            case 2:
                m8 m8Var = (m8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.f9489r = floatValue2;
                Utilities.Callback callback = m8Var.f9492x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                m8Var.f9484a.invalidate();
                return;
            case 3:
                ((k9) obj).f9344x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                o9 o9Var = (o9) obj;
                o9Var.getClass();
                o9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jg.h hVar = (jg.h) obj;
                hVar.f14538f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f14539g.f14540a.invalidate();
                return;
            case 6:
                ki.u4 u4Var = (ki.u4) obj;
                u4Var.getClass();
                u4Var.f15604a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 7:
                li.m mVar = (li.m) obj;
                sn snVar = mVar.F;
                if (snVar != null) {
                    snVar.w9();
                    if (snVar.V8 != null) {
                        snVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                mVar.G.invalidate();
                return;
            case 8:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj;
                q0Var.getClass();
                q0Var.f31793i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                gh1 gh1Var = (gh1) obj;
                gh1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = gh1Var.f31504c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * gh1Var.E));
                z0Var.requestLayout();
                return;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) obj;
                s1Var.getClass();
                s1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 12:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) obj;
                k2Var.getClass();
                k2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.f31653b.invalidate();
                return;
            case 13:
                ci.f3 f3Var = (ci.f3) obj;
                ((ci.j4) f3Var.f5319b).f31064a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                return;
            case 14:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.U = floatValue3;
                u1Var.V.setAlpha(floatValue3);
                u1Var.invalidate();
                return;
            case 15:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f43258a0 = floatValue4;
                m0Var.j(floatValue4);
                m0Var.f43260b0.setAlpha(m0Var.f43258a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f43258a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f43258a0);
                m0Var.invalidate();
                return;
            case 16:
                ((ht0) ((rg.w0) obj)).K.f33582e0.invalidate();
                return;
            case 17:
                rg.s1 s1Var2 = (rg.s1) obj;
                s1Var2.getClass();
                s1Var2.f46069n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var2.invalidate();
                return;
            case 18:
                rg.a2 a2Var = (rg.a2) obj;
                a2Var.getClass();
                a2Var.f45709x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.invalidate();
                return;
            case 19:
                qg.n nVar = (qg.n) obj;
                nVar.f45709x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 20:
                rg.o2 o2Var = (rg.o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 21:
                rg.u2 u2Var = (rg.u2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.f46092y = floatValue5;
                ai.r rVar = u2Var.f46085c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46092y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f46092y));
                u2Var.f46084b.invalidate();
                return;
            case 22:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24424o0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f7 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24428b0 = f7;
                return;
            case 23:
                sg.p0 p0Var = (sg.p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f46802f.invalidate();
                sg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 24:
                ((sg.x1) obj).f46938a.f46920o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 25:
                ((tg.f) obj).f47499a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 26:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.f48095b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 27:
                yg.h hVar2 = (yg.h) obj;
                hVar2.getClass();
                hVar2.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                zh.b0 b0Var = (zh.b0) obj;
                b0Var.getClass();
                b0Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.invalidate();
                return;
            default:
                ((zh.n0) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
