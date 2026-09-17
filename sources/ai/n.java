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
import org.telegram.ui.Components.i81;
import org.telegram.ui.bo;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.wo;
public final class n extends AnimatorListenerAdapter {
    public final int f1274a;
    public final boolean f1275b;
    public final Object f1276c;

    public n(int i10, Object obj, boolean z10) {
        this.f1274a = i10;
        this.f1276c = obj;
        this.f1275b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1274a) {
            case 15:
                ((fi.p) this.f1276c).f9159w = null;
                return;
            case 22:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f1276c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f1276c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.f1276c;
                AnimatorSet animatorSet3 = ebVar.f20066f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f20066f = null;
                    return;
                }
                return;
            case 27:
                ((nd) this.f1276c).f36053n = null;
                return;
            case 28:
                bo boVar = (bo) this.f1276c;
                AnimatorSet animatorSet4 = boVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    boVar.H0 = null;
                    return;
                }
                return;
            case 29:
                ((wo) this.f1276c).h = null;
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
        kd kdVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f1274a) {
            case 0:
                b0 b0Var = (b0) this.f1276c;
                if (this.f1275b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f546d0 = f7;
                b0Var.b();
                return;
            case 1:
                r3 r3Var = (r3) this.f1276c;
                w0 w0Var = r3Var.f1330c;
                float f25 = 0.0f;
                boolean z12 = this.f1275b;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                w0Var.setAlpha(f10);
                View view2 = r3Var.f1326a;
                if (!z12) {
                    f25 = 0.5f;
                }
                view2.setAlpha(f25);
                r3Var.invalidate();
                return;
            case 2:
                m2 m2Var = (m2) this.f1276c;
                m2Var.f1233b.removeViewImmediate(m2Var.d);
                m2Var.f1235f.b();
                if (this.f1275b && (d2Var = m2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                m2Var.v = null;
                m2Var.f1238s = true;
                m2Var.G = null;
                m2Var.E = false;
                return;
            case 3:
                jc jcVar = (jc) this.f1276c;
                jcVar.J0.unlock();
                if (this.f1275b) {
                    f11 = jcVar.f1116w.f1473c;
                } else {
                    f11 = 0.0f;
                }
                jcVar.f1078e0 = f11;
                f6 currentPeerView = jcVar.f1096n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                jcVar.v.invalidate();
                jcVar.f1115v1 = null;
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1276c;
                float f26 = 0.0f;
                boolean z13 = this.f1275b;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zVar.f3614w = f12;
                i81 i81Var = zVar.f3612r;
                if (z13) {
                    f13 = 0.0f;
                } else {
                    f13 = -42.0f;
                }
                i81Var.setTranslationY(AndroidUtilities.dp(f13));
                bi.a aVar = zVar.f3611n;
                if (z13) {
                    f26 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f26));
                return;
            case 5:
                bi.u uVar = (bi.u) this.f1276c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f3594f;
                bi.m mVar = uVar.v;
                uVar.f3592b = false;
                boolean z14 = this.f1275b;
                if (z14) {
                    int i13 = uVar.e;
                    uVar.d = i13;
                    uVar.W.f3616y = i13;
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
                uVar.f3596r.setVisibility(8);
                int i14 = uVar.S;
                if (i14 >= 0) {
                    if (z14 && (m10 = uVar.f3597s.m(i14)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                ci.d dVar = (ci.d) this.f1276c;
                if (this.f1275b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.M = f14;
                dVar.invalidate();
                return;
            case 7:
                ci.m mVar2 = (ci.m) this.f1276c;
                boolean z15 = this.f1275b;
                if (!z15) {
                    mVar2.f5008r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar2.f4995f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z15);
                return;
            case 8:
                ci.y yVar = (ci.y) this.f1276c;
                ci.v vVar = yVar.f5799a;
                boolean z16 = this.f1275b;
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
                if (!this.f1275b) {
                    ((ci.x3) this.f1276c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f1275b) {
                    ((ci.u4) this.f1276c).f5611b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ci.r6 r6Var = (ci.r6) this.f1276c;
                if (!this.f1275b) {
                    r6Var.Z1.setVisibility(8);
                    r6Var.Z1.n();
                    return;
                }
                return;
            case 12:
                ci.z9 z9Var = (ci.z9) this.f1276c;
                if (this.f1275b) {
                    z9Var.setVisibility(8);
                }
                z9Var.f5879c = null;
                return;
            case 13:
                ci.oc ocVar = (ci.oc) this.f1276c;
                if (!this.f1275b) {
                    ocVar.V0.setVisibility(8);
                }
                ocVar.f5224f2 = null;
                return;
            case 14:
                ei.k3 k3Var = (ei.k3) this.f1276c;
                if (this.f1275b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                k3Var.N0 = f16;
                k3Var.h();
                return;
            case 15:
                fi.p pVar = (fi.p) this.f1276c;
                if (pVar.f9159w != null && (radialProgressView = pVar.f9160x) != null) {
                    if (!this.f1275b) {
                        radialProgressView.setVisibility(4);
                        pVar.f9158s.setVisibility(4);
                    }
                    pVar.f9159w = null;
                    return;
                }
                return;
            case 16:
                gg.n1 n1Var = (gg.n1) this.f1276c;
                boolean z17 = this.f1275b;
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
                if (this.f1275b) {
                    ((lg.p) this.f1276c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f1276c;
                if (this.f1275b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f22, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f22, -1, -9194260));
                return;
            case 19:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1276c;
                boolean z18 = this.f1275b;
                if (z18) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                h4Var.Y0 = f23;
                h4Var.f34164q0.setTranslationY(((1.0f - f23) * AndroidUtilities.dp(51.0f)) + h4Var.f34163p0);
                if (!z18) {
                    h4Var.f34164q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f1276c;
                if (!this.f1275b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.r4) c5Var).G;
                    if (mVar3.f7333a) {
                        mVar3.f7333a = false;
                        if (((org.telegram.ui.r4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.f7335c).removeView((org.telegram.ui.r4) mVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) mVar3.d;
                        r4Var.E = true;
                        org.telegram.ui.z4 z4Var = r4Var.f32676y;
                        if (z4Var != null) {
                            if (z4Var.f40117g) {
                                z4Var.f40117g = false;
                                z4Var.f40114b.removeObserver(z4Var.f40113a, z4Var.e);
                            }
                            r4Var.f32676y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.f7334b).requestDisallowInterceptTouchEvent(false);
                        mVar3.f7334b = null;
                        mVar3.f7335c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f1276c;
                org.telegram.ui.Cells.s1 s1Var = t1Var.Zc;
                int g10 = s1Var.g();
                int i17 = t1Var.f21092hd;
                if (i17 != g10) {
                    t1Var.t1(i17, g10, this.f1275b);
                    return;
                }
                t1Var.f21136kd = false;
                s1Var.a2 = i17;
                return;
            case 22:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.f1276c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    if (!this.f1275b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f1276c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    if (!this.f1275b) {
                        s5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1276c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f1275b) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.0f;
                    }
                    t7Var.B0 = f24;
                    t7Var.A0 = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) this.f1276c;
                AnimatorSet animatorSet3 = ebVar.f20066f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f20066f = null;
                    if (!this.f1275b) {
                        ebVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((org.telegram.ui.pa) this.f1276c).d;
                if (this.f1275b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 27:
                nd ndVar = (nd) this.f1276c;
                if (ndVar.f36053n != null && (kdVar = ndVar.h) != null) {
                    if (this.f1275b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f36058r.setVisibility(4);
                    }
                    ndVar.f36053n = null;
                    return;
                }
                return;
            case 28:
                bo boVar = (bo) this.f1276c;
                AnimatorSet animatorSet4 = boVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f1275b) {
                        boVar.G0.setVisibility(4);
                        return;
                    }
                    if (boVar.C0) {
                        view = boVar.D0;
                    } else {
                        view = boVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                wo woVar = (wo) this.f1276c;
                if (woVar.h != null && (radialProgressView2 = woVar.f39098n) != null) {
                    if (!this.f1275b) {
                        radialProgressView2.setVisibility(4);
                        woVar.f39090f.setVisibility(4);
                    }
                    woVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1274a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.f1276c).performHapticFeedback(3);
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
