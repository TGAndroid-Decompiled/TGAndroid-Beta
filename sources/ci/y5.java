package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ch;
import org.telegram.ui.mu0;
import org.telegram.ui.zn;
public final class y5 extends AnimatorListenerAdapter {
    public final int f5829a;
    public int f5830b;
    public final Object f5831c;
    public final Object d;
    public final Object e;

    public y5(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5829a = i11;
        this.e = bw0Var;
        this.f5831c = viewGroup;
        this.d = viewGroup2;
        this.f5830b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5829a) {
            case 0:
                r6 r6Var = (r6) this.e;
                r6Var.Y0 = r6Var.Z0;
                r6Var.Z0 = -1;
                r6Var.W0.invalidate();
                View view = (View) this.f5831c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == r6Var.f5411b1) {
                    r6Var.f5411b1 = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                AndroidUtilities.runOnUIThread(new mu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                znVar.X0.invalidate();
                znVar.X0.setSkipBackgroundDrawing(false);
                znVar.S9 = false;
                zn znVar2 = (zn) this.f5831c;
                znVar2.U9 = 0.0f;
                znVar2.fragmentView.invalidate();
                znVar2.f40530x0.invalidate();
                znVar2.T9 = null;
                znVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                znVar.f40243a1.setTranslationY(0.0f);
                znVar2.f40243a1.setTranslationY(0.0f);
                znVar2.f40243a1.getAvatarImageView().setTranslationY(0.0f);
                znVar.f40243a1.getAvatarImageView().setScaleX(1.0f);
                znVar.f40243a1.getAvatarImageView().setScaleY(1.0f);
                znVar.f40243a1.getAvatarImageView().setAlpha(1.0f);
                znVar2.f40243a1.getAvatarImageView().setScaleX(1.0f);
                znVar2.f40243a1.getAvatarImageView().setScaleY(1.0f);
                znVar2.f40243a1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = znVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                n0Var.f41795g1 = n0Var.f41797h1;
                n0Var.f41797h1 = -1;
                n0Var.f41793f1.invalidate();
                View view2 = (View) this.f5831c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.f41801j1) {
                    n0Var.f41801j1 = null;
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
                r6 r6Var = (r6) this.e;
                qg.x1 x1Var = r6Var.f5415d1;
                if (((View) this.f5831c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5830b == 2) {
                    x1Var.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush = r6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                    x1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.e)).currentAccount;
                this.f5830b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5830b, null);
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                qg.x1 x1Var2 = n0Var.l1;
                if (((View) this.f5831c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5830b == 2) {
                    x1Var2.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush2 = n0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
                    x1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public y5(zn znVar, zn znVar2, Runnable runnable) {
        this.f5829a = 1;
        this.e = znVar;
        this.f5831c = znVar2;
        this.d = runnable;
    }
}
