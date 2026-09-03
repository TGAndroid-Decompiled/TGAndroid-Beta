package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.xn;
import org.telegram.ui.yt0;
import qh.a5;
public final class j0 extends AnimatorListenerAdapter {
    public final int f5291a;
    public int f5292b;
    public final Object f5293c;
    public final Object d;
    public final Object f5294e;

    public j0(rv0 rv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5291a = i11;
        this.f5294e = rv0Var;
        this.f5293c = viewGroup;
        this.d = viewGroup2;
        this.f5292b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5291a) {
            case 0:
                c1 c1Var = (c1) this.f5294e;
                c1Var.f5106d1 = c1Var.f5108e1;
                c1Var.f5108e1 = -1;
                c1Var.f5104c1.invalidate();
                View view = (View) this.f5293c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == c1Var.f5112g1) {
                    c1Var.f5112g1 = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.f5294e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                AndroidUtilities.runOnUIThread(new yt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.U0.invalidate();
                xnVar.U0.setSkipBackgroundDrawing(false);
                xnVar.P9 = false;
                xn xnVar2 = (xn) this.f5293c;
                xnVar2.R9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.f43340u0.invalidate();
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
                a5 a5Var = (a5) this.f5294e;
                a5Var.V0 = a5Var.W0;
                a5Var.W0 = -1;
                a5Var.T0.invalidate();
                View view2 = (View) this.f5293c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == a5Var.Y0) {
                    a5Var.Y0 = null;
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
        switch (this.f5291a) {
            case 0:
                c1 c1Var = (c1) this.f5294e;
                r2 r2Var = c1Var.f5116i1;
                if (((View) this.f5293c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5292b == 2) {
                    r2Var.b(0.5f, 2.0f);
                    return;
                }
                dg.m currentBrush = c1Var.T0.getCurrentBrush();
                if (!(currentBrush instanceof dg.b) && !(currentBrush instanceof dg.d)) {
                    r2Var.b(0.05f, 1.0f);
                    return;
                } else {
                    r2Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.f5294e)).currentAccount;
                this.f5292b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5292b, null);
                return;
            default:
                a5 a5Var = (a5) this.f5294e;
                r2 r2Var2 = a5Var.f44922a1;
                if (((View) this.f5293c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5292b == 2) {
                    r2Var2.b(0.5f, 2.0f);
                    return;
                }
                dg.m currentBrush2 = a5Var.L0.getCurrentBrush();
                if (!(currentBrush2 instanceof dg.b) && !(currentBrush2 instanceof dg.d)) {
                    r2Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    r2Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public j0(xn xnVar, xn xnVar2, Runnable runnable) {
        this.f5291a = 1;
        this.f5294e = xnVar;
        this.f5293c = xnVar2;
        this.d = runnable;
    }
}
