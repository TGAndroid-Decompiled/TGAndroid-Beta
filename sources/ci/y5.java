package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.bo;
import org.telegram.ui.ou0;
public final class y5 extends AnimatorListenerAdapter {
    public final int f5828a;
    public int f5829b;
    public final Object f5830c;
    public final Object d;
    public final Object e;

    public y5(rv0 rv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5828a = i11;
        this.e = rv0Var;
        this.f5830c = viewGroup;
        this.d = viewGroup2;
        this.f5829b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5828a) {
            case 0:
                r6 r6Var = (r6) this.e;
                r6Var.Y0 = r6Var.Z0;
                r6Var.Z0 = -1;
                r6Var.W0.invalidate();
                View view = (View) this.f5830c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == r6Var.f5410b1) {
                    r6Var.f5410b1 = null;
                    return;
                }
                return;
            case 1:
                bo boVar = (bo) this.e;
                boVar.O5 = true;
                ((org.telegram.ui.ActionBar.o2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                AndroidUtilities.runOnUIThread(new ou0(this, 29), 32L);
                super.onAnimationEnd(animator);
                boVar.X0.invalidate();
                boVar.X0.setSkipBackgroundDrawing(false);
                boVar.S9 = false;
                bo boVar2 = (bo) this.f5830c;
                boVar2.U9 = 0.0f;
                boVar2.fragmentView.invalidate();
                boVar2.f32502x0.invalidate();
                boVar2.T9 = null;
                boVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                boVar.f32215a1.setTranslationY(0.0f);
                boVar2.f32215a1.setTranslationY(0.0f);
                boVar2.f32215a1.getAvatarImageView().setTranslationY(0.0f);
                boVar.f32215a1.getAvatarImageView().setScaleX(1.0f);
                boVar.f32215a1.getAvatarImageView().setScaleY(1.0f);
                boVar.f32215a1.getAvatarImageView().setAlpha(1.0f);
                boVar2.f32215a1.getAvatarImageView().setScaleX(1.0f);
                boVar2.f32215a1.getAvatarImageView().setScaleY(1.0f);
                boVar2.f32215a1.getAvatarImageView().setAlpha(1.0f);
                bh bhVar = boVar2.M0;
                if (bhVar != null) {
                    bhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                p0Var.f41548g1 = p0Var.f41550h1;
                p0Var.f41550h1 = -1;
                p0Var.f41546f1.invalidate();
                View view2 = (View) this.f5830c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == p0Var.f41554j1) {
                    p0Var.f41554j1 = null;
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
        switch (this.f5828a) {
            case 0:
                r6 r6Var = (r6) this.e;
                qg.z1 z1Var = r6Var.f5414d1;
                if (((View) this.f5830c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5829b == 2) {
                    z1Var.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush = r6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                    z1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    z1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((bo) this.e)).currentAccount;
                this.f5829b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5829b, null);
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.e;
                qg.z1 z1Var2 = p0Var.l1;
                if (((View) this.f5830c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5829b == 2) {
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

    public y5(bo boVar, bo boVar2, Runnable runnable) {
        this.f5828a = 1;
        this.e = boVar;
        this.f5830c = boVar2;
        this.d = runnable;
    }
}
