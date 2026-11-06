package m;

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
import org.telegram.messenger.cj;
import org.telegram.messenger.gu;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.m7;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.s51;
import org.telegram.ui.e8;
import org.telegram.ui.ew0;
import org.telegram.ui.g4;
import org.telegram.ui.h8;
import org.telegram.ui.q4;
import org.telegram.ui.s9;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
public final class a extends AnimatorListenerAdapter {
    public final int f19049a;
    public final Object f19050b;

    public a(Object obj, int i7) {
        this.f19049a = i7;
        this.f19050b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19049a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f19050b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1936w = false;
                return;
            case 27:
                m7 m7Var = (m7) this.f19050b;
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
        switch (this.f19049a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f19050b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1936w = false;
                return;
            case 1:
                cj cjVar = (cj) this.f19050b;
                cjVar.f21828j = false;
                cjVar.f21827i = false;
                return;
            case 2:
                ((ng.e) this.f19050b).h.setVisibility(8);
                return;
            case 3:
                ((CropAreaView) this.f19050b).f31298c0 = null;
                return;
            case 4:
                HashMap hashMap = org.telegram.messenger.g0.f22530l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f19050b);
                    return;
                }
                return;
            case 5:
                s51 s51Var = ((MediaController) this.f19050b).f21268i0;
                if (s51Var != null) {
                    s51Var.g0();
                    return;
                }
                return;
            case 6:
                try {
                    ((s51) this.f19050b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 7:
                super.onAnimationEnd(animator);
                ((gu) this.f19050b).f22717w = null;
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19050b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27286n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
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
            case 9:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f19050b;
                if (!i1Var.f27544e) {
                    i1Var.j();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.f19050b;
                if (d3Var.F == animator) {
                    d3Var.G = d3Var.H;
                    Iterator it = d3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f19050b;
                org.telegram.ui.ActionBar.d3 d3Var2 = k3Var.f27711a;
                if (d3Var2 != null) {
                    d3Var2.f27425b = true;
                    d3Var2.invalidate();
                }
                if (k3Var.U) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k3Var.V = f11;
                k3Var.invalidate();
                if (!k3Var.U) {
                    k3Var.R.clear();
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.f19050b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                g4 g4Var = (g4) this.f19050b;
                Runnable runnable2 = g4Var.f45822a0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f45822a0 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f19050b;
                t3Var.f49911x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f49902a.e();
                return;
            case 15:
                q4 q4Var = (q4) this.f19050b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 16:
                t4 t4Var = (t4) this.f19050b;
                t4Var.f49916c = false;
                t4Var.invalidate();
                return;
            case 17:
                ((t5) this.f19050b).f49932h0.setVisibility(8);
                return;
            case 18:
            default:
                super.onAnimationEnd(animator);
                return;
            case 19:
                ((s9) this.f19050b).f49700w = null;
                return;
            case 20:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f19050b;
                ((ew0) jVar).f45422e0.f47050e.f41704c.f56924r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f19050b;
                Button button = vVar.f30602n;
                ag0 ag0Var = vVar.f30601f;
                if (button == ag0Var) {
                    vVar.f30600e.setVisibility(4);
                    return;
                } else {
                    ag0Var.setVisibility(4);
                    return;
                }
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f19050b).f28967x = null;
                return;
            case 23:
                ((h4) this.f19050b).G = null;
                return;
            case 24:
                q5 q5Var = (q5) this.f19050b;
                if (animator.equals(q5Var.f30133n)) {
                    q5Var.f30133n = null;
                    return;
                }
                return;
            case 25:
                f3 f3Var = (f3) this.f19050b;
                if (animator.equals(((s5) f3Var.f19102b).d)) {
                    ((s5) f3Var.f19102b).d = null;
                    return;
                }
                return;
            case 26:
                org.telegram.messenger.g0.i3(((s5) this.f19050b).f30262e, 1000L);
                return;
            case 27:
                m7 m7Var = (m7) this.f19050b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    return;
                }
                return;
            case 28:
                o7 o7Var = (o7) this.f19050b;
                o7Var.f29673n.N0 = true;
                o7Var.invalidate();
                return;
            case 29:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f19050b;
                ((y9) ((x9) h1Var.f27502b).f30906b).getTransitionParams().e();
                ((y9) ((x9) h1Var.f27502b).f30906b).getTransitionParams().h = false;
                ((y9) ((x9) h1Var.f27502b).f30906b).getTransitionParams().L1 = 1.0f;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19049a) {
            case 15:
                ((q4) this.f19050b).setVisibility(0);
                return;
            case 18:
                h8 h8Var = (h8) this.f19050b;
                for (int i7 = 0; i7 < h8Var.f46261b.getChildCount(); i7++) {
                    e8.a((e8) h8Var.f46261b.getChildAt(i7), h8Var.P, h8Var.Q);
                }
                return;
            case 20:
                ((ew0) ((org.telegram.ui.Cells.j) this.f19050b)).f45422e0.f47050e.f41704c.f56924r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
