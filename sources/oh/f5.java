package oh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.bi1;
import org.telegram.ui.xn;
public final class f5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17137a;
    public final Object f17138b;

    public f5(ja.c cVar, View view) {
        this.f17137a = 24;
        this.f17138b = cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17137a) {
            case 0:
                n5 n5Var = (n5) this.f17138b;
                n5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.f17492e.setTranslationY(((-n5Var.d) + n5Var.getMeasuredHeight()) - n5Var.v);
                return;
            case 1:
                x6 x6Var = (x6) this.f17138b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = x6Var.f17930a;
                w6 w6Var = (w6) arrayList.get(x6Var.d);
                w6Var.f17906n = floatValue;
                w6Var.invalidate();
                int i10 = x6Var.f17932c;
                if (i10 != -1) {
                    w6 w6Var2 = (w6) arrayList.get(i10);
                    w6Var2.f17906n = 1.0f - floatValue;
                    w6Var2.invalidate();
                    return;
                }
                return;
            case 2:
                z7 z7Var = (z7) this.f17138b;
                z7Var.getClass();
                z7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f17138b;
                q0Var.getClass();
                q0Var.f32290i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                bi1 bi1Var = (bi1) this.f17138b;
                bi1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = bi1Var.f31972c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * bi1Var.B));
                z0Var.requestLayout();
                return;
            case 5:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f17138b;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.f17138b;
                t1Var.getClass();
                t1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 7:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f17138b;
                n2Var.getClass();
                n2Var.f32213s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f32207b.invalidate();
                return;
            case 8:
                z2 z2Var = (z2) this.f17138b;
                ((a4) z2Var.f17994b).f30011a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                return;
            case 9:
                org.telegram.ui.web.t1 t1Var2 = (org.telegram.ui.web.t1) this.f17138b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var2.R = floatValue2;
                t1Var2.S.setAlpha(floatValue2);
                t1Var2.invalidate();
                return;
            case 10:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f17138b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U = floatValue3;
                m0Var.j(floatValue3);
                m0Var.V.setAlpha(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                return;
            case 11:
                ph.p pVar = (ph.p) this.f17138b;
                pVar.f44445w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.f44443r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, pVar.f44445w));
                pVar.f44442n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), pVar.f44445w));
                return;
            case 12:
                qh.k kVar = (qh.k) this.f17138b;
                kVar.f45581l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh.f fVar = kVar.f45574f;
                fVar.getEditText().setTranslationX(AndroidUtilities.lerp(kVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), kVar.f45581l0));
                FrameLayout frameLayout = kVar.f45589s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), kVar.f45581l0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, kVar.f45581l0));
                fVar.getEmojiButton().setAlpha(kVar.f45581l0);
                kVar.f45587r.setAlpha((float) Math.pow(kVar.f45581l0, 16.0d));
                kVar.u(kVar.f45581l0);
                zh zhVar = kVar.J;
                if (zhVar != null) {
                    zhVar.setAlpha((float) Math.pow(kVar.f45581l0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 13:
                qh.u uVar = (qh.u) this.f17138b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f46149a.invalidate();
                return;
            case 14:
                qh.c2 c2Var = (qh.c2) this.f17138b;
                c2Var.getClass();
                c2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.i();
                return;
            case 15:
                ((qh.c3) this.f17138b).f45164b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                qh.e3 e3Var = (qh.e3) this.f17138b;
                e3Var.getClass();
                e3Var.f45275l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e3Var.invalidate();
                return;
            case 17:
                ((qh.q3) this.f17138b).invalidate();
                return;
            case 18:
                qh.d5 d5Var = (qh.d5) this.f17138b;
                d5Var.getClass();
                d5Var.f45231n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.e();
                return;
            case 19:
                qh.c5 c5Var = (qh.c5) this.f17138b;
                c5Var.getClass();
                c5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.invalidate();
                return;
            case 20:
                qh.v5 v5Var = (qh.v5) this.f17138b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.B = floatValue4;
                qh.u5 u5Var = v5Var.f46210a;
                u5Var.setScaleX(1.0f - floatValue4);
                u5Var.setScaleY(1.0f - v5Var.B);
                v5Var.invalidate();
                return;
            case 21:
                qh.d7 d7Var = (qh.d7) this.f17138b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d7Var.f45241r = floatValue5;
                Utilities.Callback callback = d7Var.f45244x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                d7Var.f45235a.invalidate();
                return;
            case 22:
                ((qh.w7) this.f17138b).f46271x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                qh.z7 z7Var2 = (qh.z7) this.f17138b;
                z7Var2.getClass();
                z7Var2.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                ((View) ((g.a0) ((ja.c) this.f17138b).f9988a).d.getParent()).invalidate();
                return;
            case 25:
                wf.h hVar = (wf.h) this.f17138b;
                hVar.f49625f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f49626g.f49627a.invalidate();
                return;
            case 26:
                wh.o4 o4Var = (wh.o4) this.f17138b;
                o4Var.getClass();
                o4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.requestLayout();
                o4Var.invalidate();
                return;
            default:
                xh.n nVar = (xh.n) this.f17138b;
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

    public f5(Object obj, int i10) {
        this.f17137a = i10;
        this.f17138b = obj;
    }
}
