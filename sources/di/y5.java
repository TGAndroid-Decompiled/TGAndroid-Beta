package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.co;
import org.telegram.ui.lu0;
public final class y5 extends AnimatorListenerAdapter {
    public final int f8472a;
    public int f8473b;
    public final Object f8474c;
    public final Object d;
    public final Object f8475e;

    public y5(pv0 pv0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i10, int i11) {
        this.f8472a = i11;
        this.f8475e = pv0Var;
        this.f8474c = viewGroup;
        this.d = viewGroup2;
        this.f8473b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8472a) {
            case 0:
                q6 q6Var = (q6) this.f8475e;
                q6Var.Y0 = q6Var.Z0;
                q6Var.Z0 = -1;
                q6Var.W0.invalidate();
                View view = (View) this.f8474c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == q6Var.f7954b1) {
                    q6Var.f7954b1 = null;
                    return;
                }
                return;
            case 1:
                co coVar = (co) this.f8475e;
                coVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow = true;
                coVar.V9 = null;
                AndroidUtilities.runOnUIThread(new lu0(this, 29), 32L);
                super.onAnimationEnd(animator);
                coVar.X0.invalidate();
                coVar.X0.setSkipBackgroundDrawing(false);
                coVar.S9 = false;
                co coVar2 = (co) this.f8474c;
                coVar2.U9 = 0.0f;
                coVar2.fragmentView.invalidate();
                coVar2.f35473x0.invalidate();
                coVar2.T9 = null;
                coVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                coVar.f35186a1.setTranslationY(0.0f);
                coVar2.f35186a1.setTranslationY(0.0f);
                coVar2.f35186a1.getAvatarImageView().setTranslationY(0.0f);
                coVar.f35186a1.getAvatarImageView().setScaleX(1.0f);
                coVar.f35186a1.getAvatarImageView().setScaleY(1.0f);
                coVar.f35186a1.getAvatarImageView().setAlpha(1.0f);
                coVar2.f35186a1.getAvatarImageView().setScaleX(1.0f);
                coVar2.f35186a1.getAvatarImageView().setScaleY(1.0f);
                coVar2.f35186a1.getAvatarImageView().setAlpha(1.0f);
                dh dhVar = coVar2.M0;
                if (dhVar != null) {
                    dhVar.setAlpha(1.0f);
                    return;
                }
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f8475e;
                o0Var.f45349g1 = o0Var.f45351h1;
                o0Var.f45351h1 = -1;
                o0Var.f45347f1.invalidate();
                View view2 = (View) this.f8474c;
                if (view2 != null && ((View) this.d) != null) {
                    view2.setVisibility(8);
                }
                if (animator == o0Var.f45355j1) {
                    o0Var.f45355j1 = null;
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
        switch (this.f8472a) {
            case 0:
                q6 q6Var = (q6) this.f8475e;
                rg.y1 y1Var = q6Var.f7958d1;
                if (((View) this.f8474c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f8473b == 2) {
                    y1Var.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush = q6Var.O0.getCurrentBrush();
                if (!(currentBrush instanceof qg.b) && !(currentBrush instanceof qg.d)) {
                    y1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    y1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) this.f8475e)).currentAccount;
                this.f8473b = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f8473b, null);
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f8475e;
                rg.y1 y1Var2 = o0Var.l1;
                if (((View) this.f8474c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f8473b == 2) {
                    y1Var2.b(0.5f, 2.0f);
                    return;
                }
                qg.m currentBrush2 = o0Var.W0.getCurrentBrush();
                if (!(currentBrush2 instanceof qg.b) && !(currentBrush2 instanceof qg.d)) {
                    y1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    y1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public y5(co coVar, co coVar2, Runnable runnable) {
        this.f8472a = 1;
        this.f8475e = coVar;
        this.f8474c = coVar2;
        this.d = runnable;
    }
}
