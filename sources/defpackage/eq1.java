package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.e;
public final class eq1 extends AnimatorListenerAdapter {
    public final byte a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public eq1(bb2 bb2Var, f89 f89Var, int i, View view) {
        this.a = (byte) 1;
        this.e = bb2Var;
        this.c = f89Var;
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
                zu1 zu1Var = (zu1) obj;
                zu1Var.g6 = true;
                ((e) zu1Var).fragmentBeginToShow = true;
                zu1Var.sa = null;
                hl.d3(new go1(this, (byte) 2), 32L);
                super.onAnimationEnd(animator);
                zu1Var.m1.invalidate();
                zu1Var.m1.setSkipBackgroundDrawing(false);
                zu1Var.pa = false;
                zu1 zu1Var2 = (zu1) obj2;
                zu1Var2.ra = 0.0f;
                zu1Var2.fragmentView.invalidate();
                zu1Var2.A0.invalidate();
                zu1Var2.qa = null;
                zu1Var.fragmentView.setAlpha(1.0f);
                ((Runnable) obj3).run();
                zu1Var.p1.setTranslationY(0.0f);
                zu1Var2.p1.setTranslationY(0.0f);
                zu1Var2.p1.getAvatarImageView().setTranslationY(0.0f);
                zu1Var.p1.getAvatarImageView().setScaleX(1.0f);
                zu1Var.p1.getAvatarImageView().setScaleY(1.0f);
                zu1Var.p1.getAvatarImageView().setAlpha(1.0f);
                zu1Var2.p1.getAvatarImageView().setScaleX(1.0f);
                zu1Var2.p1.getAvatarImageView().setScaleY(1.0f);
                zu1Var2.p1.getAvatarImageView().setAlpha(1.0f);
                wz1 wz1Var = zu1Var2.b1;
                if (wz1Var != null) {
                    wz1Var.setAlpha(1.0f);
                    return;
                }
                return;
            case 1:
                animator.removeAllListeners();
                bb2 bb2Var = (bb2) obj3;
                f89 f89Var = (f89) obj2;
                bb2Var.W(f89Var.a);
                View view = f89Var.a;
                if (view instanceof wb2) {
                    wb2 wb2Var = (wb2) view;
                    if (wb2Var.Ab) {
                        wb2Var.Ab = false;
                        wb2Var.setVisibility(0);
                    }
                    m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        l47 l47Var = currentMessagesGroup.m;
                        l47Var.n = 1.0f;
                        l47Var.h = 0.0f;
                        l47Var.f = 0.0f;
                        l47Var.g = 0.0f;
                        l47Var.e = 0.0f;
                        l47Var.j = false;
                    }
                }
                if (bb2Var.z.remove(f89Var)) {
                    bb2Var.v(f89Var);
                    bb2Var.G();
                    return;
                }
                return;
            case 2:
                zv4 zv4Var = (zv4) obj3;
                zv4Var.d0 = null;
                LinearLayout linearLayout = (LinearLayout) obj2;
                zv4Var.f.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) obj;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                zv4Var.h.scrollTo(0, this.b);
                zv4Var.E.set(zv4Var.f0);
                zv4Var.requestLayout();
                zv4Var.invalidate();
                return;
            case 3:
                wy5 wy5Var = (wy5) obj3;
                wy5Var.Q0 = wy5Var.R0;
                wy5Var.R0 = -1;
                wy5Var.P0.invalidate();
                ViewGroup viewGroup = (ViewGroup) obj2;
                if (viewGroup != null && ((ViewGroup) obj) != null) {
                    viewGroup.setVisibility(8);
                }
                if (animator == wy5Var.T0) {
                    wy5Var.T0 = null;
                    return;
                }
                return;
            default:
                dx7 dx7Var = (dx7) obj3;
                dx7Var.I0 = dx7Var.J0;
                dx7Var.J0 = -1;
                dx7Var.G0.invalidate();
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                if (viewGroup2 != null && ((ViewGroup) obj) != null) {
                    viewGroup2.setVisibility(8);
                }
                if (animator == dx7Var.L0) {
                    dx7Var.L0 = null;
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
                i = ((e) ((zu1) obj3)).currentAccount;
                this.b = jn7.f(i).p(null, this.b, true);
                return;
            case 1:
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                wy5 wy5Var = (wy5) obj2;
                gx7 gx7Var = wy5Var.V0;
                if (((ViewGroup) obj) != null && (viewGroup = (ViewGroup) obj3) != null) {
                    viewGroup.setVisibility(0);
                }
                if (this.b == 2) {
                    wy5Var.setTextWeightRange(wy5Var.C0);
                    return;
                }
                v01 currentBrush = wy5Var.G0.getCurrentBrush();
                if (!(currentBrush instanceof p01) && !(currentBrush instanceof r01)) {
                    gx7Var.b(0.05f, 1.0f);
                    return;
                } else {
                    gx7Var.b(0.4f, 1.75f);
                    return;
                }
            case 4:
                dx7 dx7Var = (dx7) obj2;
                gx7 gx7Var2 = dx7Var.N0;
                if (((ViewGroup) obj) != null && (viewGroup2 = (ViewGroup) obj3) != null) {
                    viewGroup2.setVisibility(0);
                }
                if (this.b == 2) {
                    dx7.Z(dx7Var, dx7Var.t0);
                    return;
                }
                v01 currentBrush2 = dx7Var.y0.getCurrentBrush();
                if (!(currentBrush2 instanceof p01) && !(currentBrush2 instanceof r01)) {
                    gx7Var2.b(0.05f, 1.0f);
                    return;
                } else {
                    gx7Var2.b(0.4f, 1.75f);
                    return;
                }
        }
    }

    public eq1(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i, byte b) {
        this.a = b;
        this.e = frameLayout;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i;
    }

    public eq1(zu1 zu1Var, zu1 zu1Var2, Runnable runnable) {
        this.a = (byte) 0;
        this.d = zu1Var;
        this.c = zu1Var2;
        this.e = runnable;
    }

    private final void a(Animator animator) {
    }
}
