package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SecretMediaViewer;
public final class x89 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public x89(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                z99 z99Var = (z99) obj;
                z99Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z99Var.j0();
                return;
            case 1:
                vf9 vf9Var = (vf9) obj;
                vf9Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf9Var.requestLayout();
                vf9Var.invalidate();
                return;
            case 2:
                og9 og9Var = (og9) obj;
                og9Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                og9Var.t.run();
                return;
            case 3:
                eh9 eh9Var = (eh9) obj;
                eh9Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eh9Var.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                rh3 rh3Var = (rh3) obj;
                rh3Var.getClass();
                rh3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh3Var.g();
                return;
            case 5:
                bl9 bl9Var = (bl9) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl9Var.F = floatValue;
                al9 al9Var = bl9Var.a;
                al9Var.setScaleX(1.0f - floatValue);
                al9Var.setScaleY(1.0f - bl9Var.F);
                bl9Var.invalidate();
                return;
            case 6:
                ((nn9) obj).k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                tq9 tq9Var = (tq9) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tq9Var.r = floatValue2;
                tq9Var.E.setScaleX(gl.R1(0.8f, 1.0f, floatValue2));
                tq9Var.E.setScaleY(gl.R1(0.8f, 1.0f, tq9Var.r));
                tq9Var.E.setAlpha(tq9Var.r);
                tq9Var.s.invalidate();
                tq9Var.w.invalidate();
                return;
            case 8:
                er9 er9Var = (er9) obj;
                er9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er9Var.j();
                return;
            case 9:
                ((er9) ((u88) obj).b).invalidate();
                return;
            case 10:
                ((jr9) obj).setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                vs9 vs9Var = (vs9) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs9Var.G = floatValue3;
                vs9Var.setShown(floatValue3);
                vs9Var.b(false);
                return;
            case 12:
                SecretMediaViewer secretMediaViewer = ((fu9) obj).d;
                secretMediaViewer.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 13:
                SecretMediaViewer secretMediaViewer2 = ((fu9) obj).d;
                secretMediaViewer2.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 14:
                ((SecretMediaViewer) ((u88) obj).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 15:
                qu9 qu9Var = (qu9) obj;
                qu9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (qu9Var.T) {
                    qu9Var.O.invalidate();
                    return;
                }
                return;
            case 16:
                ((kw9) obj).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                lw9 lw9Var = (lw9) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw9Var.r = floatValue4;
                View view2 = lw9Var.e;
                if (view2 != null) {
                    view2.setAlpha(floatValue4);
                    return;
                }
                oi3 oi3Var = lw9Var.d;
                if (oi3Var != null) {
                    oi3Var.invalidate();
                    return;
                }
                return;
            case 18:
                px9 px9Var = (px9) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px9Var.M = floatValue5;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = px9Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue5);
                pkb pkbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(s33.g.getInterpolation(px9Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = gl.s(px9Var.M, i, itemsCount, 4.0f);
                    pkbVar.getChildAt(i).setTranslationY((1.0f - s) * gl.L(-12.0f));
                    pkbVar.getChildAt(i).setAlpha(s);
                }
                return;
            case 19:
                ((hz9) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                xz9 xz9Var = (xz9) obj;
                xz9Var.r = ((Float) xz9Var.x.getAnimatedValue()).floatValue();
                xz9Var.invalidate();
                return;
            case 21:
                n0a n0aVar = (n0a) obj;
                n0aVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0aVar.e.setTranslationY(((-n0aVar.d) + n0aVar.getMeasuredHeight()) - n0aVar.w);
                return;
            case 22:
                k4a k4aVar = (k4a) obj;
                k4aVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4aVar.invalidate();
                return;
            case 23:
                ((d8a) obj).k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                y9a y9aVar = (y9a) obj;
                taa taaVar = y9aVar.b;
                taaVar.p2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                taaVar.m1.invalidate();
                y9aVar.invalidate();
                return;
            case 25:
                ((gt3) obj).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                nfa nfaVar = (nfa) obj;
                nfaVar.T0(nfaVar.getTabProgress());
                return;
            case 27:
                ((iea) obj).h.invalidate();
                return;
            case 28:
                qfa qfaVar = (qfa) obj;
                qfaVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qfaVar.invalidate();
                return;
            default:
                bia biaVar = (bia) obj;
                biaVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                biaVar.invalidate();
                return;
        }
    }
}
