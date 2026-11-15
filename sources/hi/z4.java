package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.an;
import org.telegram.ui.bh;
public final class z4 extends AnimatorListenerAdapter {
    public final int f15499a;
    public int f15500b;
    public final Object f15501c;
    public final Object d;
    public final Object f15502e;

    public z4(tt0 tt0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.f15499a = i10;
        this.f15502e = tt0Var;
        this.f15501c = viewGroup;
        this.d = viewGroup2;
        this.f15500b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15499a) {
            case 2:
                if (this.f15500b != 0) {
                    ((View) this.f15501c).setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15499a) {
            case 0:
                m5 m5Var = (m5) this.f15502e;
                m5Var.I0 = m5Var.J0;
                m5Var.J0 = -1;
                m5Var.G0.invalidate();
                View view = (View) this.f15501c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == m5Var.L0) {
                    m5Var.L0 = null;
                    return;
                }
                return;
            case 1:
                an anVar = (an) this.f15502e;
                anVar.f45193f6 = true;
                ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow = true;
                anVar.f45349ra = null;
                org.telegram.messenger.g0.i3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                anVar.f45277m1.invalidate();
                anVar.f45277m1.setSkipBackgroundDrawing(false);
                anVar.f45309oa = false;
                an anVar2 = (an) this.f15501c;
                anVar2.f45335qa = 0.0f;
                anVar2.fragmentView.invalidate();
                anVar2.A0.invalidate();
                anVar2.f45322pa = null;
                anVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                anVar.f45313p1.setTranslationY(0.0f);
                anVar2.f45313p1.setTranslationY(0.0f);
                anVar2.f45313p1.getAvatarImageView().setTranslationY(0.0f);
                anVar.f45313p1.getAvatarImageView().setScaleX(1.0f);
                anVar.f45313p1.getAvatarImageView().setScaleY(1.0f);
                anVar.f45313p1.getAvatarImageView().setAlpha(1.0f);
                anVar2.f45313p1.getAvatarImageView().setScaleX(1.0f);
                anVar2.f45313p1.getAvatarImageView().setScaleY(1.0f);
                anVar2.f45313p1.getAvatarImageView().setAlpha(1.0f);
                rg rgVar = anVar2.f45133b1;
                if (rgVar != null) {
                    rgVar.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.f15502e;
                v4.e1 e1Var = (v4.e1) this.d;
                kVar.X(e1Var.f58535a);
                View view2 = e1Var.f58535a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.f31095ob) {
                        q1Var.f31095ob = false;
                        q1Var.setVisibility(0);
                    }
                    bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        aj ajVar = currentMessagesGroup.f22717m;
                        ajVar.f22527n = 1.0f;
                        ajVar.h = 0.0f;
                        ajVar.f22520f = 0.0f;
                        ajVar.f22521g = 0.0f;
                        ajVar.f22519e = 0.0f;
                        ajVar.f22523j = false;
                    }
                }
                if (kVar.f58596z.remove(e1Var)) {
                    kVar.v(e1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f15502e;
                g0Var.Q0 = g0Var.R0;
                g0Var.R0 = -1;
                g0Var.P0.invalidate();
                View view3 = (View) this.f15501c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == g0Var.T0) {
                    g0Var.T0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.f15499a) {
            case 0:
                m5 m5Var = (m5) this.f15502e;
                tg.m1 m1Var = m5Var.N0;
                if (((View) this.f15501c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f15500b == 2) {
                    m1Var.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush = m5Var.f14700y0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    m1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.e2) ((an) this.f15502e)).currentAccount;
                this.f15500b = ns.f(i7).q(null, this.f15500b, true);
                return;
            case 2:
                ((pi.k) this.f15502e).getClass();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f15502e;
                tg.m1 m1Var2 = g0Var.V0;
                if (((View) this.f15501c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f15500b == 2) {
                    m1Var2.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush2 = g0Var.G0.getCurrentBrush();
                if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                    m1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public z4(pi.k kVar, v4.e1 e1Var, int i7, View view) {
        this.f15499a = 2;
        this.f15502e = kVar;
        this.d = e1Var;
        this.f15500b = i7;
        this.f15501c = view;
    }

    public z4(an anVar, an anVar2, Runnable runnable) {
        this.f15499a = 1;
        this.f15502e = anVar;
        this.f15501c = anVar2;
        this.d = runnable;
    }
}
