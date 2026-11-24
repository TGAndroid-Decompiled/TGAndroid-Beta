package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.p;
import org.telegram.ui.o;
public final class y7 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final Object c;

    public y7(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                AnimatorSet[] animatorSetArr = ((he) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    return;
                }
                return;
            case 5:
                rl0 rl0Var = (rl0) obj;
                AnimatorSet animatorSet2 = rl0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    rl0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((fj1) obj).r = null;
                return;
            case 14:
                yv1 yv1Var = (yv1) obj;
                AnimatorSet animatorSet3 = yv1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yv1Var.W0 = null;
                    return;
                }
                return;
            case 15:
                ((i22) obj).V2 = null;
                return;
            case 16:
                ((ba2) obj).h = null;
                return;
            case 17:
                this.b = true;
                return;
            case 23:
                ((po2) obj).y = null;
                return;
            case 24:
                ((tu2) obj).x = null;
                return;
            case 25:
                lx2 lx2Var = (lx2) obj;
                AnimatorSet animatorSet4 = lx2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    lx2Var.T = null;
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
        float f;
        View m;
        cj1 cj1Var;
        View view;
        RadialProgressView radialProgressView;
        RadialProgressView radialProgressView2;
        RadialProgressView radialProgressView3;
        float f2;
        byte b = this.a;
        boolean z = true;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 1.0f;
        Object obj = this.c;
        switch (b) {
            case 0:
                a8 a8Var = (a8) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                a8Var.setTextColor(on2.f(f3, -1, -9194260));
                a8Var.setIconColor(on2.f(f3, -1, -9194260));
                return;
            case 1:
                AnimatorSet[] animatorSetArr = ((he) obj).G;
                boolean z2 = this.b;
                AnimatorSet animatorSet = animatorSetArr[z2 ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z2 ? 1 : 0] = null;
                    return;
                }
                return;
            case 2:
                o oVar = (o) obj;
                boolean z3 = this.b;
                if (z3) {
                    f3 = 1.0f;
                }
                oVar.a1 = f3;
                oVar.r0.setTranslationY(((1.0f - f3) * gm.L(51.0f)) + oVar.q0);
                if (!z3) {
                    oVar.r0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ((c30) obj).a[this.b ? 1 : 0].setVisibility(8);
                return;
            case 4:
                bd0 bd0Var = (bd0) obj;
                if (!this.b) {
                    bd0Var.setVisibility(4);
                    yh4 yh4Var = ((rc0) bd0Var).H;
                    if (yh4Var.a) {
                        yh4Var.a = false;
                        if (((rc0) yh4Var.d).getParent() != null) {
                            ((WindowManager) yh4Var.c).removeView((rc0) yh4Var.d);
                        }
                        rc0 rc0Var = (rc0) yh4Var.d;
                        rc0Var.F = true;
                        yc0 yc0Var = rc0Var.E;
                        if (yc0Var != null) {
                            if (yc0Var.g) {
                                yc0Var.g = false;
                                yc0Var.b.n(yc0Var.a, yc0Var.e);
                            }
                            rc0Var.E = null;
                        }
                        yh4Var.d = null;
                        ((ViewGroup) yh4Var.b).requestDisallowInterceptTouchEvent(false);
                        yh4Var.b = null;
                        yh4Var.c = null;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rl0 rl0Var = (rl0) obj;
                AnimatorSet animatorSet2 = rl0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        rl0Var.c.setVisibility(4);
                        return;
                    } else {
                        rl0Var.b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 6:
                ks0 ks0Var = (ks0) obj;
                boolean z4 = this.b;
                if (!z4) {
                    f4 = 0.0f;
                }
                ks0Var.x = f4;
                vgc vgcVar = ks0Var.r;
                if (z4) {
                    f = 0.0f;
                } else {
                    f = -42.0f;
                }
                vgcVar.setTranslationY(gm.L(f));
                ur0 ur0Var = ks0Var.n;
                if (z4) {
                    f3 = 42.0f;
                }
                ur0Var.setTranslationY(gm.L(f3));
                return;
            case 7:
                gs0 gs0Var = (gs0) obj;
                o7c o7cVar = gs0Var.h;
                yr0 yr0Var = gs0Var.f;
                bs0 bs0Var = gs0Var.w;
                gs0Var.b = false;
                boolean z5 = this.b;
                if (z5) {
                    int i2 = gs0Var.e;
                    gs0Var.d = i2;
                    gs0Var.a0.E = i2;
                    gda.E(i2);
                }
                int b2 = bs0Var.b();
                if (z5) {
                    o7cVar.x1(gs0Var.d);
                    yr0Var.b0();
                    if (bs0Var.b() == b2) {
                        gm.V3(yr0Var);
                    } else {
                        bs0Var.f();
                    }
                }
                gs0Var.r.setVisibility(8);
                int i3 = gs0Var.T;
                if (i3 >= 0) {
                    if (z5 && (m = gs0Var.s.m(i3)) != null) {
                        gs0Var.U = m.getTop();
                    }
                    o7cVar.g1(gs0Var.T, (-yr0Var.getPaddingTop()) + gs0Var.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 8:
                wx0 wx0Var = (wx0) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                wx0Var.S0 = f3;
                wx0Var.h();
                return;
            case 9:
                u51 u51Var = (u51) obj;
                if (animator == u51Var.g) {
                    u51Var.g = null;
                    if (this.b) {
                        f3 = 1.0f;
                    }
                    u51Var.j = f3;
                    u51Var.b();
                    return;
                }
                return;
            case 10:
                b61 b61Var = (b61) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                b61Var.Q = f3;
                b61Var.invalidate();
                return;
            case 11:
                pc1 pc1Var = (pc1) obj;
                boolean z6 = this.b;
                if (!z6) {
                    pc1Var.r.setVisibility(8);
                    lc1 lc1Var = pc1Var.N;
                    if (lc1Var != null) {
                        lc1Var.setVisibility(8);
                    }
                }
                if (z6) {
                    pc1Var.f.getEditText().setAllowDrawCursor(true);
                }
                pc1Var.c(z6);
                return;
            case 12:
                ImageView imageView = ((qf1) obj).d;
                if (!this.b) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            case 13:
                fj1 fj1Var = (fj1) obj;
                if (fj1Var.r != null && (cj1Var = fj1Var.n) != null) {
                    if (this.b) {
                        cj1Var.setVisibility(4);
                    } else {
                        fj1Var.s.setVisibility(4);
                    }
                    fj1Var.r = null;
                    return;
                }
                return;
            case 14:
                yv1 yv1Var = (yv1) obj;
                AnimatorSet animatorSet3 = yv1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        yv1Var.J0.setVisibility(4);
                        return;
                    }
                    if (yv1Var.F0) {
                        view = yv1Var.G0;
                    } else {
                        view = yv1Var.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 15:
                i22 i22Var = (i22) obj;
                if (i22Var.V2 != null) {
                    if (this.b) {
                        if (i22Var.P2) {
                            a22 a22Var = i22Var.v2;
                            if (a22Var == null || a22Var.M()) {
                                i22Var.u3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    r7 r7Var = i22Var.b3;
                    if (r7Var != null) {
                        r7Var.setVisibility(4);
                    }
                    if (i22Var.N2 != 0 || !i22Var.n3) {
                        i22Var.X2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ba2 ba2Var = (ba2) obj;
                if (ba2Var.h != null && (radialProgressView = ba2Var.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        ba2Var.f.setVisibility(4);
                    }
                    ba2Var.h = null;
                    return;
                }
                return;
            case 17:
                ua2 ua2Var = (ua2) obj;
                if (!this.b) {
                    bf0 bf0Var = ua2Var.h;
                    ua2Var.h = ua2Var.n;
                    ua2Var.n = bf0Var;
                    bf0Var.setVisibility(8);
                    ua2Var.n.setAlpha(0.0f);
                    ua2Var.h.setVisibility(0);
                    ua2Var.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 18:
                rc2 rc2Var = (rc2) obj;
                yc2 yc2Var = rc2Var.ub;
                int b3 = yc2Var.b();
                int i4 = rc2Var.Cb;
                if (i4 != b3) {
                    rc2Var.C0(i4, b3, this.b);
                    return;
                }
                rc2Var.Fb = false;
                yc2Var.b2 = i4;
                return;
            case 19:
                boolean z7 = this.b;
                ne2 ne2Var = (ne2) obj;
                if (animator == ne2Var.e) {
                    if (z7) {
                        f3 = 1.0f;
                    }
                    ne2Var.d = f3;
                    ne2Var.setShown(f3);
                    if (!z7) {
                        ne2Var.setVisibility(8);
                    }
                    ne2Var.a(true);
                    return;
                }
                return;
            case 20:
                if2 if2Var = (if2) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                if2Var.Z1 = f3;
                if2Var.C1.setTranslationY((-gm.L(7.0f)) * if2Var.Z1);
                return;
            case 21:
                wl2 wl2Var = (wl2) obj;
                hx hxVar = wl2Var.a;
                boolean z8 = this.b;
                if (z8) {
                    f3 = 1.0f;
                }
                wl2Var.d = f3;
                hxVar.invalidate();
                if (!z8) {
                    i = 8;
                }
                hxVar.setVisibility(i);
                return;
            case 22:
                if (!this.b) {
                    ((p) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 23:
                po2 po2Var = (po2) obj;
                if (po2Var.y != null && (radialProgressView2 = po2Var.E) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        po2Var.w.setVisibility(4);
                    }
                    po2Var.y = null;
                    return;
                }
                return;
            case 24:
                tu2 tu2Var = (tu2) obj;
                if (tu2Var.x != null && (radialProgressView3 = tu2Var.s) != null) {
                    if (!this.b) {
                        radialProgressView3.setVisibility(4);
                        tu2Var.w.setVisibility(4);
                    }
                    tu2Var.x = null;
                    return;
                }
                return;
            case 25:
                lx2 lx2Var = (lx2) obj;
                AnimatorSet animatorSet4 = lx2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    lx2Var.T = null;
                    if (!this.b) {
                        lx2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if (this.b) {
                    ((u43) obj).d(false, false, true, false);
                    return;
                }
                return;
            case 27:
                x53 x53Var = (x53) obj;
                v29 v29Var = x53Var.n;
                x53Var.k();
                x53Var.l();
                boolean z9 = this.b;
                x53Var.a(z9);
                x53Var.m.invalidateOutline();
                if (z9) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                x53Var.j = f2;
                if (z9) {
                    x53Var.k = true;
                    x53Var.a.invalidate();
                }
                v29Var.setCustomEmojiEnterProgress(Utilities.i(x53Var.j, 1.0f, 0.0f));
                if (!z9) {
                    v29Var.setImportantForAccessibility(0);
                    v29Var.setSkipDraw(false);
                    x53Var.f();
                    Runtime.getRuntime().gc();
                    byte b4 = x53Var.y;
                    if (b4 == 4 || b4 == 5) {
                        z = false;
                    }
                    v29Var.setCustomEmojiReactionsBackground(z);
                }
                x53Var.C = false;
                return;
            case 28:
                ih3 ih3Var = (ih3) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                ih3Var.e0 = f3;
                ih3Var.b();
                return;
            default:
                jz3 jz3Var = (jz3) obj;
                mz3 mz3Var = jz3Var.O;
                if (mz3Var.U && !jz3Var.h) {
                    if (!this.b && !jz3Var.n) {
                        jz3Var.setBackground(null);
                        return;
                    } else if (jz3Var.getBackground() == null) {
                        jz3Var.setBackground(cmb.Y(mz3Var.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 28:
                super.onAnimationStart(animator);
                try {
                    ((ih3) this.c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public y7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public y7(ua2 ua2Var) {
        this.a = (byte) 17;
        this.c = ua2Var;
    }
}
