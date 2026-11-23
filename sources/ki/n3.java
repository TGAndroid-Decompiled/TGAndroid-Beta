package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.au;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.m7;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.og0;
import org.telegram.ui.ew0;
import org.telegram.ui.g4;
import org.telegram.ui.g8;
import org.telegram.ui.j8;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
import org.telegram.ui.t9;
public final class n3 extends AnimatorListenerAdapter {
    public final int f18899a;
    public final Object f18900b;

    public n3(Object obj, int i7) {
        this.f18899a = i7;
        this.f18900b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18899a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18900b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1849w = false;
                return;
            case 28:
                m7 m7Var = (m7) this.f18900b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f18899a) {
            case 0:
                ((t3) this.f18900b).J.setVisibility(8);
                return;
            case 1:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) this.f18900b;
                if (!gVar.f19903j1) {
                    gVar.f19918v0 = false;
                    gVar.f19917u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f19896g0 = false;
                return;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18900b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1849w = false;
                return;
            case 3:
                ((ng.e) this.f18900b).h.setVisibility(8);
                return;
            case 4:
                ((CropAreaView) this.f18900b).f32979d0 = null;
                return;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.f24219l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f18900b);
                    return;
                }
                return;
            case 6:
                h61 h61Var = ((MediaController) this.f18900b).f22814j0;
                if (h61Var != null) {
                    h61Var.g0();
                    return;
                }
                return;
            case 7:
                try {
                    ((h61) this.f18900b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((au) this.f18900b).f23076w = null;
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18900b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28829n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(f10);
                    }
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f18900b;
                if (!i1Var.f29070e) {
                    i1Var.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f18900b;
                if (f3Var.G == animator) {
                    f3Var.H = f3Var.I;
                    Iterator it = f3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f18900b;
                org.telegram.ui.ActionBar.f3 f3Var2 = m3Var.f29297a;
                if (f3Var2 != null) {
                    f3Var2.f29005b = true;
                    f3Var2.invalidate();
                }
                if (m3Var.V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                m3Var.W = f11;
                m3Var.invalidate();
                if (!m3Var.V) {
                    m3Var.S.clear();
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.f18900b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                g4 g4Var = (g4) this.f18900b;
                Runnable runnable2 = g4Var.f48063b0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f48063b0 = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f18900b;
                t3Var.f52229x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f52220a.e();
                return;
            case 16:
                q4 q4Var = (q4) this.f18900b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 17:
                t4 t4Var = (t4) this.f18900b;
                t4Var.f52237c = false;
                t4Var.invalidate();
                return;
            case 18:
                ((t5) this.f18900b).f52251i0.setVisibility(8);
                return;
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((t9) this.f18900b).f52311w = null;
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18900b;
                ((ew0) jVar).f47638f0.f49218e.f43650c.f59202r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f18900b;
                Button button = vVar.f32138n;
                og0 og0Var = vVar.f32137f;
                if (button == og0Var) {
                    vVar.f32136e.setVisibility(4);
                    return;
                } else {
                    og0Var.setVisibility(4);
                    return;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.f18900b).f30604x = null;
                return;
            case 24:
                ((i4) this.f18900b).H = null;
                return;
            case 25:
                r5 r5Var = (r5) this.f18900b;
                if (animator.equals(r5Var.f31790n)) {
                    r5Var.f31790n = null;
                    return;
                }
                return;
            case 26:
                i6.g gVar2 = (i6.g) this.f18900b;
                if (animator.equals(((org.telegram.ui.Cells.t5) gVar2.f16237b).d)) {
                    ((org.telegram.ui.Cells.t5) gVar2.f16237b).d = null;
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.h3(((org.telegram.ui.Cells.t5) this.f18900b).f31927e, 1000L);
                return;
            case 28:
                m7 m7Var = (m7) this.f18900b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    return;
                }
                return;
            case 29:
                o7 o7Var = (o7) this.f18900b;
                o7Var.f31276n.P0 = true;
                o7Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18899a) {
            case 16:
                ((q4) this.f18900b).setVisibility(0);
                return;
            case 19:
                j8 j8Var = (j8) this.f18900b;
                for (int i7 = 0; i7 < j8Var.f49015b.getChildCount(); i7++) {
                    g8.a((g8) j8Var.f49015b.getChildAt(i7), j8Var.Q, j8Var.R);
                }
                return;
            case 21:
                ((ew0) ((org.telegram.ui.Cells.j) this.f18900b)).f47638f0.f49218e.f43650c.f59202r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
