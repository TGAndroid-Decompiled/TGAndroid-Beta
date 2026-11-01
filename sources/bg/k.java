package bg;

import ag.c2;
import ag.d2;
import android.animation.ValueAnimator;
import android.view.View;
import bi.f5;
import java.util.Iterator;
import jg.a1;
import jg.d3;
import jg.f2;
import jg.v2;
import jg.y1;
import jg.z2;
import kg.g2;
import kg.w0;
import kg.x0;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.voip.b0;
import org.telegram.ui.Components.voip.c1;
import org.telegram.ui.Components.voip.k0;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.Components.voip.u1;
import org.telegram.ui.br0;
import org.telegram.ui.m0;
import org.telegram.ui.sd1;
import org.telegram.ui.un;
import org.telegram.ui.web.l1;
import qh.y;
public final class k implements ValueAnimator.AnimatorUpdateListener {
    public final int f2753a;
    public final Object f2754b;

    public k(Object obj, int i10) {
        this.f2753a = i10;
        this.f2754b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        int i10 = this.f2753a;
        Object obj = this.f2754b;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                lVar.f2758f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f2759g.f2760a.invalidate();
                return;
            case 1:
                f5 f5Var = (f5) obj;
                f5Var.getClass();
                f5Var.f3001a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.requestLayout();
                f5Var.invalidate();
                return;
            case 2:
                ci.o oVar = (ci.o) obj;
                un unVar = oVar.F;
                if (unVar != null) {
                    unVar.H9();
                    if (unVar.X8 != null) {
                        unVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                oVar.G.invalidate();
                return;
            case 3:
                ((br0) ((a1) obj)).K.f33477e0.invalidate();
                return;
            case 4:
                y1 y1Var = (y1) obj;
                y1Var.getClass();
                y1Var.f10376n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1Var.invalidate();
                return;
            case 5:
                f2 f2Var = (f2) obj;
                f2Var.getClass();
                f2Var.f9975y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.invalidate();
                return;
            case 6:
                ig.j jVar = (ig.j) obj;
                jVar.f9975y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.invalidate();
                return;
            case 7:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 8:
                d3 d3Var = (d3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.D = floatValue;
                z2 z2Var = d3Var.f9934c;
                z2Var.setAlpha(floatValue);
                z2Var.setScaleX(i0.T1(0.9f, 1.0f, d3Var.D));
                z2Var.setScaleY(i0.T1(0.9f, 1.0f, d3Var.D));
                d3Var.f9933b.invalidate();
                return;
            case 9:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24097o0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f7 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f24101b0 = f7;
                return;
            case 10:
                x0 x0Var = (x0) obj;
                x0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.f11328f.invalidate();
                w0 w0Var = x0Var.h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
            case 11:
                ((g2) obj).f11093a.f11080o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                ((lg.g) obj).f11867a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                mg.b bVar = (mg.b) obj;
                bVar.getClass();
                bVar.f13073b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 14:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                y0Var.f21538a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.invalidate();
                return;
            case 15:
                b1 b1Var = (b1) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.setTextColor(i0.b.f(floatValue3, -1, -9194260));
                b1Var.setIconColor(i0.b.f(floatValue3, -1, -9194260));
                return;
            case 16:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                    if (!(childAt instanceof h1)) {
                        float s10 = i0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f20132w ? (itemsCount - 1) - i12 : i12, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s10) * i0.L(-6.0f));
                        if (childAt.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(s10 * f10);
                    }
                }
                return;
            case 17:
                m1 m1Var = (m1) obj;
                if (!m1Var.e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (m1Var.f20577r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) c3.i0.z(1.0f, floatValue5, m1Var.f20576q, m1Var.f20575p * floatValue5);
                    if (!(m1Var instanceof sg.k)) {
                        m1Var.f20563a.setTranslationY(z10);
                    }
                    m1Var.e(-z10, floatValue5, m1Var.f20578s);
                    return;
                }
                return;
            case 18:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                i3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = i3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                i3Var.invalidate();
                return;
            case 19:
                p3 p3Var = (p3) obj;
                p3Var.f20642i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q3 q3Var = p3Var.f20638b;
                if (q3Var != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            case 20:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                b0Var.f31390i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 21:
                sd1 sd1Var = (sd1) obj;
                sd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (i0.f16172q.x - i0.L(36.0f)) - i0.L(52.0f);
                k0 k0Var = sd1Var.f31593c;
                k0Var.getLayoutParams().width = i0.L(52.0f) + ((int) (L * sd1Var.E));
                k0Var.requestLayout();
                return;
            case 22:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                c1 c1Var = (c1) obj;
                c1Var.getClass();
                c1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 24:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                u1Var.f31753w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.f31747b.invalidate();
                return;
            case 25:
                c2 c2Var = (c2) obj;
                ((d2) c2Var.K1).f26357a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c2Var.invalidate();
                return;
            case 26:
                l1 l1Var = (l1) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.U = floatValue6;
                l1Var.V.setAlpha(floatValue6);
                l1Var.invalidate();
                return;
            case 27:
                m0 m0Var = (m0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f42895a0 = floatValue7;
                m0Var.j(floatValue7);
                m0Var.f42897b0.setAlpha(m0Var.f42895a0);
                m0Var.R.setTranslationX(i0.L(56.0f) * m0Var.f42895a0);
                m0Var.O.setTranslationX(i0.L(112.0f) * m0Var.f42895a0);
                m0Var.invalidate();
                return;
            case 28:
                qg.h hVar = (qg.h) obj;
                hVar.getClass();
                hVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                y yVar = (y) obj;
                yVar.getClass();
                yVar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.invalidate();
                return;
        }
    }
}
