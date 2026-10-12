package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.eo;
import org.telegram.ui.gj;
public final class x5 extends AnimatorListenerAdapter {
    public final int f6298a;
    public int f6299b;
    public final Object f6300c;
    public final Object d;
    public final Object f6301e;

    public x5(zw0 zw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f6298a = i11;
        this.f6301e = zw0Var;
        this.f6300c = viewGroup;
        this.d = viewGroup2;
        this.f6299b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6298a) {
            case 0:
                q6 q6Var = (q6) this.f6301e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f6300c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5789b1) {
                    q6Var.f5789b1 = null;
                    return;
                }
                return;
            case 1:
                eo eoVar = (eo) this.f6301e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                AndroidUtilities.runOnUIThread(new gj(this, 0), 32L);
                super.onAnimationEnd(animator);
                eoVar.X0.invalidate();
                eoVar.X0.setSkipBackgroundDrawing(false);
                eoVar.S9 = false;
                eo eoVar2 = (eo) this.f6300c;
                eoVar2.U9 = 0.0f;
                eoVar2.fragmentView.invalidate();
                eoVar2.f37483x0.invalidate();
                eoVar2.T9 = null;
                eoVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                eoVar.f37195a1.setTranslationY(0.0f);
                eoVar2.f37195a1.setTranslationY(0.0f);
                eoVar2.f37195a1.getAvatarImageView().setTranslationY(0.0f);
                eoVar.f37195a1.getAvatarImageView().setScaleX(1.0f);
                eoVar.f37195a1.getAvatarImageView().setScaleY(1.0f);
                eoVar.f37195a1.getAvatarImageView().setAlpha(1.0f);
                eoVar2.f37195a1.getAvatarImageView().setScaleX(1.0f);
                eoVar2.f37195a1.getAvatarImageView().setScaleY(1.0f);
                eoVar2.f37195a1.getAvatarImageView().setAlpha(1.0f);
                hh hhVar = eoVar2.M0;
                if (hhVar != null) {
                    hhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6301e;
                m0Var.f46316g1 = m0Var.f46318h1;
                m0Var.f46318h1 = -1;
                m0Var.f46314f1.invalidate();
                View view2 = (View) this.f6300c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f46322j1) {
                    m0Var.f46322j1 = null;
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
        switch (this.f6298a) {
            case 0:
                q6 q6Var = (q6) this.f6301e;
                qg.w1 w1Var = q6Var.f5793d1;
                if (((View) this.f6300c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f6299b == 2) {
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
                i10 = ((org.telegram.ui.ActionBar.m2) ((eo) this.f6301e)).currentAccount;
                this.f6299b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f6299b, null);
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6301e;
                qg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f6300c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f6299b == 2) {
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

    public x5(eo eoVar, eo eoVar2, Runnable runnable) {
        this.f6298a = 1;
        this.f6301e = eoVar;
        this.f6300c = eoVar2;
        this.d = runnable;
    }
}
