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
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xv;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.kd;
import org.telegram.ui.l4;
import org.telegram.ui.ma;
import org.telegram.ui.nd;
import org.telegram.ui.po;
import org.telegram.ui.u4;
import org.telegram.ui.xn;
public final class w2 extends AnimatorListenerAdapter {
    public final int f4839a;
    public boolean f4840b;
    public final Object f4841c;

    public w2(int i10, Object obj, boolean z4) {
        this.f4839a = i10;
        this.f4841c = obj;
        this.f4840b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4839a) {
            case 14:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f4841c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    return;
                }
                return;
            case 15:
                t5 t5Var = (t5) this.f4841c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
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
                ya yaVar = (ya) this.f4841c;
                AnimatorSet animatorSet3 = yaVar.f22636f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f22636f = null;
                    return;
                }
                return;
            case 19:
                ((nd) this.f4841c).f36592n = null;
                return;
            case 20:
                xn xnVar = (xn) this.f4841c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    xnVar.E0 = null;
                    return;
                }
                return;
            case 21:
                ((po) this.f4841c).h = null;
                return;
            case 22:
                v9 v9Var = (v9) this.f4841c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v9Var.h = null;
                    return;
                }
                return;
            case 24:
                ((li) this.f4841c).V0 = null;
                return;
            case 25:
                this.f4840b = true;
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
        kd kdVar;
        View view;
        RadialProgressView radialProgressView;
        float f20;
        float f21;
        float f22;
        switch (this.f4839a) {
            case 0:
                x2 x2Var = (x2) this.f4841c;
                ((cg.p) x2Var).f2490y.f2363n.d();
                if (this.f4840b) {
                    x2Var.f4852w.accept(Integer.valueOf(x2Var.f4851s));
                }
                if (x2Var.getParent() != null) {
                    ((ViewGroup) x2Var.getParent()).removeView(x2Var);
                    return;
                }
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f4841c;
                if (this.f4840b) {
                    limitPreviewView.f23101g0 = false;
                }
                Runnable runnable = limitPreviewView.f23102h0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f23102h0.run();
                    return;
                }
                return;
            case 2:
                eg.c1 c1Var = (eg.c1) this.f4841c;
                if (this.f4840b) {
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
                mg.d0 d0Var = (mg.d0) this.f4841c;
                pk0 pk0Var = d0Var.f13982n;
                d0Var.k();
                d0Var.l();
                boolean z4 = this.f4840b;
                mg.d0.a(d0Var, z4);
                d0Var.f13981m.invalidateOutline();
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                d0Var.f13978j = f11;
                boolean z10 = true;
                if (z4) {
                    d0Var.f13979k = true;
                    d0Var.f13972a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13978j, 1.0f, 0.0f));
                if (!z4) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = d0Var.f13992y;
                    pk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : false);
                }
                d0Var.C = false;
                return;
            case 4:
                nh.q qVar = (nh.q) this.f4841c;
                if (this.f4840b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                qVar.f15756a0 = f12;
                qVar.b();
                return;
            case 5:
                nh.g2 g2Var = (nh.g2) this.f4841c;
                lh.e1 e1Var2 = g2Var.f15973c;
                boolean z11 = this.f4840b;
                float f23 = 0.0f;
                if (z11) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                e1Var2.setAlpha(f13);
                View view2 = g2Var.f15969a;
                if (!z11) {
                    f23 = 0.5f;
                }
                view2.setAlpha(f23);
                g2Var.invalidate();
                return;
            case 6:
                nh.j1 j1Var = (nh.j1) this.f4841c;
                j1Var.f15503b.removeViewImmediate(j1Var.d);
                j1Var.f15505f.b();
                if (this.f4840b && (e1Var = j1Var.v) != null && e1Var != nh.e1.T) {
                    e1Var.e();
                }
                j1Var.v = null;
                j1Var.f15508s = true;
                j1Var.D = null;
                j1Var.B = false;
                return;
            case 7:
                i9 i9Var = (i9) this.f4841c;
                i9Var.G0.unlock();
                if (this.f4840b) {
                    f14 = i9Var.f15495w.f15610c;
                } else {
                    f14 = 0.0f;
                }
                i9Var.f15452b0 = f14;
                d4 currentPeerView = i9Var.f15472k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.f15490s1 = null;
                return;
            case 8:
                oh.v vVar = (oh.v) this.f4841c;
                boolean z12 = this.f4840b;
                float f24 = 0.0f;
                if (z12) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                vVar.f16622w = f15;
                k81 k81Var = vVar.f16620r;
                if (z12) {
                    f16 = 0.0f;
                } else {
                    f16 = -42.0f;
                }
                k81Var.setTranslationY(AndroidUtilities.dp(f16));
                oh.a aVar = vVar.f16619n;
                if (z12) {
                    f24 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f24));
                return;
            case 9:
                oh.r rVar = (oh.r) this.f4841c;
                oh.h hVar = rVar.h;
                oh.i iVar = rVar.f16604f;
                oh.l lVar = rVar.v;
                rVar.f16602b = false;
                boolean z13 = this.f4840b;
                if (z13) {
                    int i12 = rVar.e;
                    rVar.d = i12;
                    rVar.T.f16624y = i12;
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
                rVar.f16606r.setVisibility(8);
                int i13 = rVar.P;
                if (i13 >= 0) {
                    if (z13 && (m9 = rVar.f16607s.m(i13)) != null) {
                        rVar.Q = m9.getTop();
                    }
                    hVar.h1(rVar.P, (-iVar.getPaddingTop()) + rVar.Q);
                }
                super.onAnimationEnd(animator);
                return;
            case 10:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f4841c;
                if (this.f4840b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f17, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f17, -1, -9194260));
                return;
            case 11:
                l4 l4Var = (l4) this.f4841c;
                boolean z14 = this.f4840b;
                if (z14) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                l4Var.V0 = f18;
                l4Var.f35941n0.setTranslationY(((1.0f - f18) * AndroidUtilities.dp(51.0f)) + l4Var.m0);
                if (!z14) {
                    l4Var.f35941n0.setVisibility(8);
                    return;
                }
                return;
            case 12:
                e5 e5Var = (e5) this.f4841c;
                if (!this.f4840b) {
                    e5Var.setVisibility(4);
                    cb.m mVar = ((u4) e5Var).D;
                    if (mVar.f2232a) {
                        mVar.f2232a = false;
                        if (((u4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.f2234c).removeView((u4) mVar.d);
                        }
                        u4 u4Var = (u4) mVar.d;
                        u4Var.B = true;
                        b5 b5Var = u4Var.f33897y;
                        if (b5Var != null) {
                            if (b5Var.f32794g) {
                                b5Var.f32794g = false;
                                b5Var.f32791b.removeObserver(b5Var.f32790a, b5Var.e);
                            }
                            u4Var.f33897y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.f2233b).requestDisallowInterceptTouchEvent(false);
                        mVar.f2233b = null;
                        mVar.f2234c = null;
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f4841c;
                org.telegram.ui.Cells.s1 s1Var = t1Var.Wc;
                int g10 = s1Var.g();
                int i14 = t1Var.f22037ed;
                if (i14 != g10) {
                    t1Var.t1(i14, g10, this.f4840b);
                    return;
                }
                t1Var.f22081hd = false;
                s1Var.a2 = i14;
                return;
            case 14:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f4841c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    if (!this.f4840b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                t5 t5Var = (t5) this.f4841c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
                    if (!this.f4840b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                r7 r7Var = (r7) this.f4841c;
                ValueAnimator valueAnimator = r7Var.f21796x0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f4840b) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    r7Var.f21798y0 = f19;
                    r7Var.f21796x0 = null;
                    return;
                }
                return;
            case 17:
                ya yaVar = (ya) this.f4841c;
                AnimatorSet animatorSet3 = yaVar.f22636f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f22636f = null;
                    if (!this.f4840b) {
                        yaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ImageView imageView = ((ma) this.f4841c).d;
                if (this.f4840b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                return;
            case 19:
                nd ndVar = (nd) this.f4841c;
                if (ndVar.f36592n != null && (kdVar = ndVar.h) != null) {
                    if (this.f4840b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f36597r.setVisibility(4);
                    }
                    ndVar.f36592n = null;
                    return;
                }
                return;
            case 20:
                xn xnVar = (xn) this.f4841c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f4840b) {
                        xnVar.D0.setVisibility(4);
                        return;
                    }
                    if (xnVar.f40261z0) {
                        view = xnVar.A0;
                    } else {
                        view = xnVar.f40248y0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            case 21:
                po poVar = (po) this.f4841c;
                if (poVar.h != null && (radialProgressView = poVar.f37396n) != null) {
                    if (!this.f4840b) {
                        radialProgressView.setVisibility(4);
                        poVar.f37388f.setVisibility(4);
                    }
                    poVar.h = null;
                    return;
                }
                return;
            case 22:
                v9 v9Var = (v9) this.f4841c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f4840b) {
                        v9Var.f29393c.setVisibility(4);
                        return;
                    } else {
                        v9Var.f29392b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 23:
                rc rcVar = (rc) this.f4841c;
                if (animator == rcVar.f28444g) {
                    rcVar.f28444g = null;
                    if (this.f4840b) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    rcVar.f28445i = f20;
                    rcVar.b();
                    return;
                }
                return;
            case 24:
                li liVar = (li) this.f4841c;
                if (liVar.V0 != null) {
                    if (this.f4840b) {
                        if (liVar.P0) {
                            di diVar = liVar.f26748v0;
                            if (diVar == null || diVar.I()) {
                                liVar.f26746u1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.f26686b1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (liVar.N0 != 0 || !liVar.f26723n1) {
                        liVar.X0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                fo foVar = (fo) this.f4841c;
                if (!this.f4840b) {
                    p9 p9Var = foVar.h;
                    foVar.h = foVar.f24925n;
                    foVar.f24925n = p9Var;
                    p9Var.setVisibility(8);
                    foVar.f24925n.setAlpha(0.0f);
                    foVar.h.setVisibility(0);
                    foVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 26:
                boolean z15 = this.f4840b;
                org.telegram.ui.Components.po poVar2 = (org.telegram.ui.Components.po) this.f4841c;
                if (animator == poVar2.e) {
                    if (z15) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    poVar2.d = f21;
                    poVar2.setShown(f21);
                    if (!z15) {
                        poVar2.setVisibility(8);
                    }
                    poVar2.a(true);
                    return;
                }
                return;
            case 27:
                kp kpVar = (kp) this.f4841c;
                if (this.f4840b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                kpVar.f26341d0 = f22;
                kpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * kpVar.f26341d0);
                return;
            case 28:
                if (!this.f4840b) {
                    ((kq) this.f4841c).E.setVisibility(8);
                    return;
                }
                return;
            default:
                tv tvVar = (tv) this.f4841c;
                xv xvVar = tvVar.G;
                if (xvVar.R && !tvVar.h) {
                    if (!this.f4840b && !tvVar.f29052n) {
                        tvVar.setBackground(null);
                        return;
                    } else if (tvVar.getBackground() == null) {
                        tvVar.setBackground(j6.Y(xvVar.k(), 8, 8));
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
        switch (this.f4839a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((nh.q) this.f4841c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public w2(fo foVar) {
        this.f4839a = 25;
        this.f4841c = foVar;
    }
}
