package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.y81;
import org.telegram.ui.jd;
import org.telegram.ui.md;
import org.telegram.ui.uo;
import org.telegram.ui.zn;
public final class n extends AnimatorListenerAdapter {
    public final int f1271a;
    public final boolean f1272b;
    public final Object f1273c;

    public n(int i10, Object obj, boolean z10) {
        this.f1271a = i10;
        this.f1273c = obj;
        this.f1272b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1271a) {
            case 15:
                ((fi.p) this.f1273c).f9159w = null;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1273c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f1273c;
                AnimatorSet animatorSet2 = u5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u5Var.J = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.f1273c;
                AnimatorSet animatorSet3 = ebVar.f20262f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f20262f = null;
                    return;
                }
                return;
            case 27:
                ((md) this.f1273c).f35696n = null;
                return;
            case 28:
                zn znVar = (zn) this.f1273c;
                AnimatorSet animatorSet4 = znVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    znVar.H0 = null;
                    return;
                }
                return;
            case 29:
                ((uo) this.f1273c).h = null;
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
        d2 d2Var;
        float f11;
        float f12;
        float f13;
        View m10;
        float f14;
        float f15;
        int i10;
        float f16;
        RadialProgressView radialProgressView;
        float f17;
        boolean z10;
        int i11;
        float f18;
        float f19;
        boolean z11;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        int i12;
        jd jdVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f1271a) {
            case 0:
                b0 b0Var = (b0) this.f1273c;
                if (this.f1272b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f543d0 = f7;
                b0Var.b();
                return;
            case 1:
                r3 r3Var = (r3) this.f1273c;
                w0 w0Var = r3Var.f1327c;
                float f25 = 0.0f;
                boolean z12 = this.f1272b;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                w0Var.setAlpha(f10);
                View view2 = r3Var.f1323a;
                if (!z12) {
                    f25 = 0.5f;
                }
                view2.setAlpha(f25);
                r3Var.invalidate();
                return;
            case 2:
                m2 m2Var = (m2) this.f1273c;
                m2Var.f1230b.removeViewImmediate(m2Var.d);
                m2Var.f1232f.b();
                if (this.f1272b && (d2Var = m2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                m2Var.v = null;
                m2Var.f1235s = true;
                m2Var.G = null;
                m2Var.E = false;
                return;
            case 3:
                jc jcVar = (jc) this.f1273c;
                jcVar.J0.unlock();
                if (this.f1272b) {
                    f11 = jcVar.f1113w.f1470c;
                } else {
                    f11 = 0.0f;
                }
                jcVar.f1075e0 = f11;
                f6 currentPeerView = jcVar.f1093n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                jcVar.v.invalidate();
                jcVar.f1112v1 = null;
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1273c;
                float f26 = 0.0f;
                boolean z13 = this.f1272b;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zVar.f3613w = f12;
                y81 y81Var = zVar.f3611r;
                if (z13) {
                    f13 = 0.0f;
                } else {
                    f13 = -42.0f;
                }
                y81Var.setTranslationY(AndroidUtilities.dp(f13));
                bi.a aVar = zVar.f3610n;
                if (z13) {
                    f26 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f26));
                return;
            case 5:
                bi.u uVar = (bi.u) this.f1273c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f3593f;
                bi.m mVar = uVar.v;
                uVar.f3591b = false;
                boolean z14 = this.f1272b;
                if (z14) {
                    int i13 = uVar.e;
                    uVar.d = i13;
                    uVar.W.f3615y = i13;
                    SharedConfig.setStoriesColumnsCount(i13);
                }
                int h = mVar.h();
                if (z14) {
                    iVar.y1(uVar.d);
                    jVar.b0();
                    if (mVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(jVar);
                    } else {
                        mVar.l();
                    }
                }
                uVar.f3595r.setVisibility(8);
                int i14 = uVar.S;
                if (i14 >= 0) {
                    if (z14 && (m10 = uVar.f3596s.m(i14)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                ci.d dVar = (ci.d) this.f1273c;
                if (this.f1272b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.M = f14;
                dVar.invalidate();
                return;
            case 7:
                ci.m mVar2 = (ci.m) this.f1273c;
                boolean z15 = this.f1272b;
                if (!z15) {
                    mVar2.f5007r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar2.f4994f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z15);
                return;
            case 8:
                ci.y yVar = (ci.y) this.f1273c;
                ci.v vVar = yVar.f5798a;
                boolean z16 = this.f1272b;
                if (z16) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                yVar.d = f15;
                vVar.invalidate();
                if (z16) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                vVar.setVisibility(i10);
                return;
            case 9:
                if (!this.f1272b) {
                    ((ci.x3) this.f1273c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f1272b) {
                    ((ci.u4) this.f1273c).f5610b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ci.r6 r6Var = (ci.r6) this.f1273c;
                if (!this.f1272b) {
                    r6Var.Z1.setVisibility(8);
                    r6Var.Z1.n();
                    return;
                }
                return;
            case 12:
                ci.z9 z9Var = (ci.z9) this.f1273c;
                if (this.f1272b) {
                    z9Var.setVisibility(8);
                }
                z9Var.f5878c = null;
                return;
            case 13:
                ci.oc ocVar = (ci.oc) this.f1273c;
                if (!this.f1272b) {
                    ocVar.V0.setVisibility(8);
                }
                ocVar.f5223f2 = null;
                return;
            case 14:
                ei.k3 k3Var = (ei.k3) this.f1273c;
                if (this.f1272b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                k3Var.N0 = f16;
                k3Var.h();
                return;
            case 15:
                fi.p pVar = (fi.p) this.f1273c;
                if (pVar.f9159w != null && (radialProgressView = pVar.f9160x) != null) {
                    if (!this.f1272b) {
                        radialProgressView.setVisibility(4);
                        pVar.f9158s.setVisibility(4);
                    }
                    pVar.f9159w = null;
                    return;
                }
                return;
            case 16:
                gg.n1 n1Var = (gg.n1) this.f1273c;
                boolean z17 = this.f1272b;
                if (z17) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                n1Var.e = f17;
                n1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    n1Var.f9870c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    TextView textView = n1Var.f9870c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z17) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = n1Var.f9870c[i15];
                    if (i15 == 0) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    if (i15 == 1) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f18, f19, n1Var.e));
                    n1Var.d[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    TextView textView3 = n1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z17) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = n1Var.d[i15];
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
                    textView4.setAlpha(AndroidUtilities.lerp(f20, f21, n1Var.e));
                }
                return;
            case 17:
                if (this.f1272b) {
                    ((lg.p) this.f1273c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f1273c;
                if (this.f1272b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                f1Var.setTextColor(i0.a.d(f22, -1, -9194260));
                f1Var.setIconColor(i0.a.d(f22, -1, -9194260));
                return;
            case 19:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1273c;
                boolean z18 = this.f1272b;
                if (z18) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                h4Var.Y0 = f23;
                h4Var.f34126q0.setTranslationY(((1.0f - f23) * AndroidUtilities.dp(51.0f)) + h4Var.f34125p0);
                if (!z18) {
                    h4Var.f34126q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f1273c;
                if (!this.f1272b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.r4) c5Var).G;
                    if (mVar3.f7325a) {
                        mVar3.f7325a = false;
                        if (((org.telegram.ui.r4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.f7327c).removeView((org.telegram.ui.r4) mVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) mVar3.d;
                        r4Var.E = true;
                        org.telegram.ui.z4 z4Var = r4Var.f32651y;
                        if (z4Var != null) {
                            if (z4Var.f40115g) {
                                z4Var.f40115g = false;
                                z4Var.f40112b.removeObserver(z4Var.f40111a, z4Var.e);
                            }
                            r4Var.f32651y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.f7326b).requestDisallowInterceptTouchEvent(false);
                        mVar3.f7326b = null;
                        mVar3.f7327c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1273c;
                org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
                int g10 = t1Var.g();
                int i17 = u1Var.f21350hd;
                if (i17 != g10) {
                    u1Var.t1(i17, g10, this.f1272b);
                    return;
                }
                u1Var.f21394kd = false;
                t1Var.a2 = i17;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1273c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f1272b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f1273c;
                AnimatorSet animatorSet2 = u5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u5Var.J = null;
                    if (!this.f1272b) {
                        u5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.f1273c;
                ValueAnimator valueAnimator = u7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f1272b) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.0f;
                    }
                    u7Var.B0 = f24;
                    u7Var.A0 = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.f1273c;
                AnimatorSet animatorSet3 = ebVar.f20262f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f20262f = null;
                    if (!this.f1272b) {
                        ebVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((org.telegram.ui.oa) this.f1273c).d;
                if (this.f1272b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 27:
                md mdVar = (md) this.f1273c;
                if (mdVar.f35696n != null && (jdVar = mdVar.h) != null) {
                    if (this.f1272b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.f35701r.setVisibility(4);
                    }
                    mdVar.f35696n = null;
                    return;
                }
                return;
            case 28:
                zn znVar = (zn) this.f1273c;
                AnimatorSet animatorSet4 = znVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f1272b) {
                        znVar.G0.setVisibility(4);
                        return;
                    }
                    if (znVar.C0) {
                        view = znVar.D0;
                    } else {
                        view = znVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                uo uoVar = (uo) this.f1273c;
                if (uoVar.h != null && (radialProgressView2 = uoVar.f38180n) != null) {
                    if (!this.f1272b) {
                        radialProgressView2.setVisibility(4);
                        uoVar.f38172f.setVisibility(4);
                    }
                    uoVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1271a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.f1273c).performHapticFeedback(3);
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
