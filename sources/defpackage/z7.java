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
public final class z7 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final Object c;

    public z7(byte b, Object obj, boolean z) {
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
                AnimatorSet[] animatorSetArr = ((id) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    return;
                }
                return;
            case 5:
                sk0 sk0Var = (sk0) obj;
                AnimatorSet animatorSet2 = sk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sk0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((gi1) obj).r = null;
                return;
            case 14:
                zu1 zu1Var = (zu1) obj;
                AnimatorSet animatorSet3 = zu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zu1Var.W0 = null;
                    return;
                }
                return;
            case 15:
                ((n12) obj).V2 = null;
                return;
            case 16:
                ((g92) obj).h = null;
                return;
            case 17:
                this.b = true;
                return;
            case 23:
                ((xn2) obj).y = null;
                return;
            case 24:
                ((cu2) obj).x = null;
                return;
            case 25:
                vw2 vw2Var = (vw2) obj;
                AnimatorSet animatorSet4 = vw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    vw2Var.T = null;
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
        di1 di1Var;
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
                b8 b8Var = (b8) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                b8Var.setTextColor(vm2.f(f3, -1, -9194260));
                b8Var.setIconColor(vm2.f(f3, -1, -9194260));
                return;
            case 1:
                AnimatorSet[] animatorSetArr = ((id) obj).G;
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
                oVar.r0.setTranslationY(((1.0f - f3) * hl.L(51.0f)) + oVar.q0);
                if (!z3) {
                    oVar.r0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ((d20) obj).a[this.b ? 1 : 0].setVisibility(8);
                return;
            case 4:
                dc0 dc0Var = (dc0) obj;
                if (!this.b) {
                    dc0Var.setVisibility(4);
                    vh4 vh4Var = ((tb0) dc0Var).H;
                    if (vh4Var.a) {
                        vh4Var.a = false;
                        if (((tb0) vh4Var.d).getParent() != null) {
                            ((WindowManager) vh4Var.c).removeView((tb0) vh4Var.d);
                        }
                        tb0 tb0Var = (tb0) vh4Var.d;
                        tb0Var.F = true;
                        ac0 ac0Var = tb0Var.E;
                        if (ac0Var != null) {
                            if (ac0Var.g) {
                                ac0Var.g = false;
                                ac0Var.b.n(ac0Var.a, ac0Var.e);
                            }
                            tb0Var.E = null;
                        }
                        vh4Var.d = null;
                        ((ViewGroup) vh4Var.b).requestDisallowInterceptTouchEvent(false);
                        vh4Var.b = null;
                        vh4Var.c = null;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sk0 sk0Var = (sk0) obj;
                AnimatorSet animatorSet2 = sk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        sk0Var.c.setVisibility(4);
                        return;
                    } else {
                        sk0Var.b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 6:
                kr0 kr0Var = (kr0) obj;
                boolean z4 = this.b;
                if (!z4) {
                    f4 = 0.0f;
                }
                kr0Var.x = f4;
                uic uicVar = kr0Var.r;
                if (z4) {
                    f = 0.0f;
                } else {
                    f = -42.0f;
                }
                uicVar.setTranslationY(hl.L(f));
                uq0 uq0Var = kr0Var.n;
                if (z4) {
                    f3 = 42.0f;
                }
                uq0Var.setTranslationY(hl.L(f3));
                return;
            case 7:
                gr0 gr0Var = (gr0) obj;
                o9c o9cVar = gr0Var.h;
                yq0 yq0Var = gr0Var.f;
                br0 br0Var = gr0Var.w;
                gr0Var.b = false;
                boolean z5 = this.b;
                if (z5) {
                    int i2 = gr0Var.e;
                    gr0Var.d = i2;
                    gr0Var.a0.E = i2;
                    xea.E(i2);
                }
                int b2 = br0Var.b();
                if (z5) {
                    o9cVar.x1(gr0Var.d);
                    yq0Var.c0();
                    if (br0Var.b() == b2) {
                        hl.V3(yq0Var);
                    } else {
                        br0Var.f();
                    }
                }
                gr0Var.r.setVisibility(8);
                int i3 = gr0Var.T;
                if (i3 >= 0) {
                    if (z5 && (m = gr0Var.s.m(i3)) != null) {
                        gr0Var.U = m.getTop();
                    }
                    o9cVar.g1(gr0Var.T, (-yq0Var.getPaddingTop()) + gr0Var.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 8:
                xw0 xw0Var = (xw0) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                xw0Var.S0 = f3;
                xw0Var.h();
                return;
            case 9:
                v41 v41Var = (v41) obj;
                if (animator == v41Var.g) {
                    v41Var.g = null;
                    if (this.b) {
                        f3 = 1.0f;
                    }
                    v41Var.j = f3;
                    v41Var.b();
                    return;
                }
                return;
            case 10:
                c51 c51Var = (c51) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                c51Var.Q = f3;
                c51Var.invalidate();
                return;
            case 11:
                qb1 qb1Var = (qb1) obj;
                boolean z6 = this.b;
                if (!z6) {
                    qb1Var.r.setVisibility(8);
                    mb1 mb1Var = qb1Var.N;
                    if (mb1Var != null) {
                        mb1Var.setVisibility(8);
                    }
                }
                if (z6) {
                    qb1Var.f.getEditText().setAllowDrawCursor(true);
                }
                qb1Var.c(z6);
                return;
            case 12:
                ImageView imageView = ((re1) obj).d;
                if (!this.b) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            case 13:
                gi1 gi1Var = (gi1) obj;
                if (gi1Var.r != null && (di1Var = gi1Var.n) != null) {
                    if (this.b) {
                        di1Var.setVisibility(4);
                    } else {
                        gi1Var.s.setVisibility(4);
                    }
                    gi1Var.r = null;
                    return;
                }
                return;
            case 14:
                zu1 zu1Var = (zu1) obj;
                AnimatorSet animatorSet3 = zu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        zu1Var.J0.setVisibility(4);
                        return;
                    }
                    if (zu1Var.F0) {
                        view = zu1Var.G0;
                    } else {
                        view = zu1Var.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 15:
                n12 n12Var = (n12) obj;
                if (n12Var.V2 != null) {
                    if (this.b) {
                        if (n12Var.P2) {
                            f12 f12Var = n12Var.v2;
                            if (f12Var == null || f12Var.M()) {
                                n12Var.u3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    s7 s7Var = n12Var.b3;
                    if (s7Var != null) {
                        s7Var.setVisibility(4);
                    }
                    if (n12Var.N2 != 0 || !n12Var.n3) {
                        n12Var.X2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                g92 g92Var = (g92) obj;
                if (g92Var.h != null && (radialProgressView = g92Var.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        g92Var.f.setVisibility(4);
                    }
                    g92Var.h = null;
                    return;
                }
                return;
            case 17:
                y92 y92Var = (y92) obj;
                if (!this.b) {
                    de0 de0Var = y92Var.h;
                    y92Var.h = y92Var.n;
                    y92Var.n = de0Var;
                    de0Var.setVisibility(8);
                    y92Var.n.setAlpha(0.0f);
                    y92Var.h.setVisibility(0);
                    y92Var.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 18:
                wb2 wb2Var = (wb2) obj;
                dc2 dc2Var = wb2Var.ub;
                int b3 = dc2Var.b();
                int i4 = wb2Var.Cb;
                if (i4 != b3) {
                    wb2Var.C0(i4, b3, this.b);
                    return;
                }
                wb2Var.Fb = false;
                dc2Var.b2 = i4;
                return;
            case 19:
                boolean z7 = this.b;
                sd2 sd2Var = (sd2) obj;
                if (animator == sd2Var.e) {
                    if (z7) {
                        f3 = 1.0f;
                    }
                    sd2Var.d = f3;
                    sd2Var.setShown(f3);
                    if (!z7) {
                        sd2Var.setVisibility(8);
                    }
                    sd2Var.a(true);
                    return;
                }
                return;
            case 20:
                oe2 oe2Var = (oe2) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                oe2Var.Z1 = f3;
                oe2Var.C1.setTranslationY((-hl.L(7.0f)) * oe2Var.Z1);
                return;
            case 21:
                el2 el2Var = (el2) obj;
                iw iwVar = el2Var.a;
                boolean z8 = this.b;
                if (z8) {
                    f3 = 1.0f;
                }
                el2Var.d = f3;
                iwVar.invalidate();
                if (!z8) {
                    i = 8;
                }
                iwVar.setVisibility(i);
                return;
            case 22:
                if (!this.b) {
                    ((p) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 23:
                xn2 xn2Var = (xn2) obj;
                if (xn2Var.y != null && (radialProgressView2 = xn2Var.E) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        xn2Var.w.setVisibility(4);
                    }
                    xn2Var.y = null;
                    return;
                }
                return;
            case 24:
                cu2 cu2Var = (cu2) obj;
                if (cu2Var.x != null && (radialProgressView3 = cu2Var.s) != null) {
                    if (!this.b) {
                        radialProgressView3.setVisibility(4);
                        cu2Var.w.setVisibility(4);
                    }
                    cu2Var.x = null;
                    return;
                }
                return;
            case 25:
                vw2 vw2Var = (vw2) obj;
                AnimatorSet animatorSet4 = vw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    vw2Var.T = null;
                    if (!this.b) {
                        vw2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if (this.b) {
                    ((b43) obj).d(false, false, true, false);
                    return;
                }
                return;
            case 27:
                e53 e53Var = (e53) obj;
                i49 i49Var = e53Var.n;
                e53Var.k();
                e53Var.l();
                boolean z9 = this.b;
                e53Var.a(z9);
                e53Var.m.invalidateOutline();
                if (z9) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                e53Var.j = f2;
                if (z9) {
                    e53Var.k = true;
                    e53Var.a.invalidate();
                }
                i49Var.setCustomEmojiEnterProgress(Utilities.i(e53Var.j, 1.0f, 0.0f));
                if (!z9) {
                    i49Var.setImportantForAccessibility(0);
                    i49Var.setSkipDraw(false);
                    e53Var.f();
                    Runtime.getRuntime().gc();
                    byte b4 = e53Var.y;
                    if (b4 == 4 || b4 == 5) {
                        z = false;
                    }
                    i49Var.setCustomEmojiReactionsBackground(z);
                }
                e53Var.C = false;
                return;
            case 28:
                pg3 pg3Var = (pg3) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                pg3Var.e0 = f3;
                pg3Var.b();
                return;
            default:
                uy3 uy3Var = (uy3) obj;
                xy3 xy3Var = uy3Var.O;
                if (xy3Var.U && !uy3Var.h) {
                    if (!this.b && !uy3Var.n) {
                        uy3Var.setBackground(null);
                        return;
                    } else if (uy3Var.getBackground() == null) {
                        uy3Var.setBackground(aob.Y(xy3Var.k(), 8, 8));
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
                    ((pg3) this.c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public z7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public z7(y92 y92Var) {
        this.a = (byte) 17;
        this.c = y92Var;
    }
}
