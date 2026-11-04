package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.hs;
import org.telegram.messenger.ti;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.wm;
import org.telegram.ui.xg;
public final class z4 extends AnimatorListenerAdapter {
    public final int f14025a;
    public int f14026b;
    public final Object f14027c;
    public final Object d;
    public final Object f14028e;

    public z4(rt0 rt0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i3, int i10) {
        this.f14025a = i10;
        this.f14028e = rt0Var;
        this.f14027c = viewGroup;
        this.d = viewGroup2;
        this.f14026b = i3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14025a) {
            case 1:
                if (this.f14026b != 0) {
                    ((View) this.f14027c).setTranslationY(0.0f);
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
        switch (this.f14025a) {
            case 0:
                m5 m5Var = (m5) this.f14028e;
                m5Var.I0 = m5Var.J0;
                m5Var.J0 = -1;
                m5Var.G0.invalidate();
                View view = (View) this.f14027c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == m5Var.L0) {
                    m5Var.L0 = null;
                    return;
                }
                return;
            case 1:
                animator.removeAllListeners();
                ni.l lVar = (ni.l) this.f14028e;
                u4.d1 d1Var = (u4.d1) this.d;
                lVar.X(d1Var.f55540a);
                View view2 = d1Var.f55540a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.f30016nb) {
                        q1Var.f30016nb = false;
                        q1Var.setVisibility(0);
                    }
                    ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        ti tiVar = currentMessagesGroup.f25709m;
                        tiVar.f25538n = 1.0f;
                        tiVar.h = 0.0f;
                        tiVar.f25531f = 0.0f;
                        tiVar.f25532g = 0.0f;
                        tiVar.f25530e = 0.0f;
                        tiVar.f25534j = false;
                    }
                }
                if (lVar.f55607z.remove(d1Var)) {
                    lVar.v(d1Var);
                    lVar.G();
                    return;
                }
                return;
            case 2:
                wm wmVar = (wm) this.f14028e;
                wmVar.f51313f6 = true;
                ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow = true;
                wmVar.f51442pa = null;
                org.telegram.messenger.g0.i3(new xg(this, 1), 32L);
                super.onAnimationEnd(animator);
                wmVar.m1.invalidate();
                wmVar.m1.setSkipBackgroundDrawing(false);
                wmVar.f51403ma = false;
                wm wmVar2 = (wm) this.f14027c;
                wmVar2.f51429oa = 0.0f;
                wmVar2.fragmentView.invalidate();
                wmVar2.A0.invalidate();
                wmVar2.f51416na = null;
                wmVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wmVar.f51433p1.setTranslationY(0.0f);
                wmVar2.f51433p1.setTranslationY(0.0f);
                wmVar2.f51433p1.getAvatarImageView().setTranslationY(0.0f);
                wmVar.f51433p1.getAvatarImageView().setScaleX(1.0f);
                wmVar.f51433p1.getAvatarImageView().setScaleY(1.0f);
                wmVar.f51433p1.getAvatarImageView().setAlpha(1.0f);
                wmVar2.f51433p1.getAvatarImageView().setScaleX(1.0f);
                wmVar2.f51433p1.getAvatarImageView().setScaleY(1.0f);
                wmVar2.f51433p1.getAvatarImageView().setAlpha(1.0f);
                jg jgVar = wmVar2.f51252b1;
                if (jgVar != null) {
                    jgVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f14028e;
                f0Var.Q0 = f0Var.R0;
                f0Var.R0 = -1;
                f0Var.P0.invalidate();
                View view3 = (View) this.f14027c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == f0Var.T0) {
                    f0Var.T0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        int i3;
        View view2;
        switch (this.f14025a) {
            case 0:
                m5 m5Var = (m5) this.f14028e;
                ug.l1 l1Var = m5Var.N0;
                if (((View) this.f14027c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f14026b == 2) {
                    l1Var.b(0.5f, 2.0f);
                    return;
                }
                tg.h currentBrush = m5Var.f13239y0.getCurrentBrush();
                if (!(currentBrush instanceof tg.b) && !(currentBrush instanceof tg.d)) {
                    l1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    l1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                ((ni.l) this.f14028e).getClass();
                return;
            case 2:
                super.onAnimationStart(animator);
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) this.f14028e)).currentAccount;
                this.f14026b = hs.f(i3).q(null, this.f14026b, true);
                return;
            default:
                ug.f0 f0Var = (ug.f0) this.f14028e;
                ug.l1 l1Var2 = f0Var.V0;
                if (((View) this.f14027c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f14026b == 2) {
                    l1Var2.b(0.5f, 2.0f);
                    return;
                }
                tg.h currentBrush2 = f0Var.G0.getCurrentBrush();
                if (!(currentBrush2 instanceof tg.b) && !(currentBrush2 instanceof tg.d)) {
                    l1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    l1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public z4(ni.l lVar, u4.d1 d1Var, int i3, View view) {
        this.f14025a = 1;
        this.f14028e = lVar;
        this.d = d1Var;
        this.f14026b = i3;
        this.f14027c = view;
    }

    public z4(wm wmVar, wm wmVar2, Runnable runnable) {
        this.f14025a = 2;
        this.f14028e = wmVar;
        this.f14027c = wmVar2;
        this.d = runnable;
    }
}
