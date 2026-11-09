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
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.v61;
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
    public final int f6409a;
    public final boolean f6410b;
    public final Object f6411c;

    public y(int i7, Object obj, boolean z9) {
        this.f6409a = i7;
        this.f6411c = obj;
        this.f6410b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f6409a) {
            case 15:
                ((ii.p) this.f6411c).f15593y = null;
                return;
            case 22:
                h2 h2Var = (h2) this.f6411c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f6411c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    return;
                }
                return;
            case 25:
                ta taVar = (ta) this.f6411c;
                AnimatorSet animatorSet3 = taVar.f30552f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f30552f = null;
                    return;
                }
                return;
            case 27:
                ((bd) this.f6411c).f44001r = null;
                return;
            case 28:
                cn cnVar = (cn) this.f6411c;
                AnimatorSet animatorSet4 = cnVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    cnVar.V0 = null;
                    return;
                }
                return;
            case 29:
                ((rn) this.f6411c).h = null;
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
        switch (this.f6409a) {
            case 0:
                b0 b0Var = (b0) this.f6411c;
                ji0 ji0Var = b0Var.f6192n;
                b0Var.k();
                b0Var.l();
                boolean z11 = this.f6410b;
                b0.a(b0Var, z11);
                b0Var.f6191m.invalidateOutline();
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f6188j = f10;
                boolean z12 = true;
                if (z11) {
                    b0Var.f6189k = true;
                    b0Var.f6181a.invalidate();
                }
                ji0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f6188j, 1.0f, 0.0f));
                if (!z11) {
                    ji0Var.setImportantForAccessibility(0);
                    ji0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f6202y;
                    ji0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 1:
                di.q qVar = (di.q) this.f6411c;
                if (this.f6410b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f9532d0 = f11;
                qVar.b();
                return;
            case 2:
                g2 g2Var = (g2) this.f6411c;
                q1 q1Var = g2Var.f9805c;
                float f27 = 0.0f;
                boolean z13 = this.f6410b;
                if (z13) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                q1Var.setAlpha(f12);
                View view2 = g2Var.f9801a;
                if (!z13) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                g2Var.invalidate();
                return;
            case 3:
                q9 q9Var = (q9) this.f6411c;
                q9Var.I0.e();
                if (this.f6410b) {
                    f13 = q9Var.f9645x.f9786c;
                } else {
                    f13 = 0.0f;
                }
                q9Var.f9606e0 = f13;
                j4 currentPeerView = q9Var.f9624n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                q9Var.f9643w.invalidate();
                q9Var.f9640u1 = null;
                return;
            case 4:
                ei.r rVar = (ei.r) this.f6411c;
                float f28 = 0.0f;
                boolean z14 = this.f6410b;
                if (z14) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                rVar.f10853x = f14;
                v61 v61Var = rVar.f10850r;
                if (z14) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                v61Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                ei.a aVar = rVar.f10849n;
                if (z14) {
                    f28 = 42.0f;
                }
                aVar.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 5:
                ei.n nVar = (ei.n) this.f6411c;
                p41 p41Var = nVar.h;
                ei.f fVar = nVar.f10833f;
                ei.i iVar = nVar.f10837w;
                nVar.f10830b = false;
                boolean z15 = this.f6410b;
                if (z15) {
                    int i13 = nVar.f10832e;
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
                nVar.f10835r.setVisibility(8);
                int i14 = nVar.S;
                if (i14 >= 0) {
                    if (z15 && (m10 = nVar.f10836s.m(i14)) != null) {
                        nVar.T = m10.getTop();
                    }
                    p41Var.h1(nVar.S, (-fVar.getPaddingTop()) + nVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                fi.d dVar = (fi.d) this.f6411c;
                if (this.f6410b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.P = f16;
                dVar.invalidate();
                return;
            case 7:
                fi.m mVar = (fi.m) this.f6411c;
                boolean z16 = this.f6410b;
                if (!z16) {
                    mVar.f12379r.setVisibility(8);
                    fi.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z16) {
                    mVar.f12366f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z16);
                return;
            case 8:
                fi.y yVar = (fi.y) this.f6411c;
                fi.v vVar = yVar.f13105a;
                boolean z17 = this.f6410b;
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
                if (!this.f6410b) {
                    ((f3) this.f6411c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f6410b) {
                    ((b4) this.f6411c).f11667b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                o5 o5Var = (o5) this.f6411c;
                if (!this.f6410b) {
                    o5Var.I1.setVisibility(8);
                    o5Var.I1.n();
                    return;
                }
                return;
            case 12:
                l8 l8Var = (l8) this.f6411c;
                if (this.f6410b) {
                    l8Var.setVisibility(8);
                }
                l8Var.f12346c = null;
                return;
            case 13:
                va vaVar = (va) this.f6411c;
                if (!this.f6410b) {
                    vaVar.V0.setVisibility(8);
                }
                vaVar.f12955f2 = null;
                return;
            case 14:
                a3 a3Var = (a3) this.f6411c;
                if (this.f6410b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a3Var.R0 = f18;
                a3Var.l();
                return;
            case 15:
                ii.p pVar = (ii.p) this.f6411c;
                if (pVar.f15593y != null && (radialProgressView = pVar.D) != null) {
                    if (!this.f6410b) {
                        radialProgressView.setVisibility(4);
                        pVar.f15591w.setVisibility(4);
                    }
                    pVar.f15593y = null;
                    return;
                }
                return;
            case 16:
                l1 l1Var = (l1) this.f6411c;
                boolean z18 = this.f6410b;
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
                if (this.f6410b) {
                    ((og.o) this.f6411c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                z0 z0Var = (z0) this.f6411c;
                if (this.f6410b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                z0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 19:
                g4 g4Var = (g4) this.f6411c;
                boolean z19 = this.f6410b;
                if (z19) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.Z0 = f25;
                g4Var.f45898q0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f45897p0);
                if (!z19) {
                    g4Var.f45898q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                b5 b5Var = (b5) this.f6411c;
                if (!this.f6410b) {
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
                            if (y4Var.f51854g) {
                                y4Var.f51854g = false;
                                y4Var.f51850b.n(y4Var.f51849a, y4Var.f51852e);
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
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.f6411c;
                x1 x1Var = q1Var2.f29876hb;
                int b11 = x1Var.b();
                int i17 = q1Var2.f29973pb;
                if (i17 != b11) {
                    q1Var2.C0(i17, b11, this.f6410b);
                    return;
                }
                q1Var2.f30012sb = false;
                x1Var.f30777b2 = i17;
                return;
            case 22:
                h2 h2Var = (h2) this.f6411c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    if (!this.f6410b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                q5 q5Var = (q5) this.f6411c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    if (!this.f6410b) {
                        q5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                o7 o7Var = (o7) this.f6411c;
                ValueAnimator valueAnimator = o7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f6410b) {
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
                ta taVar = (ta) this.f6411c;
                AnimatorSet animatorSet3 = taVar.f30552f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f30552f = null;
                    if (!this.f6410b) {
                        taVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((ia) this.f6411c).d;
                if (this.f6410b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 27:
                bd bdVar = (bd) this.f6411c;
                if (bdVar.f44001r != null && (ycVar = bdVar.f43996n) != null) {
                    if (this.f6410b) {
                        ycVar.setVisibility(4);
                    } else {
                        bdVar.f44003s.setVisibility(4);
                    }
                    bdVar.f44001r = null;
                    return;
                }
                return;
            case 28:
                cn cnVar = (cn) this.f6411c;
                AnimatorSet animatorSet4 = cnVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f6410b) {
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
                rn rnVar = (rn) this.f6411c;
                if (rnVar.h != null && (radialProgressView2 = rnVar.f49526n) != null) {
                    if (!this.f6410b) {
                        radialProgressView2.setVisibility(4);
                        rnVar.f49518f.setVisibility(4);
                    }
                    rnVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f6409a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((di.q) this.f6411c).performHapticFeedback(3);
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
