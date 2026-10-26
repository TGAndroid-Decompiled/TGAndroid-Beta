package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.ui;
import org.telegram.ui.un;
public final class m5 extends AnimatorListenerAdapter {
    public final int f11251a;
    public int f11252b;
    public final Object f11253c;
    public final Object d;
    public final Object e;

    public m5(ww0 ww0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f11251a = i11;
        this.e = ww0Var;
        this.f11253c = viewGroup;
        this.d = viewGroup2;
        this.f11252b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11251a) {
            case 0:
                e6 e6Var = (e6) this.e;
                e6Var.N0 = e6Var.O0;
                e6Var.O0 = -1;
                e6Var.L0.invalidate();
                View view = (View) this.f11253c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == e6Var.Q0) {
                    e6Var.Q0 = null;
                    return;
                }
                return;
            case 1:
                un unVar = (un) this.e;
                unVar.f44185a6 = true;
                ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow = true;
                unVar.f44279ha = null;
                AndroidUtilities.runOnUIThread(new ui(this, 0), 32L);
                super.onAnimationEnd(animator);
                unVar.f44295j1.invalidate();
                unVar.f44295j1.setSkipBackgroundDrawing(false);
                unVar.f44243ea = false;
                un unVar2 = (un) this.f11253c;
                unVar2.f44267ga = 0.0f;
                unVar2.fragmentView.invalidate();
                unVar2.f44471x0.invalidate();
                unVar2.f44255fa = null;
                unVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                unVar.f44330m1.setTranslationY(0.0f);
                unVar2.f44330m1.setTranslationY(0.0f);
                unVar2.f44330m1.getAvatarImageView().setTranslationY(0.0f);
                unVar.f44330m1.getAvatarImageView().setScaleX(1.0f);
                unVar.f44330m1.getAvatarImageView().setScaleY(1.0f);
                unVar.f44330m1.getAvatarImageView().setAlpha(1.0f);
                unVar2.f44330m1.getAvatarImageView().setScaleX(1.0f);
                unVar2.f44330m1.getAvatarImageView().setScaleY(1.0f);
                unVar2.f44330m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = unVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                sg.n0 n0Var = (sg.n0) this.e;
                n0Var.V0 = n0Var.W0;
                n0Var.W0 = -1;
                n0Var.U0.invalidate();
                View view2 = (View) this.f11253c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == n0Var.Y0) {
                    n0Var.Y0 = null;
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
        switch (this.f11251a) {
            case 0:
                e6 e6Var = (e6) this.e;
                sg.y1 y1Var = e6Var.S0;
                if (((View) this.f11253c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f11252b == 2) {
                    y1Var.b(0.5f, 2.0f);
                    return;
                }
                rg.m currentBrush = e6Var.D0.getCurrentBrush();
                if (!(currentBrush instanceof rg.b) && !(currentBrush instanceof rg.d)) {
                    y1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    y1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.r2) ((un) this.e)).currentAccount;
                this.f11252b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f11252b, null);
                return;
            default:
                sg.n0 n0Var = (sg.n0) this.e;
                sg.y1 y1Var2 = n0Var.f48332a1;
                if (((View) this.f11253c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f11252b == 2) {
                    y1Var2.b(0.5f, 2.0f);
                    return;
                }
                rg.m currentBrush2 = n0Var.L0.getCurrentBrush();
                if (!(currentBrush2 instanceof rg.b) && !(currentBrush2 instanceof rg.d)) {
                    y1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    y1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public m5(un unVar, un unVar2, Runnable runnable) {
        this.f11251a = 1;
        this.e = unVar;
        this.f11253c = unVar2;
        this.d = runnable;
    }
}
