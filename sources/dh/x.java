package dh;

import ai.q3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ci.j1;
import ei.g1;
import ei.j4;
import ei.k2;
import ei.n1;
import ei.r9;
import gi.d3;
import gi.m5;
import gi.m8;
import gi.va;
import gi.y3;
import ii.a3;
import kg.h1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.a5;
import org.telegram.ui.ad;
import org.telegram.ui.d5;
import org.telegram.ui.ha;
import org.telegram.ui.i4;
import org.telegram.ui.ln;
import org.telegram.ui.t4;
import org.telegram.ui.wm;
import org.telegram.ui.xc;
public final class x extends AnimatorListenerAdapter {
    public final int f9164a;
    public final boolean f9165b;
    public final Object f9166c;

    public x(int i3, Object obj, boolean z10) {
        this.f9164a = i3;
        this.f9166c = obj;
        this.f9165b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9164a) {
            case 16:
                ((ji.n) this.f9166c).f16352y = null;
                return;
            case 22:
                h2 h2Var = (h2) this.f9166c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f9166c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    return;
                }
                return;
            case 25:
                sa saVar = (sa) this.f9166c;
                AnimatorSet animatorSet3 = saVar.f30362f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f30362f = null;
                    return;
                }
                return;
            case 27:
                ((ad) this.f9166c).f43747r = null;
                return;
            case 28:
                wm wmVar = (wm) this.f9166c;
                AnimatorSet animatorSet4 = wmVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    wmVar.W0 = null;
                    return;
                }
                return;
            case 29:
                ((ln) this.f9166c).h = null;
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
        g1 g1Var;
        float f13;
        float f14;
        float f15;
        View m10;
        float f16;
        float f17;
        int i3;
        float f18;
        RadialProgressView radialProgressView;
        float f19;
        boolean z10;
        int i10;
        float f20;
        float f21;
        boolean z11;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        int i11;
        xc xcVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f9164a) {
            case 0:
                a0 a0Var = (a0) this.f9166c;
                li0 li0Var = a0Var.f8942n;
                a0Var.k();
                a0Var.l();
                boolean z12 = this.f9165b;
                a0.a(a0Var, z12);
                a0Var.f8941m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a0Var.f8938j = f10;
                boolean z13 = true;
                if (z12) {
                    a0Var.f8939k = true;
                    a0Var.f8931a.invalidate();
                }
                li0Var.setCustomEmojiEnterProgress(Utilities.i(a0Var.f8938j, 1.0f, 0.0f));
                if (!z12) {
                    li0Var.setImportantForAccessibility(0);
                    li0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = a0Var.f8952y;
                    li0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                a0Var.C = false;
                return;
            case 1:
                ei.r rVar = (ei.r) this.f9166c;
                if (this.f9165b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                rVar.f10830e0 = f11;
                rVar.b();
                return;
            case 2:
                k2 k2Var = (k2) this.f9166c;
                j1 j1Var = k2Var.f11150c;
                float f27 = 0.0f;
                boolean z14 = this.f9165b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                j1Var.setAlpha(f12);
                View view2 = k2Var.f11146a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                k2Var.invalidate();
                return;
            case 3:
                n1 n1Var = (n1) this.f9166c;
                n1Var.f10649b.removeViewImmediate(n1Var.d);
                n1Var.f10652f.b();
                if (this.f9165b && (g1Var = n1Var.f10656w) != null && g1Var != g1.X) {
                    g1Var.e();
                }
                n1Var.f10656w = null;
                n1Var.f10655s = true;
                n1Var.H = null;
                n1Var.F = false;
                return;
            case 4:
                r9 r9Var = (r9) this.f9166c;
                r9Var.K0.e();
                if (this.f9165b) {
                    f13 = r9Var.f10960x.f10999c;
                } else {
                    f13 = 0.0f;
                }
                r9Var.f10923f0 = f13;
                j4 currentPeerView = r9Var.f10939o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                r9Var.f10957w.invalidate();
                r9Var.f10959w1 = null;
                return;
            case 5:
                fi.q qVar = (fi.q) this.f9166c;
                float f28 = 0.0f;
                boolean z15 = this.f9165b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                qVar.f11640x = f14;
                m61 m61Var = qVar.f11637r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                m61Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                q3 q3Var = qVar.f11636n;
                if (z15) {
                    f28 = 42.0f;
                }
                q3Var.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 6:
                fi.m mVar = (fi.m) this.f9166c;
                j41 j41Var = mVar.h;
                fi.e eVar = mVar.f11620f;
                fi.h hVar = mVar.f11624w;
                mVar.f11617b = false;
                boolean z16 = this.f9165b;
                if (z16) {
                    int i13 = mVar.f11619e;
                    mVar.d = i13;
                    mVar.f11616a0.E = i13;
                    az.F(i13);
                }
                int b10 = hVar.b();
                if (z16) {
                    j41Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.b4(eVar);
                    } else {
                        hVar.f();
                    }
                }
                mVar.f11622r.setVisibility(8);
                int i14 = mVar.T;
                if (i14 >= 0) {
                    if (z16 && (m10 = mVar.f11623s.m(i14)) != null) {
                        mVar.U = m10.getTop();
                    }
                    j41Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                gi.d dVar = (gi.d) this.f9166c;
                if (this.f9165b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.Q = f16;
                dVar.invalidate();
                return;
            case 8:
                gi.m mVar2 = (gi.m) this.f9166c;
                boolean z17 = this.f9165b;
                if (!z17) {
                    mVar2.f13157r.setVisibility(8);
                    gi.i iVar = mVar2.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar2.f13144f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z17);
                return;
            case 9:
                gi.y yVar = (gi.y) this.f9166c;
                gi.v vVar = yVar.f13875a;
                boolean z18 = this.f9165b;
                if (z18) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                yVar.d = f17;
                vVar.invalidate();
                if (z18) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                vVar.setVisibility(i3);
                return;
            case 10:
                if (!this.f9165b) {
                    ((d3) this.f9166c).J.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f9165b) {
                    ((y3) this.f9166c).f13923b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                m5 m5Var = (m5) this.f9166c;
                if (!this.f9165b) {
                    m5Var.J1.setVisibility(8);
                    m5Var.J1.n();
                    return;
                }
                return;
            case 13:
                m8 m8Var = (m8) this.f9166c;
                if (this.f9165b) {
                    m8Var.setVisibility(8);
                }
                m8Var.f13263c = null;
                return;
            case 14:
                va vaVar = (va) this.f9166c;
                if (!this.f9165b) {
                    vaVar.W0.setVisibility(8);
                }
                vaVar.f13722g2 = null;
                return;
            case 15:
                a3 a3Var = (a3) this.f9166c;
                if (this.f9165b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a3Var.S0 = f18;
                a3Var.l();
                return;
            case 16:
                ji.n nVar = (ji.n) this.f9166c;
                if (nVar.f16352y != null && (radialProgressView = nVar.E) != null) {
                    if (!this.f9165b) {
                        radialProgressView.setVisibility(4);
                        nVar.f16350w.setVisibility(4);
                    }
                    nVar.f16352y = null;
                    return;
                }
                return;
            case 17:
                h1 h1Var = (h1) this.f9166c;
                boolean z19 = this.f9165b;
                if (z19) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                h1Var.f17038e = f19;
                h1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    h1Var.f17037c[i15].setTranslationX(org.telegram.messenger.g0.W1(h1Var.f17038e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = h1Var.f17037c[i15];
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
                    TextView textView2 = h1Var.f17037c[i15];
                    if (i15 == 0) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    if (i15 == 1) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f20, f21, h1Var.f17038e));
                    h1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(h1Var.f17038e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView3 = h1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = h1Var.d[i15];
                    if (i15 == 0) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i15 == 1) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.0f;
                    }
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f22, f23, h1Var.f17038e));
                }
                return;
            case 18:
                y0 y0Var = (y0) this.f9166c;
                if (this.f9165b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                y0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                y0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 19:
                i4 i4Var = (i4) this.f9166c;
                boolean z20 = this.f9165b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                i4Var.f46078a1 = f25;
                i4Var.f46096r0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + i4Var.f46095q0);
                if (!z20) {
                    i4Var.f46096r0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                d5 d5Var = (d5) this.f9166c;
                if (!this.f9165b) {
                    d5Var.setVisibility(4);
                    b4.n nVar2 = ((t4) d5Var).H;
                    if (nVar2.f2377a) {
                        nVar2.f2377a = false;
                        if (((t4) nVar2.d).getParent() != null) {
                            ((WindowManager) nVar2.f2379c).removeView((t4) nVar2.d);
                        }
                        t4 t4Var = (t4) nVar2.d;
                        t4Var.F = true;
                        a5 a5Var = t4Var.E;
                        if (a5Var != null) {
                            if (a5Var.f43601g) {
                                a5Var.f43601g = false;
                                a5Var.f43597b.n(a5Var.f43596a, a5Var.f43599e);
                            }
                            t4Var.E = null;
                        }
                        nVar2.d = null;
                        ((ViewGroup) nVar2.f2378b).requestDisallowInterceptTouchEvent(false);
                        nVar2.f2378b = null;
                        nVar2.f2379c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                q1 q1Var = (q1) this.f9166c;
                x1 x1Var = q1Var.hb;
                int b11 = x1Var.b();
                int i17 = q1Var.f30042pb;
                if (i17 != b11) {
                    q1Var.B0(i17, b11, this.f9165b);
                    return;
                }
                q1Var.f30080sb = false;
                x1Var.f30846b2 = i17;
                return;
            case 22:
                h2 h2Var = (h2) this.f9166c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    if (!this.f9165b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f9166c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    if (!this.f9165b) {
                        q5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                n7 n7Var = (n7) this.f9166c;
                ValueAnimator valueAnimator = n7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f9165b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    n7Var.C0 = f26;
                    n7Var.B0 = null;
                    return;
                }
                return;
            case 25:
                sa saVar = (sa) this.f9166c;
                AnimatorSet animatorSet3 = saVar.f30362f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f30362f = null;
                    if (!this.f9165b) {
                        saVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((ha) this.f9166c).d;
                if (this.f9165b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 27:
                ad adVar = (ad) this.f9166c;
                if (adVar.f43747r != null && (xcVar = adVar.f43742n) != null) {
                    if (this.f9165b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.f43749s.setVisibility(4);
                    }
                    adVar.f43747r = null;
                    return;
                }
                return;
            case 28:
                wm wmVar = (wm) this.f9166c;
                AnimatorSet animatorSet4 = wmVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f9165b) {
                        wmVar.J0.setVisibility(4);
                        return;
                    }
                    if (wmVar.F0) {
                        view = wmVar.G0;
                    } else {
                        view = wmVar.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                ln lnVar = (ln) this.f9166c;
                if (lnVar.h != null && (radialProgressView2 = lnVar.f47381n) != null) {
                    if (!this.f9165b) {
                        radialProgressView2.setVisibility(4);
                        lnVar.f47373f.setVisibility(4);
                    }
                    lnVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9164a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((ei.r) this.f9166c).performHapticFeedback(3);
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
