package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import hi.ta;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.ia;
import org.telegram.ui.xc;
public final class j7 extends AnimatorListenerAdapter {
    public final int f3729a;
    public final boolean f3730b;
    public final Object f3731c;

    public j7(int i7, Object obj, boolean z10) {
        this.f3729a = i7;
        this.f3731c = obj;
        this.f3730b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3729a) {
            case 17:
                ((li.p) this.f3731c).f19984y = null;
                return;
            case 23:
                org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) this.f3731c;
                AnimatorSet animatorSet = i2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i2Var.T = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f3731c;
                AnimatorSet animatorSet2 = s5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.L = null;
                    return;
                }
                return;
            case 26:
                ua uaVar = (ua) this.f3731c;
                AnimatorSet animatorSet3 = uaVar.f32046f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uaVar.f32046f = null;
                    return;
                }
                return;
            case 28:
                ((ad) this.f3731c).f45564r = null;
                return;
            case 29:
                bn bnVar = (bn) this.f3731c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bnVar.W0 = null;
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View m10;
        float f16;
        float f17;
        int i7;
        float f18;
        boolean z10;
        int i10;
        float f19;
        float f20;
        boolean z11;
        float f21;
        float f22;
        float f23;
        RadialProgressView radialProgressView;
        float f24;
        float f25;
        float f26;
        int i11;
        xc xcVar;
        View view;
        switch (this.f3729a) {
            case 0:
                if (!this.f3730b) {
                    ((m8) this.f3731c).f3857w.setVisibility(8);
                    return;
                }
                return;
            case 1:
                ch.b0 b0Var = (ch.b0) this.f3731c;
                xi0 xi0Var = b0Var.f5300n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f3730b;
                ch.b0.a(b0Var, z12);
                b0Var.f5299m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f5296j = f10;
                boolean z13 = true;
                if (z12) {
                    b0Var.f5297k = true;
                    b0Var.f5289a.invalidate();
                }
                xi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5296j, 1.0f, 0.0f));
                if (!z12) {
                    xi0Var.setImportantForAccessibility(0);
                    xi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f5310y;
                    xi0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 2:
                fi.q qVar = (fi.q) this.f3731c;
                if (this.f3730b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f12412e0 = f11;
                qVar.b();
                return;
            case 3:
                fi.a2 a2Var = (fi.a2) this.f3731c;
                di.b1 b1Var = a2Var.f12553c;
                float f27 = 0.0f;
                boolean z14 = this.f3730b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                b1Var.setAlpha(f12);
                View view2 = a2Var.f12549a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                a2Var.invalidate();
                return;
            case 4:
                fi.f9 f9Var = (fi.f9) this.f3731c;
                f9Var.J0.e();
                if (this.f3730b) {
                    f13 = f9Var.f11999x.f12095c;
                } else {
                    f13 = 0.0f;
                }
                f9Var.f11962f0 = f13;
                fi.z3 currentPeerView = f9Var.f11978o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9Var.f11996w.invalidate();
                f9Var.f11995v1 = null;
                return;
            case 5:
                gi.q qVar2 = (gi.q) this.f3731c;
                float f28 = 0.0f;
                boolean z15 = this.f3730b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                qVar2.f13668x = f14;
                i71 i71Var = qVar2.f13665r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                i71Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                s5 s5Var = qVar2.f13664n;
                if (z15) {
                    f28 = 42.0f;
                }
                s5Var.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 6:
                gi.m mVar = (gi.m) this.f3731c;
                f51 f51Var = mVar.h;
                gi.e eVar = mVar.f13648f;
                gi.h hVar = mVar.f13652w;
                mVar.f13645b = false;
                boolean z16 = this.f3730b;
                if (z16) {
                    int i13 = mVar.f13647e;
                    mVar.d = i13;
                    mVar.f13644a0.E = i13;
                    cz.F(i13);
                }
                int b10 = hVar.b();
                if (z16) {
                    f51Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.Z3(eVar);
                    } else {
                        hVar.f();
                    }
                }
                mVar.f13650r.setVisibility(8);
                int i14 = mVar.T;
                if (i14 >= 0) {
                    if (z16 && (m10 = mVar.f13651s.m(i14)) != null) {
                        mVar.U = m10.getTop();
                    }
                    f51Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                hi.d dVar = (hi.d) this.f3731c;
                if (this.f3730b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.Q = f16;
                dVar.invalidate();
                return;
            case 8:
                hi.m mVar2 = (hi.m) this.f3731c;
                boolean z17 = this.f3730b;
                if (!z17) {
                    mVar2.f14984r.setVisibility(8);
                    hi.i iVar = mVar2.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar2.f14971f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z17);
                return;
            case 9:
                hi.y yVar = (hi.y) this.f3731c;
                hi.v vVar = yVar.f15701a;
                boolean z18 = this.f3730b;
                if (z18) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                yVar.d = f17;
                vVar.invalidate();
                if (z18) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                vVar.setVisibility(i7);
                return;
            case 10:
                if (!this.f3730b) {
                    ((hi.d3) this.f3731c).J.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f3730b) {
                    ((hi.x3) this.f3731c).f15669b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                hi.l5 l5Var = (hi.l5) this.f3731c;
                if (!this.f3730b) {
                    l5Var.J1.setVisibility(8);
                    l5Var.J1.n();
                    return;
                }
                return;
            case 13:
                hi.j8 j8Var = (hi.j8) this.f3731c;
                if (this.f3730b) {
                    j8Var.setVisibility(8);
                }
                j8Var.f14781c = null;
                return;
            case 14:
                ta taVar = (ta) this.f3731c;
                if (!this.f3730b) {
                    taVar.W0.setVisibility(8);
                }
                taVar.f15411g2 = null;
                return;
            case 15:
                jg.k1 k1Var = (jg.k1) this.f3731c;
                boolean z19 = this.f3730b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                k1Var.f17553e = f18;
                k1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    k1Var.f17552c[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17553e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = k1Var.f17552c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z19) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    TextView textView2 = k1Var.f17552c[i15];
                    if (i15 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i15 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f19, f20, k1Var.f17553e));
                    k1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17553e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView3 = k1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = k1Var.d[i15];
                    if (i15 == 0) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (i15 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f21, f22, k1Var.f17553e));
                }
                return;
            case 16:
                ki.s2 s2Var = (ki.s2) this.f3731c;
                if (this.f3730b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                s2Var.S0 = f23;
                s2Var.l();
                return;
            case 17:
                li.p pVar = (li.p) this.f3731c;
                if (pVar.f19984y != null && (radialProgressView = pVar.E) != null) {
                    if (!this.f3730b) {
                        radialProgressView.setVisibility(4);
                        pVar.f19982w.setVisibility(4);
                    }
                    pVar.f19984y = null;
                    return;
                }
                return;
            case 18:
                if (this.f3730b) {
                    ((og.o) this.f3731c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f3731c;
                if (this.f3730b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                y0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                y0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 20:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f3731c;
                boolean z20 = this.f3730b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.f47898a1 = f25;
                g4Var.f47916r0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f47915q0);
                if (!z20) {
                    g4Var.f47916r0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f3731c;
                if (!this.f3730b) {
                    b5Var.setVisibility(4);
                    ab.q qVar3 = ((org.telegram.ui.r4) b5Var).H;
                    if (qVar3.f987a) {
                        qVar3.f987a = false;
                        if (((org.telegram.ui.r4) qVar3.d).getParent() != null) {
                            ((WindowManager) qVar3.f989c).removeView((org.telegram.ui.r4) qVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) qVar3.d;
                        r4Var.F = true;
                        org.telegram.ui.y4 y4Var = r4Var.E;
                        if (y4Var != null) {
                            if (y4Var.f54015g) {
                                y4Var.f54015g = false;
                                y4Var.f54011b.n(y4Var.f54010a, y4Var.f54013e);
                            }
                            r4Var.E = null;
                        }
                        qVar3.d = null;
                        ((ViewGroup) qVar3.f988b).requestDisallowInterceptTouchEvent(false);
                        qVar3.f988b = null;
                        qVar3.f989c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f3731c;
                org.telegram.ui.Cells.y1 y1Var = r1Var.f31437ib;
                int b11 = y1Var.b();
                int i17 = r1Var.f31542qb;
                if (i17 != b11) {
                    r1Var.B0(i17, b11, this.f3730b);
                    return;
                }
                r1Var.f31583tb = false;
                y1Var.f32349b2 = i17;
                return;
            case 23:
                org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) this.f3731c;
                AnimatorSet animatorSet = i2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i2Var.T = null;
                    if (!this.f3730b) {
                        i2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f3731c;
                AnimatorSet animatorSet2 = s5Var2.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var2.L = null;
                    if (!this.f3730b) {
                        s5Var2.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f3731c;
                ValueAnimator valueAnimator = p7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f3730b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    p7Var.C0 = f26;
                    p7Var.B0 = null;
                    return;
                }
                return;
            case 26:
                ua uaVar = (ua) this.f3731c;
                AnimatorSet animatorSet3 = uaVar.f32046f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uaVar.f32046f = null;
                    if (!this.f3730b) {
                        uaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((ia) this.f3731c).d;
                if (this.f3730b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 28:
                ad adVar = (ad) this.f3731c;
                if (adVar.f45564r != null && (xcVar = adVar.f45559n) != null) {
                    if (this.f3730b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.f45566s.setVisibility(4);
                    }
                    adVar.f45564r = null;
                    return;
                }
                return;
            default:
                bn bnVar = (bn) this.f3731c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f3730b) {
                        bnVar.J0.setVisibility(4);
                        return;
                    }
                    if (bnVar.F0) {
                        view = bnVar.G0;
                    } else {
                        view = bnVar.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3729a) {
            case 2:
                super.onAnimationStart(animator);
                try {
                    ((fi.q) this.f3731c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
