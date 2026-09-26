package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.eu0;
import org.telegram.ui.wn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f5829a;
    public int f5830b;
    public final Object f5831c;
    public final Object d;
    public final Object e;

    public x5(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
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
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                AndroidUtilities.runOnUIThread(new eu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                wnVar.X0.invalidate();
                wnVar.X0.setSkipBackgroundDrawing(false);
                wnVar.S9 = false;
                wn wnVar2 = (wn) this.f5831c;
                wnVar2.U9 = 0.0f;
                wnVar2.fragmentView.invalidate();
                wnVar2.f39695x0.invalidate();
                wnVar2.T9 = null;
                wnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wnVar.f39409a1.setTranslationY(0.0f);
                wnVar2.f39409a1.setTranslationY(0.0f);
                wnVar2.f39409a1.getAvatarImageView().setTranslationY(0.0f);
                wnVar.f39409a1.getAvatarImageView().setScaleX(1.0f);
                wnVar.f39409a1.getAvatarImageView().setScaleY(1.0f);
                wnVar.f39409a1.getAvatarImageView().setAlpha(1.0f);
                wnVar2.f39409a1.getAvatarImageView().setScaleX(1.0f);
                wnVar2.f39409a1.getAvatarImageView().setScaleY(1.0f);
                wnVar2.f39409a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = wnVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                n0Var.f41781g1 = n0Var.f41783h1;
                n0Var.f41783h1 = -1;
                n0Var.f41779f1.invalidate();
                View view2 = (View) this.f5831c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.f41787j1) {
                    n0Var.f41787j1 = null;
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
                qg.x1 x1Var = q6Var.f5336d1;
                if (((View) this.f5831c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5830b == 2) {
                    x1Var.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush = q6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                    x1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
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

    public x5(wn wnVar, wn wnVar2, Runnable runnable) {
        this.f5829a = 1;
        this.e = wnVar;
        this.f5831c = wnVar2;
        this.d = runnable;
    }
}
