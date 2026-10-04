package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.hu0;
import org.telegram.ui.yn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f6288a;
    public int f6289b;
    public final Object f6290c;
    public final Object d;
    public final Object f6291e;

    public x5(mw0 mw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f6288a = i11;
        this.f6291e = mw0Var;
        this.f6290c = viewGroup;
        this.d = viewGroup2;
        this.f6289b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6288a) {
            case 0:
                q6 q6Var = (q6) this.f6291e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f6290c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5746b1) {
                    q6Var.f5746b1 = null;
                    return;
                }
                return;
            case 1:
                yn ynVar = (yn) this.f6291e;
                ynVar.M5 = true;
                ((org.telegram.ui.ActionBar.n2) ynVar).fragmentBeginToShow = true;
                ynVar.T9 = null;
                AndroidUtilities.runOnUIThread(new hu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                ynVar.V0.invalidate();
                ynVar.V0.setSkipBackgroundDrawing(false);
                ynVar.Q9 = false;
                yn ynVar2 = (yn) this.f6290c;
                ynVar2.S9 = 0.0f;
                ynVar2.fragmentView.invalidate();
                ynVar2.f43525v0.invalidate();
                ynVar2.R9 = null;
                ynVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                ynVar.Y0.setTranslationY(0.0f);
                ynVar2.Y0.setTranslationY(0.0f);
                ynVar2.Y0.getAvatarImageView().setTranslationY(0.0f);
                ynVar.Y0.getAvatarImageView().setScaleX(1.0f);
                ynVar.Y0.getAvatarImageView().setScaleY(1.0f);
                ynVar.Y0.getAvatarImageView().setAlpha(1.0f);
                ynVar2.Y0.getAvatarImageView().setScaleX(1.0f);
                ynVar2.Y0.getAvatarImageView().setScaleY(1.0f);
                ynVar2.Y0.getAvatarImageView().setAlpha(1.0f);
                eh ehVar = ynVar2.K0;
                if (ehVar != null) {
                    ehVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6291e;
                m0Var.f45166g1 = m0Var.f45168h1;
                m0Var.f45168h1 = -1;
                m0Var.f45164f1.invalidate();
                View view2 = (View) this.f6290c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f45172j1) {
                    m0Var.f45172j1 = null;
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
        switch (this.f6288a) {
            case 0:
                q6 q6Var = (q6) this.f6291e;
                qg.w1 w1Var = q6Var.f5750d1;
                if (((View) this.f6290c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f6289b == 2) {
                    w1Var.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush = q6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof pg.b) && !(currentBrush instanceof pg.d)) {
                    w1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) this.f6291e)).currentAccount;
                this.f6289b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f6289b, null);
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6291e;
                qg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f6290c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f6289b == 2) {
                    w1Var2.b(0.5f, 2.0f);
                    return;
                }
                pg.m currentBrush2 = m0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof pg.b) && !(currentBrush2 instanceof pg.d)) {
                    w1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public x5(yn ynVar, yn ynVar2, Runnable runnable) {
        this.f6288a = 1;
        this.f6291e = ynVar;
        this.f6290c = ynVar2;
        this.d = runnable;
    }
}
