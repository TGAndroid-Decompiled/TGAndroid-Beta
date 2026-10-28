package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.kh1;
import org.telegram.ui.ot0;
import org.telegram.ui.wn;
public final class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10775a;
    public final Object f10776b;

    public e4(Object obj, int i10) {
        this.f10775a = i10;
        this.f10776b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        int i10 = this.f10775a;
        Object obj = this.f10776b;
        switch (i10) {
            case 0:
                ((k4) obj).invalidate();
                return;
            case 1:
                i6 i6Var = (i6) obj;
                i6Var.getClass();
                i6Var.f11000n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.e();
                return;
            case 2:
                h6 h6Var = (h6) obj;
                h6Var.getClass();
                h6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                return;
            case 3:
                b7 b7Var = (b7) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b7Var.E = floatValue;
                a7 a7Var = b7Var.f10565a;
                a7Var.setScaleX(1.0f - floatValue);
                a7Var.setScaleY(1.0f - b7Var.E);
                b7Var.invalidate();
                return;
            case 4:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f11010r = floatValue2;
                Utilities.Callback callback = i8Var.f11013x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                i8Var.f11005a.invalidate();
                return;
            case 5:
                ((g9) obj).f10927x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                k9 k9Var = (k9) obj;
                k9Var.getClass();
                k9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                hi.p pVar = (hi.p) obj;
                pVar.getClass();
                pVar.f13187c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.a();
                pVar.requestLayout();
                return;
            case 8:
                kg.i iVar = (kg.i) obj;
                iVar.f16630f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f16631g.f16632a.invalidate();
                return;
            case 9:
                li.u4 u4Var = (li.u4) obj;
                u4Var.getClass();
                u4Var.f17515a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 10:
                mi.m mVar = (mi.m) obj;
                wn wnVar = mVar.F;
                if (wnVar != null) {
                    wnVar.C9();
                    if (wnVar.Z8 != null) {
                        wnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                mVar.G.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj;
                q0Var.getClass();
                q0Var.f34132i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                kh1 kh1Var = (kh1) obj;
                kh1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = kh1Var.f33841c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * kh1Var.E));
                z0Var.requestLayout();
                return;
            case 13:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) obj;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) obj;
                v1Var.getClass();
                v1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                return;
            case 15:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.getClass();
                n2Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f34062b.invalidate();
                return;
            case 16:
                di.f3 f3Var = (di.f3) obj;
                ((di.k4) f3Var.f8550b).f35004a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                return;
            case 17:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.U = floatValue3;
                u1Var.V.setAlpha(floatValue3);
                u1Var.invalidate();
                return;
            case 18:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f44904a0 = floatValue4;
                l0Var.j(floatValue4);
                l0Var.f44906b0.setAlpha(l0Var.f44904a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f44904a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f44904a0);
                l0Var.invalidate();
                return;
            case 19:
                ((ot0) ((sg.w0) obj)).K.f35670e0.invalidate();
                return;
            case 20:
                sg.s1 s1Var = (sg.s1) obj;
                s1Var.getClass();
                s1Var.f48545n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 21:
                sg.z1 z1Var = (sg.z1) obj;
                z1Var.getClass();
                z1Var.f48644x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.invalidate();
                return;
            case 22:
                rg.n nVar = (rg.n) obj;
                nVar.f48644x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 23:
                sg.o2 o2Var = (sg.o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 24:
                sg.u2 u2Var = (sg.u2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.f48570y = floatValue5;
                bi.r rVar = u2Var.f48563c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f48570y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.f48570y));
                u2Var.f48562b.invalidate();
                return;
            case 25:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f26218o0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f7 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f26222b0 = f7;
                return;
            case 26:
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f49016f.invalidate();
                tg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 27:
                ((tg.x1) obj).f49154a.f49136o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 28:
                ((ug.f) obj).f49804a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                vg.b bVar = (vg.b) obj;
                bVar.getClass();
                bVar.f50180b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
        }
    }
}
