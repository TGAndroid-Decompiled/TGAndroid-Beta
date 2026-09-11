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
import bi.a2;
import bi.e3;
import bi.o5;
import bi.pb;
import bi.t1;
import di.pc;
import di.q6;
import di.u4;
import di.x3;
import di.z9;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.c5;
import org.telegram.ui.co;
import org.telegram.ui.i4;
import org.telegram.ui.jd;
import org.telegram.ui.md;
import org.telegram.ui.na;
import org.telegram.ui.s4;
import org.telegram.ui.z4;
public final class q0 extends AnimatorListenerAdapter {
    public final int f660a;
    public final boolean f661b;
    public final Object f662c;

    public q0(int i10, Object obj, boolean z10) {
        this.f660a = i10;
        this.f662c = obj;
        this.f661b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f660a) {
            case 16:
                ((gi.p) this.f662c).f10748w = null;
                return;
            case 23:
                e2 e2Var = (e2) this.f662c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f662c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    return;
                }
                return;
            case 26:
                db dbVar = (db) this.f662c;
                AnimatorSet animatorSet3 = dbVar.f21808f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f21808f = null;
                    return;
                }
                return;
            case 28:
                ((md) this.f662c).f38650n = null;
                return;
            case 29:
                co coVar = (co) this.f662c;
                AnimatorSet animatorSet4 = coVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    coVar.H0 = null;
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
        jd jdVar;
        View view;
        switch (this.f660a) {
            case 0:
                u0 u0Var = (u0) this.f662c;
                fk0 fk0Var = u0Var.f696n;
                u0Var.k();
                u0Var.l();
                boolean z12 = this.f661b;
                u0.a(u0Var, z12);
                u0Var.f695m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.f692j = f7;
                boolean z13 = true;
                if (z12) {
                    u0Var.f693k = true;
                    u0Var.f685a.invalidate();
                }
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(u0Var.f692j, 1.0f, 0.0f));
                if (!z12) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    u0Var.f();
                    Runtime.getRuntime().gc();
                    int i13 = u0Var.f706y;
                    fk0Var.setCustomEmojiReactionsBackground((i13 == 4 || i13 == 5) ? false : false);
                }
                u0Var.C = false;
                return;
            case 1:
                bi.v vVar = (bi.v) this.f662c;
                if (this.f661b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                vVar.f3852d0 = f10;
                vVar.b();
                return;
            case 2:
                e3 e3Var = (e3) this.f662c;
                bi.o0 o0Var = e3Var.f3004c;
                float f26 = 0.0f;
                boolean z14 = this.f661b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                o0Var.setAlpha(f11);
                View view2 = e3Var.f3000a;
                if (!z14) {
                    f26 = 0.5f;
                }
                view2.setAlpha(f26);
                e3Var.invalidate();
                return;
            case 3:
                a2 a2Var = (a2) this.f662c;
                a2Var.f2738b.removeViewImmediate(a2Var.d);
                a2Var.f2741f.b();
                if (this.f661b && (t1Var = a2Var.v) != null && t1Var != t1.W) {
                    t1Var.e();
                }
                a2Var.v = null;
                a2Var.f2744s = true;
                a2Var.G = null;
                a2Var.E = false;
                return;
            case 4:
                pb pbVar = (pb) this.f662c;
                pbVar.J0.unlock();
                if (this.f661b) {
                    f12 = pbVar.f3581w.f2763c;
                } else {
                    f12 = 0.0f;
                }
                pbVar.f3543e0 = f12;
                o5 currentPeerView = pbVar.f3561n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                pbVar.v.invalidate();
                pbVar.f3580v1 = null;
                return;
            case 5:
                ci.y yVar = (ci.y) this.f662c;
                float f27 = 0.0f;
                boolean z15 = this.f661b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                yVar.f4856w = f13;
                h81 h81Var = yVar.f4854r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                h81Var.setTranslationY(AndroidUtilities.dp(f14));
                ci.a aVar = yVar.f4853n;
                if (z15) {
                    f27 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f27));
                return;
            case 6:
                ci.t tVar = (ci.t) this.f662c;
                ci.h hVar = tVar.h;
                ci.i iVar = tVar.f4835f;
                ci.l lVar = tVar.v;
                tVar.f4832b = false;
                boolean z16 = this.f661b;
                if (z16) {
                    int i14 = tVar.f4834e;
                    tVar.d = i14;
                    tVar.W.f4858y = i14;
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
                tVar.f4837r.setVisibility(8);
                int i15 = tVar.S;
                if (i15 >= 0) {
                    if (z16 && (m10 = tVar.f4838s.m(i15)) != null) {
                        tVar.T = m10.getTop();
                    }
                    hVar.h1(tVar.S, (-iVar.getPaddingTop()) + tVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                di.d dVar = (di.d) this.f662c;
                if (this.f661b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.M = f15;
                dVar.invalidate();
                return;
            case 8:
                di.m mVar = (di.m) this.f662c;
                boolean z17 = this.f661b;
                if (!z17) {
                    mVar.f7606r.setVisibility(8);
                    di.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f7593f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                di.y yVar2 = (di.y) this.f662c;
                di.v vVar2 = yVar2.f8440a;
                boolean z18 = this.f661b;
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
                if (!this.f661b) {
                    ((x3) this.f662c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f661b) {
                    ((u4) this.f662c).f8234b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                q6 q6Var = (q6) this.f662c;
                if (!this.f661b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    return;
                }
                return;
            case 13:
                z9 z9Var = (z9) this.f662c;
                if (this.f661b) {
                    z9Var.setVisibility(8);
                }
                z9Var.f8530c = null;
                return;
            case 14:
                pc pcVar = (pc) this.f662c;
                if (!this.f661b) {
                    pcVar.V0.setVisibility(8);
                }
                pcVar.f7862f2 = null;
                return;
            case 15:
                k3 k3Var = (k3) this.f662c;
                if (this.f661b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                k3Var.N0 = f17;
                k3Var.h();
                return;
            case 16:
                gi.p pVar = (gi.p) this.f662c;
                if (pVar.f10748w != null && (radialProgressView = pVar.f10749x) != null) {
                    if (!this.f661b) {
                        radialProgressView.setVisibility(4);
                        pVar.f10747s.setVisibility(4);
                    }
                    pVar.f10748w = null;
                    return;
                }
                return;
            case 17:
                hg.n1 n1Var = (hg.n1) this.f662c;
                boolean z19 = this.f661b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                n1Var.f11186e = f18;
                n1Var.invalidate();
                for (int i16 = 0; i16 < 2; i16++) {
                    n1Var.f11185c[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f11186e));
                    TextView textView = n1Var.f11185c[i16];
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
                    TextView textView2 = n1Var.f11185c[i16];
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
                    textView2.setAlpha(AndroidUtilities.lerp(f19, f20, n1Var.f11186e));
                    n1Var.d[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f11186e));
                    TextView textView3 = n1Var.d[i16];
                    if (i16 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i17 = 0;
                    }
                    textView3.setVisibility(i17);
                    TextView textView4 = n1Var.d[i16];
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
                    textView4.setAlpha(AndroidUtilities.lerp(f21, f22, n1Var.f11186e));
                }
                return;
            case 18:
                if (this.f661b) {
                    ((mg.q) this.f662c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f662c;
                if (this.f661b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                f1Var.setTextColor(i0.a.d(f23, -1, -9194260));
                f1Var.setIconColor(i0.a.d(f23, -1, -9194260));
                return;
            case 20:
                i4 i4Var = (i4) this.f662c;
                boolean z20 = this.f661b;
                if (z20) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                i4Var.Y0 = f24;
                i4Var.f37228q0.setTranslationY(((1.0f - f24) * AndroidUtilities.dp(51.0f)) + i4Var.f37227p0);
                if (!z20) {
                    i4Var.f37228q0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                c5 c5Var = (c5) this.f662c;
                if (!this.f661b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar2 = ((s4) c5Var).G;
                    if (mVar2.f6371a) {
                        mVar2.f6371a = false;
                        if (((s4) mVar2.d).getParent() != null) {
                            ((WindowManager) mVar2.f6373c).removeView((s4) mVar2.d);
                        }
                        s4 s4Var = (s4) mVar2.d;
                        s4Var.E = true;
                        z4 z4Var = s4Var.f35004y;
                        if (z4Var != null) {
                            if (z4Var.f43288g) {
                                z4Var.f43288g = false;
                                z4Var.f43284b.removeObserver(z4Var.f43283a, z4Var.f43286e);
                            }
                            s4Var.f35004y = null;
                        }
                        mVar2.d = null;
                        ((ViewGroup) mVar2.f6372b).requestDisallowInterceptTouchEvent(false);
                        mVar2.f6372b = null;
                        mVar2.f6373c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f662c;
                s1 s1Var = t1Var2.Zc;
                int g10 = s1Var.g();
                int i18 = t1Var2.f22965hd;
                if (i18 != g10) {
                    t1Var2.t1(i18, g10, this.f661b);
                    return;
                }
                t1Var2.f23009kd = false;
                s1Var.a2 = i18;
                return;
            case 23:
                e2 e2Var = (e2) this.f662c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    if (!this.f661b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                s5 s5Var = (s5) this.f662c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    if (!this.f661b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                t7 t7Var = (t7) this.f662c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f661b) {
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
                db dbVar = (db) this.f662c;
                AnimatorSet animatorSet3 = dbVar.f21808f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f21808f = null;
                    if (!this.f661b) {
                        dbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((na) this.f662c).d;
                if (this.f661b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 28:
                md mdVar = (md) this.f662c;
                if (mdVar.f38650n != null && (jdVar = mdVar.h) != null) {
                    if (this.f661b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.f38655r.setVisibility(4);
                    }
                    mdVar.f38650n = null;
                    return;
                }
                return;
            default:
                co coVar = (co) this.f662c;
                AnimatorSet animatorSet4 = coVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f661b) {
                        coVar.G0.setVisibility(4);
                        return;
                    }
                    if (coVar.C0) {
                        view = coVar.D0;
                    } else {
                        view = coVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f660a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((bi.v) this.f662c).performHapticFeedback(3);
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
