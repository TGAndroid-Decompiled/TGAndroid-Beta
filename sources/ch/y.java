package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import bi.q1;
import di.g2;
import di.j4;
import di.q9;
import fi.b4;
import fi.f3;
import fi.l8;
import fi.o5;
import fi.va;
import hi.a3;
import jg.l1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u61;
import org.telegram.ui.b5;
import org.telegram.ui.bd;
import org.telegram.ui.cn;
import org.telegram.ui.g4;
import org.telegram.ui.ia;
import org.telegram.ui.r4;
import org.telegram.ui.rn;
import org.telegram.ui.y4;
import org.telegram.ui.yc;
public final class y extends AnimatorListenerAdapter {
    public final int f6414a;
    public final boolean f6415b;
    public final Object f6416c;

    public y(int i7, Object obj, boolean z9) {
        this.f6414a = i7;
        this.f6416c = obj;
        this.f6415b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f6414a) {
            case 15:
                ((ii.p) this.f6416c).f15592y = null;
                return;
            case 22:
                h2 h2Var = (h2) this.f6416c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f6416c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    return;
                }
                return;
            case 25:
                ta taVar = (ta) this.f6416c;
                AnimatorSet animatorSet3 = taVar.f30563f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f30563f = null;
                    return;
                }
                return;
            case 27:
                ((bd) this.f6416c).f44030r = null;
                return;
            case 28:
                cn cnVar = (cn) this.f6416c;
                AnimatorSet animatorSet4 = cnVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    cnVar.V0 = null;
                    return;
                }
                return;
            case 29:
                ((rn) this.f6416c).h = null;
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
        RadialProgressView radialProgressView;
        float f19;
        boolean z9;
        int i10;
        float f20;
        float f21;
        boolean z10;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        int i11;
        yc ycVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f6414a) {
            case 0:
                b0 b0Var = (b0) this.f6416c;
                ii0 ii0Var = b0Var.f6197n;
                b0Var.k();
                b0Var.l();
                boolean z11 = this.f6415b;
                b0.a(b0Var, z11);
                b0Var.f6196m.invalidateOutline();
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f6193j = f10;
                boolean z12 = true;
                if (z11) {
                    b0Var.f6194k = true;
                    b0Var.f6186a.invalidate();
                }
                ii0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f6193j, 1.0f, 0.0f));
                if (!z11) {
                    ii0Var.setImportantForAccessibility(0);
                    ii0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f6207y;
                    ii0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 1:
                di.q qVar = (di.q) this.f6416c;
                if (this.f6415b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f9537d0 = f11;
                qVar.b();
                return;
            case 2:
                g2 g2Var = (g2) this.f6416c;
                q1 q1Var = g2Var.f9810c;
                float f27 = 0.0f;
                boolean z13 = this.f6415b;
                if (z13) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                q1Var.setAlpha(f12);
                View view2 = g2Var.f9806a;
                if (!z13) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                g2Var.invalidate();
                return;
            case 3:
                q9 q9Var = (q9) this.f6416c;
                q9Var.I0.e();
                if (this.f6415b) {
                    f13 = q9Var.f9650x.f9791c;
                } else {
                    f13 = 0.0f;
                }
                q9Var.f9611e0 = f13;
                j4 currentPeerView = q9Var.f9629n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                q9Var.f9648w.invalidate();
                q9Var.f9645u1 = null;
                return;
            case 4:
                ei.r rVar = (ei.r) this.f6416c;
                float f28 = 0.0f;
                boolean z14 = this.f6415b;
                if (z14) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                rVar.f10858x = f14;
                u61 u61Var = rVar.f10855r;
                if (z14) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                u61Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                ei.a aVar = rVar.f10854n;
                if (z14) {
                    f28 = 42.0f;
                }
                aVar.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 5:
                ei.n nVar = (ei.n) this.f6416c;
                p41 p41Var = nVar.h;
                ei.f fVar = nVar.f10838f;
                ei.i iVar = nVar.f10842w;
                nVar.f10835b = false;
                boolean z15 = this.f6415b;
                if (z15) {
                    int i13 = nVar.f10837e;
                    nVar.d = i13;
                    nVar.W.D = i13;
                    iz.F(i13);
                }
                int b10 = iVar.b();
                if (z15) {
                    p41Var.y1(nVar.d);
                    fVar.a0();
                    if (iVar.b() == b10) {
                        org.telegram.messenger.g0.b4(fVar);
                    } else {
                        iVar.f();
                    }
                }
                nVar.f10840r.setVisibility(8);
                int i14 = nVar.S;
                if (i14 >= 0) {
                    if (z15 && (m10 = nVar.f10841s.m(i14)) != null) {
                        nVar.T = m10.getTop();
                    }
                    p41Var.h1(nVar.S, (-fVar.getPaddingTop()) + nVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                fi.d dVar = (fi.d) this.f6416c;
                if (this.f6415b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.P = f16;
                dVar.invalidate();
                return;
            case 7:
                fi.m mVar = (fi.m) this.f6416c;
                boolean z16 = this.f6415b;
                if (!z16) {
                    mVar.f12380r.setVisibility(8);
                    fi.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z16) {
                    mVar.f12367f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z16);
                return;
            case 8:
                fi.y yVar = (fi.y) this.f6416c;
                fi.v vVar = yVar.f13107a;
                boolean z17 = this.f6415b;
                if (z17) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                yVar.d = f17;
                vVar.invalidate();
                if (z17) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                vVar.setVisibility(i7);
                return;
            case 9:
                if (!this.f6415b) {
                    ((f3) this.f6416c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f6415b) {
                    ((b4) this.f6416c).f11672b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                o5 o5Var = (o5) this.f6416c;
                if (!this.f6415b) {
                    o5Var.I1.setVisibility(8);
                    o5Var.I1.n();
                    return;
                }
                return;
            case 12:
                l8 l8Var = (l8) this.f6416c;
                if (this.f6415b) {
                    l8Var.setVisibility(8);
                }
                l8Var.f12347c = null;
                return;
            case 13:
                va vaVar = (va) this.f6416c;
                if (!this.f6415b) {
                    vaVar.V0.setVisibility(8);
                }
                vaVar.f12957f2 = null;
                return;
            case 14:
                a3 a3Var = (a3) this.f6416c;
                if (this.f6415b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a3Var.R0 = f18;
                a3Var.l();
                return;
            case 15:
                ii.p pVar = (ii.p) this.f6416c;
                if (pVar.f15592y != null && (radialProgressView = pVar.D) != null) {
                    if (!this.f6415b) {
                        radialProgressView.setVisibility(4);
                        pVar.f15590w.setVisibility(4);
                    }
                    pVar.f15592y = null;
                    return;
                }
                return;
            case 16:
                l1 l1Var = (l1) this.f6416c;
                boolean z18 = this.f6415b;
                if (z18) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                l1Var.f16834e = f19;
                l1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    l1Var.f16833c[i15].setTranslationX(org.telegram.messenger.g0.W1(l1Var.f16834e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = l1Var.f16833c[i15];
                    if (i15 == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i16 = 8;
                    if (z9 == z18) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    TextView textView2 = l1Var.f16833c[i15];
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f20, f21, l1Var.f16834e));
                    l1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(l1Var.f16834e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView3 = l1Var.d[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 == z18) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = l1Var.d[i15];
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
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f22, f23, l1Var.f16834e));
                }
                return;
            case 17:
                if (this.f6415b) {
                    ((og.o) this.f6416c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                z0 z0Var = (z0) this.f6416c;
                if (this.f6415b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                z0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 19:
                g4 g4Var = (g4) this.f6416c;
                boolean z19 = this.f6415b;
                if (z19) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.Z0 = f25;
                g4Var.f45967q0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f45966p0);
                if (!z19) {
                    g4Var.f45967q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                b5 b5Var = (b5) this.f6416c;
                if (!this.f6415b) {
                    b5Var.setVisibility(4);
                    ab.q qVar2 = ((r4) b5Var).G;
                    if (qVar2.f989a) {
                        qVar2.f989a = false;
                        if (((r4) qVar2.d).getParent() != null) {
                            ((WindowManager) qVar2.f991c).removeView((r4) qVar2.d);
                        }
                        r4 r4Var = (r4) qVar2.d;
                        r4Var.E = true;
                        y4 y4Var = r4Var.D;
                        if (y4Var != null) {
                            if (y4Var.f51890g) {
                                y4Var.f51890g = false;
                                y4Var.f51886b.n(y4Var.f51885a, y4Var.f51888e);
                            }
                            r4Var.D = null;
                        }
                        qVar2.d = null;
                        ((ViewGroup) qVar2.f990b).requestDisallowInterceptTouchEvent(false);
                        qVar2.f990b = null;
                        qVar2.f991c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f6416c;
                x1 x1Var = q1Var2.f29887hb;
                int b11 = x1Var.b();
                int i17 = q1Var2.f29984pb;
                if (i17 != b11) {
                    q1Var2.C0(i17, b11, this.f6415b);
                    return;
                }
                q1Var2.f30023sb = false;
                x1Var.f30788b2 = i17;
                return;
            case 22:
                h2 h2Var = (h2) this.f6416c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    if (!this.f6415b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f6416c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    if (!this.f6415b) {
                        q5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                o7 o7Var = (o7) this.f6416c;
                ValueAnimator valueAnimator = o7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f6415b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    o7Var.B0 = f26;
                    o7Var.A0 = null;
                    return;
                }
                return;
            case 25:
                ta taVar = (ta) this.f6416c;
                AnimatorSet animatorSet3 = taVar.f30563f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f30563f = null;
                    if (!this.f6415b) {
                        taVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((ia) this.f6416c).d;
                if (this.f6415b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 27:
                bd bdVar = (bd) this.f6416c;
                if (bdVar.f44030r != null && (ycVar = bdVar.f44025n) != null) {
                    if (this.f6415b) {
                        ycVar.setVisibility(4);
                    } else {
                        bdVar.f44032s.setVisibility(4);
                    }
                    bdVar.f44030r = null;
                    return;
                }
                return;
            case 28:
                cn cnVar = (cn) this.f6416c;
                AnimatorSet animatorSet4 = cnVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f6415b) {
                        cnVar.I0.setVisibility(4);
                        return;
                    }
                    if (cnVar.E0) {
                        view = cnVar.F0;
                    } else {
                        view = cnVar.D0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                rn rnVar = (rn) this.f6416c;
                if (rnVar.h != null && (radialProgressView2 = rnVar.f49464n) != null) {
                    if (!this.f6415b) {
                        radialProgressView2.setVisibility(4);
                        rnVar.f49456f.setVisibility(4);
                    }
                    rnVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f6414a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((di.q) this.f6416c).performHapticFeedback(3);
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
