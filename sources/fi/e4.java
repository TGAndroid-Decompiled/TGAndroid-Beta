package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.ih1;
import org.telegram.ui.mt0;
import org.telegram.ui.un;
public final class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10776a;
    public final Object f10777b;

    public e4(Object obj, int i10) {
        this.f10776a = i10;
        this.f10777b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        int i10 = this.f10776a;
        Object obj = this.f10777b;
        switch (i10) {
            case 0:
                ((k4) obj).invalidate();
                return;
            case 1:
                i6 i6Var = (i6) obj;
                i6Var.getClass();
                i6Var.f11001n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                a7 a7Var = b7Var.f10566a;
                a7Var.setScaleX(1.0f - floatValue);
                a7Var.setScaleY(1.0f - b7Var.E);
                b7Var.invalidate();
                return;
            case 4:
                i8 i8Var = (i8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f11011r = floatValue2;
                Utilities.Callback callback = i8Var.f11014x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                i8Var.f11006a.invalidate();
                return;
            case 5:
                ((g9) obj).f10928x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                k9 k9Var = (k9) obj;
                k9Var.getClass();
                k9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                hi.p pVar = (hi.p) obj;
                pVar.getClass();
                pVar.f13188c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.a();
                pVar.requestLayout();
                return;
            case 8:
                kg.i iVar = (kg.i) obj;
                iVar.f16631f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f16632g.f16633a.invalidate();
                return;
            case 9:
                li.u4 u4Var = (li.u4) obj;
                u4Var.getClass();
                u4Var.f17516a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 10:
                mi.m mVar = (mi.m) obj;
                un unVar = mVar.F;
                if (unVar != null) {
                    unVar.z9();
                    if (unVar.V8 != null) {
                        unVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                mVar.G.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) obj;
                q0Var.getClass();
                q0Var.f34024i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                ih1 ih1Var = (ih1) obj;
                ih1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = ih1Var.f33733c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * ih1Var.E));
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
                n2Var.f33954b.invalidate();
                return;
            case 16:
                di.f3 f3Var = (di.f3) obj;
                ((di.k4) f3Var.f8551b).f34981a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                l0Var.f45390a0 = floatValue4;
                l0Var.j(floatValue4);
                l0Var.f45392b0.setAlpha(l0Var.f45390a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f45390a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f45390a0);
                l0Var.invalidate();
                return;
            case 19:
                ((mt0) ((sg.x0) obj)).K.f35643e0.invalidate();
                return;
            case 20:
                sg.t1 t1Var = (sg.t1) obj;
                t1Var.getClass();
                t1Var.f48517n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 21:
                sg.a2 a2Var = (sg.a2) obj;
                a2Var.getClass();
                a2Var.f48145x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.invalidate();
                return;
            case 22:
                rg.n nVar = (rg.n) obj;
                nVar.f48145x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 23:
                sg.p2 p2Var = (sg.p2) obj;
                p2Var.getClass();
                p2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 24:
                sg.v2 v2Var = (sg.v2) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.f48542y = floatValue5;
                bi.r rVar = v2Var.f48535c;
                rVar.setAlpha(floatValue5);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f48542y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f48542y));
                v2Var.f48534b.invalidate();
                return;
            case 25:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f26214o0;
                limitPreviewView.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue6 < 0.5f) {
                    f7 = (floatValue6 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f26218b0 = f7;
                return;
            case 26:
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f48978f.invalidate();
                tg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 27:
                ((tg.x1) obj).f49116a.f49098o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 28:
                ((ug.f) obj).f49766a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                vg.b bVar = (vg.b) obj;
                bVar.getClass();
                bVar.f50142b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
        }
    }
}
