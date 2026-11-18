package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.aj;
import org.telegram.messenger.ks;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
public final class y4 extends AnimatorListenerAdapter {
    public final int f15763a;
    public int f15764b;
    public final Object f15765c;
    public final Object d;
    public final Object f15766e;

    public y4(bu0 bu0Var, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.f15763a = i10;
        this.f15766e = bu0Var;
        this.f15765c = viewGroup;
        this.d = viewGroup2;
        this.f15764b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15763a) {
            case 2:
                if (this.f15764b != 0) {
                    ((View) this.f15765c).setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15763a) {
            case 0:
                l5 l5Var = (l5) this.f15766e;
                l5Var.I0 = l5Var.J0;
                l5Var.J0 = -1;
                l5Var.G0.invalidate();
                View view = (View) this.f15765c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == l5Var.L0) {
                    l5Var.L0 = null;
                    return;
                }
                return;
            case 1:
                bn bnVar = (bn) this.f15766e;
                bnVar.f46011g6 = true;
                ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow = true;
                bnVar.f46168sa = null;
                org.telegram.messenger.g0.h3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.f46084m1.invalidate();
                bnVar.f46084m1.setSkipBackgroundDrawing(false);
                bnVar.f46129pa = false;
                bn bnVar2 = (bn) this.f15765c;
                bnVar2.f46156ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.f46142qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.f46120p1.setTranslationY(0.0f);
                bnVar2.f46120p1.setTranslationY(0.0f);
                bnVar2.f46120p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.f46120p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.f46120p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.f46120p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.f46120p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.f46120p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.f46120p1.getAvatarImageView().setAlpha(1.0f);
                ah ahVar = bnVar2.f45939b1;
                if (ahVar != null) {
                    ahVar.setAlpha(1.0f);
                    return;
                }
                return;
            case 2:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.f15766e;
                v4.f1 f1Var = (v4.f1) this.d;
                kVar.X(f1Var.f59123a);
                View view2 = f1Var.f59123a;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.f31517ob) {
                        r1Var.f31517ob = false;
                        r1Var.setVisibility(0);
                    }
                    aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        zi ziVar = currentMessagesGroup.f22905m;
                        ziVar.f28311n = 1.0f;
                        ziVar.h = 0.0f;
                        ziVar.f28304f = 0.0f;
                        ziVar.f28305g = 0.0f;
                        ziVar.f28303e = 0.0f;
                        ziVar.f28307j = false;
                    }
                }
                if (kVar.f59180z.remove(f1Var)) {
                    kVar.v(f1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f15766e;
                g0Var.Q0 = g0Var.R0;
                g0Var.R0 = -1;
                g0Var.P0.invalidate();
                View view3 = (View) this.f15765c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == g0Var.T0) {
                    g0Var.T0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.f15763a) {
            case 0:
                l5 l5Var = (l5) this.f15766e;
                tg.m1 m1Var = l5Var.N0;
                if (((View) this.f15765c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f15764b == 2) {
                    m1Var.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush = l5Var.f14936y0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    m1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var.b(0.4f, 1.75f);
                    return;
                }
            case 1:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) this.f15766e)).currentAccount;
                this.f15764b = ks.f(i7).q(null, this.f15764b, true);
                return;
            case 2:
                ((pi.k) this.f15766e).getClass();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f15766e;
                tg.m1 m1Var2 = g0Var.V0;
                if (((View) this.f15765c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f15764b == 2) {
                    m1Var2.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush2 = g0Var.G0.getCurrentBrush();
                if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                    m1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    m1Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public y4(pi.k kVar, v4.f1 f1Var, int i7, View view) {
        this.f15763a = 2;
        this.f15766e = kVar;
        this.d = f1Var;
        this.f15764b = i7;
        this.f15765c = view;
    }

    public y4(bn bnVar, bn bnVar2, Runnable runnable) {
        this.f15763a = 1;
        this.f15766e = bnVar;
        this.f15765c = bnVar2;
        this.d = runnable;
    }
}
