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
import fi.i9;
import hi.j8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.ia;
import org.telegram.ui.xc;
public final class v4 extends AnimatorListenerAdapter {
    public final int f3939a;
    public final boolean f3940b;
    public final Object f3941c;

    public v4(int i7, Object obj, boolean z10) {
        this.f3939a = i7;
        this.f3941c = obj;
        this.f3940b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3939a) {
            case 17:
                ((li.n) this.f3941c).f19619y = null;
                return;
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.f3941c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.f3941c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    return;
                }
                return;
            case 26:
                sa saVar = (sa) this.f3941c;
                AnimatorSet animatorSet3 = saVar.f31438f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f31438f = null;
                    return;
                }
                return;
            case 28:
                ((ad) this.f3941c).f45017r = null;
                return;
            case 29:
                an anVar = (an) this.f3941c;
                AnimatorSet animatorSet4 = anVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    anVar.W0 = null;
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
        switch (this.f3939a) {
            case 0:
                if (!this.f3940b) {
                    ((a6) this.f3941c).f3386w.setVisibility(8);
                    return;
                }
                return;
            case 1:
                ch.b0 b0Var = (ch.b0) this.f3941c;
                mi0 mi0Var = b0Var.f5022n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f3940b;
                ch.b0.a(b0Var, z12);
                b0Var.f5021m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f5018j = f10;
                boolean z13 = true;
                if (z12) {
                    b0Var.f5019k = true;
                    b0Var.f5011a.invalidate();
                }
                mi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5018j, 1.0f, 0.0f));
                if (!z12) {
                    mi0Var.setImportantForAccessibility(0);
                    mi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f5032y;
                    mi0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 2:
                fi.q qVar = (fi.q) this.f3941c;
                if (this.f3940b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f12192e0 = f11;
                qVar.b();
                return;
            case 3:
                fi.c2 c2Var = (fi.c2) this.f3941c;
                di.c1 c1Var = c2Var.f12379c;
                float f27 = 0.0f;
                boolean z14 = this.f3940b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                c1Var.setAlpha(f12);
                View view2 = c2Var.f12375a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                c2Var.invalidate();
                return;
            case 4:
                i9 i9Var = (i9) this.f3941c;
                i9Var.J0.e();
                if (this.f3940b) {
                    f13 = i9Var.f11882x.f11929c;
                } else {
                    f13 = 0.0f;
                }
                i9Var.f11845f0 = f13;
                fi.b4 currentPeerView = i9Var.f11861o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.f11879w.invalidate();
                i9Var.f11878v1 = null;
                return;
            case 5:
                gi.q qVar2 = (gi.q) this.f3941c;
                float f28 = 0.0f;
                boolean z15 = this.f3940b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                qVar2.f13361x = f14;
                v61 v61Var = qVar2.f13358r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                v61Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                f3 f3Var = qVar2.f13357n;
                if (z15) {
                    f28 = 42.0f;
                }
                f3Var.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 6:
                gi.m mVar = (gi.m) this.f3941c;
                s41 s41Var = mVar.h;
                gi.e eVar = mVar.f13341f;
                gi.h hVar = mVar.f13345w;
                mVar.f13338b = false;
                boolean z16 = this.f3940b;
                if (z16) {
                    int i13 = mVar.f13340e;
                    mVar.d = i13;
                    mVar.f13337a0.E = i13;
                    gz.F(i13);
                }
                int b10 = hVar.b();
                if (z16) {
                    s41Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.a4(eVar);
                    } else {
                        hVar.f();
                    }
                }
                mVar.f13343r.setVisibility(8);
                int i14 = mVar.T;
                if (i14 >= 0) {
                    if (z16 && (m10 = mVar.f13344s.m(i14)) != null) {
                        mVar.U = m10.getTop();
                    }
                    s41Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                hi.d dVar = (hi.d) this.f3941c;
                if (this.f3940b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.Q = f16;
                dVar.invalidate();
                return;
            case 8:
                hi.m mVar2 = (hi.m) this.f3941c;
                boolean z17 = this.f3940b;
                if (!z17) {
                    mVar2.f14636r.setVisibility(8);
                    hi.i iVar = mVar2.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar2.f14623f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z17);
                return;
            case 9:
                hi.y yVar = (hi.y) this.f3941c;
                hi.v vVar = yVar.f15400a;
                boolean z18 = this.f3940b;
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
                if (!this.f3940b) {
                    ((hi.d3) this.f3941c).J.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f3940b) {
                    ((hi.x3) this.f3941c).f15326b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                hi.m5 m5Var = (hi.m5) this.f3941c;
                if (!this.f3940b) {
                    m5Var.J1.setVisibility(8);
                    m5Var.J1.n();
                    return;
                }
                return;
            case 13:
                j8 j8Var = (j8) this.f3941c;
                if (this.f3940b) {
                    j8Var.setVisibility(8);
                }
                j8Var.f14474c = null;
                return;
            case 14:
                hi.sa saVar = (hi.sa) this.f3941c;
                if (!this.f3940b) {
                    saVar.W0.setVisibility(8);
                }
                saVar.f15059g2 = null;
                return;
            case 15:
                jg.k1 k1Var = (jg.k1) this.f3941c;
                boolean z19 = this.f3940b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                k1Var.f17176e = f18;
                k1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    k1Var.f17175c[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17176e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = k1Var.f17175c[i15];
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
                    TextView textView2 = k1Var.f17175c[i15];
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f19, f20, k1Var.f17176e));
                    k1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17176e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f21, f22, k1Var.f17176e));
                }
                return;
            case 16:
                ki.x2 x2Var = (ki.x2) this.f3941c;
                if (this.f3940b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                x2Var.S0 = f23;
                x2Var.l();
                return;
            case 17:
                li.n nVar = (li.n) this.f3941c;
                if (nVar.f19619y != null && (radialProgressView = nVar.E) != null) {
                    if (!this.f3940b) {
                        radialProgressView.setVisibility(4);
                        nVar.f19617w.setVisibility(4);
                    }
                    nVar.f19619y = null;
                    return;
                }
                return;
            case 18:
                if (this.f3940b) {
                    ((og.o) this.f3941c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f3941c;
                if (this.f3940b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                z0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 20:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f3941c;
                boolean z20 = this.f3940b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.f47304a1 = f25;
                g4Var.f47322r0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f47321q0);
                if (!z20) {
                    g4Var.f47322r0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f3941c;
                if (!this.f3940b) {
                    b5Var.setVisibility(4);
                    ab.q qVar3 = ((org.telegram.ui.r4) b5Var).H;
                    if (qVar3.f988a) {
                        qVar3.f988a = false;
                        if (((org.telegram.ui.r4) qVar3.d).getParent() != null) {
                            ((WindowManager) qVar3.f990c).removeView((org.telegram.ui.r4) qVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) qVar3.d;
                        r4Var.F = true;
                        org.telegram.ui.y4 y4Var = r4Var.E;
                        if (y4Var != null) {
                            if (y4Var.f53413g) {
                                y4Var.f53413g = false;
                                y4Var.f53409b.n(y4Var.f53408a, y4Var.f53411e);
                            }
                            r4Var.E = null;
                        }
                        qVar3.d = null;
                        ((ViewGroup) qVar3.f989b).requestDisallowInterceptTouchEvent(false);
                        qVar3.f989b = null;
                        qVar3.f990c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f3941c;
                org.telegram.ui.Cells.x1 x1Var = q1Var.f31018ib;
                int b11 = x1Var.b();
                int i17 = q1Var.f31123qb;
                if (i17 != b11) {
                    q1Var.C0(i17, b11, this.f3940b);
                    return;
                }
                q1Var.f31164tb = false;
                x1Var.f31922b2 = i17;
                return;
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.f3941c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    if (!this.f3940b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.f3941c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    if (!this.f3940b) {
                        q5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                n7 n7Var = (n7) this.f3941c;
                ValueAnimator valueAnimator = n7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f3940b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    n7Var.C0 = f26;
                    n7Var.B0 = null;
                    return;
                }
                return;
            case 26:
                sa saVar2 = (sa) this.f3941c;
                AnimatorSet animatorSet3 = saVar2.f31438f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar2.f31438f = null;
                    if (!this.f3940b) {
                        saVar2.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((ia) this.f3941c).d;
                if (this.f3940b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 28:
                ad adVar = (ad) this.f3941c;
                if (adVar.f45017r != null && (xcVar = adVar.f45012n) != null) {
                    if (this.f3940b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.f45019s.setVisibility(4);
                    }
                    adVar.f45017r = null;
                    return;
                }
                return;
            default:
                an anVar = (an) this.f3941c;
                AnimatorSet animatorSet4 = anVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f3940b) {
                        anVar.J0.setVisibility(4);
                        return;
                    }
                    if (anVar.F0) {
                        view = anVar.G0;
                    } else {
                        view = anVar.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3939a) {
            case 2:
                super.onAnimationStart(animator);
                try {
                    ((fi.q) this.f3941c).performHapticFeedback(3);
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
