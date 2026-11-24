package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.d;
public final class dr1 extends AnimatorListenerAdapter {
    public final byte a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public dr1(wb2 wb2Var, u69 u69Var, int i, View view) {
        this.a = (byte) 1;
        this.e = wb2Var;
        this.c = u69Var;
        this.b = i;
        this.d = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b != 0) {
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
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                yv1Var.g6 = true;
                ((d) yv1Var).fragmentBeginToShow = true;
                yv1Var.sa = null;
                gm.d3(new fo1(this, (byte) 2), 32L);
                super.onAnimationEnd(animator);
                yv1Var.m1.invalidate();
                yv1Var.m1.setSkipBackgroundDrawing(false);
                yv1Var.pa = false;
                yv1 yv1Var2 = (yv1) obj2;
                yv1Var2.ra = 0.0f;
                yv1Var2.fragmentView.invalidate();
                yv1Var2.A0.invalidate();
                yv1Var2.qa = null;
                yv1Var.fragmentView.setAlpha(1.0f);
                ((Runnable) obj3).run();
                yv1Var.p1.setTranslationY(0.0f);
                yv1Var2.p1.setTranslationY(0.0f);
                yv1Var2.p1.getAvatarImageView().setTranslationY(0.0f);
                yv1Var.p1.getAvatarImageView().setScaleX(1.0f);
                yv1Var.p1.getAvatarImageView().setScaleY(1.0f);
                yv1Var.p1.getAvatarImageView().setAlpha(1.0f);
                yv1Var2.p1.getAvatarImageView().setScaleX(1.0f);
                yv1Var2.p1.getAvatarImageView().setScaleY(1.0f);
                yv1Var2.p1.getAvatarImageView().setAlpha(1.0f);
                r02 r02Var = yv1Var2.b1;
                if (r02Var != null) {
                    r02Var.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                animator.removeAllListeners();
                wb2 wb2Var = (wb2) obj3;
                u69 u69Var = (u69) obj2;
                wb2Var.W(u69Var.a);
                View view = u69Var.a;
                if (view instanceof rc2) {
                    rc2 rc2Var = (rc2) view;
                    if (rc2Var.Ab) {
                        rc2Var.Ab = false;
                        rc2Var.setVisibility(0);
                    }
                    f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        e47 e47Var = currentMessagesGroup.m;
                        e47Var.n = 1.0f;
                        e47Var.h = 0.0f;
                        e47Var.f = 0.0f;
                        e47Var.g = 0.0f;
                        e47Var.e = 0.0f;
                        e47Var.j = false;
                    }
                }
                if (wb2Var.z.remove(u69Var)) {
                    wb2Var.v(u69Var);
                    wb2Var.G();
                    return;
                }
                return;
            case 2:
                xv4 xv4Var = (xv4) obj3;
                xv4Var.U = null;
                LinearLayout linearLayout = (LinearLayout) obj2;
                xv4Var.f.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) obj;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                xv4Var.h.scrollTo(0, this.b);
                xv4Var.E.set(xv4Var.W);
                xv4Var.requestLayout();
                xv4Var.invalidate();
                return;
            case 3:
                ry5 ry5Var = (ry5) obj3;
                ry5Var.W0 = ry5Var.X0;
                ry5Var.X0 = -1;
                ry5Var.V0.invalidate();
                ViewGroup viewGroup = (ViewGroup) obj2;
                if (viewGroup != null && ((ViewGroup) obj) != null) {
                    viewGroup.setVisibility(8);
                }
                if (animator == ry5Var.Z0) {
                    ry5Var.Z0 = null;
                    return;
                }
                return;
            default:
                xv7 xv7Var = (xv7) obj3;
                xv7Var.O0 = xv7Var.P0;
                xv7Var.P0 = -1;
                xv7Var.M0.invalidate();
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                if (viewGroup2 != null && ((ViewGroup) obj) != null) {
                    viewGroup2.setVisibility(8);
                }
                if (animator == xv7Var.R0) {
                    xv7Var.R0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                super.onAnimationStart(animator);
                i = ((d) ((yv1) obj3)).currentAccount;
                this.b = nm7.f(i).p(null, this.b, true);
                return;
            case 1:
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ry5 ry5Var = (ry5) obj2;
                aw7 aw7Var = ry5Var.b1;
                if (((ViewGroup) obj) != null && (viewGroup = (ViewGroup) obj3) != null) {
                    viewGroup.setVisibility(0);
                }
                if (this.b == 2) {
                    ry5Var.setTextWeightRange(ry5Var.I0);
                    return;
                }
                u11 currentBrush = ry5Var.M0.getCurrentBrush();
                if (!(currentBrush instanceof o11) && !(currentBrush instanceof q11)) {
                    aw7Var.b(0.05f, 1.0f);
                    return;
                } else {
                    aw7Var.b(0.4f, 1.75f);
                    return;
                }
            case 4:
                xv7 xv7Var = (xv7) obj2;
                aw7 aw7Var2 = xv7Var.T0;
                if (((ViewGroup) obj) != null && (viewGroup2 = (ViewGroup) obj3) != null) {
                    viewGroup2.setVisibility(0);
                }
                if (this.b == 2) {
                    xv7.Y(xv7Var, xv7Var.z0);
                    return;
                }
                u11 currentBrush2 = xv7Var.E0.getCurrentBrush();
                if (!(currentBrush2 instanceof o11) && !(currentBrush2 instanceof q11)) {
                    aw7Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    aw7Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public dr1(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i, byte b) {
        this.a = b;
        this.e = frameLayout;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i;
    }

    public dr1(yv1 yv1Var, yv1 yv1Var2, Runnable runnable) {
        this.a = (byte) 0;
        this.d = yv1Var;
        this.c = yv1Var2;
        this.e = runnable;
    }

    private final void a(Animator animator) {
    }
}
