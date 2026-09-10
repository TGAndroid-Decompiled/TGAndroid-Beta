package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.eo;
import org.telegram.ui.mu0;
public final class x6 extends AnimatorListenerAdapter {
    public final int f3913a;
    public int f3914b;
    public final Object f3915c;
    public final Object d;
    public final Object e;

    public x6(bw0 bw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f3913a = i11;
        this.e = bw0Var;
        this.f3915c = viewGroup;
        this.d = viewGroup2;
        this.f3914b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3913a) {
            case 0:
                r7 r7Var = (r7) this.e;
                r7Var.Y0 = r7Var.Z0;
                r7Var.Z0 = -1;
                r7Var.W0.invalidate();
                View view = (View) this.f3915c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == r7Var.f3501b1) {
                    r7Var.f3501b1 = null;
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                AndroidUtilities.runOnUIThread(new mu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                eoVar.X0.invalidate();
                eoVar.X0.setSkipBackgroundDrawing(false);
                eoVar.S9 = false;
                eo eoVar2 = (eo) this.f3915c;
                eoVar2.U9 = 0.0f;
                eoVar2.fragmentView.invalidate();
                eoVar2.f32542x0.invalidate();
                eoVar2.T9 = null;
                eoVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                eoVar.f32256a1.setTranslationY(0.0f);
                eoVar2.f32256a1.setTranslationY(0.0f);
                eoVar2.f32256a1.getAvatarImageView().setTranslationY(0.0f);
                eoVar.f32256a1.getAvatarImageView().setScaleX(1.0f);
                eoVar.f32256a1.getAvatarImageView().setScaleY(1.0f);
                eoVar.f32256a1.getAvatarImageView().setAlpha(1.0f);
                eoVar2.f32256a1.getAvatarImageView().setScaleX(1.0f);
                eoVar2.f32256a1.getAvatarImageView().setScaleY(1.0f);
                eoVar2.f32256a1.getAvatarImageView().setAlpha(1.0f);
                fh fhVar = eoVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                pg.m0 m0Var = (pg.m0) this.e;
                m0Var.f40134g1 = m0Var.f40136h1;
                m0Var.f40136h1 = -1;
                m0Var.f40132f1.invalidate();
                View view2 = (View) this.f3915c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f40140j1) {
                    m0Var.f40140j1 = null;
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
        switch (this.f3913a) {
            case 0:
                r7 r7Var = (r7) this.e;
                pg.w1 w1Var = r7Var.f3505d1;
                if (((View) this.f3915c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f3914b == 2) {
                    w1Var.b(0.5f, 2.0f);
                    return;
                }
                og.m currentBrush = r7Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof og.b) && !(currentBrush instanceof og.d)) {
                    w1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.p2) ((eo) this.e)).currentAccount;
                this.f3914b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f3914b, null);
                return;
            default:
                pg.m0 m0Var = (pg.m0) this.e;
                pg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f3915c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f3914b == 2) {
                    w1Var2.b(0.5f, 2.0f);
                    return;
                }
                og.m currentBrush2 = m0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof og.b) && !(currentBrush2 instanceof og.d)) {
                    w1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public x6(eo eoVar, eo eoVar2, Runnable runnable) {
        this.f3913a = 1;
        this.e = eoVar;
        this.f3915c = eoVar2;
        this.d = runnable;
    }
}
