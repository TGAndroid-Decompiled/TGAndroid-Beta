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
                AnimatorSet[] animatorSetArr = ((hd) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    return;
                }
                return;
            case 5:
                rk0 rk0Var = (rk0) obj;
                AnimatorSet animatorSet2 = rk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    rk0Var.h = null;
                    return;
                }
                return;
            case 13:
                ((yh1) obj).r = null;
                return;
            case 14:
                mu1 mu1Var = (mu1) obj;
                AnimatorSet animatorSet3 = mu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mu1Var.W0 = null;
                    return;
                }
                return;
            case 15:
                ((x02) obj).V2 = null;
                return;
            case 16:
                ((p82) obj).h = null;
                return;
            case 17:
                this.b = true;
                return;
            case 23:
                ((en2) obj).y = null;
                return;
            case 24:
                ((it2) obj).x = null;
                return;
            case 25:
                bw2 bw2Var = (bw2) obj;
                AnimatorSet animatorSet4 = bw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bw2Var.T = null;
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
        vh1 vh1Var;
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
                a8Var.setTextColor(bm2.f(f3, -1, -9194260));
                a8Var.setIconColor(bm2.f(f3, -1, -9194260));
                return;
            case 1:
                AnimatorSet[] animatorSetArr = ((hd) obj).G;
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
                oVar.r0.setTranslationY(((1.0f - f3) * gl.L(51.0f)) + oVar.q0);
                if (!z3) {
                    oVar.r0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                ((c20) obj).a[this.b ? 1 : 0].setVisibility(8);
                return;
            case 4:
                bc0 bc0Var = (bc0) obj;
                if (!this.b) {
                    bc0Var.setVisibility(4);
                    xf4 xf4Var = ((rb0) bc0Var).H;
                    if (xf4Var.a) {
                        xf4Var.a = false;
                        if (((rb0) xf4Var.d).getParent() != null) {
                            ((WindowManager) xf4Var.c).removeView((rb0) xf4Var.d);
                        }
                        rb0 rb0Var = (rb0) xf4Var.d;
                        rb0Var.F = true;
                        yb0 yb0Var = rb0Var.E;
                        if (yb0Var != null) {
                            if (yb0Var.g) {
                                yb0Var.g = false;
                                yb0Var.b.n(yb0Var.a, yb0Var.e);
                            }
                            rb0Var.E = null;
                        }
                        xf4Var.d = null;
                        ((ViewGroup) xf4Var.b).requestDisallowInterceptTouchEvent(false);
                        xf4Var.b = null;
                        xf4Var.c = null;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rk0 rk0Var = (rk0) obj;
                AnimatorSet animatorSet2 = rk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        rk0Var.c.setVisibility(4);
                        return;
                    } else {
                        rk0Var.b.setVisibility(4);
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
                vec vecVar = kr0Var.r;
                if (z4) {
                    f = 0.0f;
                } else {
                    f = -42.0f;
                }
                vecVar.setTranslationY(gl.L(f));
                uq0 uq0Var = kr0Var.n;
                if (z4) {
                    f3 = 42.0f;
                }
                uq0Var.setTranslationY(gl.L(f3));
                return;
            case 7:
                gr0 gr0Var = (gr0) obj;
                o5c o5cVar = gr0Var.h;
                yq0 yq0Var = gr0Var.f;
                br0 br0Var = gr0Var.w;
                gr0Var.b = false;
                boolean z5 = this.b;
                if (z5) {
                    int i2 = gr0Var.e;
                    gr0Var.d = i2;
                    gr0Var.a0.E = i2;
                    gba.E(i2);
                }
                int b2 = br0Var.b();
                if (z5) {
                    o5cVar.x1(gr0Var.d);
                    yq0Var.b0();
                    if (br0Var.b() == b2) {
                        gl.W3(yq0Var);
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
                    o5cVar.g1(gr0Var.T, (-yq0Var.getPaddingTop()) + gr0Var.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 8:
                ow0 ow0Var = (ow0) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                ow0Var.S0 = f3;
                ow0Var.h();
                return;
            case 9:
                n41 n41Var = (n41) obj;
                if (animator == n41Var.g) {
                    n41Var.g = null;
                    if (this.b) {
                        f3 = 1.0f;
                    }
                    n41Var.j = f3;
                    n41Var.b();
                    return;
                }
                return;
            case 10:
                u41 u41Var = (u41) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                u41Var.Q = f3;
                u41Var.invalidate();
                return;
            case 11:
                ib1 ib1Var = (ib1) obj;
                boolean z6 = this.b;
                if (!z6) {
                    ib1Var.r.setVisibility(8);
                    eb1 eb1Var = ib1Var.N;
                    if (eb1Var != null) {
                        eb1Var.setVisibility(8);
                    }
                }
                if (z6) {
                    ib1Var.f.getEditText().setAllowDrawCursor(true);
                }
                ib1Var.c(z6);
                return;
            case 12:
                ImageView imageView = ((ie1) obj).d;
                if (!this.b) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            case 13:
                yh1 yh1Var = (yh1) obj;
                if (yh1Var.r != null && (vh1Var = yh1Var.n) != null) {
                    if (this.b) {
                        vh1Var.setVisibility(4);
                    } else {
                        yh1Var.s.setVisibility(4);
                    }
                    yh1Var.r = null;
                    return;
                }
                return;
            case 14:
                mu1 mu1Var = (mu1) obj;
                AnimatorSet animatorSet3 = mu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        mu1Var.J0.setVisibility(4);
                        return;
                    }
                    if (mu1Var.F0) {
                        view = mu1Var.G0;
                    } else {
                        view = mu1Var.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 15:
                x02 x02Var = (x02) obj;
                if (x02Var.V2 != null) {
                    if (this.b) {
                        if (x02Var.P2) {
                            p02 p02Var = x02Var.v2;
                            if (p02Var == null || p02Var.N()) {
                                x02Var.u3.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    r7 r7Var = x02Var.b3;
                    if (r7Var != null) {
                        r7Var.setVisibility(4);
                    }
                    if (x02Var.N2 != 0 || !x02Var.n3) {
                        x02Var.X2.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                p82 p82Var = (p82) obj;
                if (p82Var.h != null && (radialProgressView = p82Var.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        p82Var.f.setVisibility(4);
                    }
                    p82Var.h = null;
                    return;
                }
                return;
            case 17:
                i92 i92Var = (i92) obj;
                if (!this.b) {
                    be0 be0Var = i92Var.h;
                    i92Var.h = i92Var.n;
                    i92Var.n = be0Var;
                    be0Var.setVisibility(8);
                    i92Var.n.setAlpha(0.0f);
                    i92Var.h.setVisibility(0);
                    i92Var.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 18:
                gb2 gb2Var = (gb2) obj;
                nb2 nb2Var = gb2Var.ub;
                int b3 = nb2Var.b();
                int i4 = gb2Var.Cb;
                if (i4 != b3) {
                    gb2Var.C0(i4, b3, this.b);
                    return;
                }
                gb2Var.Fb = false;
                nb2Var.b2 = i4;
                return;
            case 19:
                boolean z7 = this.b;
                cd2 cd2Var = (cd2) obj;
                if (animator == cd2Var.e) {
                    if (z7) {
                        f3 = 1.0f;
                    }
                    cd2Var.d = f3;
                    cd2Var.setShown(f3);
                    if (!z7) {
                        cd2Var.setVisibility(8);
                    }
                    cd2Var.a(true);
                    return;
                }
                return;
            case 20:
                xd2 xd2Var = (xd2) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                xd2Var.Z1 = f3;
                xd2Var.C1.setTranslationY((-gl.L(7.0f)) * xd2Var.Z1);
                return;
            case 21:
                jk2 jk2Var = (jk2) obj;
                hw hwVar = jk2Var.a;
                boolean z8 = this.b;
                if (z8) {
                    f3 = 1.0f;
                }
                jk2Var.d = f3;
                hwVar.invalidate();
                if (!z8) {
                    i = 8;
                }
                hwVar.setVisibility(i);
                return;
            case 22:
                if (!this.b) {
                    ((p) obj).I.setVisibility(8);
                    return;
                }
                return;
            case 23:
                en2 en2Var = (en2) obj;
                if (en2Var.y != null && (radialProgressView2 = en2Var.E) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        en2Var.w.setVisibility(4);
                    }
                    en2Var.y = null;
                    return;
                }
                return;
            case 24:
                it2 it2Var = (it2) obj;
                if (it2Var.x != null && (radialProgressView3 = it2Var.s) != null) {
                    if (!this.b) {
                        radialProgressView3.setVisibility(4);
                        it2Var.w.setVisibility(4);
                    }
                    it2Var.x = null;
                    return;
                }
                return;
            case 25:
                bw2 bw2Var = (bw2) obj;
                AnimatorSet animatorSet4 = bw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bw2Var.T = null;
                    if (!this.b) {
                        bw2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if (this.b) {
                    ((j33) obj).d(false, false, true, false);
                    return;
                }
                return;
            case 27:
                m43 m43Var = (m43) obj;
                t09 t09Var = m43Var.n;
                m43Var.k();
                m43Var.l();
                boolean z9 = this.b;
                m43Var.a(z9);
                m43Var.m.invalidateOutline();
                if (z9) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                m43Var.j = f2;
                if (z9) {
                    m43Var.k = true;
                    m43Var.a.invalidate();
                }
                t09Var.setCustomEmojiEnterProgress(Utilities.i(m43Var.j, 1.0f, 0.0f));
                if (!z9) {
                    t09Var.setImportantForAccessibility(0);
                    t09Var.setSkipDraw(false);
                    m43Var.f();
                    Runtime.getRuntime().gc();
                    byte b4 = m43Var.y;
                    if (b4 == 4 || b4 == 5) {
                        z = false;
                    }
                    t09Var.setCustomEmojiReactionsBackground(z);
                }
                m43Var.C = false;
                return;
            case 28:
                vf3 vf3Var = (vf3) obj;
                if (this.b) {
                    f3 = 1.0f;
                }
                vf3Var.e0 = f3;
                vf3Var.b();
                return;
            default:
                zx3 zx3Var = (zx3) obj;
                cy3 cy3Var = zx3Var.O;
                if (cy3Var.U && !zx3Var.h) {
                    if (!this.b && !zx3Var.n) {
                        zx3Var.setBackground(null);
                        return;
                    } else if (zx3Var.getBackground() == null) {
                        zx3Var.setBackground(bkb.Y(cy3Var.k(), 8, 8));
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
                    ((vf3) this.c).performHapticFeedback(3);
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

    public y7(i92 i92Var) {
        this.a = (byte) 17;
        this.c = i92Var;
    }
}
