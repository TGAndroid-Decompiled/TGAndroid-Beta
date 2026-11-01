package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import jg.d2;
import jg.r0;
import org.telegram.messenger.at;
import org.telegram.messenger.ej;
import org.telegram.messenger.fj;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.rh;
import org.telegram.ui.un;
import s4.c1;
import vh.b4;
public final class k extends AnimatorListenerAdapter {
    public final int f4222a;
    public final Object f4223b;
    public int f4224c;
    public final Object d;
    public final Object e;

    public k(wu0 wu0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f4222a = i11;
        this.e = wu0Var;
        this.f4223b = viewGroup;
        this.d = viewGroup2;
        this.f4224c = i10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4222a) {
            case 0:
                if (this.f4224c != 0) {
                    ((View) this.f4223b).setTranslationY(0.0f);
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
        switch (this.f4222a) {
            case 0:
                animator.removeAllListeners();
                o oVar = (o) this.e;
                c1 c1Var = (c1) this.d;
                oVar.X(c1Var.f47909a);
                View view = c1Var.f47909a;
                if (view instanceof q1) {
                    q1 q1Var = (q1) view;
                    if (q1Var.f22647mb) {
                        q1Var.f22647mb = false;
                        q1Var.setVisibility(0);
                    }
                    fj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        ej ejVar = currentMessagesGroup.f15744m;
                        ejVar.f15581n = 1.0f;
                        ejVar.h = 0.0f;
                        ejVar.f15574f = 0.0f;
                        ejVar.f15575g = 0.0f;
                        ejVar.e = 0.0f;
                        ejVar.f15577j = false;
                    }
                }
                if (oVar.f47966z.remove(c1Var)) {
                    oVar.v(c1Var);
                    oVar.G();
                    return;
                }
                return;
            case 1:
                r0 r0Var = (r0) this.e;
                r0Var.P0 = r0Var.Q0;
                r0Var.Q0 = -1;
                r0Var.O0.invalidate();
                View view2 = (View) this.f4223b;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == r0Var.S0) {
                    r0Var.S0 = null;
                    return;
                }
                return;
            case 2:
                un unVar = (un) this.e;
                unVar.f42049e6 = true;
                ((k2) unVar).fragmentBeginToShow = true;
                unVar.f42175oa = null;
                i0.h3(new rh(this, 1), 32L);
                super.onAnimationEnd(animator);
                unVar.l1.invalidate();
                unVar.l1.setSkipBackgroundDrawing(false);
                unVar.f42136la = false;
                un unVar2 = (un) this.d;
                unVar2.f42162na = 0.0f;
                unVar2.fragmentView.invalidate();
                unVar2.f42303z0.invalidate();
                unVar2.f42148ma = null;
                unVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.f4223b).run();
                unVar.f42166o1.setTranslationY(0.0f);
                unVar2.f42166o1.setTranslationY(0.0f);
                unVar2.f42166o1.getAvatarImageView().setTranslationY(0.0f);
                unVar.f42166o1.getAvatarImageView().setScaleX(1.0f);
                unVar.f42166o1.getAvatarImageView().setScaleY(1.0f);
                unVar.f42166o1.getAvatarImageView().setAlpha(1.0f);
                unVar2.f42166o1.getAvatarImageView().setScaleX(1.0f);
                unVar2.f42166o1.getAvatarImageView().setScaleY(1.0f);
                unVar2.f42166o1.getAvatarImageView().setAlpha(1.0f);
                hg hgVar = unVar2.f41990a1;
                if (hgVar != null) {
                    hgVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                b4 b4Var = (b4) this.e;
                b4Var.H0 = b4Var.I0;
                b4Var.I0 = -1;
                b4Var.F0.invalidate();
                View view3 = (View) this.f4223b;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == b4Var.K0) {
                    b4Var.K0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        int i10;
        View view2;
        switch (this.f4222a) {
            case 0:
                ((o) this.e).getClass();
                return;
            case 1:
                r0 r0Var = (r0) this.e;
                d2 d2Var = r0Var.U0;
                if (((View) this.f4223b) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f4224c == 2) {
                    d2Var.b(0.5f, 2.0f);
                    return;
                }
                ig.h currentBrush = r0Var.F0.getCurrentBrush();
                if (!(currentBrush instanceof ig.b) && !(currentBrush instanceof ig.d)) {
                    d2Var.b(0.05f, 1.0f);
                    return;
                } else {
                    d2Var.b(0.4f, 1.75f);
                    return;
                }
            case 2:
                super.onAnimationStart(animator);
                i10 = ((k2) ((un) this.e)).currentAccount;
                this.f4224c = at.f(i10).q(null, this.f4224c, true);
                return;
            default:
                b4 b4Var = (b4) this.e;
                d2 d2Var2 = b4Var.M0;
                if (((View) this.f4223b) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f4224c == 2) {
                    d2Var2.b(0.5f, 2.0f);
                    return;
                }
                ig.h currentBrush2 = b4Var.f51003x0.getCurrentBrush();
                if (!(currentBrush2 instanceof ig.b) && !(currentBrush2 instanceof ig.d)) {
                    d2Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    d2Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public k(o oVar, c1 c1Var, int i10, View view) {
        this.f4222a = 0;
        this.e = oVar;
        this.d = c1Var;
        this.f4224c = i10;
        this.f4223b = view;
    }

    public k(un unVar, un unVar2, Runnable runnable) {
        this.f4222a = 2;
        this.e = unVar;
        this.d = unVar2;
        this.f4223b = runnable;
    }
}
