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
import ci.aa;
import ci.n2;
import ci.p1;
import ci.q4;
import ei.f6;
import ei.i9;
import ei.l4;
import ei.q3;
import ei.vb;
import gi.d3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.e5;
import org.telegram.ui.h5;
import org.telegram.ui.jd;
import org.telegram.ui.md;
import org.telegram.ui.pa;
import org.telegram.ui.qn;
import org.telegram.ui.x4;
public final class p0 extends AnimatorListenerAdapter {
    public final int f844a;
    public final boolean f845b;
    public final Object f846c;

    public p0(int i10, Object obj, boolean z10) {
        this.f844a = i10;
        this.f846c = obj;
        this.f845b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f844a) {
            case 17:
                ((hi.o) this.f846c).f12198w = null;
                return;
            case 23:
                f2 f2Var = (f2) this.f846c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f846c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    return;
                }
                return;
            case 26:
                za zaVar = (za) this.f846c;
                AnimatorSet animatorSet3 = zaVar.f23894f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zaVar.f23894f = null;
                    return;
                }
                return;
            case 28:
                ((md) this.f846c).f39198n = null;
                return;
            case 29:
                qn qnVar = (qn) this.f846c;
                AnimatorSet animatorSet4 = qnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    qnVar.H0 = null;
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
        switch (this.f844a) {
            case 0:
                t0 t0Var = (t0) this.f846c;
                dl0 dl0Var = t0Var.f878n;
                t0Var.k();
                t0Var.l();
                boolean z12 = this.f845b;
                t0.a(t0Var, z12);
                t0Var.f877m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t0Var.f874j = f7;
                boolean z13 = true;
                if (z12) {
                    t0Var.f875k = true;
                    t0Var.f868a.invalidate();
                }
                dl0Var.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f874j, 1.0f, 0.0f));
                if (!z12) {
                    dl0Var.setImportantForAccessibility(0);
                    dl0Var.setSkipDraw(false);
                    t0Var.f();
                    Runtime.getRuntime().gc();
                    int i13 = t0Var.f888y;
                    dl0Var.setCustomEmojiReactionsBackground((i13 == 4 || i13 == 5) ? false : false);
                }
                t0Var.C = false;
                return;
            case 1:
                ci.r rVar = (ci.r) this.f846c;
                if (this.f845b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar.f5872d0 = f10;
                rVar.b();
                return;
            case 2:
                n2 n2Var = (n2) this.f846c;
                u1 u1Var = n2Var.f6133c;
                float f26 = 0.0f;
                boolean z14 = this.f845b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                u1Var.setAlpha(f11);
                View view2 = n2Var.f6129a;
                if (!z14) {
                    f26 = 0.5f;
                }
                view2.setAlpha(f26);
                n2Var.invalidate();
                return;
            case 3:
                p1 p1Var = (p1) this.f846c;
                p1Var.f5712b.removeViewImmediate(p1Var.d);
                p1Var.f5714f.b();
                if (this.f845b && (h1Var = p1Var.v) != null && h1Var != ci.h1.W) {
                    h1Var.e();
                }
                p1Var.v = null;
                p1Var.f5717s = true;
                p1Var.G = null;
                p1Var.E = false;
                return;
            case 4:
                aa aaVar = (aa) this.f846c;
                aaVar.J0.unlock();
                if (this.f845b) {
                    f12 = aaVar.f5223w.f5279c;
                } else {
                    f12 = 0.0f;
                }
                aaVar.f5185e0 = f12;
                q4 currentPeerView = aaVar.f5203n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                aaVar.v.invalidate();
                aaVar.f5222v1 = null;
                return;
            case 5:
                di.v vVar = (di.v) this.f846c;
                float f27 = 0.0f;
                boolean z15 = this.f845b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                vVar.f8075w = f13;
                d91 d91Var = vVar.f8073r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                d91Var.setTranslationY(AndroidUtilities.dp(f14));
                di.a aVar = vVar.f8072n;
                if (z15) {
                    f27 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f27));
                return;
            case 6:
                di.r rVar2 = (di.r) this.f846c;
                di.h hVar = rVar2.h;
                di.i iVar = rVar2.f8057f;
                di.l lVar = rVar2.v;
                rVar2.f8055b = false;
                boolean z16 = this.f845b;
                if (z16) {
                    int i14 = rVar2.e;
                    rVar2.d = i14;
                    rVar2.W.f8077y = i14;
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
                rVar2.f8059r.setVisibility(8);
                int i15 = rVar2.S;
                if (i15 >= 0) {
                    if (z16 && (m10 = rVar2.f8060s.m(i15)) != null) {
                        rVar2.T = m10.getTop();
                    }
                    hVar.h1(rVar2.S, (-iVar.getPaddingTop()) + rVar2.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                ei.d dVar = (ei.d) this.f846c;
                if (this.f845b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.M = f15;
                dVar.invalidate();
                return;
            case 8:
                ei.m mVar = (ei.m) this.f846c;
                boolean z17 = this.f845b;
                if (!z17) {
                    mVar.f9412r.setVisibility(8);
                    ei.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f9399f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                ei.y yVar = (ei.y) this.f846c;
                ei.v vVar2 = yVar.f10119a;
                boolean z18 = this.f845b;
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
                if (!this.f845b) {
                    ((q3) this.f846c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f845b) {
                    ((l4) this.f846c).f9365b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                f6 f6Var = (f6) this.f846c;
                if (!this.f845b) {
                    f6Var.Z1.setVisibility(8);
                    f6Var.Z1.n();
                    return;
                }
                return;
            case 13:
                i9 i9Var = (i9) this.f846c;
                if (this.f845b) {
                    i9Var.setVisibility(8);
                }
                i9Var.f9207c = null;
                return;
            case 14:
                vb vbVar = (vb) this.f846c;
                if (!this.f845b) {
                    vbVar.V0.setVisibility(8);
                }
                vbVar.f9967f2 = null;
                return;
            case 15:
                d3 d3Var = (d3) this.f846c;
                if (this.f845b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                d3Var.N0 = f17;
                d3Var.h();
                return;
            case 16:
                hg.m1 m1Var = (hg.m1) this.f846c;
                boolean z19 = this.f845b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m1Var.e = f18;
                m1Var.invalidate();
                for (int i16 = 0; i16 < 2; i16++) {
                    m1Var.f11982c[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    TextView textView = m1Var.f11982c[i16];
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
                    TextView textView2 = m1Var.f11982c[i16];
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
                hi.o oVar = (hi.o) this.f846c;
                if (oVar.f12198w != null && (radialProgressView = oVar.f12199x) != null) {
                    if (!this.f845b) {
                        radialProgressView.setVisibility(4);
                        oVar.f12197s.setVisibility(4);
                    }
                    oVar.f12198w = null;
                    return;
                }
                return;
            case 18:
                if (this.f845b) {
                    ((mg.p) this.f846c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f846c;
                if (this.f845b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                e1Var.setTextColor(i0.a.f(f23, -1, -9194260));
                e1Var.setIconColor(i0.a.f(f23, -1, -9194260));
                return;
            case 20:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f846c;
                boolean z20 = this.f845b;
                if (z20) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                l4Var.Y0 = f24;
                l4Var.f38779q0.setTranslationY(((1.0f - f24) * AndroidUtilities.dp(51.0f)) + l4Var.f38778p0);
                if (!z20) {
                    l4Var.f38779q0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                h5 h5Var = (h5) this.f846c;
                if (!this.f845b) {
                    h5Var.setVisibility(4);
                    c2.b bVar = ((x4) h5Var).G;
                    if (bVar.f4489a) {
                        bVar.f4489a = false;
                        if (((x4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.f4491c).removeView((x4) bVar.d);
                        }
                        x4 x4Var = (x4) bVar.d;
                        x4Var.E = true;
                        e5 e5Var = x4Var.f37499y;
                        if (e5Var != null) {
                            if (e5Var.f36554g) {
                                e5Var.f36554g = false;
                                e5Var.f36551b.removeObserver(e5Var.f36550a, e5Var.e);
                            }
                            x4Var.f37499y = null;
                        }
                        bVar.d = null;
                        ((ViewGroup) bVar.f4490b).requestDisallowInterceptTouchEvent(false);
                        bVar.f4490b = null;
                        bVar.f4491c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f846c;
                t1 t1Var = u1Var2.Zc;
                int g10 = t1Var.g();
                int i18 = u1Var2.f23332hd;
                if (i18 != g10) {
                    u1Var2.t1(i18, g10, this.f845b);
                    return;
                }
                u1Var2.f23375kd = false;
                t1Var.a2 = i18;
                return;
            case 23:
                f2 f2Var = (f2) this.f846c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f845b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f846c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    if (!this.f845b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                s7 s7Var = (s7) this.f846c;
                ValueAnimator valueAnimator = s7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f845b) {
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
                za zaVar = (za) this.f846c;
                AnimatorSet animatorSet3 = zaVar.f23894f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zaVar.f23894f = null;
                    if (!this.f845b) {
                        zaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((pa) this.f846c).d;
                if (this.f845b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 28:
                md mdVar = (md) this.f846c;
                if (mdVar.f39198n != null && (jdVar = mdVar.h) != null) {
                    if (this.f845b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.f39203r.setVisibility(4);
                    }
                    mdVar.f39198n = null;
                    return;
                }
                return;
            default:
                qn qnVar = (qn) this.f846c;
                AnimatorSet animatorSet4 = qnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f845b) {
                        qnVar.G0.setVisibility(4);
                        return;
                    }
                    if (qnVar.C0) {
                        view = qnVar.D0;
                    } else {
                        view = qnVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f844a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((ci.r) this.f846c).performHapticFeedback(3);
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
