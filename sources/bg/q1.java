package bg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import jh.ab;
import jh.h5;
import jh.m5;
import jh.w9;
import jh.x9;
import lh.s4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.vs0;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2463a;
    public final Object f2464b;

    public q1(Object obj, int i10) {
        this.f2463a = i10;
        this.f2464b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        jh.y3 y3Var;
        boolean z10;
        int i10 = this.f2463a;
        Object obj = this.f2464b;
        switch (i10) {
            case 0:
                ((vs0) ((s1) obj)).G.f35647a0.invalidate();
                return;
            case 1:
                r2 r2Var = (r2) obj;
                r2Var.getClass();
                r2Var.f2475n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                return;
            case 2:
                a3 a3Var = (a3) obj;
                a3Var.getClass();
                a3Var.f2091x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                return;
            case 3:
                ag.q qVar = (ag.q) obj;
                qVar.f2091x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.invalidate();
                return;
            case 4:
                u3 u3Var = (u3) obj;
                u3Var.getClass();
                u3Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                c4 c4Var = (c4) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.f2136y = floatValue;
                y3 y3Var2 = c4Var.f2128c;
                y3Var2.setAlpha(floatValue);
                y3Var2.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.f2136y));
                y3Var2.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.f2136y));
                c4Var.f2127b.invalidate();
                return;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f26457h0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f9 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f9 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.U = f9;
                return;
            case 7:
                cg.d1 d1Var = (cg.d1) obj;
                d1Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.d.invalidate();
                cg.b1 b1Var = d1Var.f3092e;
                if (b1Var != null) {
                    b1Var.invalidate();
                    return;
                }
                return;
            case 8:
                ((cg.s2) obj).f3367a.f3342o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                eg.b bVar = (eg.b) obj;
                bVar.getClass();
                bVar.f5922b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 10:
                ig.k kVar = (ig.k) obj;
                kVar.getClass();
                kVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                h5 h5Var = (h5) obj;
                h5Var.U0.f164c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h5Var.T1();
                return;
            case 12:
                ((jh.g4) obj).h.invalidate();
                return;
            case 13:
                jh.z3 z3Var = (jh.z3) obj;
                z3Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.A = floatValue3;
                if (floatValue3 >= 0.8f && (y3Var = z3Var.D) != null && (z10 = y3Var.f13123l) && z10) {
                    y3Var.f13123l = false;
                    y3Var.b();
                }
                z3Var.invalidate();
                return;
            case 14:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 15:
                m5 m5Var = (m5) obj;
                m5Var.getClass();
                m5Var.f12464y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.invalidate();
                return;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = ((x9) obj).f13087c;
                w9Var.setScaleX(floatValue4);
                w9Var.setScaleY(floatValue4);
                return;
            case 17:
                ab abVar = (ab) obj;
                abVar.getClass();
                abVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abVar.invalidate();
                return;
            case 18:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg.u uVar = ((kg.v) obj).f13871b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    return;
                }
                return;
            case 19:
                lh.a aVar = (lh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 20:
                lh.o oVar = (lh.o) obj;
                oVar.K.f15668e = AndroidUtilities.lerp(0.0f, 1.0f - oVar.U.W, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.invalidate();
                return;
            case 21:
                ((lh.u0) obj).invalidate();
                return;
            case 22:
                lh.f2 f2Var = (lh.f2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.f16279c.setAlpha(floatValue6);
                f2Var.f16275a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                f2Var.invalidate();
                return;
            case 23:
                lh.n0 n0Var = (lh.n0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.f15952e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(n0Var.f15953f, 1.0f, floatValue7) * 255.0f));
                    n0Var.h.invalidate();
                    return;
                }
                return;
            case 24:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh.n0 n0Var2 = (lh.n0) ((ag.m0) obj).f586b;
                Drawable drawable2 = n0Var2.f15952e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, n0Var2.f15953f, floatValue8) * 255.0f));
                    n0Var2.h.invalidate();
                    return;
                }
                return;
            case 25:
                lh.i1 i1Var = (lh.i1) obj;
                i1Var.getClass();
                i1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                lh.q1 q1Var = (lh.q1) obj;
                q1Var.getClass();
                q1Var.f16114n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 27:
                lh.z3 z3Var2 = (lh.z3) obj;
                z3Var2.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = z3Var2.f16455c;
                textViewArr[0].setAlpha(floatValue9);
                float f10 = 1.0f - floatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue9 * AndroidUtilities.dp(4.0f));
                return;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.C = floatValue10;
                iz0Var.N = floatValue10;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            default:
                s4 s4Var = (s4) obj;
                s4Var.f16211r = ((Float) s4Var.f16213w.getAnimatedValue()).floatValue();
                s4Var.invalidate();
                return;
        }
    }
}
