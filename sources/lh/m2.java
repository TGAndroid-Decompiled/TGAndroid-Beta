package lh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.eh1;
import org.telegram.ui.rn;
import org.telegram.ui.xs0;

public final class m2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16376a;

    public final Object f16377b;

    public m2(a9.i iVar, View view) {
        this.f16376a = 18;
        this.f16377b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16376a) {
            case 0:
                r2 r2Var = (r2) this.f16377b;
                r2Var.getClass();
                r2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.i();
                break;
            case 1:
                ((t3) this.f16377b).f16844b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                w3 w3Var = (w3) this.f16377b;
                w3Var.getClass();
                w3Var.f16987k0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                w3Var.invalidate();
                break;
            case 3:
                ((k4) this.f16377b).invalidate();
                break;
            case 4:
                i6 i6Var = (i6) this.f16377b;
                i6Var.getClass();
                i6Var.f16114n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.e();
                break;
            case 5:
                h6 h6Var = (h6) this.f16377b;
                h6Var.getClass();
                h6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                break;
            case 6:
                d7 d7Var = (d7) this.f16377b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7Var.A = fFloatValue;
                c7 c7Var = d7Var.f15860a;
                c7Var.setScaleX(1.0f - fFloatValue);
                c7Var.setScaleY(1.0f - d7Var.A);
                d7Var.invalidate();
                break;
            case 7:
                m8 m8Var = (m8) this.f16377b;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.f16394r = fFloatValue2;
                Utilities.Callback callback = m8Var.f16397x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(fFloatValue2, 1.0f, -1.0f)));
                }
                m8Var.f16388a.invalidate();
                break;
            case 8:
                ((k9) this.f16377b).f16258x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                n9 n9Var = (n9) this.f16377b;
                n9Var.getClass();
                n9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.f16377b;
                p0Var.getClass();
                p0Var.f33796i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 11:
                eh1 eh1Var = (eh1) this.f16377b;
                eh1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.y0 y0Var = eh1Var.f33477c;
                y0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (iDp * eh1Var.A));
                y0Var.requestLayout();
                break;
            case 12:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f16377b;
                g1Var.getClass();
                g1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f16377b;
                s1Var.getClass();
                s1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.f16377b;
                l2Var.getClass();
                l2Var.f33709s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.f33703b.invalidate();
                break;
            case 15:
                jh.y2 y2Var = (jh.y2) this.f16377b;
                ((jh.z3) y2Var.f14151b).f30898a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                y2Var.invalidate();
                break;
            case 16:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.f16377b;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.Q = fFloatValue3;
                r1Var.R.setAlpha(fFloatValue3);
                r1Var.invalidate();
                break;
            case 17:
                org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this.f16377b;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.T = fFloatValue4;
                o0Var.j(fFloatValue4);
                o0Var.U.setAlpha(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                break;
            case 18:
                ((View) ((g.b0) ((a9.i) this.f16377b).f181b).d.getParent()).invalidate();
                break;
            case 19:
                rf.h hVar = (rf.h) this.f16377b;
                hVar.f46998f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f46999g.f47000a.invalidate();
                break;
            case 20:
                rh.m4 m4Var = (rh.m4) this.f16377b;
                m4Var.getClass();
                m4Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.requestLayout();
                m4Var.invalidate();
                break;
            case 21:
                sh.m mVar = (sh.m) this.f16377b;
                rn rnVar = mVar.F;
                if (rnVar == null) {
                    mVar.G.invalidate();
                } else {
                    rnVar.r9();
                    if (rnVar.F8 != null) {
                        rnVar.fragmentView.invalidate();
                    }
                }
                break;
            case 22:
                ((xs0) ((zf.v0) this.f16377b)).G.f35583a0.invalidate();
                break;
            case 23:
                zf.r1 r1Var2 = (zf.r1) this.f16377b;
                r1Var2.getClass();
                r1Var2.f50689n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var2.invalidate();
                break;
            case 24:
                zf.y1 y1Var = (zf.y1) this.f16377b;
                y1Var.getClass();
                y1Var.f50789x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                break;
            case 25:
                yf.n nVar = (yf.n) this.f16377b;
                nVar.f50789x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.invalidate();
                break;
            case 26:
                zf.n2 n2Var = (zf.n2) this.f16377b;
                n2Var.getClass();
                n2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                zf.t2 t2Var = (zf.t2) this.f16377b;
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f50715y = fFloatValue5;
                hh.m mVar2 = t2Var.f50707c;
                mVar2.setAlpha(fFloatValue5);
                mVar2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f50715y));
                mVar2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f50715y));
                t2Var.f50706b.invalidate();
                break;
        }
    }

    public m2(Object obj, int i10) {
        this.f16376a = i10;
        this.f16377b = obj;
    }
}
