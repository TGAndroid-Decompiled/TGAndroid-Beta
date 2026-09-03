package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import nh.d4;
import nh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.wv;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import org.telegram.ui.md;
import org.telegram.ui.n4;
import org.telegram.ui.oa;
import org.telegram.ui.pd;
import org.telegram.ui.ro;
import org.telegram.ui.w4;
import org.telegram.ui.zn;
public final class w2 extends AnimatorListenerAdapter {
    public final int f4845a;
    public boolean f4846b;
    public final Object f4847c;

    public w2(int i10, Object obj, boolean z4) {
        this.f4845a = i10;
        this.f4847c = obj;
        this.f4846b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4845a) {
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f4847c;
                AnimatorSet animatorSet = d2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.O = null;
                    return;
                }
                return;
            case 15:
                s5 s5Var = (s5) this.f4847c;
                AnimatorSet animatorSet2 = s5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.G = null;
                    return;
                }
                return;
            case 16:
            case 18:
            case 23:
            default:
                super.onAnimationCancel(animator);
                return;
            case 17:
                xa xaVar = (xa) this.f4847c;
                AnimatorSet animatorSet3 = xaVar.f22566f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xaVar.f22566f = null;
                    return;
                }
                return;
            case 19:
                ((pd) this.f4847c).f37091n = null;
                return;
            case 20:
                zn znVar = (zn) this.f4847c;
                AnimatorSet animatorSet4 = znVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    znVar.E0 = null;
                    return;
                }
                return;
            case 21:
                ((ro) this.f4847c).h = null;
                return;
            case 22:
                v9 v9Var = (v9) this.f4847c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v9Var.h = null;
                    return;
                }
                return;
            case 24:
                ((li) this.f4847c).V0 = null;
                return;
            case 25:
                this.f4846b = true;
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        float f12;
        float f13;
        nh.e1 e1Var;
        float f14;
        float f15;
        float f16;
        View m9;
        float f17;
        float f18;
        float f19;
        int i10;
        md mdVar;
        View view;
        RadialProgressView radialProgressView;
        float f20;
        float f21;
        float f22;
        switch (this.f4845a) {
            case 0:
                x2 x2Var = (x2) this.f4847c;
                ((cg.p) x2Var).f2473y.f2346n.d();
                if (this.f4846b) {
                    x2Var.f4858w.accept(Integer.valueOf(x2Var.f4857s));
                }
                if (x2Var.getParent() != null) {
                    ((ViewGroup) x2Var.getParent()).removeView(x2Var);
                    return;
                }
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f4847c;
                if (this.f4846b) {
                    limitPreviewView.f23074g0 = false;
                }
                Runnable runnable = limitPreviewView.f23075h0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f23075h0.run();
                    return;
                }
                return;
            case 2:
                eg.c1 c1Var = (eg.c1) this.f4847c;
                if (this.f4846b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                c1Var.J = f10;
                c1Var.d.invalidate();
                eg.a1 a1Var = c1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 3:
                mg.d0 d0Var = (mg.d0) this.f4847c;
                pk0 pk0Var = d0Var.f13970n;
                d0Var.k();
                d0Var.l();
                boolean z4 = this.f4846b;
                mg.d0.a(d0Var, z4);
                d0Var.f13969m.invalidateOutline();
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                d0Var.f13966j = f11;
                boolean z10 = true;
                if (z4) {
                    d0Var.f13967k = true;
                    d0Var.f13960a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13966j, 1.0f, 0.0f));
                if (!z4) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = d0Var.f13980y;
                    pk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                d0Var.C = false;
                return;
            case 4:
                nh.q qVar = (nh.q) this.f4847c;
                if (this.f4846b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                qVar.f15736a0 = f12;
                qVar.b();
                return;
            case 5:
                nh.g2 g2Var = (nh.g2) this.f4847c;
                lh.e1 e1Var2 = g2Var.f15953c;
                boolean z11 = this.f4846b;
                float f23 = 0.0f;
                if (z11) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                e1Var2.setAlpha(f13);
                View view2 = g2Var.f15949a;
                if (!z11) {
                    f23 = 0.5f;
                }
                view2.setAlpha(f23);
                g2Var.invalidate();
                return;
            case 6:
                nh.j1 j1Var = (nh.j1) this.f4847c;
                j1Var.f15483b.removeViewImmediate(j1Var.d);
                j1Var.f15485f.b();
                if (this.f4846b && (e1Var = j1Var.v) != null && e1Var != nh.e1.T) {
                    e1Var.e();
                }
                j1Var.v = null;
                j1Var.f15488s = true;
                j1Var.D = null;
                j1Var.B = false;
                return;
            case 7:
                i9 i9Var = (i9) this.f4847c;
                i9Var.G0.unlock();
                if (this.f4846b) {
                    f14 = i9Var.f15475w.f15590c;
                } else {
                    f14 = 0.0f;
                }
                i9Var.f15432b0 = f14;
                d4 currentPeerView = i9Var.f15452k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.f15470s1 = null;
                return;
            case 8:
                oh.v vVar = (oh.v) this.f4847c;
                boolean z12 = this.f4846b;
                float f24 = 0.0f;
                if (z12) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                vVar.f16602w = f15;
                k81 k81Var = vVar.f16600r;
                if (z12) {
                    f16 = 0.0f;
                } else {
                    f16 = -42.0f;
                }
                k81Var.setTranslationY(AndroidUtilities.dp(f16));
                oh.a aVar = vVar.f16599n;
                if (z12) {
                    f24 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f24));
                return;
            case 9:
                oh.r rVar = (oh.r) this.f4847c;
                oh.h hVar = rVar.h;
                oh.i iVar = rVar.f16584f;
                oh.l lVar = rVar.v;
                rVar.f16582b = false;
                boolean z13 = this.f4846b;
                if (z13) {
                    int i12 = rVar.e;
                    rVar.d = i12;
                    rVar.T.f16604y = i12;
                    SharedConfig.setStoriesColumnsCount(i12);
                }
                int h = lVar.h();
                if (z13) {
                    hVar.y1(rVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar.f16586r.setVisibility(8);
                int i13 = rVar.P;
                if (i13 >= 0) {
                    if (z13 && (m9 = rVar.f16587s.m(i13)) != null) {
                        rVar.Q = m9.getTop();
                    }
                    hVar.h1(rVar.P, (-iVar.getPaddingTop()) + rVar.Q);
                }
                super.onAnimationEnd(animator);
                return;
            case 10:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f4847c;
                if (this.f4846b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f17, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f17, -1, -9194260));
                return;
            case 11:
                n4 n4Var = (n4) this.f4847c;
                boolean z14 = this.f4846b;
                if (z14) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                n4Var.V0 = f18;
                n4Var.f36371n0.setTranslationY(((1.0f - f18) * AndroidUtilities.dp(51.0f)) + n4Var.m0);
                if (!z14) {
                    n4Var.f36371n0.setVisibility(8);
                    return;
                }
                return;
            case 12:
                g5 g5Var = (g5) this.f4847c;
                if (!this.f4846b) {
                    g5Var.setVisibility(4);
                    cb.m mVar = ((w4) g5Var).D;
                    if (mVar.f2255a) {
                        mVar.f2255a = false;
                        if (((w4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.f2257c).removeView((w4) mVar.d);
                        }
                        w4 w4Var = (w4) mVar.d;
                        w4Var.B = true;
                        d5 d5Var = w4Var.f34326y;
                        if (d5Var != null) {
                            if (d5Var.f33327g) {
                                d5Var.f33327g = false;
                                d5Var.f33324b.removeObserver(d5Var.f33323a, d5Var.e);
                            }
                            w4Var.f34326y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.f2256b).requestDisallowInterceptTouchEvent(false);
                        mVar.f2256b = null;
                        mVar.f2257c = null;
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4847c;
                org.telegram.ui.Cells.r1 r1Var = s1Var.Wc;
                int g10 = r1Var.g();
                int i14 = s1Var.f21974ed;
                if (i14 != g10) {
                    s1Var.t1(i14, g10, this.f4846b);
                    return;
                }
                s1Var.f22018hd = false;
                r1Var.a2 = i14;
                return;
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f4847c;
                AnimatorSet animatorSet = d2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.O = null;
                    if (!this.f4846b) {
                        d2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                s5 s5Var = (s5) this.f4847c;
                AnimatorSet animatorSet2 = s5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.G = null;
                    if (!this.f4846b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                q7 q7Var = (q7) this.f4847c;
                ValueAnimator valueAnimator = q7Var.f21729x0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f4846b) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    q7Var.f21731y0 = f19;
                    q7Var.f21729x0 = null;
                    return;
                }
                return;
            case 17:
                xa xaVar = (xa) this.f4847c;
                AnimatorSet animatorSet3 = xaVar.f22566f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xaVar.f22566f = null;
                    if (!this.f4846b) {
                        xaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ImageView imageView = ((oa) this.f4847c).d;
                if (this.f4846b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
            case 19:
                pd pdVar = (pd) this.f4847c;
                if (pdVar.f37091n != null && (mdVar = pdVar.h) != null) {
                    if (this.f4846b) {
                        mdVar.setVisibility(4);
                    } else {
                        pdVar.f37096r.setVisibility(4);
                    }
                    pdVar.f37091n = null;
                    return;
                }
                return;
            case 20:
                zn znVar = (zn) this.f4847c;
                AnimatorSet animatorSet4 = znVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f4846b) {
                        znVar.D0.setVisibility(4);
                        return;
                    }
                    if (znVar.f40827z0) {
                        view = znVar.A0;
                    } else {
                        view = znVar.f40814y0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 21:
                ro roVar = (ro) this.f4847c;
                if (roVar.h != null && (radialProgressView = roVar.f37916n) != null) {
                    if (!this.f4846b) {
                        radialProgressView.setVisibility(4);
                        roVar.f37908f.setVisibility(4);
                    }
                    roVar.h = null;
                    return;
                }
                return;
            case 22:
                v9 v9Var = (v9) this.f4847c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f4846b) {
                        v9Var.f29412c.setVisibility(4);
                        return;
                    } else {
                        v9Var.f29411b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 23:
                rc rcVar = (rc) this.f4847c;
                if (animator == rcVar.f28454g) {
                    rcVar.f28454g = null;
                    if (this.f4846b) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    rcVar.f28455i = f20;
                    rcVar.b();
                    return;
                }
                return;
            case 24:
                li liVar = (li) this.f4847c;
                if (liVar.V0 != null) {
                    if (this.f4846b) {
                        if (liVar.P0) {
                            di diVar = liVar.f26744v0;
                            if (diVar == null || diVar.I()) {
                                liVar.f26742u1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.f26682b1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (liVar.N0 != 0 || !liVar.f26719n1) {
                        liVar.X0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                eo eoVar = (eo) this.f4847c;
                if (!this.f4846b) {
                    p9 p9Var = eoVar.h;
                    eoVar.h = eoVar.f24658n;
                    eoVar.f24658n = p9Var;
                    p9Var.setVisibility(8);
                    eoVar.f24658n.setAlpha(0.0f);
                    eoVar.h.setVisibility(0);
                    eoVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 26:
                boolean z15 = this.f4846b;
                oo ooVar = (oo) this.f4847c;
                if (animator == ooVar.e) {
                    if (z15) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    ooVar.d = f21;
                    ooVar.setShown(f21);
                    if (!z15) {
                        ooVar.setVisibility(8);
                    }
                    ooVar.a(true);
                    return;
                }
                return;
            case 27:
                jp jpVar = (jp) this.f4847c;
                if (this.f4846b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                jpVar.f26011d0 = f22;
                jpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * jpVar.f26011d0);
                return;
            case 28:
                if (!this.f4846b) {
                    ((jq) this.f4847c).E.setVisibility(8);
                    return;
                }
                return;
            default:
                sv svVar = (sv) this.f4847c;
                wv wvVar = svVar.G;
                if (wvVar.R && !svVar.h) {
                    if (!this.f4846b && !svVar.f28820n) {
                        svVar.setBackground(null);
                        return;
                    } else if (svVar.getBackground() == null) {
                        svVar.setBackground(j6.Y(wvVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4845a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((nh.q) this.f4847c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public w2(eo eoVar) {
        this.f4845a = 25;
        this.f4847c = eoVar;
    }
}
