package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public f0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                h0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.requestLayout();
                return;
            case 1:
                w7 w7Var = (w7) obj;
                w7Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                return;
            case 2:
                a8 a8Var = (a8) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setTextColor(on2.f(floatValue, -1, -9194260));
                a8Var.setIconColor(on2.f(floatValue, -1, -9194260));
                return;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < itemsCount) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof j8)) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                            f = (itemsCount - 1) - i;
                        } else {
                            f = i;
                        }
                        float s = gm.s(floatValue2, f, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s) * gm.L(-6.0f));
                        if (childAt.isEnabled()) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.5f;
                        }
                        childAt.setAlpha(s * f2);
                    }
                    i++;
                }
                return;
            case 4:
                gb gbVar = (gb) obj;
                if (!gbVar.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (gbVar.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float A = (int) td4.A(1.0f, floatValue3, gbVar.q, gbVar.p * floatValue3);
                    if (!(gbVar instanceof j92)) {
                        gbVar.a.setTranslationY(A);
                    }
                    gbVar.e(-A, floatValue3, gbVar.s);
                    return;
                }
                return;
            case 5:
                ic icVar = (ic) obj;
                icVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                icVar.a();
                icVar.requestLayout();
                return;
            case 6:
                ho hoVar = (ho) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hoVar.q = floatValue4;
                d53 d53Var = hoVar.x;
                if (d53Var != null) {
                    floatValue4 = d53Var.getInterpolation(floatValue4);
                }
                hoVar.r = floatValue4;
                hoVar.invalidateSelf();
                Runnable runnable = hoVar.c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((ns) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                cx cxVar = (cx) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cxVar.d.setTextColor(on2.f(floatValue5, -16777216, -1));
                cxVar.e.setTextColor(on2.f(floatValue5, -16777216, -1));
                cxVar.f.setTextColor(on2.f(floatValue5, -16777216, -1));
                return;
            case 9:
                yy yyVar = (yy) obj;
                yyVar.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yyVar.invalidate();
                return;
            case 10:
                i30 i30Var = (i30) obj;
                i30Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i30Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 11:
                ((mc0) obj).o0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                qc0 qc0Var = (qc0) obj;
                float S1 = gm.S1(valueAnimator.getAnimatedFraction(), qc0Var.n);
                int i2 = (int) (255.0f * S1);
                qc0Var.f.setAlpha(i2);
                qc0Var.h.setAlpha(i2);
                qc0Var.r.setAlpha((int) (66.0f * S1));
                qc0Var.s.setAlpha((int) (85.0f * S1));
                qc0Var.w.setAlpha(i2);
                qc0Var.H = S1;
                qc0Var.invalidate();
                return;
            case 13:
                gd0 gd0Var = (gd0) obj;
                gd0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gd0Var.d();
                return;
            case 14:
                ci0 ci0Var = (ci0) obj;
                ci0Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci0Var.invalidateSelf();
                return;
            case 15:
                wm0 wm0Var = (wm0) obj;
                wm0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm0Var.b.invalidate();
                return;
            case 16:
                mn0 mn0Var = (mn0) obj;
                mn0Var.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mn0Var.invalidate();
                return;
            case 17:
                wp0 wp0Var = (wp0) obj;
                wp0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.a.run();
                return;
            case 18:
                ks0 ks0Var = (ks0) obj;
                ks0Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ks0Var.r.setTranslationY(gm.U1(ks0Var.x, -gm.L(42.0f), 0));
                ks0Var.n.setTranslationY(gm.U1(ks0Var.x, 0, gm.L(42.0f)));
                return;
            case 19:
                ((rs0) obj).n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                mm mmVar = (mm) obj;
                ((kc0) mmVar.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mmVar.invalidate();
                return;
            case 21:
                xy0 xy0Var = (xy0) obj;
                xy0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = xy0Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                xy0Var.invalidate();
                return;
            case 22:
                ez0 ez0Var = (ez0) obj;
                ez0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.b.invalidate();
                return;
            case 23:
                u51 u51Var = (u51) obj;
                u51Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u51Var.b();
                return;
            case 24:
                k91 k91Var = (k91) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < k91Var.b.getChildCount()) {
                    int i3 = h91.E;
                    ((h91) k91Var.b.getChildAt(i)).b(floatValue6);
                    i++;
                }
                return;
            case 25:
                ((CameraView) obj).lambda$showTexture$6(valueAnimator);
                return;
            case 26:
                pc1 pc1Var = (pc1) obj;
                pc1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc1 jc1Var = pc1Var.f;
                qu3 editText = jc1Var.getEditText();
                int L = gm.L(-26.0f);
                int L2 = gm.L(2.0f);
                editText.setTranslationX(gm.U1(pc1Var.o0, pc1Var.getEditTextLeft() + L, L2));
                FrameLayout frameLayout = pc1Var.s;
                int L3 = gm.L(2.0f);
                frameLayout.setTranslationX(gm.U1(pc1Var.o0, -gm.L(8.0f), L3));
                frameLayout.setTranslationY(gm.U1(pc1Var.o0, -gm.L(8.0f), 0));
                jc1Var.getEmojiButton().setAlpha(pc1Var.o0);
                pc1Var.r.setAlpha((float) Math.pow(pc1Var.o0, 16.0d));
                pc1Var.u(pc1Var.o0);
                lc1 lc1Var = pc1Var.N;
                if (lc1Var != null) {
                    lc1Var.setAlpha((float) Math.pow(pc1Var.o0, 4.0d));
                }
                jc1Var.getEditText().invalidate();
                pc1Var.invalidate();
                return;
            case 27:
                fj1 fj1Var = (fj1) obj;
                fj1Var.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fj1Var.b.invalidateSelf();
                return;
            case 28:
                rl1 rl1Var = (rl1) obj;
                rl1Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl1Var.g.a.invalidate();
                return;
            default:
                ((x43) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
