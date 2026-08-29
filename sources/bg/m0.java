package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.it0;
import org.telegram.ui.tn;
public final class m0 extends AnimatorListenerAdapter {
    public final int f2393a;
    public final Object f2394b;
    public final Object f2395c;
    public int d;
    public final Object f2396e;

    public m0(iv0 iv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f2393a = i11;
        this.f2396e = iv0Var;
        this.f2394b = viewGroup;
        this.f2395c = viewGroup2;
        this.d = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2393a) {
            case 0:
                g1 g1Var = (g1) this.f2396e;
                g1Var.f2227c1 = g1Var.f2229d1;
                g1Var.f2229d1 = -1;
                g1Var.f2225b1.invalidate();
                View view = (View) this.f2394b;
                if (view != null && ((View) this.f2395c) != null) {
                    view.setVisibility(8);
                }
                if (animator == g1Var.f2233f1) {
                    g1Var.f2233f1 = null;
                    return;
                }
                return;
            case 1:
                t5 t5Var = (t5) this.f2396e;
                t5Var.U0 = t5Var.V0;
                t5Var.V0 = -1;
                t5Var.S0.invalidate();
                View view2 = (View) this.f2394b;
                if (view2 != null && ((View) this.f2395c) != null) {
                    view2.setVisibility(8);
                }
                if (animator == t5Var.X0) {
                    t5Var.X0 = null;
                    return;
                }
                return;
            default:
                tn tnVar = (tn) this.f2396e;
                tnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow = true;
                tnVar.R9 = null;
                AndroidUtilities.runOnUIThread(new it0(this, 29), 32L);
                super.onAnimationEnd(animator);
                tnVar.T0.invalidate();
                tnVar.T0.setSkipBackgroundDrawing(false);
                tnVar.O9 = false;
                tn tnVar2 = (tn) this.f2394b;
                tnVar2.Q9 = 0.0f;
                tnVar2.fragmentView.invalidate();
                tnVar2.f42973t0.invalidate();
                tnVar2.P9 = null;
                tnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.f2395c).run();
                tnVar.W0.setTranslationY(0.0f);
                tnVar2.W0.setTranslationY(0.0f);
                tnVar2.W0.getAvatarImageView().setTranslationY(0.0f);
                tnVar.W0.getAvatarImageView().setScaleX(1.0f);
                tnVar.W0.getAvatarImageView().setScaleY(1.0f);
                tnVar.W0.getAvatarImageView().setAlpha(1.0f);
                tnVar2.W0.getAvatarImageView().setScaleX(1.0f);
                tnVar2.W0.getAvatarImageView().setScaleY(1.0f);
                tnVar2.W0.getAvatarImageView().setAlpha(1.0f);
                vg vgVar = tnVar2.I0;
                if (vgVar != null) {
                    vgVar.setAlpha(1.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        View view2;
        int i10;
        switch (this.f2393a) {
            case 0:
                g1 g1Var = (g1) this.f2396e;
                w2 w2Var = g1Var.f2237h1;
                if (((View) this.f2394b) != null && (view = (View) this.f2395c) != null) {
                    view.setVisibility(0);
                }
                if (this.d == 2) {
                    w2Var.b(0.5f, 2.0f);
                    return;
                }
                ag.m currentBrush = g1Var.S0.getCurrentBrush();
                if (!(currentBrush instanceof ag.b) && !(currentBrush instanceof ag.d)) {
                    w2Var.b(0.05f, 1.0f);
                    return;
                } else {
                    w2Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                t5 t5Var = (t5) this.f2396e;
                w2 w2Var2 = t5Var.Z0;
                if (((View) this.f2394b) != null && (view2 = (View) this.f2395c) != null) {
                    view2.setVisibility(0);
                }
                if (this.d == 2) {
                    w2Var2.b(0.5f, 2.0f);
                    return;
                }
                ag.m currentBrush2 = t5Var.K0.getCurrentBrush();
                if (!(currentBrush2 instanceof ag.b) && !(currentBrush2 instanceof ag.d)) {
                    w2Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    w2Var2.b(0.4f, 1.75f);
                    return;
                }
            default:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) this.f2396e)).currentAccount;
                this.d = NotificationCenter.getInstance(i10).setAnimationInProgress(this.d, null);
                return;
        }
    }

    public m0(tn tnVar, tn tnVar2, Runnable runnable) {
        this.f2393a = 2;
        this.f2396e = tnVar;
        this.f2394b = tnVar2;
        this.f2395c = runnable;
    }
}
