package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.rt0;
import org.telegram.ui.xn;
import ph.c5;
public final class l0 extends AnimatorListenerAdapter {
    public final int f4637a;
    public int f4638b;
    public final Object f4639c;
    public final Object d;
    public final Object e;

    public l0(rv0 rv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f4637a = i11;
        this.e = rv0Var;
        this.f4639c = viewGroup;
        this.d = viewGroup2;
        this.f4638b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4637a) {
            case 0:
                e1 e1Var = (e1) this.e;
                e1Var.f4463d1 = e1Var.f4465e1;
                e1Var.f4465e1 = -1;
                e1Var.f4461c1.invalidate();
                View view = (View) this.f4639c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == e1Var.f4469g1) {
                    e1Var.f4469g1 = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                AndroidUtilities.runOnUIThread(new rt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.U0.invalidate();
                xnVar.U0.setSkipBackgroundDrawing(false);
                xnVar.P9 = false;
                xn xnVar2 = (xn) this.f4639c;
                xnVar2.R9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.f40193u0.invalidate();
                xnVar2.Q9 = null;
                xnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                xnVar.X0.setTranslationY(0.0f);
                xnVar2.X0.setTranslationY(0.0f);
                xnVar2.X0.getAvatarImageView().setTranslationY(0.0f);
                xnVar.X0.getAvatarImageView().setScaleX(1.0f);
                xnVar.X0.getAvatarImageView().setScaleY(1.0f);
                xnVar.X0.getAvatarImageView().setAlpha(1.0f);
                xnVar2.X0.getAvatarImageView().setScaleX(1.0f);
                xnVar2.X0.getAvatarImageView().setScaleY(1.0f);
                xnVar2.X0.getAvatarImageView().setAlpha(1.0f);
                sg sgVar = xnVar2.J0;
                if (sgVar != null) {
                    sgVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                c5 c5Var = (c5) this.e;
                c5Var.V0 = c5Var.W0;
                c5Var.W0 = -1;
                c5Var.T0.invalidate();
                View view2 = (View) this.f4639c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == c5Var.Y0) {
                    c5Var.Y0 = null;
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
        switch (this.f4637a) {
            case 0:
                e1 e1Var = (e1) this.e;
                t2 t2Var = e1Var.f4473i1;
                if (((View) this.f4639c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f4638b == 2) {
                    t2Var.b(0.5f, 2.0f);
                    return;
                }
                cg.m currentBrush = e1Var.T0.getCurrentBrush();
                if (!(currentBrush instanceof cg.b) && !(currentBrush instanceof cg.d)) {
                    t2Var.b(0.05f, 1.0f);
                    return;
                } else {
                    t2Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.e)).currentAccount;
                this.f4638b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f4638b, null);
                return;
            default:
                c5 c5Var = (c5) this.e;
                t2 t2Var2 = c5Var.f41326a1;
                if (((View) this.f4639c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f4638b == 2) {
                    t2Var2.b(0.5f, 2.0f);
                    return;
                }
                cg.m currentBrush2 = c5Var.L0.getCurrentBrush();
                if (!(currentBrush2 instanceof cg.b) && !(currentBrush2 instanceof cg.d)) {
                    t2Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    t2Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public l0(xn xnVar, xn xnVar2, Runnable runnable) {
        this.f4637a = 1;
        this.e = xnVar;
        this.f4639c = xnVar2;
        this.d = runnable;
    }
}
