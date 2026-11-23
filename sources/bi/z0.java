package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.bj;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ch;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
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
                hi.l5 l5Var = (hi.l5) this.f4282e;
                l5Var.I0 = l5Var.J0;
                l5Var.J0 = -1;
                l5Var.G0.invalidate();
                View view = (View) this.f4281c;
                if (view != null && ((View) this.d) != null) {
                    view.setVisibility(8);
                }
                if (animator == l5Var.L0) {
                    l5Var.L0 = null;
                    return;
                }
                return;
            case 2:
                bn bnVar = (bn) this.f4282e;
                bnVar.f45991g6 = true;
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.f46148sa = null;
                org.telegram.messenger.g0.h3(new bh(this, 1), 32L);
                super.onAnimationEnd(animator);
                bnVar.f46064m1.invalidate();
                bnVar.f46064m1.setSkipBackgroundDrawing(false);
                bnVar.f46109pa = false;
                bn bnVar2 = (bn) this.f4281c;
                bnVar2.f46136ra = 0.0f;
                bnVar2.fragmentView.invalidate();
                bnVar2.A0.invalidate();
                bnVar2.f46122qa = null;
                bnVar.fragmentView.setAlpha(1.0f);
                ((Runnable) this.d).run();
                bnVar.f46100p1.setTranslationY(0.0f);
                bnVar2.f46100p1.setTranslationY(0.0f);
                bnVar2.f46100p1.getAvatarImageView().setTranslationY(0.0f);
                bnVar.f46100p1.getAvatarImageView().setScaleX(1.0f);
                bnVar.f46100p1.getAvatarImageView().setScaleY(1.0f);
                bnVar.f46100p1.getAvatarImageView().setAlpha(1.0f);
                bnVar2.f46100p1.getAvatarImageView().setScaleX(1.0f);
                bnVar2.f46100p1.getAvatarImageView().setScaleY(1.0f);
                bnVar2.f46100p1.getAvatarImageView().setAlpha(1.0f);
                ch chVar = bnVar2.f45919b1;
                if (chVar != null) {
                    chVar.setAlpha(1.0f);
                    return;
                }
                return;
            case 3:
                animator.removeAllListeners();
                pi.k kVar = (pi.k) this.f4282e;
                v4.e1 e1Var = (v4.e1) this.f4281c;
                kVar.X(e1Var.f59111a);
                View view2 = e1Var.f59111a;
                if (view2 instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view2;
                    if (r1Var.f31514ob) {
                        r1Var.f31514ob = false;
                        r1Var.setVisibility(0);
                    }
                    bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        aj ajVar = currentMessagesGroup.f23084m;
                        ajVar.f22894n = 1.0f;
                        ajVar.h = 0.0f;
                        ajVar.f22887f = 0.0f;
                        ajVar.f22888g = 0.0f;
                        ajVar.f22886e = 0.0f;
                        ajVar.f22890j = false;
                    }
                }
                if (kVar.f59171z.remove(e1Var)) {
                    kVar.v(e1Var);
                    kVar.G();
                    return;
                }
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f4282e;
                h0Var.Q0 = h0Var.R0;
                h0Var.R0 = -1;
                h0Var.P0.invalidate();
                View view3 = (View) this.f4281c;
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
        switch (this.f4279a) {
            case 1:
                hi.l5 l5Var = (hi.l5) this.f4282e;
                tg.n1 n1Var = l5Var.N0;
                if (((View) this.f4281c) != null && (view = (View) this.d) != null) {
                    view.setVisibility(0);
                }
                if (this.f4280b == 2) {
                    n1Var.b(0.5f, 2.0f);
                    return;
                }
                sg.h currentBrush = l5Var.f14926y0.getCurrentBrush();
                if (!(currentBrush instanceof sg.b) && !(currentBrush instanceof sg.d)) {
                    n1Var.b(0.05f, 1.0f);
                    return;
                } else {
                    n1Var.b(0.4f, 1.75f);
                    return;
                }
            case 2:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.f4282e)).currentAccount;
                this.f4280b = ls.f(i7).q(null, this.f4280b, true);
                return;
            case 3:
                ((pi.k) this.f4282e).getClass();
                return;
            case 4:
                tg.h0 h0Var = (tg.h0) this.f4282e;
                tg.n1 n1Var2 = h0Var.V0;
                if (((View) this.f4281c) != null && (view2 = (View) this.d) != null) {
                    view2.setVisibility(0);
                }
                if (this.f4280b == 2) {
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

    public z0(pi.k kVar, v4.e1 e1Var, int i7, View view) {
        this.f4279a = 3;
        this.f4282e = kVar;
        this.f4281c = e1Var;
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
