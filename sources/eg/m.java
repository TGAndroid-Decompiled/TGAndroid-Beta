package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import jg.f2;
import kg.w0;
import kg.x0;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xn;
import org.telegram.ui.a5;
import org.telegram.ui.h4;
import org.telegram.ui.hd;
import org.telegram.ui.kd;
import org.telegram.ui.la;
import org.telegram.ui.oo;
import org.telegram.ui.r4;
import org.telegram.ui.un;
import org.telegram.ui.x4;
public final class m extends AnimatorListenerAdapter {
    public final int f6568a;
    public boolean f6569b;
    public final Object f6570c;

    public m(int i10, Object obj, boolean z10) {
        this.f6568a = i10;
        this.f6570c = obj;
        this.f6569b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f6568a) {
            case 8:
                h2 h2Var = (h2) this.f6570c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    return;
                }
                return;
            case 9:
                v5 v5Var = (v5) this.f6570c;
                AnimatorSet animatorSet2 = v5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v5Var.J = null;
                    return;
                }
                return;
            case 10:
            case 12:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                super.onAnimationCancel(animator);
                return;
            case 11:
                ta taVar = (ta) this.f6570c;
                AnimatorSet animatorSet3 = taVar.f23114f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f23114f = null;
                    return;
                }
                return;
            case 13:
                ((kd) this.f6570c).f38827r = null;
                return;
            case 14:
                un unVar = (un) this.f6570c;
                AnimatorSet animatorSet4 = unVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    unVar.V0 = null;
                    return;
                }
                return;
            case 15:
                ((oo) this.f6570c).h = null;
                return;
            case 16:
                o9 o9Var = (o9) this.f6570c;
                AnimatorSet animatorSet5 = o9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o9Var.h = null;
                    return;
                }
                return;
            case 18:
                ((bi) this.f6570c).S2 = null;
                return;
            case 19:
                this.f6569b = true;
                return;
            case 24:
                uz uzVar = (uz) this.f6570c;
                AnimatorSet animatorSet6 = uzVar.f31120m1;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    uzVar.f31120m1 = null;
                    return;
                }
                return;
            case 28:
                c60 c60Var = (c60) this.f6570c;
                AnimatorSet animatorSet7 = c60Var.O1;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    c60Var.O1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        hd hdVar;
        View view;
        RadialProgressView radialProgressView;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        float f18;
        switch (this.f6568a) {
            case 0:
                if (this.f6569b) {
                    ((q) this.f6570c).e(false, false, true, false);
                    return;
                }
                return;
            case 1:
                f2 f2Var = (f2) this.f6570c;
                ((ig.j) f2Var).D.f8479o1.c();
                if (this.f6569b) {
                    f2Var.f9974x.accept(Integer.valueOf(f2Var.f9972s));
                }
                if (f2Var.getParent() != null) {
                    ((ViewGroup) f2Var.getParent()).removeView(f2Var);
                    return;
                }
                return;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f6570c;
                if (this.f6569b) {
                    limitPreviewView.f24111j0 = false;
                }
                Runnable runnable = limitPreviewView.f24112k0;
                if (runnable != null) {
                    i0.r(runnable);
                    limitPreviewView.f24112k0.run();
                    return;
                }
                return;
            case 3:
                x0 x0Var = (x0) this.f6570c;
                if (this.f6569b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                x0Var.O = f7;
                x0Var.f11328f.invalidate();
                w0 w0Var = x0Var.h;
                if (w0Var != null) {
                    w0Var.invalidate();
                    return;
                }
                return;
            case 4:
                b1 b1Var = (b1) this.f6570c;
                if (this.f6569b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b1Var.setTextColor(i0.b.f(f10, -1, -9194260));
                b1Var.setIconColor(i0.b.f(f10, -1, -9194260));
                return;
            case 5:
                h4 h4Var = (h4) this.f6570c;
                boolean z10 = this.f6569b;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                h4Var.Z0 = f11;
                h4Var.f37687q0.setTranslationY(((1.0f - f11) * i0.L(51.0f)) + h4Var.f37686p0);
                if (!z10) {
                    h4Var.f37687q0.setVisibility(8);
                    return;
                }
                return;
            case 6:
                a5 a5Var = (a5) this.f6570c;
                if (!this.f6569b) {
                    a5Var.setVisibility(4);
                    ac.a aVar = ((r4) a5Var).G;
                    if (aVar.f362a) {
                        aVar.f362a = false;
                        if (((r4) aVar.d).getParent() != null) {
                            ((WindowManager) aVar.f364c).removeView((r4) aVar.d);
                        }
                        r4 r4Var = (r4) aVar.d;
                        r4Var.E = true;
                        x4 x4Var = r4Var.D;
                        if (x4Var != null) {
                            if (x4Var.f43226g) {
                                x4Var.f43226g = false;
                                x4Var.f43223b.n(x4Var.f43222a, x4Var.e);
                            }
                            r4Var.D = null;
                        }
                        aVar.d = null;
                        ((ViewGroup) aVar.f363b).requestDisallowInterceptTouchEvent(false);
                        aVar.f363b = null;
                        aVar.f364c = null;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                q1 q1Var = (q1) this.f6570c;
                x1 x1Var = q1Var.gb;
                int b10 = x1Var.b();
                int i12 = q1Var.f22674ob;
                if (i12 != b10) {
                    q1Var.A0(i12, b10, this.f6569b);
                    return;
                }
                q1Var.f22710rb = false;
                x1Var.f23463b2 = i12;
                return;
            case 8:
                h2 h2Var = (h2) this.f6570c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    if (!this.f6569b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                v5 v5Var = (v5) this.f6570c;
                AnimatorSet animatorSet2 = v5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v5Var.J = null;
                    if (!this.f6569b) {
                        v5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                s7 s7Var = (s7) this.f6570c;
                ValueAnimator valueAnimator = s7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f6569b) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    s7Var.B0 = f12;
                    s7Var.A0 = null;
                    return;
                }
                return;
            case 11:
                ta taVar = (ta) this.f6570c;
                AnimatorSet animatorSet3 = taVar.f23114f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f23114f = null;
                    if (!this.f6569b) {
                        taVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ImageView imageView = ((la) this.f6570c).d;
                if (this.f6569b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
            case 13:
                kd kdVar = (kd) this.f6570c;
                if (kdVar.f38827r != null && (hdVar = kdVar.f38822n) != null) {
                    if (this.f6569b) {
                        hdVar.setVisibility(4);
                    } else {
                        kdVar.f38829s.setVisibility(4);
                    }
                    kdVar.f38827r = null;
                    return;
                }
                return;
            case 14:
                un unVar = (un) this.f6570c;
                AnimatorSet animatorSet4 = unVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f6569b) {
                        unVar.I0.setVisibility(4);
                        return;
                    }
                    if (unVar.E0) {
                        view = unVar.F0;
                    } else {
                        view = unVar.D0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 15:
                oo ooVar = (oo) this.f6570c;
                if (ooVar.h != null && (radialProgressView = ooVar.f40219n) != null) {
                    if (!this.f6569b) {
                        radialProgressView.setVisibility(4);
                        ooVar.f40211f.setVisibility(4);
                    }
                    ooVar.h = null;
                    return;
                }
                return;
            case 16:
                o9 o9Var = (o9) this.f6570c;
                AnimatorSet animatorSet5 = o9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f6569b) {
                        o9Var.f29064c.setVisibility(4);
                        return;
                    } else {
                        o9Var.f29063b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 17:
                dc dcVar = (dc) this.f6570c;
                if (animator == dcVar.f25464g) {
                    dcVar.f25464g = null;
                    if (this.f6569b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    dcVar.f25466j = f13;
                    dcVar.b();
                    return;
                }
                return;
            case 18:
                bi biVar = (bi) this.f6570c;
                if (biVar.S2 != null) {
                    if (this.f6569b) {
                        if (biVar.M2) {
                            uh uhVar = biVar.f24812s2;
                            if (uhVar == null || uhVar.K()) {
                                biVar.f24809r3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    t0 t0Var = biVar.Y2;
                    if (t0Var != null) {
                        t0Var.setVisibility(4);
                    }
                    if (biVar.K2 != 0 || !biVar.f24783k3) {
                        biVar.U2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                xn xnVar = (xn) this.f6570c;
                if (!this.f6569b) {
                    g9 g9Var = xnVar.h;
                    xnVar.h = xnVar.f32609n;
                    xnVar.f32609n = g9Var;
                    g9Var.setVisibility(8);
                    xnVar.f32609n.setAlpha(0.0f);
                    xnVar.h.setVisibility(0);
                    xnVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 20:
                boolean z11 = this.f6569b;
                lo loVar = (lo) this.f6570c;
                if (animator == loVar.e) {
                    if (z11) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    loVar.d = f14;
                    loVar.setShown(f14);
                    if (!z11) {
                        loVar.setVisibility(8);
                    }
                    loVar.a(true);
                    return;
                }
                return;
            case 21:
                dp dpVar = (dp) this.f6570c;
                if (this.f6569b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dpVar.W1 = f15;
                dpVar.f25555z1.setTranslationY((-i0.L(7.0f)) * dpVar.W1);
                return;
            case 22:
                if (!this.f6569b) {
                    ((cq) this.f6570c).H.setVisibility(8);
                    return;
                }
                return;
            case 23:
                iv ivVar = (iv) this.f6570c;
                mv mvVar = ivVar.N;
                if (mvVar.U && !ivVar.h) {
                    if (!this.f6569b && !ivVar.f27181n) {
                        ivVar.setBackground(null);
                        return;
                    } else if (ivVar.getBackground() == null) {
                        ivVar.setBackground(t6.a0(mvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 24:
                uz uzVar = (uz) this.f6570c;
                AnimatorSet animatorSet6 = uzVar.f31120m1;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    if (!this.f6569b) {
                        uzVar.f31121n1.setVisibility(4);
                    }
                    uzVar.f31120m1 = null;
                    return;
                }
                return;
            case 25:
                f00 f00Var = (f00) this.f6570c;
                if (this.f6569b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                f00Var.f25990n = f16;
                f00Var.invalidate();
                return;
            case 26:
                g20 g20Var = (g20) this.f6570c;
                e20 e20Var = g20Var.f26298a;
                if (!g20Var.F) {
                    if (this.f6569b) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    g20Var.f26301b0 = f17;
                    g20Var.U.setPinnedProgress(f17);
                    e20Var.setScaleX(1.0f - (g20Var.f26301b0 * 0.6f));
                    e20Var.setScaleY(1.0f - (g20Var.f26301b0 * 0.6f));
                    if (g20Var.W) {
                        g20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                View view2 = (View) this.f6570c;
                if (this.f6569b) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                view2.setVisibility(i11);
                return;
            case 28:
                c60 c60Var = (c60) this.f6570c;
                AnimatorSet animatorSet7 = c60Var.O1;
                if (animatorSet7 != null && animatorSet7.equals(animator)) {
                    if (!this.f6569b) {
                        c60Var.P1.setVisibility(4);
                    }
                    c60Var.O1 = null;
                    return;
                }
                return;
            default:
                m60 m60Var = (m60) this.f6570c;
                boolean z12 = this.f6569b;
                if (z12) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m60Var.Y1 = f18;
                m60Var.f21587b.invalidate();
                if (!z12) {
                    m60Var.M1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public m(View view) {
        this.f6568a = 27;
        this.f6570c = view;
        this.f6569b = true;
    }

    public m(View view, boolean z10) {
        this.f6568a = 27;
        this.f6570c = view;
        this.f6569b = z10;
    }

    public m(xn xnVar) {
        this.f6568a = 19;
        this.f6570c = xnVar;
    }
}
