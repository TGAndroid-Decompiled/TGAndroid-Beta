package ai;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import bi.da;
import bi.kb;
import bi.m3;
import bi.ob;
import bi.p5;
import bi.q8;
import bi.r8;
import bi.t4;
import bi.u7;
import bi.v7;
import bi.x4;
import gg.h1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.voip.a1;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.eo;
import org.telegram.ui.l0;
import org.telegram.ui.si1;
import org.telegram.ui.web.v1;
import org.telegram.ui.yt0;
import org.telegram.ui.zd;
import pg.n2;
import pg.r1;
import pg.t2;
import pg.w0;
import pg.y1;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f408a;
    public final Object f409b;

    public a(Object obj, int i10) {
        this.f408a = i10;
        this.f409b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f408a) {
            case 0:
                g0 g0Var = (g0) this.f409b;
                g0Var.f449w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f447r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, g0Var.f449w));
                g0Var.f446n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), g0Var.f449w));
                return;
            case 1:
                bi.o oVar = (bi.o) this.f409b;
                oVar.f3278o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.i iVar = oVar.f3268f;
                iVar.getEditText().setTranslationX(AndroidUtilities.lerp(oVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), oVar.f3278o0));
                FrameLayout frameLayout = oVar.f3283s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), oVar.f3278o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, oVar.f3278o0));
                iVar.getEmojiButton().setAlpha(oVar.f3278o0);
                oVar.f3281r.setAlpha((float) Math.pow(oVar.f3278o0, 16.0d));
                oVar.u(oVar.f3278o0);
                bi.k kVar = oVar.M;
                if (kVar != null) {
                    kVar.setAlpha((float) Math.pow(oVar.f3278o0, 4.0d));
                }
                iVar.getEditText().invalidate();
                oVar.invalidate();
                return;
            case 2:
                bi.c0 c0Var = (bi.c0) this.f409b;
                c0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.f2392a.invalidate();
                return;
            case 3:
                m3 m3Var = (m3) this.f409b;
                m3Var.getClass();
                m3Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.i();
                return;
            case 4:
                ((t4) this.f409b).f3674b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                x4 x4Var = (x4) this.f409b;
                x4Var.getClass();
                x4Var.f3893o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x4Var.invalidate();
                return;
            case 6:
                ((p5) this.f409b).invalidate();
                return;
            case 7:
                v7 v7Var = (v7) this.f409b;
                v7Var.getClass();
                v7Var.f3795n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v7Var.e();
                return;
            case 8:
                u7 u7Var = (u7) this.f409b;
                u7Var.getClass();
                u7Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                return;
            case 9:
                r8 r8Var = (r8) this.f409b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.E = floatValue;
                q8 q8Var = r8Var.f3549a;
                q8Var.setScaleX(1.0f - floatValue);
                q8Var.setScaleY(1.0f - r8Var.E);
                r8Var.invalidate();
                return;
            case 10:
                da daVar = (da) this.f409b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.f2562r = floatValue2;
                Utilities.Callback callback = daVar.f2565x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue2, 1.0f, -1.0f)));
                }
                daVar.f2557a.invalidate();
                return;
            case 11:
                ((kb) this.f409b).f3014x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                ob obVar = (ob) this.f409b;
                obVar.getClass();
                obVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                hg.h hVar = (hg.h) this.f409b;
                hVar.f9395f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f9396g.f9397a.invalidate();
                return;
            case 14:
                hi.x4 x4Var2 = (hi.x4) this.f409b;
                x4Var2.getClass();
                x4Var2.f9945a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var2.requestLayout();
                x4Var2.invalidate();
                return;
            case 15:
                ii.n nVar = (ii.n) this.f409b;
                eo eoVar = nVar.F;
                if (eoVar != null) {
                    eoVar.r9();
                    if (eoVar.J8 != null) {
                        eoVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
            case 16:
                r0 r0Var = (r0) this.f409b;
                r0Var.getClass();
                r0Var.f28366i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                si1 si1Var = (si1) this.f409b;
                si1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                a1 a1Var = si1Var.f28068c;
                a1Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * si1Var.E));
                a1Var.requestLayout();
                return;
            case 18:
                i1 i1Var = (i1) this.f409b;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                t1 t1Var = (t1) this.f409b;
                t1Var.getClass();
                t1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 20:
                l2 l2Var = (l2) this.f409b;
                l2Var.getClass();
                l2Var.f28233s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.f28228b.invalidate();
                return;
            case 21:
                h1 h1Var = (h1) this.f409b;
                ((gg.i1) h1Var.f8903b).f28728a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h1Var.invalidate();
                return;
            case 22:
                v1 v1Var = (v1) this.f409b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.U = floatValue3;
                v1Var.V.setAlpha(floatValue3);
                v1Var.invalidate();
                return;
            case 23:
                l0 l0Var = (l0) this.f409b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f38101a0 = floatValue4;
                l0Var.j(floatValue4);
                l0Var.f38103b0.setAlpha(l0Var.f38101a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f38101a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f38101a0);
                l0Var.invalidate();
                return;
            case 24:
                ((yt0) ((w0) this.f409b)).K.f30049e0.invalidate();
                return;
            case 25:
                r1 r1Var = (r1) this.f409b;
                r1Var.getClass();
                r1Var.f40276n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 26:
                y1 y1Var = (y1) this.f409b;
                y1Var.getClass();
                y1Var.f40383x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 27:
                og.n nVar2 = (og.n) this.f409b;
                nVar2.f40383x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar2.invalidate();
                return;
            case 28:
                n2 n2Var = (n2) this.f409b;
                n2Var.getClass();
                n2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                t2 t2Var = (t2) this.f409b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.f40311y = floatValue5;
                zd zdVar = t2Var.f40304c;
                zdVar.setAlpha(floatValue5);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f40311y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.f40311y));
                t2Var.f40303b.invalidate();
                return;
        }
    }
}
