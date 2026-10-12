package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import bi.b2;
import bi.h3;
import bi.q5;
import bi.sb;
import bi.t1;
import di.kc;
import di.o6;
import di.s4;
import di.v3;
import di.v9;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.d5;
import org.telegram.ui.fo;
import org.telegram.ui.g5;
import org.telegram.ui.k4;
import org.telegram.ui.pd;
import org.telegram.ui.sa;
import org.telegram.ui.sd;
import org.telegram.ui.w4;
public final class p0 extends AnimatorListenerAdapter {
    public final int f840a;
    public final boolean f841b;
    public final Object f842c;

    public p0(int i10, Object obj, boolean z10) {
        this.f840a = i10;
        this.f842c = obj;
        this.f841b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f840a) {
            case 16:
                ((gi.p) this.f842c).f10234w = null;
                return;
            case 23:
                f2 f2Var = (f2) this.f842c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 24:
                t5 t5Var = (t5) this.f842c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    return;
                }
                return;
            case 26:
                bb bbVar = (bb) this.f842c;
                AnimatorSet animatorSet3 = bbVar.f20998f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f20998f = null;
                    return;
                }
                return;
            case 28:
                ((sd) this.f842c).f40079n = null;
                return;
            case 29:
                fo foVar = (fo) this.f842c;
                AnimatorSet animatorSet4 = foVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    foVar.H0 = null;
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
        t1 t1Var;
        float f12;
        float f13;
        float f14;
        View m10;
        float f15;
        float f16;
        int i10;
        float f17;
        RadialProgressView radialProgressView;
        float f18;
        boolean z10;
        int i11;
        float f19;
        float f20;
        boolean z11;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        int i12;
        pd pdVar;
        View view;
        switch (this.f840a) {
            case 0:
                t0 t0Var = (t0) this.f842c;
                gl0 gl0Var = t0Var.f874n;
                t0Var.k();
                t0Var.l();
                boolean z12 = this.f841b;
                t0.a(t0Var, z12);
                t0Var.f873m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t0Var.f870j = f7;
                boolean z13 = true;
                if (z12) {
                    t0Var.f871k = true;
                    t0Var.f864a.invalidate();
                }
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f870j, 1.0f, 0.0f));
                if (!z12) {
                    gl0Var.setImportantForAccessibility(0);
                    gl0Var.setSkipDraw(false);
                    t0Var.f();
                    Runtime.getRuntime().gc();
                    int i13 = t0Var.f884y;
                    gl0Var.setCustomEmojiReactionsBackground((i13 == 4 || i13 == 5) ? false : false);
                }
                t0Var.C = false;
                return;
            case 1:
                bi.v vVar = (bi.v) this.f842c;
                if (this.f841b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                vVar.f3817d0 = f10;
                vVar.b();
                return;
            case 2:
                h3 h3Var = (h3) this.f842c;
                bi.o0 o0Var = h3Var.f3054c;
                float f26 = 0.0f;
                boolean z14 = this.f841b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                o0Var.setAlpha(f11);
                View view2 = h3Var.f3050a;
                if (!z14) {
                    f26 = 0.5f;
                }
                view2.setAlpha(f26);
                h3Var.invalidate();
                return;
            case 3:
                b2 b2Var = (b2) this.f842c;
                b2Var.f2854b.removeViewImmediate(b2Var.d);
                b2Var.f2856f.b();
                if (this.f841b && (t1Var = b2Var.v) != null && t1Var != t1.W) {
                    t1Var.e();
                }
                b2Var.v = null;
                b2Var.f2859s = true;
                b2Var.G = null;
                b2Var.E = false;
                return;
            case 4:
                sb sbVar = (sb) this.f842c;
                sbVar.J0.unlock();
                if (this.f841b) {
                    f12 = sbVar.f3709w.f2990c;
                } else {
                    f12 = 0.0f;
                }
                sbVar.f3671e0 = f12;
                q5 currentPeerView = sbVar.f3689n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                sbVar.v.invalidate();
                sbVar.f3708v1 = null;
                return;
            case 5:
                ci.y yVar = (ci.y) this.f842c;
                float f27 = 0.0f;
                boolean z15 = this.f841b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yVar.f4803w = f13;
                j91 j91Var = yVar.f4801r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                j91Var.setTranslationY(AndroidUtilities.dp(f14));
                ci.a aVar = yVar.f4800n;
                if (z15) {
                    f27 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f27));
                return;
            case 6:
                ci.t tVar = (ci.t) this.f842c;
                ci.h hVar = tVar.h;
                ci.i iVar = tVar.f4783f;
                ci.l lVar = tVar.v;
                tVar.f4781b = false;
                boolean z16 = this.f841b;
                if (z16) {
                    int i14 = tVar.e;
                    tVar.d = i14;
                    tVar.W.f4805y = i14;
                    SharedConfig.setStoriesColumnsCount(i14);
                }
                int h = lVar.h();
                if (z16) {
                    hVar.y1(tVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                tVar.f4785r.setVisibility(8);
                int i15 = tVar.S;
                if (i15 >= 0) {
                    if (z16 && (m10 = tVar.f4786s.m(i15)) != null) {
                        tVar.T = m10.getTop();
                    }
                    hVar.h1(tVar.S, (-iVar.getPaddingTop()) + tVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                di.d dVar = (di.d) this.f842c;
                if (this.f841b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.M = f15;
                dVar.invalidate();
                return;
            case 8:
                di.m mVar = (di.m) this.f842c;
                boolean z17 = this.f841b;
                if (!z17) {
                    mVar.f7395r.setVisibility(8);
                    di.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f7382f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                di.y yVar2 = (di.y) this.f842c;
                di.v vVar2 = yVar2.f8112a;
                boolean z18 = this.f841b;
                if (z18) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                yVar2.d = f16;
                vVar2.invalidate();
                if (z18) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vVar2.setVisibility(i10);
                return;
            case 10:
                if (!this.f841b) {
                    ((v3) this.f842c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f841b) {
                    ((s4) this.f842c).f7753b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                o6 o6Var = (o6) this.f842c;
                if (!this.f841b) {
                    o6Var.Z1.setVisibility(8);
                    o6Var.Z1.n();
                    return;
                }
                return;
            case 13:
                v9 v9Var = (v9) this.f842c;
                if (this.f841b) {
                    v9Var.setVisibility(8);
                }
                v9Var.f8013c = null;
                return;
            case 14:
                kc kcVar = (kc) this.f842c;
                if (!this.f841b) {
                    kcVar.V0.setVisibility(8);
                }
                kcVar.f7254f2 = null;
                return;
            case 15:
                k3 k3Var = (k3) this.f842c;
                if (this.f841b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                k3Var.N0 = f17;
                k3Var.h();
                return;
            case 16:
                gi.p pVar = (gi.p) this.f842c;
                if (pVar.f10234w != null && (radialProgressView = pVar.f10235x) != null) {
                    if (!this.f841b) {
                        radialProgressView.setVisibility(4);
                        pVar.f10233s.setVisibility(4);
                    }
                    pVar.f10234w = null;
                    return;
                }
                return;
            case 17:
                hg.m1 m1Var = (hg.m1) this.f842c;
                boolean z19 = this.f841b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m1Var.e = f18;
                m1Var.invalidate();
                for (int i16 = 0; i16 < 2; i16++) {
                    m1Var.f10672c[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    TextView textView = m1Var.f10672c[i16];
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
                    TextView textView2 = m1Var.f10672c[i16];
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
            case 18:
                if (this.f841b) {
                    ((mg.p) this.f842c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f842c;
                if (this.f841b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                e1Var.setTextColor(i0.a.d(f23, -1, -9194260));
                e1Var.setIconColor(i0.a.d(f23, -1, -9194260));
                return;
            case 20:
                k4 k4Var = (k4) this.f842c;
                boolean z20 = this.f841b;
                if (z20) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                k4Var.Y0 = f24;
                k4Var.f37553q0.setTranslationY(((1.0f - f24) * AndroidUtilities.dp(51.0f)) + k4Var.f37552p0);
                if (!z20) {
                    k4Var.f37553q0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                g5 g5Var = (g5) this.f842c;
                if (!this.f841b) {
                    g5Var.setVisibility(4);
                    c2.b bVar = ((w4) g5Var).G;
                    if (bVar.f4118a) {
                        bVar.f4118a = false;
                        if (((w4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.f4120c).removeView((w4) bVar.d);
                        }
                        w4 w4Var = (w4) bVar.d;
                        w4Var.E = true;
                        d5 d5Var = w4Var.f36313y;
                        if (d5Var != null) {
                            if (d5Var.f35150g) {
                                d5Var.f35150g = false;
                                d5Var.f35147b.removeObserver(d5Var.f35146a, d5Var.e);
                            }
                            w4Var.f36313y = null;
                        }
                        bVar.d = null;
                        ((ViewGroup) bVar.f4119b).requestDisallowInterceptTouchEvent(false);
                        bVar.f4119b = null;
                        bVar.f4120c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                u1 u1Var = (u1) this.f842c;
                org.telegram.ui.Cells.t1 t1Var2 = u1Var.Zc;
                int g10 = t1Var2.g();
                int i18 = u1Var.f22248hd;
                if (i18 != g10) {
                    u1Var.t1(i18, g10, this.f841b);
                    return;
                }
                u1Var.f22291kd = false;
                t1Var2.a2 = i18;
                return;
            case 23:
                f2 f2Var = (f2) this.f842c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f841b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                t5 t5Var = (t5) this.f842c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.f841b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                t7 t7Var = (t7) this.f842c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f841b) {
                        f25 = 1.0f;
                    } else {
                        f25 = 0.0f;
                    }
                    t7Var.B0 = f25;
                    t7Var.A0 = null;
                    return;
                }
                return;
            case 26:
                bb bbVar = (bb) this.f842c;
                AnimatorSet animatorSet3 = bbVar.f20998f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f20998f = null;
                    if (!this.f841b) {
                        bbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((sa) this.f842c).d;
                if (this.f841b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 28:
                sd sdVar = (sd) this.f842c;
                if (sdVar.f40079n != null && (pdVar = sdVar.h) != null) {
                    if (this.f841b) {
                        pdVar.setVisibility(4);
                    } else {
                        sdVar.f40084r.setVisibility(4);
                    }
                    sdVar.f40079n = null;
                    return;
                }
                return;
            default:
                fo foVar = (fo) this.f842c;
                AnimatorSet animatorSet4 = foVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f841b) {
                        foVar.G0.setVisibility(4);
                        return;
                    }
                    if (foVar.C0) {
                        view = foVar.D0;
                    } else {
                        view = foVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f840a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((bi.v) this.f842c).performHapticFeedback(3);
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
