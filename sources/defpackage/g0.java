package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public g0(Object obj, byte b) {
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
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                i0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.requestLayout();
                return;
            case 1:
                x7 x7Var = (x7) obj;
                x7Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.invalidate();
                return;
            case 2:
                b8 b8Var = (b8) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b8Var.setTextColor(vm2.f(floatValue, -1, -9194260));
                b8Var.setIconColor(vm2.f(floatValue, -1, -9194260));
                return;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < itemsCount) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof k8)) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                            f = (itemsCount - 1) - i;
                        } else {
                            f = i;
                        }
                        float s = hl.s(floatValue2, f, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s) * hl.L(-6.0f));
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
                hb hbVar = (hb) obj;
                if (!hbVar.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (hbVar.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float A = (int) qd4.A(1.0f, floatValue3, hbVar.q, hbVar.p * floatValue3);
                    if (!(hbVar instanceof p82)) {
                        hbVar.a.setTranslationY(A);
                    }
                    hbVar.e(-A, floatValue3, hbVar.s);
                    return;
                }
                return;
            case 5:
                hn hnVar = (hn) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hnVar.q = floatValue4;
                k43 k43Var = hnVar.x;
                if (k43Var != null) {
                    floatValue4 = k43Var.getInterpolation(floatValue4);
                }
                hnVar.r = floatValue4;
                hnVar.invalidateSelf();
                Runnable runnable = hnVar.c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((or) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                dw dwVar = (dw) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.d.setTextColor(vm2.f(floatValue5, -16777216, -1));
                dwVar.e.setTextColor(vm2.f(floatValue5, -16777216, -1));
                dwVar.f.setTextColor(vm2.f(floatValue5, -16777216, -1));
                return;
            case 8:
                yx yxVar = (yx) obj;
                yxVar.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yxVar.invalidate();
                return;
            case 9:
                j20 j20Var = (j20) obj;
                j20Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                j20Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 10:
                ((ob0) obj).n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                sb0 sb0Var = (sb0) obj;
                float S1 = hl.S1(valueAnimator.getAnimatedFraction(), sb0Var.n);
                int i2 = (int) (255.0f * S1);
                sb0Var.f.setAlpha(i2);
                sb0Var.h.setAlpha(i2);
                sb0Var.r.setAlpha((int) (66.0f * S1));
                sb0Var.s.setAlpha((int) (85.0f * S1));
                sb0Var.w.setAlpha(i2);
                sb0Var.H = S1;
                sb0Var.invalidate();
                return;
            case 12:
                ic0 ic0Var = (ic0) obj;
                ic0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ic0Var.d();
                return;
            case 13:
                dh0 dh0Var = (dh0) obj;
                dh0Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dh0Var.invalidateSelf();
                return;
            case 14:
                xl0 xl0Var = (xl0) obj;
                xl0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xl0Var.b.invalidate();
                return;
            case 15:
                mm0 mm0Var = (mm0) obj;
                mm0Var.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mm0Var.invalidate();
                return;
            case 16:
                wo0 wo0Var = (wo0) obj;
                wo0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wo0Var.a.run();
                return;
            case 17:
                kr0 kr0Var = (kr0) obj;
                kr0Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kr0Var.r.setTranslationY(hl.U1(kr0Var.x, -hl.L(42.0f), 0));
                kr0Var.n.setTranslationY(hl.U1(kr0Var.x, 0, hl.L(42.0f)));
                return;
            case 18:
                ((rr0) obj).m0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                nl nlVar = (nl) obj;
                ((mb0) nlVar.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nlVar.invalidate();
                return;
            case 20:
                yx0 yx0Var = (yx0) obj;
                yx0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = yx0Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                yx0Var.invalidate();
                return;
            case 21:
                fy0 fy0Var = (fy0) obj;
                fy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.b.invalidate();
                return;
            case 22:
                v41 v41Var = (v41) obj;
                v41Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v41Var.b();
                return;
            case 23:
                j81 j81Var = (j81) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < j81Var.b.getChildCount()) {
                    int i3 = g81.E;
                    ((g81) j81Var.b.getChildAt(i)).b(floatValue6);
                    i++;
                }
                return;
            case 24:
                ((CameraView) obj).lambda$showTexture$6(valueAnimator);
                return;
            case 25:
                qb1 qb1Var = (qb1) obj;
                qb1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kb1 kb1Var = qb1Var.f;
                xt3 editText = kb1Var.getEditText();
                int L = hl.L(-26.0f);
                int L2 = hl.L(2.0f);
                editText.setTranslationX(hl.U1(qb1Var.o0, qb1Var.getEditTextLeft() + L, L2));
                FrameLayout frameLayout = qb1Var.s;
                int L3 = hl.L(2.0f);
                frameLayout.setTranslationX(hl.U1(qb1Var.o0, -hl.L(8.0f), L3));
                frameLayout.setTranslationY(hl.U1(qb1Var.o0, -hl.L(8.0f), 0));
                kb1Var.getEmojiButton().setAlpha(qb1Var.o0);
                qb1Var.r.setAlpha((float) Math.pow(qb1Var.o0, 16.0d));
                qb1Var.u(qb1Var.o0);
                mb1 mb1Var = qb1Var.N;
                if (mb1Var != null) {
                    mb1Var.setAlpha((float) Math.pow(qb1Var.o0, 4.0d));
                }
                kb1Var.getEditText().invalidate();
                qb1Var.invalidate();
                return;
            case 26:
                gi1 gi1Var = (gi1) obj;
                gi1Var.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gi1Var.b.invalidateSelf();
                return;
            case 27:
                sk1 sk1Var = (sk1) obj;
                sk1Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk1Var.g.a.invalidate();
                return;
            case 28:
                ((e43) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                gs1 gs1Var = (gs1) obj;
                gs1Var.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gs1Var.invalidate();
                return;
        }
    }
}
