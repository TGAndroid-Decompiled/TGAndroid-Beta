package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import lh.i9;
import nh.gb;
import nh.t5;
import nh.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.c5;
import org.telegram.ui.ed;
import org.telegram.ui.hd;
import org.telegram.ui.ia;
import org.telegram.ui.ko;
import org.telegram.ui.m4;
import org.telegram.ui.s4;
import org.telegram.ui.tn;
import org.telegram.ui.z4;
public final class z2 extends AnimatorListenerAdapter {
    public final int f2635a;
    public final boolean f2636b;
    public final Object f2637c;

    public z2(int i10, Object obj, boolean z10) {
        this.f2635a = i10;
        this.f2637c = obj;
        this.f2636b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2635a) {
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f2637c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    return;
                }
                return;
            case 23:
                r5 r5Var = (r5) this.f2637c;
                AnimatorSet animatorSet2 = r5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.F = null;
                    return;
                }
                return;
            case 24:
            case 26:
            default:
                super.onAnimationCancel(animator);
                return;
            case 25:
                va vaVar = (va) this.f2637c;
                AnimatorSet animatorSet3 = vaVar.f25847f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f25847f = null;
                    return;
                }
                return;
            case 27:
                ((hd) this.f2637c).f38866n = null;
                return;
            case 28:
                tn tnVar = (tn) this.f2637c;
                AnimatorSet animatorSet4 = tnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    tnVar.D0 = null;
                    return;
                }
                return;
            case 29:
                ((ko) this.f2637c).h = null;
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        float f10;
        float f11;
        float f12;
        lh.d1 d1Var;
        float f13;
        float f14;
        float f15;
        View m10;
        float f16;
        float f17;
        int i10;
        float f18;
        float f19;
        float f20;
        int i11;
        ed edVar;
        View view;
        RadialProgressView radialProgressView;
        switch (this.f2635a) {
            case 0:
                a3 a3Var = (a3) this.f2637c;
                ((ag.q) a3Var).f631y.f467n.d();
                if (this.f2636b) {
                    a3Var.f2090w.accept(Integer.valueOf(a3Var.f2089s));
                }
                if (a3Var.getParent() != null) {
                    ((ViewGroup) a3Var.getParent()).removeView(a3Var);
                    return;
                }
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f2637c;
                if (this.f2636b) {
                    limitPreviewView.f26468f0 = false;
                }
                Runnable runnable = limitPreviewView.f26469g0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f26469g0.run();
                    return;
                }
                return;
            case 2:
                cg.d1 d1Var2 = (cg.d1) this.f2637c;
                if (this.f2636b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                d1Var2.I = f9;
                d1Var2.d.invalidate();
                cg.b1 b1Var = d1Var2.f3092e;
                if (b1Var != null) {
                    b1Var.invalidate();
                    return;
                }
                return;
            case 3:
                kg.d0 d0Var = (kg.d0) this.f2637c;
                fk0 fk0Var = d0Var.f13692n;
                d0Var.k();
                d0Var.l();
                boolean z10 = this.f2636b;
                kg.d0.a(d0Var, z10);
                d0Var.f13691m.invalidateOutline();
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d0Var.f13688j = f10;
                boolean z11 = true;
                if (z10) {
                    d0Var.f13689k = true;
                    d0Var.f13681a.invalidate();
                }
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13688j, 1.0f, 0.0f));
                if (!z10) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = d0Var.f13702y;
                    fk0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                d0Var.C = false;
                return;
            case 4:
                lh.p pVar = (lh.p) this.f2637c;
                if (this.f2636b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                pVar.W = f11;
                pVar.b();
                return;
            case 5:
                lh.f2 f2Var = (lh.f2) this.f2637c;
                jh.e1 e1Var = f2Var.f16279c;
                float f21 = 0.0f;
                boolean z12 = this.f2636b;
                if (z12) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                e1Var.setAlpha(f12);
                View view2 = f2Var.f16275a;
                if (!z12) {
                    f21 = 0.5f;
                }
                view2.setAlpha(f21);
                f2Var.invalidate();
                return;
            case 6:
                lh.i1 i1Var = (lh.i1) this.f2637c;
                i1Var.f15699b.removeViewImmediate(i1Var.d);
                i1Var.f15702f.b();
                if (this.f2636b && (d1Var = i1Var.v) != null && d1Var != lh.d1.S) {
                    d1Var.e();
                }
                i1Var.v = null;
                i1Var.f15705s = true;
                i1Var.C = null;
                i1Var.A = false;
                return;
            case 7:
                i9 i9Var = (i9) this.f2637c;
                i9Var.F0.unlock();
                if (this.f2636b) {
                    f13 = i9Var.f15789w.f15884c;
                } else {
                    f13 = 0.0f;
                }
                i9Var.f15743a0 = f13;
                lh.d4 currentPeerView = i9Var.f15765j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.f15782r1 = null;
                return;
            case 8:
                mh.v vVar = (mh.v) this.f2637c;
                float f22 = 0.0f;
                boolean z13 = this.f2636b;
                if (z13) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                vVar.f17064w = f14;
                y71 y71Var = vVar.f17062r;
                if (z13) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                y71Var.setTranslationY(AndroidUtilities.dp(f15));
                mh.a aVar = vVar.f17061n;
                if (z13) {
                    f22 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f22));
                return;
            case 9:
                mh.r rVar = (mh.r) this.f2637c;
                mh.h hVar = rVar.h;
                mh.i iVar = rVar.f17045f;
                mh.l lVar = rVar.v;
                rVar.f17042b = false;
                boolean z14 = this.f2636b;
                if (z14) {
                    int i13 = rVar.f17044e;
                    rVar.d = i13;
                    rVar.S.f17066y = i13;
                    SharedConfig.setStoriesColumnsCount(i13);
                }
                int h = lVar.h();
                if (z14) {
                    hVar.y1(rVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar.f17047r.setVisibility(8);
                int i14 = rVar.O;
                if (i14 >= 0) {
                    if (z14 && (m10 = rVar.f17048s.m(i14)) != null) {
                        rVar.P = m10.getTop();
                    }
                    hVar.h1(rVar.O, (-iVar.getPaddingTop()) + rVar.P);
                }
                super.onAnimationEnd(animator);
                return;
            case 10:
                nh.d dVar = (nh.d) this.f2637c;
                if (this.f2636b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.I = f16;
                dVar.invalidate();
                return;
            case 11:
                nh.m mVar = (nh.m) this.f2637c;
                boolean z15 = this.f2636b;
                if (!z15) {
                    mVar.f18089r.setVisibility(8);
                    nh.i iVar2 = mVar.I;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar.f18076f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z15);
                return;
            case 12:
                nh.y yVar = (nh.y) this.f2637c;
                nh.v vVar2 = yVar.f18845a;
                boolean z16 = this.f2636b;
                if (z16) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                yVar.d = f17;
                vVar2.invalidate();
                if (z16) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vVar2.setVisibility(i10);
                return;
            case 13:
                if (!this.f2636b) {
                    ((nh.n3) this.f2637c).E.setVisibility(8);
                    return;
                }
                return;
            case 14:
                if (!this.f2636b) {
                    ((nh.g4) this.f2637c).f17694b.setVisibility(8);
                    return;
                }
                return;
            case 15:
                t5 t5Var = (t5) this.f2637c;
                if (!this.f2636b) {
                    t5Var.V1.setVisibility(8);
                    t5Var.V1.n();
                    return;
                }
                return;
            case 16:
                w8 w8Var = (w8) this.f2637c;
                if (this.f2636b) {
                    w8Var.setVisibility(8);
                }
                w8Var.f18800c = null;
                return;
            case 17:
                gb gbVar = (gb) this.f2637c;
                if (!this.f2636b) {
                    gbVar.R0.setVisibility(8);
                }
                gbVar.f17742b2 = null;
                return;
            case 18:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f2637c;
                if (this.f2636b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f18, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f18, -1, -9194260));
                return;
            case 19:
                m4 m4Var = (m4) this.f2637c;
                boolean z17 = this.f2636b;
                if (z17) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                m4Var.U0 = f19;
                m4Var.m0.setTranslationY(((1.0f - f19) * AndroidUtilities.dp(51.0f)) + m4Var.f40400l0);
                if (!z17) {
                    m4Var.m0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                c5 c5Var = (c5) this.f2637c;
                if (!this.f2636b) {
                    c5Var.setVisibility(4);
                    ab.m mVar2 = ((s4) c5Var).C;
                    if (mVar2.f324a) {
                        mVar2.f324a = false;
                        if (((s4) mVar2.d).getParent() != null) {
                            ((WindowManager) mVar2.f326c).removeView((s4) mVar2.d);
                        }
                        s4 s4Var = (s4) mVar2.d;
                        s4Var.A = true;
                        z4 z4Var = s4Var.f37001y;
                        if (z4Var != null) {
                            if (z4Var.f45068g) {
                                z4Var.f45068g = false;
                                z4Var.f45064b.removeObserver(z4Var.f45063a, z4Var.f45066e);
                            }
                            s4Var.f37001y = null;
                        }
                        mVar2.d = null;
                        ((ViewGroup) mVar2.f325b).requestDisallowInterceptTouchEvent(false);
                        mVar2.f325b = null;
                        mVar2.f326c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f2637c;
                org.telegram.ui.Cells.r1 r1Var = s1Var.Vc;
                int g10 = r1Var.g();
                int i15 = s1Var.f25319dd;
                if (i15 != g10) {
                    s1Var.t1(i15, g10, this.f2636b);
                    return;
                }
                s1Var.f25363gd = false;
                r1Var.a2 = i15;
                return;
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f2637c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    if (!this.f2636b) {
                        d2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                r5 r5Var = (r5) this.f2637c;
                AnimatorSet animatorSet2 = r5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.F = null;
                    if (!this.f2636b) {
                        r5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                p7 p7Var = (p7) this.f2637c;
                ValueAnimator valueAnimator = p7Var.f25004w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f2636b) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    p7Var.f25006x0 = f20;
                    p7Var.f25004w0 = null;
                    return;
                }
                return;
            case 25:
                va vaVar = (va) this.f2637c;
                AnimatorSet animatorSet3 = vaVar.f25847f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f25847f = null;
                    if (!this.f2636b) {
                        vaVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((ia) this.f2637c).d;
                if (this.f2636b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 27:
                hd hdVar = (hd) this.f2637c;
                if (hdVar.f38866n != null && (edVar = hdVar.h) != null) {
                    if (this.f2636b) {
                        edVar.setVisibility(4);
                    } else {
                        hdVar.f38871r.setVisibility(4);
                    }
                    hdVar.f38866n = null;
                    return;
                }
                return;
            case 28:
                tn tnVar = (tn) this.f2637c;
                AnimatorSet animatorSet4 = tnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f2636b) {
                        tnVar.C0.setVisibility(4);
                        return;
                    }
                    if (tnVar.f43038y0) {
                        view = tnVar.f43050z0;
                    } else {
                        view = tnVar.f43027x0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                ko koVar = (ko) this.f2637c;
                if (koVar.h != null && (radialProgressView = koVar.f39955n) != null) {
                    if (!this.f2636b) {
                        radialProgressView.setVisibility(4);
                        koVar.f39947f.setVisibility(4);
                    }
                    koVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2635a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((lh.p) this.f2637c).performHapticFeedback(3);
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
