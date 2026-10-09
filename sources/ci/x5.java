package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.cj;
import org.telegram.ui.zn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f6300a;
    public int f6301b;
    public final Object f6302c;
    public final Object d;
    public final Object f6303e;

    public x5(tw0 tw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f6300a = i11;
        this.f6303e = tw0Var;
        this.f6302c = viewGroup;
        this.d = viewGroup2;
        this.f6301b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6300a) {
            case 0:
                q6 q6Var = (q6) this.f6303e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f6302c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5791b1) {
                    q6Var.f5791b1 = null;
                    return;
                }
                return;
            case 1:
                zn znVar = (zn) this.f6303e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                AndroidUtilities.runOnUIThread(new cj(this, 0), 32L);
                super.onAnimationEnd(animator);
                znVar.X0.invalidate();
                znVar.X0.setSkipBackgroundDrawing(false);
                znVar.S9 = false;
                zn znVar2 = (zn) this.f6302c;
                znVar2.U9 = 0.0f;
                znVar2.fragmentView.invalidate();
                znVar2.f44990x0.invalidate();
                znVar2.T9 = null;
                znVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                znVar.f44702a1.setTranslationY(0.0f);
                znVar2.f44702a1.setTranslationY(0.0f);
                znVar2.f44702a1.getAvatarImageView().setTranslationY(0.0f);
                znVar.f44702a1.getAvatarImageView().setScaleX(1.0f);
                znVar.f44702a1.getAvatarImageView().setScaleY(1.0f);
                znVar.f44702a1.getAvatarImageView().setAlpha(1.0f);
                znVar2.f44702a1.getAvatarImageView().setScaleX(1.0f);
                znVar2.f44702a1.getAvatarImageView().setScaleY(1.0f);
                znVar2.f44702a1.getAvatarImageView().setAlpha(1.0f);
                fh fhVar = znVar2.M0;
                if (fhVar != null) {
                    fhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6303e;
                m0Var.f46371g1 = m0Var.f46373h1;
                m0Var.f46373h1 = -1;
                m0Var.f46369f1.invalidate();
                View view2 = (View) this.f6302c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f46377j1) {
                    m0Var.f46377j1 = null;
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
        switch (this.f6300a) {
            case 0:
                q6 q6Var = (q6) this.f6303e;
                qg.w1 w1Var = q6Var.f5795d1;
                if (((View) this.f6302c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f6301b == 2) {
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.f6303e)).currentAccount;
                this.f6301b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f6301b, null);
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6303e;
                qg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f6302c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f6301b == 2) {
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

    public x5(zn znVar, zn znVar2, Runnable runnable) {
        this.f6300a = 1;
        this.f6303e = znVar;
        this.f6302c = znVar2;
        this.d = runnable;
    }
}
