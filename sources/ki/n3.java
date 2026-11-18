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
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.f8;
import org.telegram.ui.fw0;
import org.telegram.ui.g4;
import org.telegram.ui.i8;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
import org.telegram.ui.t9;
public final class n3 extends AnimatorListenerAdapter {
    public final int f18804a;
    public final Object f18805b;

    public n3(Object obj, int i7) {
        this.f18804a = i7;
        this.f18805b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18804a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18805b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1878w = false;
                return;
            case 28:
                n7 n7Var = (n7) this.f18805b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
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
        switch (this.f18804a) {
            case 0:
                ((t3) this.f18805b).J.setVisibility(8);
                return;
            case 1:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) this.f18805b;
                if (!gVar.f19806j1) {
                    gVar.f19821v0 = false;
                    gVar.f19820u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f19799g0 = false;
                return;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18805b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1878w = false;
                return;
            case 3:
                ((ng.e) this.f18805b).h.setVisibility(8);
                return;
            case 4:
                ((CropAreaView) this.f18805b).f32879d0 = null;
                return;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.f24111l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f18805b);
                    return;
                }
                return;
            case 6:
                f61 f61Var = ((MediaController) this.f18805b).f22716j0;
                if (f61Var != null) {
                    f61Var.g0();
                    return;
                }
                return;
            case 7:
                try {
                    ((f61) this.f18805b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((au) this.f18805b).f22965w = null;
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18805b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28738n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.e1)) {
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
                org.telegram.ui.ActionBar.j1 j1Var = (org.telegram.ui.ActionBar.j1) this.f18805b;
                if (!j1Var.f29021e) {
                    j1Var.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f18805b;
                if (g3Var.G == animator) {
                    g3Var.H = g3Var.I;
                    Iterator it = g3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.f18805b;
                org.telegram.ui.ActionBar.g3 g3Var2 = n3Var.f29270a;
                if (g3Var2 != null) {
                    g3Var2.f28962b = true;
                    g3Var2.invalidate();
                }
                if (n3Var.V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n3Var.W = f11;
                n3Var.invalidate();
                if (!n3Var.V) {
                    n3Var.S.clear();
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.f18805b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                g4 g4Var = (g4) this.f18805b;
                Runnable runnable2 = g4Var.f47878b0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f47878b0 = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f18805b;
                t3Var.f52147x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f52138a.e();
                return;
            case 16:
                q4 q4Var = (q4) this.f18805b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 17:
                t4 t4Var = (t4) this.f18805b;
                t4Var.f52156c = false;
                t4Var.invalidate();
                return;
            case 18:
                ((t5) this.f18805b).f52170i0.setVisibility(8);
                return;
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((t9) this.f18805b).f52227w = null;
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18805b;
                ((fw0) jVar).f47799f0.f49663e.f43524c.f59078r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f18805b;
                Button button = vVar.f32058n;
                ng0 ng0Var = vVar.f32057f;
                if (button == ng0Var) {
                    vVar.f32056e.setVisibility(4);
                    return;
                } else {
                    ng0Var.setVisibility(4);
                    return;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.f18805b).f30518x = null;
                return;
            case 24:
                ((i4) this.f18805b).H = null;
                return;
            case 25:
                s5 s5Var = (s5) this.f18805b;
                if (animator.equals(s5Var.f31760n)) {
                    s5Var.f31760n = null;
                    return;
                }
                return;
            case 26:
                j6.o oVar = (j6.o) this.f18805b;
                if (animator.equals(((u5) oVar.f17268b).d)) {
                    ((u5) oVar.f17268b).d = null;
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.h3(((u5) this.f18805b).f32027e, 1000L);
                return;
            case 28:
                n7 n7Var = (n7) this.f18805b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    return;
                }
                return;
            case 29:
                p7 p7Var = (p7) this.f18805b;
                p7Var.f31239n.P0 = true;
                p7Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18804a) {
            case 16:
                ((q4) this.f18805b).setVisibility(0);
                return;
            case 19:
                i8 i8Var = (i8) this.f18805b;
                for (int i7 = 0; i7 < i8Var.f48579b.getChildCount(); i7++) {
                    f8.a((f8) i8Var.f48579b.getChildAt(i7), i8Var.Q, i8Var.R);
                }
                return;
            case 21:
                ((fw0) ((org.telegram.ui.Cells.j) this.f18805b)).f47799f0.f49663e.f43524c.f59078r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
