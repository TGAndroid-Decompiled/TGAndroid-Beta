package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.sn;
import org.telegram.ui.vi;
public final class n5 extends AnimatorListenerAdapter {
    public final int f9514a;
    public int f9515b;
    public final Object f9516c;
    public final Object d;
    public final Object e;

    public n5(kw0 kw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f9514a = i11;
        this.e = kw0Var;
        this.f9516c = viewGroup;
        this.d = viewGroup2;
        this.f9515b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9514a) {
            case 0:
                f6 f6Var = (f6) this.e;
                f6Var.Y0 = f6Var.Z0;
                f6Var.Z0 = -1;
                f6Var.W0.invalidate();
                View view = (View) this.f9516c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == f6Var.f9002b1) {
                    f6Var.f9002b1 = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.e;
                snVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow = true;
                snVar.V9 = null;
                AndroidUtilities.runOnUIThread(new vi(this, 0), 32L);
                super.onAnimationEnd(animator);
                snVar.X0.invalidate();
                snVar.X0.setSkipBackgroundDrawing(false);
                snVar.S9 = false;
                sn snVar2 = (sn) this.f9516c;
                snVar2.U9 = 0.0f;
                snVar2.fragmentView.invalidate();
                snVar2.f41433x0.invalidate();
                snVar2.T9 = null;
                snVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                snVar.f41145a1.setTranslationY(0.0f);
                snVar2.f41145a1.setTranslationY(0.0f);
                snVar2.f41145a1.getAvatarImageView().setTranslationY(0.0f);
                snVar.f41145a1.getAvatarImageView().setScaleX(1.0f);
                snVar.f41145a1.getAvatarImageView().setScaleY(1.0f);
                snVar.f41145a1.getAvatarImageView().setAlpha(1.0f);
                snVar2.f41145a1.getAvatarImageView().setScaleX(1.0f);
                snVar2.f41145a1.getAvatarImageView().setScaleY(1.0f);
                snVar2.f41145a1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = snVar2.M0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
                m0Var.f45503g1 = m0Var.f45505h1;
                m0Var.f45505h1 = -1;
                m0Var.f45501f1.invalidate();
                View view2 = (View) this.f9516c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f45509j1) {
                    m0Var.f45509j1 = null;
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
        switch (this.f9514a) {
            case 0:
                f6 f6Var = (f6) this.e;
                rg.w1 w1Var = f6Var.f9006d1;
                if (((View) this.f9516c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f9515b == 2) {
                    w1Var.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush = f6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof qg.b) && !(currentBrush instanceof qg.d)) {
                    w1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((sn) this.e)).currentAccount;
                this.f9515b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f9515b, null);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
                rg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f9516c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f9515b == 2) {
                    w1Var2.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush2 = m0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof qg.b) && !(currentBrush2 instanceof qg.d)) {
                    w1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    w1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public n5(sn snVar, sn snVar2, Runnable runnable) {
        this.f9514a = 1;
        this.e = snVar;
        this.f9516c = snVar2;
        this.d = runnable;
    }
}
