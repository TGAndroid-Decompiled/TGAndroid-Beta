package ki;

import android.animation.ValueAnimator;
import android.view.View;
import bi.i5;
import bi.y3;
import g.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.Components.voip.q0;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.z0;
import org.telegram.ui.co;
import org.telegram.ui.k0;
import org.telegram.ui.ni1;
import org.telegram.ui.s00;
import org.telegram.ui.web.w1;
import org.telegram.ui.yd;
import org.telegram.ui.yt0;
import rg.a2;
import rg.o2;
import rg.t1;
import rg.v2;
import rg.y0;
import sg.r0;
import sg.z1;
import zh.a4;
import zh.j7;
import zh.k8;
import zh.p2;
import zh.q2;
import zh.w3;
import zh.x2;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f14997a;
    public final Object f14998b;

    public a(a4.m mVar, View view) {
        this.f14997a = 9;
        this.f14998b = mVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        p2 p2Var;
        boolean z10;
        int i10 = this.f14997a;
        Object obj = this.f14998b;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                co coVar = oVar.F;
                if (coVar != null) {
                    coVar.r9();
                    if (coVar.J8 != null) {
                        coVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                oVar.G.invalidate();
                return;
            case 1:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                q0Var.f31756i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                ni1 ni1Var = (ni1) obj;
                ni1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                z0 z0Var = ni1Var.f31443c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * ni1Var.E));
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
                k2 k2Var = (k2) obj;
                k2Var.getClass();
                k2Var.f31611s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.f31605b.invalidate();
                return;
            case 6:
                y3 y3Var = (y3) obj;
                ((i5) y3Var.f4038b).f32503a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y3Var.invalidate();
                return;
            case 7:
                w1 w1Var = (w1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.U = floatValue;
                w1Var.V.setAlpha(floatValue);
                w1Var.invalidate();
                return;
            case 8:
                k0 k0Var = (k0) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f42302a0 = floatValue2;
                k0Var.j(floatValue2);
                k0Var.f42304b0.setAlpha(k0Var.f42302a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.f42302a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.f42302a0);
                k0Var.invalidate();
                return;
            case 9:
                ((View) ((b0) ((a4.m) obj).f295b).d.getParent()).invalidate();
                return;
            case 10:
                ((yt0) ((y0) obj)).K.f33576e0.invalidate();
                return;
            case 11:
                t1 t1Var = (t1) obj;
                t1Var.getClass();
                t1Var.f45524n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 12:
                a2 a2Var = (a2) obj;
                a2Var.getClass();
                a2Var.f45152x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.invalidate();
                return;
            case 13:
                qg.n nVar = (qg.n) obj;
                nVar.f45152x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                return;
            case 14:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                o2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 15:
                v2 v2Var = (v2) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.f45562y = floatValue3;
                yd ydVar = v2Var.f45554c;
                ydVar.setAlpha(floatValue3);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f45562y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.f45562y));
                v2Var.f45553b.invalidate();
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24071l0;
                limitPreviewView.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue4 < 0.5f) {
                    f7 = (floatValue4 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue4 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24075b0 = f7;
                return;
            case 17:
                r0 r0Var = (r0) obj;
                r0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.d.invalidate();
                sg.q0 q0Var2 = r0Var.f46266e;
                if (q0Var2 != null) {
                    q0Var2.invalidate();
                    return;
                }
                return;
            case 18:
                ((z1) obj).f46404a.f46384o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 19:
                ug.b bVar = (ug.b) obj;
                bVar.getClass();
                bVar.f47093b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 20:
                yg.i iVar = (yg.i) obj;
                iVar.getClass();
                iVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                w3 w3Var = (w3) obj;
                w3Var.Y0.f9286c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.T1();
                return;
            case 22:
                ((x2) obj).h.invalidate();
                return;
            case 23:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue5;
                if (floatValue5 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.f52444l) && z10) {
                    p2Var.f52444l = false;
                    p2Var.b();
                }
                q2Var.invalidate();
                return;
            case 24:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 25:
                a4 a4Var = (a4) obj;
                a4Var.getClass();
                a4Var.f51719y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a4Var.invalidate();
                return;
            case 26:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s00 s00Var = ((j7) obj).f52143c;
                s00Var.setScaleX(floatValue6);
                s00Var.setScaleY(floatValue6);
                return;
            default:
                k8 k8Var = (k8) obj;
                k8Var.getClass();
                k8Var.f52186c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                return;
        }
    }

    public a(Object obj, int i10) {
        this.f14997a = i10;
        this.f14998b = obj;
    }
}
