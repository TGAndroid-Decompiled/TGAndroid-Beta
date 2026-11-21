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
import fi.f9;
import hi.sa;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.ia;
import org.telegram.ui.xc;
public final class h7 extends AnimatorListenerAdapter {
    public final int f3708a;
    public final boolean f3709b;
    public final Object f3710c;

    public h7(int i7, Object obj, boolean z10) {
        this.f3708a = i7;
        this.f3710c = obj;
        this.f3709b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3708a) {
            case 17:
                ((li.p) this.f3710c).f20015y = null;
                return;
            case 23:
                org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) this.f3710c;
                AnimatorSet animatorSet = i2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i2Var.T = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f3710c;
                AnimatorSet animatorSet2 = s5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.L = null;
                    return;
                }
                return;
            case 26:
                ua uaVar = (ua) this.f3710c;
                AnimatorSet animatorSet3 = uaVar.f32077f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uaVar.f32077f = null;
                    return;
                }
                return;
            case 28:
                ((ad) this.f3710c).f45593r = null;
                return;
            case 29:
                bn bnVar = (bn) this.f3710c;
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
        switch (this.f3708a) {
            case 0:
                if (!this.f3709b) {
                    ((k8) this.f3710c).f3804w.setVisibility(8);
                    return;
                }
                return;
            case 1:
                ch.b0 b0Var = (ch.b0) this.f3710c;
                xi0 xi0Var = b0Var.f5334n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f3709b;
                ch.b0.a(b0Var, z12);
                b0Var.f5333m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f5330j = f10;
                boolean z13 = true;
                if (z12) {
                    b0Var.f5331k = true;
                    b0Var.f5323a.invalidate();
                }
                xi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5330j, 1.0f, 0.0f));
                if (!z12) {
                    xi0Var.setImportantForAccessibility(0);
                    xi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f5344y;
                    xi0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 2:
                fi.q qVar = (fi.q) this.f3710c;
                if (this.f3709b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f12457e0 = f11;
                qVar.b();
                return;
            case 3:
                fi.a2 a2Var = (fi.a2) this.f3710c;
                di.b1 b1Var = a2Var.f12599c;
                float f27 = 0.0f;
                boolean z14 = this.f3709b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                b1Var.setAlpha(f12);
                View view2 = a2Var.f12595a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                a2Var.invalidate();
                return;
            case 4:
                f9 f9Var = (f9) this.f3710c;
                f9Var.J0.e();
                if (this.f3709b) {
                    f13 = f9Var.f12045x.f12186c;
                } else {
                    f13 = 0.0f;
                }
                f9Var.f12008f0 = f13;
                fi.z3 currentPeerView = f9Var.f12024o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9Var.f12042w.invalidate();
                f9Var.f12041v1 = null;
                return;
            case 5:
                gi.q qVar2 = (gi.q) this.f3710c;
                float f28 = 0.0f;
                boolean z15 = this.f3709b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                qVar2.f13702x = f14;
                i71 i71Var = qVar2.f13699r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                i71Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                q5 q5Var = qVar2.f13698n;
                if (z15) {
                    f28 = 42.0f;
                }
                q5Var.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 6:
                gi.m mVar = (gi.m) this.f3710c;
                f51 f51Var = mVar.h;
                gi.e eVar = mVar.f13682f;
                gi.h hVar = mVar.f13686w;
                mVar.f13679b = false;
                boolean z16 = this.f3709b;
                if (z16) {
                    int i13 = mVar.f13681e;
                    mVar.d = i13;
                    mVar.f13678a0.E = i13;
                    bz.F(i13);
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
                mVar.f13684r.setVisibility(8);
                int i14 = mVar.T;
                if (i14 >= 0) {
                    if (z16 && (m10 = mVar.f13685s.m(i14)) != null) {
                        mVar.U = m10.getTop();
                    }
                    f51Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                hi.e eVar2 = (hi.e) this.f3710c;
                if (this.f3709b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                eVar2.Q = f16;
                eVar2.invalidate();
                return;
            case 8:
                hi.o oVar = (hi.o) this.f3710c;
                boolean z17 = this.f3709b;
                if (!z17) {
                    oVar.f15161r.setVisibility(8);
                    hi.j jVar = oVar.N;
                    if (jVar != null) {
                        jVar.setVisibility(8);
                    }
                }
                if (z17) {
                    oVar.f15148f.getEditText().setAllowDrawCursor(true);
                }
                oVar.c(z17);
                return;
            case 9:
                hi.a0 a0Var = (hi.a0) this.f3710c;
                hi.x xVar = a0Var.f14202a;
                boolean z18 = this.f3709b;
                if (z18) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                a0Var.d = f17;
                xVar.invalidate();
                if (z18) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                xVar.setVisibility(i7);
                return;
            case 10:
                if (!this.f3709b) {
                    ((hi.d3) this.f3710c).J.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f3709b) {
                    ((hi.w3) this.f3710c).f15694b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                hi.k5 k5Var = (hi.k5) this.f3710c;
                if (!this.f3709b) {
                    k5Var.J1.setVisibility(8);
                    k5Var.J1.n();
                    return;
                }
                return;
            case 13:
                hi.i8 i8Var = (hi.i8) this.f3710c;
                if (this.f3709b) {
                    i8Var.setVisibility(8);
                }
                i8Var.f14802c = null;
                return;
            case 14:
                sa saVar = (sa) this.f3710c;
                if (!this.f3709b) {
                    saVar.W0.setVisibility(8);
                }
                saVar.f15405g2 = null;
                return;
            case 15:
                jg.k1 k1Var = (jg.k1) this.f3710c;
                boolean z19 = this.f3709b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                k1Var.f17584e = f18;
                k1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    k1Var.f17583c[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17584e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = k1Var.f17583c[i15];
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
                    TextView textView2 = k1Var.f17583c[i15];
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f19, f20, k1Var.f17584e));
                    k1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17584e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f21, f22, k1Var.f17584e));
                }
                return;
            case 16:
                ki.s2 s2Var = (ki.s2) this.f3710c;
                if (this.f3709b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                s2Var.S0 = f23;
                s2Var.l();
                return;
            case 17:
                li.p pVar = (li.p) this.f3710c;
                if (pVar.f20015y != null && (radialProgressView = pVar.E) != null) {
                    if (!this.f3709b) {
                        radialProgressView.setVisibility(4);
                        pVar.f20013w.setVisibility(4);
                    }
                    pVar.f20015y = null;
                    return;
                }
                return;
            case 18:
                if (this.f3709b) {
                    ((og.o) this.f3710c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f3710c;
                if (this.f3709b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                y0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                y0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 20:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f3710c;
                boolean z20 = this.f3709b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.f47947a1 = f25;
                g4Var.f47965r0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f47964q0);
                if (!z20) {
                    g4Var.f47965r0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f3710c;
                if (!this.f3709b) {
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
                            if (y4Var.f54037g) {
                                y4Var.f54037g = false;
                                y4Var.f54033b.n(y4Var.f54032a, y4Var.f54035e);
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
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f3710c;
                org.telegram.ui.Cells.y1 y1Var = r1Var.f31468ib;
                int b11 = y1Var.b();
                int i17 = r1Var.f31573qb;
                if (i17 != b11) {
                    r1Var.B0(i17, b11, this.f3709b);
                    return;
                }
                r1Var.f31614tb = false;
                y1Var.f32380b2 = i17;
                return;
            case 23:
                org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) this.f3710c;
                AnimatorSet animatorSet = i2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    i2Var.T = null;
                    if (!this.f3709b) {
                        i2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f3710c;
                AnimatorSet animatorSet2 = s5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.L = null;
                    if (!this.f3709b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f3710c;
                ValueAnimator valueAnimator = p7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f3709b) {
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
                ua uaVar = (ua) this.f3710c;
                AnimatorSet animatorSet3 = uaVar.f32077f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    uaVar.f32077f = null;
                    if (!this.f3709b) {
                        uaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((ia) this.f3710c).d;
                if (this.f3709b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 28:
                ad adVar = (ad) this.f3710c;
                if (adVar.f45593r != null && (xcVar = adVar.f45588n) != null) {
                    if (this.f3709b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.f45595s.setVisibility(4);
                    }
                    adVar.f45593r = null;
                    return;
                }
                return;
            default:
                bn bnVar = (bn) this.f3710c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f3709b) {
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
        switch (this.f3708a) {
            case 2:
                super.onAnimationStart(animator);
                try {
                    ((fi.q) this.f3710c).performHapticFeedback(3);
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
