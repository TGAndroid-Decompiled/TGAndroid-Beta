package ki;

import android.animation.ValueAnimator;
import android.view.View;
import bi.b4;
import bi.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.q0;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.z0;
import org.telegram.ui.ee;
import org.telegram.ui.fo;
import org.telegram.ui.fu0;
import org.telegram.ui.m0;
import org.telegram.ui.vi1;
import org.telegram.ui.web.v1;
import org.telegram.ui.x00;
import rg.a2;
import rg.p2;
import rg.t1;
import rg.v2;
import rg.y0;
import sg.o0;
import sg.x1;
import zh.d7;
import zh.e8;
import zh.k2;
import zh.l2;
import zh.r3;
import zh.s2;
import zh.v3;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f14292a;
    public final Object f14293b;

    public a(Object obj, int i10) {
        this.f14292a = i10;
        this.f14293b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        k2 k2Var;
        boolean z10;
        int i10 = this.f14292a;
        Object obj = this.f14293b;
        switch (i10) {
            case 0:
                n nVar = (n) obj;
                fo foVar = nVar.F;
                if (foVar != null) {
                    foVar.w9();
                    if (foVar.J8 != null) {
                        foVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
            case 1:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                q0Var.f30075i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                vi1 vi1Var = (vi1) obj;
                vi1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = vi1Var.f29776c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * vi1Var.E));
                z0Var.requestLayout();
                return;
            case 3:
                h1 h1Var = (h1) obj;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                s1 s1Var = (s1) obj;
                s1Var.getClass();
                s1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.k2 k2Var2 = (org.telegram.ui.Components.voip.k2) obj;
                k2Var2.getClass();
                k2Var2.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var2.f29935b.invalidate();
                return;
            case 6:
                b4 b4Var = (b4) obj;
                ((k5) b4Var.f2871b).f31507a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                b4Var.invalidate();
                return;
            case 7:
                v1 v1Var = (v1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.U = floatValue;
                v1Var.V.setAlpha(floatValue);
                v1Var.invalidate();
                return;
            case 8:
                m0 m0Var = (m0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f41202a0 = floatValue2;
                m0Var.j(floatValue2);
                m0Var.f41204b0.setAlpha(m0Var.f41202a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.f41202a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.f41202a0);
                m0Var.invalidate();
                return;
            case 9:
                ((fu0) ((y0) obj)).K.f31928e0.invalidate();
                return;
            case 10:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                t1Var.f44314n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 11:
                a2 a2Var = (a2) obj;
                a2Var.getClass();
                a2Var.f43957x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.invalidate();
                return;
            case 12:
                qg.n nVar2 = (qg.n) obj;
                nVar2.f43957x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.invalidate();
                return;
            case 13:
                p2 p2Var = (p2) obj;
                p2Var.getClass();
                p2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 14:
                v2 v2Var = (v2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.f44349y = floatValue3;
                ee eeVar = v2Var.f44342c;
                eeVar.setAlpha(floatValue3);
                eeVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f44349y));
                eeVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f44349y));
                v2Var.f44341b.invalidate();
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f22920l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f22924b0 = f7;
                return;
            case 16:
                sg.q0 q0Var2 = (sg.q0) obj;
                q0Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var2.d.invalidate();
                o0 o0Var = q0Var2.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 17:
                ((x1) obj).f45428a.f45410o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                ((tg.f) obj).f45693a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 19:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.f46280b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 20:
                yg.i iVar = (yg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                r3 r3Var = (r3) obj;
                r3Var.Z0.f8934c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.U1();
                return;
            case 22:
                ((s2) obj).h.invalidate();
                return;
            case 23:
                l2 l2Var = (l2) obj;
                l2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (k2Var = l2Var.H) != null && (z10 = k2Var.f50756l) && z10) {
                    k2Var.f50756l = false;
                    k2Var.b();
                }
                l2Var.invalidate();
                return;
            case 24:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 25:
                v3 v3Var = (v3) obj;
                v3Var.getClass();
                v3Var.f51246y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.invalidate();
                return;
            case 26:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x00 x00Var = ((d7) obj).f50390c;
                x00Var.setScaleX(floatValue6);
                x00Var.setScaleY(floatValue6);
                return;
            default:
                e8 e8Var = (e8) obj;
                e8Var.getClass();
                e8Var.f50463c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.invalidate();
                return;
        }
    }
}
