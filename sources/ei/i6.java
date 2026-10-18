package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ch1;
import org.telegram.ui.ht0;
import org.telegram.ui.sn;
public final class i6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9200a;
    public final Object f9201b;

    public i6(Object obj, int i10) {
        this.f9200a = i10;
        this.f9201b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        int i10 = this.f9200a;
        Object obj = this.f9201b;
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
                d7 d7Var = e7Var.f8964a;
                d7Var.setScaleX(1.0f - floatValue);
                d7Var.setScaleY(1.0f - e7Var.E);
                e7Var.invalidate();
                return;
            case 2:
                m8 m8Var = (m8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.f9481r = floatValue2;
                Utilities.Callback callback = m8Var.f9484x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                m8Var.f9476a.invalidate();
                return;
            case 3:
                ((k9) obj).f9336x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                o9 o9Var = (o9) obj;
                o9Var.getClass();
                o9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                jg.h hVar = (jg.h) obj;
                hVar.f14495f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f14496g.f14497a.invalidate();
                return;
            case 6:
                ki.u4 u4Var = (ki.u4) obj;
                u4Var.getClass();
                u4Var.f15546a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 7:
                li.m mVar = (li.m) obj;
                sn snVar = mVar.F;
                if (snVar != null) {
                    snVar.w9();
                    if (snVar.J8 != null) {
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
                q0Var.f31684i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                ch1 ch1Var = (ch1) obj;
                ch1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = ch1Var.f31395c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * ch1Var.E));
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
                k2Var.f31544b.invalidate();
                return;
            case 13:
                ci.g3 g3Var = (ci.g3) obj;
                ((ci.k4) g3Var.f5419b).f32040a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                g3Var.invalidate();
                return;
            case 14:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.U = floatValue3;
                t1Var.V.setAlpha(floatValue3);
                t1Var.invalidate();
                return;
            case 15:
                org.telegram.ui.n0 n0Var = (org.telegram.ui.n0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f42763a0 = floatValue4;
                n0Var.j(floatValue4);
                n0Var.f42765b0.setAlpha(n0Var.f42763a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.f42763a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.f42763a0);
                n0Var.invalidate();
                return;
            case 16:
                ((ht0) ((rg.w0) obj)).K.f33273e0.invalidate();
                return;
            case 17:
                rg.r1 r1Var = (rg.r1) obj;
                r1Var.getClass();
                r1Var.f45664n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 18:
                rg.y1 y1Var = (rg.y1) obj;
                y1Var.getClass();
                y1Var.f45767x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 19:
                qg.o oVar = (qg.o) obj;
                oVar.f45767x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.invalidate();
                return;
            case 20:
                rg.m2 m2Var = (rg.m2) obj;
                m2Var.getClass();
                m2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 21:
                rg.t2 t2Var = (rg.t2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f45699y = floatValue5;
                ai.r rVar = t2Var.f45692c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45699y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f45699y));
                t2Var.f45691b.invalidate();
                return;
            case 22:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24282l0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f7 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24286b0 = f7;
                return;
            case 23:
                sg.p0 p0Var = (sg.p0) obj;
                p0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.d.invalidate();
                sg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 24:
                ((sg.w1) obj).f46519a.f46501o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 25:
                ((tg.f) obj).f47102a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 26:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.f47691b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 27:
                yg.h hVar2 = (yg.h) obj;
                hVar2.getClass();
                hVar2.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                zh.w wVar = (zh.w) obj;
                wVar.getClass();
                wVar.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                ((zh.f0) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
