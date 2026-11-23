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
import org.telegram.ui.Components.bh;
import org.telegram.ui.bn;
import org.telegram.ui.ch;
public final class z0 extends AnimatorListenerAdapter {
    public final int f4279a;
    public int f4280b;
    public final Object f4281c;
    public final Object d;
    public final Object f4282e;

    public z0(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i7, int i10) {
        this.f4279a = i10;
        this.f4282e = frameLayout;
        this.f4281c = viewGroup;
        this.d = viewGroup2;
        this.f4280b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4279a) {
            case 3:
                if (this.f4280b != 0) {
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
        switch (this.f4279a) {
            case 0:
                b1 b1Var = (b1) this.f4282e;
                b1Var.U = null;
                FrameLayout frameLayout = b1Var.f3395f;
                LinearLayout linearLayout = (LinearLayout) this.f4281c;
                frameLayout.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) this.d;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                b1Var.h.scrollTo(0, this.f4280b);
                b1Var.E.set(b1Var.W);
                b1Var.requestLayout();
                b1Var.invalidate();
                return;
            case 1:
                hi.v5 v5Var = (hi.v5) this.f4282e;
                v5Var.I0 = v5Var.J0;
                v5Var.J0 = -1;
                v5Var.G0.invalidate();
                View view = (View) this.f4281c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == v5Var.L0) {
                    v5Var.L0 = null;
                    return;
                }
                return;
            case 2:
                bn bnVar = (bn) this.f4282e;
                bnVar.f46206g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46363sa = null;
                org.telegram.messenger.g0.h3(new ch(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.f46279m1.invalidate();
                bnVar.f46279m1.setSkipBackgroundDrawing(false);
                bnVar.f46324pa = false;
                bn bnVar2 = (bn) this.f4281c;
                bnVar2.f46351ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.f46337qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.f46315p1.setTranslationY(0.0f);
                bnVar2.f46315p1.setTranslationY(0.0f);
                bnVar2.f46315p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.f46315p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.f46315p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.f46315p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.f46315p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.f46315p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.f46315p1.getAvatarImageView().setAlpha(1.0f);
                bh bhVar = bnVar2.f46134b1;
                if (bhVar != null) {
                    bhVar.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.f4282e;
                v4.f1 f1Var = (v4.f1) this.f4281c;
                kVar.X(f1Var.f59245a);
                View view2 = f1Var.f59245a;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.f31598ob) {
                        r1Var.f31598ob = false;
                        r1Var.setVisibility(0);
                    }
                    aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        zi ziVar = currentMessagesGroup.f23016m;
                        ziVar.f28403n = 1.0f;
                        ziVar.h = 0.0f;
                        ziVar.f28396f = 0.0f;
                        ziVar.f28397g = 0.0f;
                        ziVar.f28395e = 0.0f;
                        ziVar.f28399j = false;
                    }
                }
                if (kVar.f59306z.remove(f1Var)) {
                    kVar.v(f1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                tg.l0 l0Var = (tg.l0) this.f4282e;
                l0Var.Q0 = l0Var.R0;
                l0Var.R0 = -1;
                l0Var.P0.invalidate();
                View view3 = (View) this.f4281c;
                if (view3 != null && ((View) this.d) != null) {
                    view3.setVisibility(8);
                }
                if (animator == l0Var.T0) {
                    l0Var.T0 = null;
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
        switch (this.f4279a) {
            case 1:
                hi.v5 v5Var = (hi.v5) this.f4282e;
                tg.r1 r1Var = v5Var.N0;
                if (((View) this.f4281c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f4280b == 2) {
                    v5Var.setTextWeightRange(v5Var.f15590t0);
                    return;
                }
                sg.h currentBrush = v5Var.f15600y0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    r1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    r1Var.b(0.4f, 1.75f);
                    return;
                }
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f4282e)).currentAccount;
                this.f4280b = ks.f(i7).q(null, this.f4280b, true);
                return;
            case 3:
                ((pi.k) this.f4282e).getClass();
                return;
            case 4:
                tg.l0 l0Var = (tg.l0) this.f4282e;
                tg.r1 r1Var2 = l0Var.V0;
                if (((View) this.f4281c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f4280b == 2) {
                    l0Var.setTextWeightRange(l0Var.C0);
                    return;
                }
                sg.h currentBrush2 = l0Var.G0.getCurrentBrush();
                if (!(currentBrush2 instanceof sg.b) && !(currentBrush2 instanceof sg.d)) {
                    r1Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    r1Var2.b(0.4f, 1.75f);
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z0(pi.k kVar, v4.f1 f1Var, int i7, View view) {
        this.f4279a = 3;
        this.f4282e = kVar;
        this.f4281c = f1Var;
        this.f4280b = i7;
        this.d = view;
    }

    public z0(bn bnVar, bn bnVar2, Runnable runnable) {
        this.f4279a = 2;
        this.f4282e = bnVar;
        this.f4281c = bnVar2;
        this.d = runnable;
    }
}
