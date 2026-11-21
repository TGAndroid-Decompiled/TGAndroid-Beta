package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.ks;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.ch;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
public final class z0 extends AnimatorListenerAdapter {
    public final int f4321a;
    public int f4322b;
    public final Object f4323c;
    public final Object d;
    public final Object f4324e;

    public z0(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.f4321a = i10;
        this.f4324e = frameLayout;
        this.f4323c = viewGroup;
        this.d = viewGroup2;
        this.f4322b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4321a) {
            case 3:
                if (this.f4322b != 0) {
                    ((View) this.d).setTranslationY(0.0f);
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
        switch (this.f4321a) {
            case 0:
                b1 b1Var = (b1) this.f4324e;
                b1Var.U = null;
                FrameLayout frameLayout = b1Var.f3423f;
                LinearLayout linearLayout = (LinearLayout) this.f4323c;
                frameLayout.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) this.d;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                b1Var.h.scrollTo(0, this.f4322b);
                b1Var.E.set(b1Var.W);
                b1Var.requestLayout();
                b1Var.invalidate();
                return;
            case 1:
                hi.k5 k5Var = (hi.k5) this.f4324e;
                k5Var.I0 = k5Var.J0;
                k5Var.J0 = -1;
                k5Var.G0.invalidate();
                View view = (View) this.f4323c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == k5Var.L0) {
                    k5Var.L0 = null;
                    return;
                }
                return;
            case 2:
                bn bnVar = (bn) this.f4324e;
                bnVar.f46034g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46191sa = null;
                org.telegram.messenger.g0.h3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.f46107m1.invalidate();
                bnVar.f46107m1.setSkipBackgroundDrawing(false);
                bnVar.f46152pa = false;
                bn bnVar2 = (bn) this.f4323c;
                bnVar2.f46179ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.f46165qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.f46143p1.setTranslationY(0.0f);
                bnVar2.f46143p1.setTranslationY(0.0f);
                bnVar2.f46143p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.f46143p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.f46143p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.f46143p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.f46143p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.f46143p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.f46143p1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = bnVar2.f45962b1;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.f4324e;
                v4.f1 f1Var = (v4.f1) this.f4323c;
                kVar.X(f1Var.f59161a);
                View view2 = f1Var.f59161a;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.f31545ob) {
                        r1Var.f31545ob = false;
                        r1Var.setVisibility(0);
                    }
                    aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        zi ziVar = currentMessagesGroup.f22933m;
                        ziVar.f28339n = 1.0f;
                        ziVar.h = 0.0f;
                        ziVar.f28332f = 0.0f;
                        ziVar.f28333g = 0.0f;
                        ziVar.f28331e = 0.0f;
                        ziVar.f28335j = false;
                    }
                }
                if (kVar.f59218z.remove(f1Var)) {
                    kVar.v(f1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f4324e;
                h0Var.Q0 = h0Var.R0;
                h0Var.R0 = -1;
                h0Var.P0.invalidate();
                View view3 = (View) this.f4323c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == h0Var.T0) {
                    h0Var.T0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        View view;
        int i7;
        View view2;
        switch (this.f4321a) {
            case 1:
                hi.k5 k5Var = (hi.k5) this.f4324e;
                tg.n1 n1Var = k5Var.N0;
                if (((View) this.f4323c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f4322b == 2) {
                    n1Var.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush = k5Var.f14911y0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    n1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    n1Var.b(0.4f, 1.75f);
                    return;
                }
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f4324e)).currentAccount;
                this.f4322b = ks.f(i7).q(null, this.f4322b, true);
                return;
            case 3:
                ((pi.k) this.f4324e).getClass();
                return;
            case 4:
                tg.h0 h0Var = (tg.h0) this.f4324e;
                tg.n1 n1Var2 = h0Var.V0;
                if (((View) this.f4323c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f4322b == 2) {
                    n1Var2.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush2 = h0Var.G0.getCurrentBrush();
                if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                    n1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    n1Var2.b(0.4f, 1.75f);
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z0(pi.k kVar, v4.f1 f1Var, int i7, View view) {
        this.f4321a = 3;
        this.f4324e = kVar;
        this.f4323c = f1Var;
        this.f4322b = i7;
        this.d = view;
    }

    public z0(bn bnVar, bn bnVar2, Runnable runnable) {
        this.f4321a = 2;
        this.f4324e = bnVar;
        this.f4323c = bnVar2;
        this.d = runnable;
    }
}
