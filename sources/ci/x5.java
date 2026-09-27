package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.hu0;
import org.telegram.ui.xn;
public final class x5 extends AnimatorListenerAdapter {
    public final int f5838a;
    public int f5839b;
    public final Object f5840c;
    public final Object d;
    public final Object e;

    public x5(dw0 dw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f5838a = i11;
        this.e = dw0Var;
        this.f5840c = viewGroup;
        this.d = viewGroup2;
        this.f5839b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5838a) {
            case 0:
                q6 q6Var = (q6) this.e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f5840c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f5336b1) {
                    q6Var.f5336b1 = null;
                    return;
                }
                return;
            case 1:
                xn xnVar = (xn) this.e;
                xnVar.O5 = true;
                ((org.telegram.ui.ActionBar.o2) xnVar).fragmentBeginToShow = true;
                xnVar.V9 = null;
                AndroidUtilities.runOnUIThread(new hu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                xnVar.X0.invalidate();
                xnVar.X0.setSkipBackgroundDrawing(false);
                xnVar.S9 = false;
                xn xnVar2 = (xn) this.f5840c;
                xnVar2.U9 = 0.0f;
                xnVar2.fragmentView.invalidate();
                xnVar2.f39977x0.invalidate();
                xnVar2.T9 = null;
                xnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                xnVar.f39690a1.setTranslationY(0.0f);
                xnVar2.f39690a1.setTranslationY(0.0f);
                xnVar2.f39690a1.getAvatarImageView().setTranslationY(0.0f);
                xnVar.f39690a1.getAvatarImageView().setScaleX(1.0f);
                xnVar.f39690a1.getAvatarImageView().setScaleY(1.0f);
                xnVar.f39690a1.getAvatarImageView().setAlpha(1.0f);
                xnVar2.f39690a1.getAvatarImageView().setScaleX(1.0f);
                xnVar2.f39690a1.getAvatarImageView().setScaleY(1.0f);
                xnVar2.f39690a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = xnVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.e;
                m0Var.f41806g1 = m0Var.f41808h1;
                m0Var.f41808h1 = -1;
                m0Var.f41804f1.invalidate();
                View view2 = (View) this.f5840c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.f41812j1) {
                    m0Var.f41812j1 = null;
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
        switch (this.f5838a) {
            case 0:
                q6 q6Var = (q6) this.e;
                qg.w1 w1Var = q6Var.f5340d1;
                if (((View) this.f5840c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f5839b == 2) {
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
                i10 = ((org.telegram.ui.ActionBar.o2) ((xn) this.e)).currentAccount;
                this.f5839b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f5839b, null);
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.e;
                qg.w1 w1Var2 = m0Var.l1;
                if (((View) this.f5840c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f5839b == 2) {
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

    public x5(xn xnVar, xn xnVar2, Runnable runnable) {
        this.f5838a = 1;
        this.e = xnVar;
        this.f5840c = xnVar2;
        this.d = runnable;
    }
}
