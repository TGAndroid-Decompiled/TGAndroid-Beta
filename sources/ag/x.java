package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import jh.e4;
import jh.i9;
import lh.f6;
import lh.k4;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.c5;
import org.telegram.ui.fd;
import org.telegram.ui.id;
import org.telegram.ui.ka;
import org.telegram.ui.m4;
import org.telegram.ui.rn;
import org.telegram.ui.s4;
import org.telegram.ui.z4;

public final class x extends AnimatorListenerAdapter {

    public final int f692a;

    public final boolean f693b;

    public final Object f694c;

    public x(int i10, Object obj, boolean z10) {
        this.f692a = i10;
        this.f694c = obj;
        this.f693b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f692a) {
            case 18:
                ((oh.o) this.f694c).f19539w = null;
                break;
            case 23:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f694c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    break;
                }
                break;
            case 24:
                q5 q5Var = (q5) this.f694c;
                AnimatorSet animatorSet2 = q5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.F = null;
                    break;
                }
                break;
            case 26:
                va vaVar = (va) this.f694c;
                AnimatorSet animatorSet3 = vaVar.f25831f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f25831f = null;
                    break;
                }
                break;
            case 28:
                ((id) this.f694c).f39046n = null;
                break;
            case 29:
                rn rnVar = (rn) this.f694c;
                AnimatorSet animatorSet4 = rnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    rnVar.D0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jh.d1 d1Var;
        View viewM;
        RadialProgressView radialProgressView;
        fd fdVar;
        switch (this.f692a) {
            case 0:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f694c;
                if (this.f693b) {
                    limitPreviewView.f26453f0 = false;
                }
                Runnable runnable = limitPreviewView.f26454g0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f26454g0.run();
                }
                break;
            case 1:
                s1 s1Var = (s1) this.f694c;
                s1Var.I = this.f693b ? 1.0f : 0.0f;
                s1Var.d.invalidate();
                o1 o1Var = s1Var.f644e;
                if (o1Var != null) {
                    o1Var.invalidate();
                }
                break;
            case 2:
                ig.d0 d0Var = (ig.d0) this.f694c;
                wj0 wj0Var = d0Var.f11279n;
                d0Var.k();
                d0Var.l();
                boolean z10 = this.f693b;
                ig.d0.a(d0Var, z10);
                d0Var.f11278m.invalidateOutline();
                d0Var.f11275j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    d0Var.f11276k = true;
                    d0Var.f11268a.invalidate();
                }
                wj0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f11275j, 1.0f, 0.0f));
                if (!z10) {
                    wj0Var.setImportantForAccessibility(0);
                    wj0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = d0Var.f11289y;
                    wj0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                d0Var.C = false;
                break;
            case 3:
                jh.p pVar = (jh.p) this.f694c;
                pVar.W = this.f693b ? 1.0f : 0.0f;
                pVar.b();
                break;
            case 4:
                jh.g2 g2Var = (jh.g2) this.f694c;
                hh.f1 f1Var = g2Var.f14012c;
                boolean z11 = this.f693b;
                f1Var.setAlpha(z11 ? 0.0f : 1.0f);
                g2Var.f14008a.setAlpha(z11 ? 0.0f : 0.5f);
                g2Var.invalidate();
                break;
            case 5:
                jh.i1 i1Var = (jh.i1) this.f694c;
                i1Var.f13425b.removeViewImmediate(i1Var.d);
                i1Var.f13428f.b();
                if (this.f693b && (d1Var = i1Var.v) != null && d1Var != jh.d1.S) {
                    d1Var.e();
                }
                i1Var.v = null;
                i1Var.f13431s = true;
                i1Var.C = null;
                i1Var.A = false;
                break;
            case 6:
                i9 i9Var = (i9) this.f694c;
                i9Var.F0.unlock();
                i9Var.f13465a0 = this.f693b ? i9Var.f13511w.f13579c : 0.0f;
                e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.f13504r1 = null;
                break;
            case 7:
                kh.v vVar = (kh.v) this.f694c;
                boolean z12 = this.f693b;
                vVar.f15237w = z12 ? 1.0f : 0.0f;
                vVar.f15235r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                vVar.f15234n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 8:
                kh.r rVar = (kh.r) this.f694c;
                kh.i iVar = rVar.h;
                kh.j jVar = rVar.f15218f;
                kh.m mVar = rVar.v;
                rVar.f15215b = false;
                boolean z13 = this.f693b;
                if (z13) {
                    int i11 = rVar.f15217e;
                    rVar.d = i11;
                    rVar.S.f15239y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int iH = mVar.h();
                if (z13) {
                    iVar.y1(rVar.d);
                    jVar.a0();
                    if (mVar.h() == iH) {
                        AndroidUtilities.updateVisibleRows(jVar);
                    } else {
                        mVar.l();
                    }
                }
                rVar.f15220r.setVisibility(8);
                int i12 = rVar.O;
                if (i12 >= 0) {
                    if (z13 && (viewM = rVar.f15221s.m(i12)) != null) {
                        rVar.P = viewM.getTop();
                    }
                    iVar.h1(rVar.O, (-jVar.getPaddingTop()) + rVar.P);
                }
                super.onAnimationEnd(animator);
                break;
            case 9:
                lh.d dVar = (lh.d) this.f694c;
                dVar.I = this.f693b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 10:
                lh.m mVar2 = (lh.m) this.f694c;
                boolean z14 = this.f693b;
                if (!z14) {
                    mVar2.f16351r.setVisibility(8);
                    lh.i iVar2 = mVar2.I;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z14) {
                    mVar2.f16338f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z14);
                break;
            case 11:
                lh.z zVar = (lh.z) this.f694c;
                lh.w wVar = zVar.f17134a;
                boolean z15 = this.f693b;
                zVar.d = z15 ? 1.0f : 0.0f;
                wVar.invalidate();
                wVar.setVisibility(z15 ? 0 : 8);
                break;
            case 12:
                if (!this.f693b) {
                    ((lh.p3) this.f694c).E.setVisibility(8);
                }
                break;
            case 13:
                if (!this.f693b) {
                    ((k4) this.f694c).f16228b.setVisibility(8);
                }
                break;
            case 14:
                f6 f6Var = (f6) this.f694c;
                if (!this.f693b) {
                    f6Var.V1.setVisibility(8);
                    f6Var.V1.n();
                }
                break;
            case 15:
                lh.i9 i9Var2 = (lh.i9) this.f694c;
                if (this.f693b) {
                    i9Var2.setVisibility(8);
                }
                i9Var2.f16136c = null;
                break;
            case 16:
                sb sbVar = (sb) this.f694c;
                if (!this.f693b) {
                    sbVar.R0.setVisibility(8);
                }
                sbVar.f16748b2 = null;
                break;
            case 17:
                nh.b3 b3Var = (nh.b3) this.f694c;
                b3Var.J0 = this.f693b ? 1.0f : 0.0f;
                b3Var.h();
                break;
            case 18:
                oh.o oVar = (oh.o) this.f694c;
                if (oVar.f19539w != null && (radialProgressView = oVar.f19540x) != null) {
                    if (!this.f693b) {
                        radialProgressView.setVisibility(4);
                        oVar.f19538s.setVisibility(4);
                    }
                    oVar.f19539w = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f694c;
                float f10 = this.f693b ? 1.0f : 0.0f;
                f1Var2.setTextColor(i0.b.d(f10, -1, -9194260));
                f1Var2.setIconColor(i0.b.d(f10, -1, -9194260));
                break;
            case 20:
                m4 m4Var = (m4) this.f694c;
                boolean z16 = this.f693b;
                float f11 = z16 ? 1.0f : 0.0f;
                m4Var.U0 = f11;
                m4Var.m0.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(51.0f)) + m4Var.f40343l0);
                if (!z16) {
                    m4Var.m0.setVisibility(8);
                }
                break;
            case 21:
                c5 c5Var = (c5) this.f694c;
                if (!this.f693b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.l lVar = ((s4) c5Var).C;
                    if (lVar.f4599a) {
                        lVar.f4599a = false;
                        if (((s4) lVar.d).getParent() != null) {
                            ((WindowManager) lVar.f4601c).removeView((s4) lVar.d);
                        }
                        s4 s4Var = (s4) lVar.d;
                        s4Var.A = true;
                        z4 z4Var = s4Var.f36958y;
                        if (z4Var != null) {
                            if (z4Var.f45022g) {
                                z4Var.f45022g = false;
                                z4Var.f45018b.removeObserver(z4Var.f45017a, z4Var.f45020e);
                            }
                            s4Var.f36958y = null;
                        }
                        lVar.d = null;
                        ((ViewGroup) lVar.f4600b).requestDisallowInterceptTouchEvent(false);
                        lVar.f4600b = null;
                        lVar.f4601c = null;
                    }
                }
                break;
            case 22:
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.f694c;
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Vc;
                int iG = r1Var.g();
                int i13 = s1Var2.f25308dd;
                if (i13 == iG) {
                    s1Var2.f25351gd = false;
                    r1Var.a2 = i13;
                } else {
                    s1Var2.s1(i13, iG, this.f693b);
                }
                break;
            case 23:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f694c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    if (!this.f693b) {
                        d2Var.setBackgroundColor(0);
                    }
                    break;
                }
                break;
            case 24:
                q5 q5Var = (q5) this.f694c;
                AnimatorSet animatorSet2 = q5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.F = null;
                    if (!this.f693b) {
                        q5Var.setBackgroundColor(0);
                    }
                    break;
                }
                break;
            case 25:
                o7 o7Var = (o7) this.f694c;
                ValueAnimator valueAnimator = o7Var.f24812w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    o7Var.f24814x0 = this.f693b ? 1.0f : 0.0f;
                    o7Var.f24812w0 = null;
                    break;
                }
                break;
            case 26:
                va vaVar = (va) this.f694c;
                AnimatorSet animatorSet3 = vaVar.f25831f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f25831f = null;
                    if (!this.f693b) {
                        vaVar.setBackgroundColor(0);
                    }
                    break;
                }
                break;
            case 27:
                ((ka) this.f694c).d.setVisibility(this.f693b ? 0 : 8);
                break;
            case 28:
                id idVar = (id) this.f694c;
                if (idVar.f39046n != null && (fdVar = idVar.h) != null) {
                    if (this.f693b) {
                        fdVar.setVisibility(4);
                    } else {
                        idVar.f39051r.setVisibility(4);
                    }
                    idVar.f39046n = null;
                    break;
                }
                break;
            default:
                rn rnVar = (rn) this.f694c;
                AnimatorSet animatorSet4 = rnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f693b) {
                        rnVar.C0.setVisibility(4);
                    } else {
                        (rnVar.f42277y0 ? rnVar.f42290z0 : rnVar.f42264x0).setVisibility(4);
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f692a) {
            case 3:
                super.onAnimationStart(animator);
                try {
                    ((jh.p) this.f694c).performHapticFeedback(3);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
