package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
public final class n5 extends AnimatorListenerAdapter {
    public final int f9523a;
    public int f9524b;
    public final Object f9525c;
    public final Object d;
    public final Object e;

    public n5(pw0 pw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f9523a = i11;
        this.e = pw0Var;
        this.f9525c = viewGroup;
        this.d = viewGroup2;
        this.f9524b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9523a) {
            case 0:
                f6 f6Var = (f6) this.e;
                f6Var.Y0 = f6Var.Z0;
                f6Var.Z0 = -1;
                f6Var.W0.invalidate();
                View view = (View) this.f9525c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == f6Var.f9011b1) {
                    f6Var.f9011b1 = null;
                    return;
                }
                return;
            case 1:
                sn snVar = (sn) this.e;
                snVar.f41453a6 = true;
                ((org.telegram.ui.ActionBar.o2) snVar).fragmentBeginToShow = true;
                snVar.ha = null;
                AndroidUtilities.runOnUIThread(new ti(this, 0), 32L);
                super.onAnimationEnd(animator);
                snVar.f41561j1.invalidate();
                snVar.f41561j1.setSkipBackgroundDrawing(false);
                snVar.f41509ea = false;
                sn snVar2 = (sn) this.f9525c;
                snVar2.f41534ga = 0.0f;
                snVar2.fragmentView.invalidate();
                snVar2.f41737x0.invalidate();
                snVar2.f41522fa = null;
                snVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                snVar.f41597m1.setTranslationY(0.0f);
                snVar2.f41597m1.setTranslationY(0.0f);
                snVar2.f41597m1.getAvatarImageView().setTranslationY(0.0f);
                snVar.f41597m1.getAvatarImageView().setScaleX(1.0f);
                snVar.f41597m1.getAvatarImageView().setScaleY(1.0f);
                snVar.f41597m1.getAvatarImageView().setAlpha(1.0f);
                snVar2.f41597m1.getAvatarImageView().setScaleX(1.0f);
                snVar2.f41597m1.getAvatarImageView().setScaleY(1.0f);
                snVar2.f41597m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = snVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
                m0Var.f45894g1 = m0Var.f45896h1;
                m0Var.f45896h1 = -1;
                m0Var.f45892f1.invalidate();
                View view2 = (View) this.f9525c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f45900j1) {
                    m0Var.f45900j1 = null;
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
        switch (this.f9523a) {
            case 0:
                f6 f6Var = (f6) this.e;
                rg.x1 x1Var = f6Var.f9015d1;
                if (((View) this.f9525c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f9524b == 2) {
                    x1Var.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush = f6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof qg.b) && !(currentBrush instanceof qg.d)) {
                    x1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((sn) this.e)).currentAccount;
                this.f9524b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f9524b, null);
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.e;
                rg.x1 x1Var2 = m0Var.l1;
                if (((View) this.f9525c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f9524b == 2) {
                    x1Var2.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush2 = m0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof qg.b) && !(currentBrush2 instanceof qg.d)) {
                    x1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public n5(sn snVar, sn snVar2, Runnable runnable) {
        this.f9523a = 1;
        this.e = snVar;
        this.f9525c = snVar2;
        this.d = runnable;
    }
}
