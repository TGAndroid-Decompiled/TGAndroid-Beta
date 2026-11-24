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
                a8Var.setTextColor(bm2.f(floatValue, -1, -9194260));
                a8Var.setIconColor(bm2.f(floatValue, -1, -9194260));
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
                        float s = gl.s(floatValue2, f, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s) * gl.L(-6.0f));
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
                    float A = (int) tb4.A(1.0f, floatValue3, gbVar.q, gbVar.p * floatValue3);
                    if (!(gbVar instanceof y72)) {
                        gbVar.a.setTranslationY(A);
                    }
                    gbVar.e(-A, floatValue3, gbVar.s);
                    return;
                }
                return;
            case 5:
                gn gnVar = (gn) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.q = floatValue4;
                s33 s33Var = gnVar.x;
                if (s33Var != null) {
                    floatValue4 = s33Var.getInterpolation(floatValue4);
                }
                gnVar.r = floatValue4;
                gnVar.invalidateSelf();
                Runnable runnable = gnVar.c0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ((nr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                cw cwVar = (cw) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d.setTextColor(bm2.f(floatValue5, -16777216, -1));
                cwVar.e.setTextColor(bm2.f(floatValue5, -16777216, -1));
                cwVar.f.setTextColor(bm2.f(floatValue5, -16777216, -1));
                return;
            case 8:
                xx xxVar = (xx) obj;
                xxVar.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xxVar.invalidate();
                return;
            case 9:
                i20 i20Var = (i20) obj;
                i20Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i20Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 10:
                ((mb0) obj).n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                qb0 qb0Var = (qb0) obj;
                float S1 = gl.S1(valueAnimator.getAnimatedFraction(), qb0Var.n);
                int i2 = (int) (255.0f * S1);
                qb0Var.f.setAlpha(i2);
                qb0Var.h.setAlpha(i2);
                qb0Var.r.setAlpha((int) (66.0f * S1));
                qb0Var.s.setAlpha((int) (85.0f * S1));
                qb0Var.w.setAlpha(i2);
                qb0Var.H = S1;
                qb0Var.invalidate();
                return;
            case 12:
                gc0 gc0Var = (gc0) obj;
                gc0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gc0Var.d();
                return;
            case 13:
                ch0 ch0Var = (ch0) obj;
                ch0Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var.invalidateSelf();
                return;
            case 14:
                wl0 wl0Var = (wl0) obj;
                wl0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wl0Var.b.invalidate();
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
                kr0Var.r.setTranslationY(gl.U1(kr0Var.x, -gl.L(42.0f), 0));
                kr0Var.n.setTranslationY(gl.U1(kr0Var.x, 0, gl.L(42.0f)));
                return;
            case 18:
                ml mlVar = (ml) obj;
                ((kb0) mlVar.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mlVar.invalidate();
                return;
            case 19:
                qx0 qx0Var = (qx0) obj;
                qx0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = qx0Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                qx0Var.invalidate();
                return;
            case 20:
                xx0 xx0Var = (xx0) obj;
                xx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.b.invalidate();
                return;
            case 21:
                n41 n41Var = (n41) obj;
                n41Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.b();
                return;
            case 22:
                b81 b81Var = (b81) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < b81Var.b.getChildCount()) {
                    int i3 = y71.E;
                    ((y71) b81Var.b.getChildAt(i)).b(floatValue6);
                    i++;
                }
                return;
            case 23:
                ((CameraView) obj).lambda$showTexture$6(valueAnimator);
                return;
            case 24:
                ib1 ib1Var = (ib1) obj;
                ib1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cb1 cb1Var = ib1Var.f;
                gt3 editText = cb1Var.getEditText();
                int L = gl.L(-26.0f);
                int L2 = gl.L(2.0f);
                editText.setTranslationX(gl.U1(ib1Var.o0, ib1Var.getEditTextLeft() + L, L2));
                FrameLayout frameLayout = ib1Var.s;
                int L3 = gl.L(2.0f);
                frameLayout.setTranslationX(gl.U1(ib1Var.o0, -gl.L(8.0f), L3));
                frameLayout.setTranslationY(gl.U1(ib1Var.o0, -gl.L(8.0f), 0));
                cb1Var.getEmojiButton().setAlpha(ib1Var.o0);
                ib1Var.r.setAlpha((float) Math.pow(ib1Var.o0, 16.0d));
                ib1Var.u(ib1Var.o0);
                eb1 eb1Var = ib1Var.N;
                if (eb1Var != null) {
                    eb1Var.setAlpha((float) Math.pow(ib1Var.o0, 4.0d));
                }
                cb1Var.getEditText().invalidate();
                ib1Var.invalidate();
                return;
            case 25:
                yh1 yh1Var = (yh1) obj;
                yh1Var.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yh1Var.b.invalidateSelf();
                return;
            case 26:
                jk1 jk1Var = (jk1) obj;
                jk1Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk1Var.g.a.invalidate();
                return;
            case 27:
                ((m33) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                sr1 sr1Var = (sr1) obj;
                sr1Var.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                sr1Var.invalidate();
                return;
            default:
                ((ky1) obj).g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
