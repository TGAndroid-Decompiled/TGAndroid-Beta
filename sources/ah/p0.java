package ah;

import ai.u1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ci.m2;
import ci.o1;
import ci.p4;
import ci.z9;
import ei.f6;
import ei.i9;
import ei.l4;
import ei.q3;
import ei.vb;
import gi.d3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import org.telegram.ui.jd;
import org.telegram.ui.k4;
import org.telegram.ui.md;
import org.telegram.ui.pa;
import org.telegram.ui.sn;
import org.telegram.ui.w4;
public final class p0 extends AnimatorListenerAdapter {
    public final int f845a;
    public final boolean f846b;
    public final Object f847c;

    public p0(int i10, Object obj, boolean z10) {
        this.f845a = i10;
        this.f847c = obj;
        this.f846b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f845a) {
            case 17:
                ((hi.o) this.f847c).f12230x = null;
                return;
            case 23:
                e2 e2Var = (e2) this.f847c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f847c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    return;
                }
                return;
            case 26:
                ab abVar = (ab) this.f847c;
                AnimatorSet animatorSet3 = abVar.f22111f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    abVar.f22111f = null;
                    return;
                }
                return;
            case 28:
                ((md) this.f847c).f39495r = null;
                return;
            case 29:
                sn snVar = (sn) this.f847c;
                AnimatorSet animatorSet4 = snVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    snVar.T0 = null;
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
        float f7;
        float f10;
        float f11;
        ci.h1 h1Var;
        float f12;
        float f13;
        float f14;
        View m10;
        float f15;
        float f16;
        int i10;
        float f17;
        float f18;
        boolean z10;
        int i11;
        float f19;
        float f20;
        boolean z11;
        float f21;
        float f22;
        RadialProgressView radialProgressView;
        float f23;
        float f24;
        float f25;
        int i12;
        jd jdVar;
        View view;
        switch (this.f845a) {
            case 0:
                t0 t0Var = (t0) this.f847c;
                gl0 gl0Var = t0Var.f879n;
                t0Var.k();
                t0Var.l();
                boolean z12 = this.f846b;
                t0.a(t0Var, z12);
                t0Var.f878m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t0Var.f875j = f7;
                boolean z13 = true;
                if (z12) {
                    t0Var.f876k = true;
                    t0Var.f869a.invalidate();
                }
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f875j, 1.0f, 0.0f));
                if (!z12) {
                    gl0Var.setImportantForAccessibility(0);
                    gl0Var.setSkipDraw(false);
                    t0Var.f();
                    Runtime.getRuntime().gc();
                    int i13 = t0Var.f889y;
                    gl0Var.setCustomEmojiReactionsBackground((i13 == 4 || i13 == 5) ? false : false);
                }
                t0Var.C = false;
                return;
            case 1:
                ci.r rVar = (ci.r) this.f847c;
                if (this.f846b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar.f5817d0 = f10;
                rVar.b();
                return;
            case 2:
                m2 m2Var = (m2) this.f847c;
                u1 u1Var = m2Var.f6083c;
                float f26 = 0.0f;
                boolean z14 = this.f846b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                u1Var.setAlpha(f11);
                View view2 = m2Var.f6079a;
                if (!z14) {
                    f26 = 0.5f;
                }
                view2.setAlpha(f26);
                m2Var.invalidate();
                return;
            case 3:
                o1 o1Var = (o1) this.f847c;
                o1Var.f5618b.removeViewImmediate(o1Var.d);
                o1Var.f5620f.b();
                if (this.f846b && (h1Var = o1Var.v) != null && h1Var != ci.h1.W) {
                    h1Var.e();
                }
                o1Var.v = null;
                o1Var.f5623s = true;
                o1Var.G = null;
                o1Var.E = false;
                return;
            case 4:
                z9 z9Var = (z9) this.f847c;
                z9Var.J0.unlock();
                if (this.f846b) {
                    f12 = z9Var.f6269w.f5180c;
                } else {
                    f12 = 0.0f;
                }
                z9Var.f6231e0 = f12;
                p4 currentPeerView = z9Var.f6249n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                z9Var.v.invalidate();
                z9Var.f6268v1 = null;
                return;
            case 5:
                di.v vVar = (di.v) this.f847c;
                float f27 = 0.0f;
                boolean z15 = this.f846b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                vVar.f8082w = f13;
                k91 k91Var = vVar.f8080r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                k91Var.setTranslationY(AndroidUtilities.dp(f14));
                di.a aVar = vVar.f8079n;
                if (z15) {
                    f27 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f27));
                return;
            case 6:
                di.r rVar2 = (di.r) this.f847c;
                di.h hVar = rVar2.h;
                di.i iVar = rVar2.f8064f;
                di.l lVar = rVar2.v;
                rVar2.f8062b = false;
                boolean z16 = this.f846b;
                if (z16) {
                    int i14 = rVar2.e;
                    rVar2.d = i14;
                    rVar2.W.f8084y = i14;
                    SharedConfig.setStoriesColumnsCount(i14);
                }
                int h = lVar.h();
                if (z16) {
                    hVar.y1(rVar2.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar2.f8066r.setVisibility(8);
                int i15 = rVar2.S;
                if (i15 >= 0) {
                    if (z16 && (m10 = rVar2.f8067s.m(i15)) != null) {
                        rVar2.T = m10.getTop();
                    }
                    hVar.h1(rVar2.S, (-iVar.getPaddingTop()) + rVar2.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                ei.d dVar = (ei.d) this.f847c;
                if (this.f846b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.P = f15;
                dVar.invalidate();
                return;
            case 8:
                ei.m mVar = (ei.m) this.f847c;
                boolean z17 = this.f846b;
                if (!z17) {
                    mVar.f9423r.setVisibility(8);
                    ei.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f9410f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                ei.y yVar = (ei.y) this.f847c;
                ei.v vVar2 = yVar.f10136a;
                boolean z18 = this.f846b;
                if (z18) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                yVar.d = f16;
                vVar2.invalidate();
                if (z18) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vVar2.setVisibility(i10);
                return;
            case 10:
                if (!this.f846b) {
                    ((q3) this.f847c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f846b) {
                    ((l4) this.f847c).f9376b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                f6 f6Var = (f6) this.f847c;
                if (!this.f846b) {
                    f6Var.Z1.setVisibility(8);
                    f6Var.Z1.n();
                    return;
                }
                return;
            case 13:
                i9 i9Var = (i9) this.f847c;
                if (this.f846b) {
                    i9Var.setVisibility(8);
                }
                i9Var.f9218c = null;
                return;
            case 14:
                vb vbVar = (vb) this.f847c;
                if (!this.f846b) {
                    vbVar.V0.setVisibility(8);
                }
                vbVar.f9984f2 = null;
                return;
            case 15:
                d3 d3Var = (d3) this.f847c;
                if (this.f846b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                d3Var.R0 = f17;
                d3Var.h();
                return;
            case 16:
                hg.m1 m1Var = (hg.m1) this.f847c;
                boolean z19 = this.f846b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m1Var.e = f18;
                m1Var.invalidate();
                for (int i16 = 0; i16 < 2; i16++) {
                    m1Var.f12010c[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    TextView textView = m1Var.f12010c[i16];
                    if (i16 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i17 = 8;
                    if (z10 == z19) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = m1Var.f12010c[i16];
                    if (i16 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i16 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f19, f20, m1Var.e));
                    m1Var.d[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    TextView textView3 = m1Var.d[i16];
                    if (i16 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i17 = 0;
                    }
                    textView3.setVisibility(i17);
                    TextView textView4 = m1Var.d[i16];
                    if (i16 == 0) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (i16 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f21, f22, m1Var.e));
                }
                return;
            case 17:
                hi.o oVar = (hi.o) this.f847c;
                if (oVar.f12230x != null && (radialProgressView = oVar.f12231y) != null) {
                    if (!this.f846b) {
                        radialProgressView.setVisibility(4);
                        oVar.v.setVisibility(4);
                    }
                    oVar.f12230x = null;
                    return;
                }
                return;
            case 18:
                if (this.f846b) {
                    ((mg.p) this.f847c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f847c;
                if (this.f846b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                e1Var.setTextColor(i0.a.f(f23, -1, -9194260));
                e1Var.setIconColor(i0.a.f(f23, -1, -9194260));
                return;
            case 20:
                k4 k4Var = (k4) this.f847c;
                boolean z20 = this.f846b;
                if (z20) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                k4Var.Z0 = f24;
                k4Var.f38801q0.setTranslationY(((1.0f - f24) * AndroidUtilities.dp(51.0f)) + k4Var.f38800p0);
                if (!z20) {
                    k4Var.f38801q0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                g5 g5Var = (g5) this.f847c;
                if (!this.f846b) {
                    g5Var.setVisibility(4);
                    c2.b bVar = ((w4) g5Var).G;
                    if (bVar.f4493a) {
                        bVar.f4493a = false;
                        if (((w4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.f4495c).removeView((w4) bVar.d);
                        }
                        w4 w4Var = (w4) bVar.d;
                        w4Var.E = true;
                        d5 d5Var = w4Var.f37493y;
                        if (d5Var != null) {
                            if (d5Var.f36504g) {
                                d5Var.f36504g = false;
                                d5Var.f36501b.removeObserver(d5Var.f36500a, d5Var.e);
                            }
                            w4Var.f37493y = null;
                        }
                        bVar.d = null;
                        ((ViewGroup) bVar.f4494b).requestDisallowInterceptTouchEvent(false);
                        bVar.f4494b = null;
                        bVar.f4495c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                t1 t1Var = (t1) this.f847c;
                s1 s1Var = t1Var.Zc;
                int g10 = s1Var.g();
                int i18 = t1Var.f23419hd;
                if (i18 != g10) {
                    t1Var.s1(i18, g10, this.f846b);
                    return;
                }
                t1Var.f23462kd = false;
                s1Var.a2 = i18;
                return;
            case 23:
                e2 e2Var = (e2) this.f847c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    if (!this.f846b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f847c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    if (!this.f846b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                s7 s7Var = (s7) this.f847c;
                ValueAnimator valueAnimator = s7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f846b) {
                        f25 = 1.0f;
                    } else {
                        f25 = 0.0f;
                    }
                    s7Var.B0 = f25;
                    s7Var.A0 = null;
                    return;
                }
                return;
            case 26:
                ab abVar = (ab) this.f847c;
                AnimatorSet animatorSet3 = abVar.f22111f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    abVar.f22111f = null;
                    if (!this.f846b) {
                        abVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((pa) this.f847c).d;
                if (this.f846b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 28:
                md mdVar = (md) this.f847c;
                if (mdVar.f39495r != null && (jdVar = mdVar.f39490n) != null) {
                    if (this.f846b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.f39497s.setVisibility(4);
                    }
                    mdVar.f39495r = null;
                    return;
                }
                return;
            default:
                sn snVar = (sn) this.f847c;
                AnimatorSet animatorSet4 = snVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f846b) {
                        snVar.G0.setVisibility(4);
                        return;
                    }
                    if (snVar.C0) {
                        view = snVar.D0;
                    } else {
                        view = snVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f845a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((ci.r) this.f847c).performHapticFeedback(3);
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
