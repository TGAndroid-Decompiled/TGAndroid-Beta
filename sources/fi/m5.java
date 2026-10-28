package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ch;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.wn;
import org.telegram.ui.xi;
public final class m5 extends AnimatorListenerAdapter {
    public final int f11250a;
    public int f11251b;
    public final Object f11252c;
    public final Object d;
    public final Object e;

    public m5(xw0 xw0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f11250a = i11;
        this.e = xw0Var;
        this.f11252c = viewGroup;
        this.d = viewGroup2;
        this.f11251b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11250a) {
            case 0:
                e6 e6Var = (e6) this.e;
                e6Var.N0 = e6Var.O0;
                e6Var.O0 = -1;
                e6Var.L0.invalidate();
                View view = (View) this.f11252c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == e6Var.Q0) {
                    e6Var.Q0 = null;
                    return;
                }
                return;
            case 1:
                wn wnVar = (wn) this.e;
                wnVar.f45107e6 = true;
                ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow = true;
                wnVar.f45195la = null;
                AndroidUtilities.runOnUIThread(new xi(this, 0), 32L);
                super.onAnimationEnd(animator);
                wnVar.f45163j1.invalidate();
                wnVar.f45163j1.setSkipBackgroundDrawing(false);
                wnVar.ia = false;
                wn wnVar2 = (wn) this.f11252c;
                wnVar2.f45184ka = 0.0f;
                wnVar2.fragmentView.invalidate();
                wnVar2.f45339x0.invalidate();
                wnVar2.ja = null;
                wnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                wnVar.f45198m1.setTranslationY(0.0f);
                wnVar2.f45198m1.setTranslationY(0.0f);
                wnVar2.f45198m1.getAvatarImageView().setTranslationY(0.0f);
                wnVar.f45198m1.getAvatarImageView().setScaleX(1.0f);
                wnVar.f45198m1.getAvatarImageView().setScaleY(1.0f);
                wnVar.f45198m1.getAvatarImageView().setAlpha(1.0f);
                wnVar2.f45198m1.getAvatarImageView().setScaleX(1.0f);
                wnVar2.f45198m1.getAvatarImageView().setScaleY(1.0f);
                wnVar2.f45198m1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = wnVar2.Y0;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.e;
                m0Var.V0 = m0Var.W0;
                m0Var.W0 = -1;
                m0Var.U0.invalidate();
                View view2 = (View) this.f11252c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == m0Var.Y0) {
                    m0Var.Y0 = null;
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
        switch (this.f11250a) {
            case 0:
                e6 e6Var = (e6) this.e;
                sg.x1 x1Var = e6Var.S0;
                if (((View) this.f11252c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f11251b == 2) {
                    x1Var.b(0.5f, 2.0f);
                    return;
                }
                rg.m currentBrush = e6Var.D0.getCurrentBrush();
                if (!(currentBrush instanceof rg.b) && !(currentBrush instanceof rg.d)) {
                    x1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.r2) ((wn) this.e)).currentAccount;
                this.f11251b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f11251b, null);
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.e;
                sg.x1 x1Var2 = m0Var.f48358a1;
                if (((View) this.f11252c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f11251b == 2) {
                    x1Var2.b(0.5f, 2.0f);
                    return;
                }
                rg.m currentBrush2 = m0Var.L0.getCurrentBrush();
                if (!(currentBrush2 instanceof rg.b) && !(currentBrush2 instanceof rg.d)) {
                    x1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    x1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public m5(wn wnVar, wn wnVar2, Runnable runnable) {
        this.f11250a = 1;
        this.e = wnVar;
        this.f11252c = wnVar2;
        this.d = runnable;
    }
}
