package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.fu0;
import org.telegram.ui.xn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f5829a;
    public int f5830b;
    public final Object f5831c;
    public final Object d;
    public final Object e;

    public x5(qv0 qv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5829a = i11;
        this.e = qv0Var;
        this.f5831c = viewGroup;
        this.d = viewGroup2;
        this.f5830b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5829a) {
            case 0:
                q6 q6Var = (q6) this.e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f5831c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5332b1) {
                    q6Var.f5332b1 = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.e;
                xnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow = true;
                xnVar.V9 = null;
                AndroidUtilities.runOnUIThread(new fu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.X0.invalidate();
                xnVar.X0.setSkipBackgroundDrawing(false);
                xnVar.S9 = false;
                xn xnVar2 = (xn) this.f5831c;
                xnVar2.U9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.f39596x0.invalidate();
                xnVar2.T9 = null;
                xnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                xnVar.f39310a1.setTranslationY(0.0f);
                xnVar2.f39310a1.setTranslationY(0.0f);
                xnVar2.f39310a1.getAvatarImageView().setTranslationY(0.0f);
                xnVar.f39310a1.getAvatarImageView().setScaleX(1.0f);
                xnVar.f39310a1.getAvatarImageView().setScaleY(1.0f);
                xnVar.f39310a1.getAvatarImageView().setAlpha(1.0f);
                xnVar2.f39310a1.getAvatarImageView().setScaleX(1.0f);
                xnVar2.f39310a1.getAvatarImageView().setScaleY(1.0f);
                xnVar2.f39310a1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = xnVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                p0Var.f41478g1 = p0Var.f41480h1;
                p0Var.f41480h1 = -1;
                p0Var.f41476f1.invalidate();
                View view2 = (View) this.f5831c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == p0Var.f41484j1) {
                    p0Var.f41484j1 = null;
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
        switch (this.f5829a) {
            case 0:
                q6 q6Var = (q6) this.e;
                qg.z1 z1Var = q6Var.f5336d1;
                if (((View) this.f5831c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5830b == 2) {
                    z1Var.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush = q6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                    z1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    z1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((xn) this.e)).currentAccount;
                this.f5830b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5830b, null);
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                qg.z1 z1Var2 = p0Var.l1;
                if (((View) this.f5831c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5830b == 2) {
                    z1Var2.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush2 = p0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
                    z1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    z1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public x5(xn xnVar, xn xnVar2, Runnable runnable) {
        this.f5829a = 1;
        this.e = xnVar;
        this.f5831c = xnVar2;
        this.d = runnable;
    }
}
