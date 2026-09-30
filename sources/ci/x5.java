package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.eu0;
import org.telegram.ui.wn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f5841a;
    public int f5842b;
    public final Object f5843c;
    public final Object d;
    public final Object e;

    public x5(ew0 ew0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5841a = i11;
        this.e = ew0Var;
        this.f5843c = viewGroup;
        this.d = viewGroup2;
        this.f5842b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5841a) {
            case 0:
                q6 q6Var = (q6) this.e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f5843c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5341b1) {
                    q6Var.f5341b1 = null;
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
                wn wnVar2 = (wn) this.f5843c;
                wnVar2.U9 = 0.0f;
                wnVar2.fragmentView.invalidate();
                wnVar2.f39788x0.invalidate();
                wnVar2.T9 = null;
                wnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wnVar.f39502a1.setTranslationY(0.0f);
                wnVar2.f39502a1.setTranslationY(0.0f);
                wnVar2.f39502a1.getAvatarImageView().setTranslationY(0.0f);
                wnVar.f39502a1.getAvatarImageView().setScaleX(1.0f);
                wnVar.f39502a1.getAvatarImageView().setScaleY(1.0f);
                wnVar.f39502a1.getAvatarImageView().setAlpha(1.0f);
                wnVar2.f39502a1.getAvatarImageView().setScaleX(1.0f);
                wnVar2.f39502a1.getAvatarImageView().setScaleY(1.0f);
                wnVar2.f39502a1.getAvatarImageView().setAlpha(1.0f);
                eh ehVar = wnVar2.M0;
                if (ehVar != null) {
                    ehVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                n0Var.f41882g1 = n0Var.f41884h1;
                n0Var.f41884h1 = -1;
                n0Var.f41880f1.invalidate();
                View view2 = (View) this.f5843c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.f41888j1) {
                    n0Var.f41888j1 = null;
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
        switch (this.f5841a) {
            case 0:
                q6 q6Var = (q6) this.e;
                qg.x1 x1Var = q6Var.f5345d1;
                if (((View) this.f5843c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5842b == 2) {
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
                this.f5842b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5842b, null);
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.e;
                qg.x1 x1Var2 = n0Var.l1;
                if (((View) this.f5843c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5842b == 2) {
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
        this.f5841a = 1;
        this.e = wnVar;
        this.f5843c = wnVar2;
        this.d = runnable;
    }
}
