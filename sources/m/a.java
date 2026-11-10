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
import org.telegram.ui.Components.t51;
import org.telegram.ui.e8;
import org.telegram.ui.g4;
import org.telegram.ui.h8;
import org.telegram.ui.hw0;
import org.telegram.ui.q4;
import org.telegram.ui.s9;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
public final class a extends AnimatorListenerAdapter {
    public final int f19057a;
    public final Object f19058b;

    public a(Object obj, int i7) {
        this.f19057a = i7;
        this.f19058b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19057a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f19058b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1936w = false;
                return;
            case 27:
                m7 m7Var = (m7) this.f19058b;
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
        switch (this.f19057a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f19058b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.f1936w = false;
                return;
            case 1:
                cj cjVar = (cj) this.f19058b;
                cjVar.f21871j = false;
                cjVar.f21870i = false;
                return;
            case 2:
                ((ng.e) this.f19058b).h.setVisibility(8);
                return;
            case 3:
                ((CropAreaView) this.f19058b).f31319c0 = null;
                return;
            case 4:
                HashMap hashMap = org.telegram.messenger.g0.f22560l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f19058b);
                    return;
                }
                return;
            case 5:
                t51 t51Var = ((MediaController) this.f19058b).f21276i0;
                if (t51Var != null) {
                    t51Var.g0();
                    return;
                }
                return;
            case 6:
                try {
                    ((t51) this.f19058b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 7:
                super.onAnimationEnd(animator);
                ((gu) this.f19058b).f22745w = null;
                return;
            case 8:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19058b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27294n = false;
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
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f19058b;
                if (!i1Var.f27531e) {
                    i1Var.j();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f19058b;
                if (e3Var.F == animator) {
                    e3Var.G = e3Var.H;
                    Iterator it = e3Var.I.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.f19058b;
                org.telegram.ui.ActionBar.e3 e3Var2 = l3Var.f27728a;
                if (e3Var2 != null) {
                    e3Var2.f27433b = true;
                    e3Var2.invalidate();
                }
                if (l3Var.U) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                l3Var.V = f11;
                l3Var.invalidate();
                if (!l3Var.U) {
                    l3Var.R.clear();
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.f19058b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                g4 g4Var = (g4) this.f19058b;
                Runnable runnable2 = g4Var.f45950a0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f45950a0 = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f19058b;
                t3Var.f50097x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f50088a.e();
                return;
            case 15:
                q4 q4Var = (q4) this.f19058b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 16:
                t4 t4Var = (t4) this.f19058b;
                t4Var.f50107c = false;
                t4Var.invalidate();
                return;
            case 17:
                ((t5) this.f19058b).f50122h0.setVisibility(8);
                return;
            case 18:
            default:
                super.onAnimationEnd(animator);
                return;
            case 19:
                ((s9) this.f19058b).f49752w = null;
                return;
            case 20:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f19058b;
                ((hw0) jVar).f46435e0.f48065e.f41705c.f57024r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f19058b;
                Button button = vVar.f30622n;
                ag0 ag0Var = vVar.f30621f;
                if (button == ag0Var) {
                    vVar.f30620e.setVisibility(4);
                    return;
                } else {
                    ag0Var.setVisibility(4);
                    return;
                }
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f19058b).f28986x = null;
                return;
            case 23:
                ((h4) this.f19058b).G = null;
                return;
            case 24:
                q5 q5Var = (q5) this.f19058b;
                if (animator.equals(q5Var.f30153n)) {
                    q5Var.f30153n = null;
                    return;
                }
                return;
            case 25:
                f3 f3Var = (f3) this.f19058b;
                if (animator.equals(((s5) f3Var.f19110b).d)) {
                    ((s5) f3Var.f19110b).d = null;
                    return;
                }
                return;
            case 26:
                org.telegram.messenger.g0.i3(((s5) this.f19058b).f30282e, 1000L);
                return;
            case 27:
                m7 m7Var = (m7) this.f19058b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    return;
                }
                return;
            case 28:
                o7 o7Var = (o7) this.f19058b;
                o7Var.f29692n.N0 = true;
                o7Var.invalidate();
                return;
            case 29:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f19058b;
                ((y9) ((x9) h1Var.f27516b).f30927b).getTransitionParams().e();
                ((y9) ((x9) h1Var.f27516b).f30927b).getTransitionParams().h = false;
                ((y9) ((x9) h1Var.f27516b).f30927b).getTransitionParams().L1 = 1.0f;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19057a) {
            case 15:
                ((q4) this.f19058b).setVisibility(0);
                return;
            case 18:
                h8 h8Var = (h8) this.f19058b;
                for (int i7 = 0; i7 < h8Var.f46246b.getChildCount(); i7++) {
                    e8.a((e8) h8Var.f46246b.getChildAt(i7), h8Var.P, h8Var.Q);
                }
                return;
            case 20:
                ((hw0) ((org.telegram.ui.Cells.j) this.f19058b)).f46435e0.f48065e.f41705c.f57024r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
