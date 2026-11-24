package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SecretMediaViewer;
public final class p29 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public p29(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        float f2 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                t29 t29Var = (t29) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t29Var.J = floatValue;
                s29 s29Var = t29Var.b;
                if (t29Var.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                s29Var.setScaleY(floatValue * f);
                float f3 = t29Var.J;
                if (t29Var.x) {
                    f2 = 0.76f;
                }
                s29Var.setScaleX(f3 * f2);
                return;
            case 1:
                n99 n99Var = (n99) obj;
                n99Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n99Var.invalidateSelf();
                return;
            case 2:
                zb9 zb9Var = (zb9) obj;
                zb9Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb9Var.k0();
                return;
            case 3:
                zh9 zh9Var = (zh9) obj;
                zh9Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zh9Var.requestLayout();
                zh9Var.invalidate();
                return;
            case 4:
                ri9 ri9Var = (ri9) obj;
                ri9Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri9Var.t.run();
                return;
            case 5:
                hj9 hj9Var = (hj9) obj;
                hj9Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = hj9Var.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                dj3 dj3Var = (dj3) obj;
                dj3Var.getClass();
                dj3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj3Var.g();
                return;
            case 7:
                bn9 bn9Var = (bn9) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn9Var.F = floatValue2;
                an9 an9Var = bn9Var.a;
                an9Var.setScaleX(1.0f - floatValue2);
                an9Var.setScaleY(1.0f - bn9Var.F);
                bn9Var.invalidate();
                return;
            case 8:
                ((op9) obj).k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                vs9 vs9Var = (vs9) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs9Var.r = floatValue3;
                vs9Var.E.setScaleX(gm.R1(0.8f, 1.0f, floatValue3));
                vs9Var.E.setScaleY(gm.R1(0.8f, 1.0f, vs9Var.r));
                vs9Var.E.setAlpha(vs9Var.r);
                vs9Var.s.invalidate();
                vs9Var.w.invalidate();
                return;
            case 10:
                gt9 gt9Var = (gt9) obj;
                gt9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gt9Var.j();
                return;
            case 11:
                ((gt9) ((wa8) obj).b).invalidate();
                return;
            case 12:
                ((lt9) obj).setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 13:
                xu9 xu9Var = (xu9) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu9Var.G = floatValue4;
                xu9Var.setShown(floatValue4);
                xu9Var.b(false);
                return;
            case 14:
                SecretMediaViewer secretMediaViewer = ((iw9) obj).d;
                secretMediaViewer.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 15:
                SecretMediaViewer secretMediaViewer2 = ((iw9) obj).d;
                secretMediaViewer2.Z.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 16:
                ((SecretMediaViewer) ((wa8) obj).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 17:
                tw9 tw9Var = (tw9) obj;
                tw9Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (tw9Var.T) {
                    tw9Var.O.invalidate();
                    return;
                }
                return;
            case 18:
                ((my9) obj).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 19:
                ny9 ny9Var = (ny9) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ny9Var.r = floatValue5;
                View view2 = ny9Var.e;
                if (view2 != null) {
                    view2.setAlpha(floatValue5);
                    return;
                }
                yj3 yj3Var = ny9Var.d;
                if (yj3Var != null) {
                    yj3Var.invalidate();
                    return;
                }
                return;
            case 20:
                rz9 rz9Var = (rz9) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz9Var.M = floatValue6;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = rz9Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue6);
                qmb qmbVar = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(d53.g.getInterpolation(rz9Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = gm.s(rz9Var.M, i, itemsCount, 4.0f);
                    qmbVar.getChildAt(i).setTranslationY((1.0f - s) * gm.L(-12.0f));
                    qmbVar.getChildAt(i).setAlpha(s);
                }
                return;
            case 21:
                ((j1a) obj).setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 22:
                z1a z1aVar = (z1a) obj;
                z1aVar.r = ((Float) z1aVar.x.getAnimatedValue()).floatValue();
                z1aVar.invalidate();
                return;
            case 23:
                p2a p2aVar = (p2a) obj;
                p2aVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2aVar.e.setTranslationY(((-p2aVar.d) + p2aVar.getMeasuredHeight()) - p2aVar.w);
                return;
            case 24:
                m6a m6aVar = (m6a) obj;
                m6aVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6aVar.invalidate();
                return;
            case 25:
                ((daa) obj).l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                yba ybaVar = (yba) obj;
                tca tcaVar = ybaVar.b;
                tcaVar.p2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tcaVar.m1.invalidate();
                ybaVar.invalidate();
                return;
            case 27:
                ((qu3) obj).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                nha nhaVar = (nha) obj;
                nhaVar.T0(nhaVar.getTabProgress());
                return;
            default:
                ((iga) obj).h.invalidate();
                return;
        }
    }
}
