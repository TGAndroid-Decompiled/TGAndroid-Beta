package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.og;
import org.telegram.ui.lt0;
import org.telegram.ui.rn;

public final class n5 extends AnimatorListenerAdapter {

    public final int f16430a;

    public int f16431b;

    public final Object f16432c;
    public final Object d;

    public final Object f16433e;

    public n5(av0 av0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f16430a = i11;
        this.f16433e = av0Var;
        this.f16432c = viewGroup;
        this.d = viewGroup2;
        this.f16431b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16430a) {
            case 0:
                f6 f6Var = (f6) this.f16433e;
                f6Var.U0 = f6Var.V0;
                f6Var.V0 = -1;
                f6Var.S0.invalidate();
                View view = (View) this.f16432c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == f6Var.X0) {
                    f6Var.X0 = null;
                }
                break;
            case 1:
                rn rnVar = (rn) this.f16433e;
                rnVar.K5 = true;
                ((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow = true;
                rnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new lt0(this, 29), 32L);
                super.onAnimationEnd(animator);
                rnVar.T0.invalidate();
                rnVar.T0.setSkipBackgroundDrawing(false);
                rnVar.O9 = false;
                rn rnVar2 = (rn) this.f16432c;
                rnVar2.Q9 = 0.0f;
                rnVar2.fragmentView.invalidate();
                rnVar2.f42213t0.invalidate();
                rnVar2.P9 = null;
                rnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                rnVar.W0.setTranslationY(0.0f);
                rnVar2.W0.setTranslationY(0.0f);
                rnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                rnVar.W0.getAvatarImageView().setScaleX(1.0f);
                rnVar.W0.getAvatarImageView().setScaleY(1.0f);
                rnVar.W0.getAvatarImageView().setAlpha(1.0f);
                rnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                rnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                rnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                og ogVar = rnVar2.I0;
                if (ogVar != null) {
                    ogVar.setAlpha(1.0f);
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f16433e;
                l0Var.f50508c1 = l0Var.f50510d1;
                l0Var.f50510d1 = -1;
                l0Var.f50506b1.invalidate();
                View view2 = (View) this.f16432c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == l0Var.f50514f1) {
                    l0Var.f50514f1 = null;
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        View view2;
        switch (this.f16430a) {
            case 0:
                f6 f6Var = (f6) this.f16433e;
                zf.w1 w1Var = f6Var.Z0;
                if (((View) this.f16432c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f16431b != 2) {
                    yf.m currentBrush = f6Var.K0.getCurrentBrush();
                    if ((currentBrush instanceof yf.b) || (currentBrush instanceof yf.d)) {
                        w1Var.b(0.4f, 1.75f);
                    } else {
                        w1Var.b(0.05f, 1.0f);
                    }
                } else {
                    w1Var.b(0.5f, 2.0f);
                }
                break;
            case 1:
                super.onAnimationStart(animator);
                this.f16431b = NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) ((rn) this.f16433e)).currentAccount).setAnimationInProgress(this.f16431b, null);
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f16433e;
                zf.w1 w1Var2 = l0Var.f50518h1;
                if (((View) this.f16432c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f16431b != 2) {
                    yf.m currentBrush2 = l0Var.S0.getCurrentBrush();
                    if ((currentBrush2 instanceof yf.b) || (currentBrush2 instanceof yf.d)) {
                        w1Var2.b(0.4f, 1.75f);
                    } else {
                        w1Var2.b(0.05f, 1.0f);
                    }
                } else {
                    w1Var2.b(0.5f, 2.0f);
                }
                break;
        }
    }

    public n5(rn rnVar, rn rnVar2, Runnable runnable) {
        this.f16430a = 1;
        this.f16433e = rnVar;
        this.f16432c = rnVar2;
        this.d = runnable;
    }
}
