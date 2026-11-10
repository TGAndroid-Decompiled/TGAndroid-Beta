package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.cn;
import org.telegram.ui.dh;
public final class b5 extends AnimatorListenerAdapter {
    public final int f11682a;
    public int f11683b;
    public final Object f11684c;
    public final Object d;
    public final Object f11685e;

    public b5(tt0 tt0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.f11682a = i10;
        this.f11685e = tt0Var;
        this.f11684c = viewGroup;
        this.d = viewGroup2;
        this.f11683b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11682a) {
            case 1:
                if (this.f11683b != 0) {
                    ((View) this.f11684c).setTranslationY(0.0f);
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
        switch (this.f11682a) {
            case 0:
                o5 o5Var = (o5) this.f11685e;
                o5Var.H0 = o5Var.I0;
                o5Var.I0 = -1;
                o5Var.F0.invalidate();
                View view = (View) this.f11684c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == o5Var.K0) {
                    o5Var.K0 = null;
                    return;
                }
                return;
            case 1:
                animator.removeAllListeners();
                mi.l lVar = (mi.l) this.f11685e;
                v4.d1 d1Var = (v4.d1) this.d;
                lVar.X(d1Var.f57052a);
                View view2 = d1Var.f57052a;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view2;
                    if (q1Var.f29959nb) {
                        q1Var.f29959nb = false;
                        q1Var.setVisibility(0);
                    }
                    dj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        cj cjVar = currentMessagesGroup.f22048m;
                        cjVar.f21875n = 1.0f;
                        cjVar.h = 0.0f;
                        cjVar.f21868f = 0.0f;
                        cjVar.f21869g = 0.0f;
                        cjVar.f21867e = 0.0f;
                        cjVar.f21871j = false;
                    }
                }
                if (lVar.f57118z.remove(d1Var)) {
                    lVar.v(d1Var);
                    lVar.G();
                    return;
                }
                return;
            case 2:
                cn cnVar = (cn) this.f11685e;
                cnVar.f44480e6 = true;
                ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow = true;
                cnVar.f44635qa = null;
                org.telegram.messenger.g0.i3(new dh(this, 1), 32L);
                super.onAnimationEnd(animator);
                cnVar.l1.invalidate();
                cnVar.l1.setSkipBackgroundDrawing(false);
                cnVar.f44597na = false;
                cn cnVar2 = (cn) this.f11684c;
                cnVar2.f44622pa = 0.0f;
                cnVar2.fragmentView.invalidate();
                cnVar2.f44741z0.invalidate();
                cnVar2.f44609oa = null;
                cnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                cnVar.f44601o1.setTranslationY(0.0f);
                cnVar2.f44601o1.setTranslationY(0.0f);
                cnVar2.f44601o1.getAvatarImageView().setTranslationY(0.0f);
                cnVar.f44601o1.getAvatarImageView().setScaleX(1.0f);
                cnVar.f44601o1.getAvatarImageView().setScaleY(1.0f);
                cnVar.f44601o1.getAvatarImageView().setAlpha(1.0f);
                cnVar2.f44601o1.getAvatarImageView().setScaleX(1.0f);
                cnVar2.f44601o1.getAvatarImageView().setScaleY(1.0f);
                cnVar2.f44601o1.getAvatarImageView().setAlpha(1.0f);
                kg kgVar = cnVar2.f44419a1;
                if (kgVar != null) {
                    kgVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f11685e;
                g0Var.P0 = g0Var.Q0;
                g0Var.Q0 = -1;
                g0Var.O0.invalidate();
                View view3 = (View) this.f11684c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == g0Var.S0) {
                    g0Var.S0 = null;
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
        switch (this.f11682a) {
            case 0:
                o5 o5Var = (o5) this.f11685e;
                tg.m1 m1Var = o5Var.M0;
                if (((View) this.f11684c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f11683b == 2) {
                    m1Var.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush = o5Var.f12557x0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    m1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                ((mi.l) this.f11685e).getClass();
                return;
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) this.f11685e)).currentAccount;
                this.f11683b = qs.f(i7).q(null, this.f11683b, true);
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f11685e;
                tg.m1 m1Var2 = g0Var.U0;
                if (((View) this.f11684c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f11683b == 2) {
                    m1Var2.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush2 = g0Var.F0.getCurrentBrush();
                if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                    m1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public b5(mi.l lVar, v4.d1 d1Var, int i7, View view) {
        this.f11682a = 1;
        this.f11685e = lVar;
        this.d = d1Var;
        this.f11683b = i7;
        this.f11684c = view;
    }

    public b5(cn cnVar, cn cnVar2, Runnable runnable) {
        this.f11682a = 2;
        this.f11685e = cnVar;
        this.f11684c = cnVar2;
        this.d = runnable;
    }
}
