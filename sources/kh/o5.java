package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.kt0;
import org.telegram.ui.qn;
public final class o5 extends AnimatorListenerAdapter {
    public final int f15793a;
    public int f15794b;
    public final Object f15795c;
    public final Object d;
    public final Object f15796e;

    public o5(yu0 yu0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i9, int i10) {
        this.f15793a = i10;
        this.f15796e = yu0Var;
        this.f15795c = viewGroup;
        this.d = viewGroup2;
        this.f15794b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15793a) {
            case 0:
                g6 g6Var = (g6) this.f15796e;
                g6Var.U0 = g6Var.V0;
                g6Var.V0 = -1;
                g6Var.S0.invalidate();
                View view = (View) this.f15795c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == g6Var.X0) {
                    g6Var.X0 = null;
                    return;
                }
                return;
            case 1:
                qn qnVar = (qn) this.f15796e;
                qnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow = true;
                qnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new kt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                qnVar.T0.invalidate();
                qnVar.T0.setSkipBackgroundDrawing(false);
                qnVar.O9 = false;
                qn qnVar2 = (qn) this.f15795c;
                qnVar2.Q9 = 0.0f;
                qnVar2.fragmentView.invalidate();
                qnVar2.f42077t0.invalidate();
                qnVar2.P9 = null;
                qnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                qnVar.W0.setTranslationY(0.0f);
                qnVar2.W0.setTranslationY(0.0f);
                qnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                qnVar.W0.getAvatarImageView().setScaleX(1.0f);
                qnVar.W0.getAvatarImageView().setScaleY(1.0f);
                qnVar.W0.getAvatarImageView().setAlpha(1.0f);
                qnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                qnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                qnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                sg sgVar = qnVar2.I0;
                if (sgVar != null) {
                    sgVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f15796e;
                l0Var.f49930c1 = l0Var.f49932d1;
                l0Var.f49932d1 = -1;
                l0Var.f49928b1.invalidate();
                View view2 = (View) this.f15795c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == l0Var.f49936f1) {
                    l0Var.f49936f1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        int i9;
        View view2;
        switch (this.f15793a) {
            case 0:
                g6 g6Var = (g6) this.f15796e;
                yf.w1 w1Var = g6Var.Z0;
                if (((View) this.f15795c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f15794b == 2) {
                    w1Var.b(0.5f, 2.0f);
                    return;
                }
                xf.m currentBrush = g6Var.K0.getCurrentBrush();
                if (!(currentBrush instanceof xf.b) && !(currentBrush instanceof xf.d)) {
                    w1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) this.f15796e)).currentAccount;
                this.f15794b = NotificationCenter.getInstance(i9).setAnimationInProgress(this.f15794b, null);
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f15796e;
                yf.w1 w1Var2 = l0Var.f49940h1;
                if (((View) this.f15795c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f15794b == 2) {
                    w1Var2.b(0.5f, 2.0f);
                    return;
                }
                xf.m currentBrush2 = l0Var.S0.getCurrentBrush();
                if (!(currentBrush2 instanceof xf.b) && !(currentBrush2 instanceof xf.d)) {
                    w1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public o5(qn qnVar, qn qnVar2, Runnable runnable) {
        this.f15793a = 1;
        this.f15796e = qnVar;
        this.f15795c = qnVar2;
        this.d = runnable;
    }
}
