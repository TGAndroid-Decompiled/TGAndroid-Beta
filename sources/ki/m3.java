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
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.f8;
import org.telegram.ui.fw0;
import org.telegram.ui.g4;
import org.telegram.ui.i8;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
import org.telegram.ui.t9;
public final class m3 extends AnimatorListenerAdapter {
    public final int f18814a;
    public final Object f18815b;

    public m3(Object obj, int i7) {
        this.f18814a = i7;
        this.f18815b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18814a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18815b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1890w = false;
                return;
            case 28:
                n7 n7Var = (n7) this.f18815b;
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
        switch (this.f18814a) {
            case 0:
                ((s3) this.f18815b).J.setVisibility(8);
                return;
            case 1:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) this.f18815b;
                if (!gVar.f19834j1) {
                    gVar.f19849v0 = false;
                    gVar.f19848u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f19827g0 = false;
                return;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18815b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1890w = false;
                return;
            case 3:
                ((ng.e) this.f18815b).h.setVisibility(8);
                return;
            case 4:
                ((CropAreaView) this.f18815b).f32912d0 = null;
                return;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.f24139l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f18815b);
                    return;
                }
                return;
            case 6:
                i61 i61Var = ((MediaController) this.f18815b).f22744j0;
                if (i61Var != null) {
                    i61Var.g0();
                    return;
                }
                return;
            case 7:
                try {
                    ((i61) this.f18815b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((au) this.f18815b).f22993w = null;
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18815b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28768n = false;
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
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f18815b;
                if (!i1Var.f29006e) {
                    i1Var.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f18815b;
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
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.f18815b;
                org.telegram.ui.ActionBar.f3 f3Var2 = m3Var.f29254a;
                if (f3Var2 != null) {
                    f3Var2.f28944b = true;
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
                Runnable runnable = (Runnable) this.f18815b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                g4 g4Var = (g4) this.f18815b;
                Runnable runnable2 = g4Var.f47948b0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f47948b0 = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f18815b;
                t3Var.f52197x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f52188a.e();
                return;
            case 16:
                q4 q4Var = (q4) this.f18815b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 17:
                t4 t4Var = (t4) this.f18815b;
                t4Var.f52206c = false;
                t4Var.invalidate();
                return;
            case 18:
                ((t5) this.f18815b).f52220i0.setVisibility(8);
                return;
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((t9) this.f18815b).f52277w = null;
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18815b;
                ((fw0) jVar).f47866f0.f49714e.f43565c.f59116r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f18815b;
                Button button = vVar.f32086n;
                pg0 pg0Var = vVar.f32085f;
                if (button == pg0Var) {
                    vVar.f32084e.setVisibility(4);
                    return;
                } else {
                    pg0Var.setVisibility(4);
                    return;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.f18815b).f30546x = null;
                return;
            case 24:
                ((i4) this.f18815b).H = null;
                return;
            case 25:
                s5 s5Var = (s5) this.f18815b;
                if (animator.equals(s5Var.f31788n)) {
                    s5Var.f31788n = null;
                    return;
                }
                return;
            case 26:
                j6.o oVar = (j6.o) this.f18815b;
                if (animator.equals(((u5) oVar.f17293b).d)) {
                    ((u5) oVar.f17293b).d = null;
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.h3(((u5) this.f18815b).f32055e, 1000L);
                return;
            case 28:
                n7 n7Var = (n7) this.f18815b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    return;
                }
                return;
            case 29:
                p7 p7Var = (p7) this.f18815b;
                p7Var.f31267n.P0 = true;
                p7Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18814a) {
            case 16:
                ((q4) this.f18815b).setVisibility(0);
                return;
            case 19:
                i8 i8Var = (i8) this.f18815b;
                for (int i7 = 0; i7 < i8Var.f48617b.getChildCount(); i7++) {
                    f8.a((f8) i8Var.f48617b.getChildAt(i7), i8Var.Q, i8Var.R);
                }
                return;
            case 21:
                ((fw0) ((org.telegram.ui.Cells.j) this.f18815b)).f47866f0.f49714e.f43565c.f59116r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
