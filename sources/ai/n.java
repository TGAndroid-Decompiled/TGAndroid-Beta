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
import org.telegram.ui.Components.t91;
import org.telegram.ui.eo;
import org.telegram.ui.nd;
import org.telegram.ui.qd;
import org.telegram.ui.xo;
public final class n extends AnimatorListenerAdapter {
    public final int f1434a;
    public final boolean f1435b;
    public final Object f1436c;

    public n(int i10, Object obj, boolean z10) {
        this.f1434a = i10;
        this.f1436c = obj;
        this.f1435b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1434a) {
            case 15:
                ((fi.p) this.f1436c).f10027w = null;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1436c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1436c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.f1436c;
                AnimatorSet animatorSet3 = bbVar.f21656f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f21656f = null;
                    return;
                }
                return;
            case 27:
                ((qd) this.f1436c).f41291n = null;
                return;
            case 28:
                eo eoVar = (eo) this.f1436c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    eoVar.H0 = null;
                    return;
                }
                return;
            case 29:
                ((xo) this.f1436c).h = null;
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
        nd ndVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f1434a) {
            case 0:
                b0 b0Var = (b0) this.f1436c;
                if (this.f1435b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f668d0 = f7;
                b0Var.b();
                return;
            case 1:
                s3 s3Var = (s3) this.f1436c;
                w0 w0Var = s3Var.f1507c;
                float f25 = 0.0f;
                boolean z12 = this.f1435b;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                w0Var.setAlpha(f10);
                View view2 = s3Var.f1503a;
                if (!z12) {
                    f25 = 0.5f;
                }
                view2.setAlpha(f25);
                s3Var.invalidate();
                return;
            case 2:
                n2 n2Var = (n2) this.f1436c;
                n2Var.f1445b.removeViewImmediate(n2Var.d);
                n2Var.f1448f.b();
                if (this.f1435b && (d2Var = n2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                n2Var.v = null;
                n2Var.f1451s = true;
                n2Var.G = null;
                n2Var.E = false;
                return;
            case 3:
                kc kcVar = (kc) this.f1436c;
                kcVar.J0.unlock();
                if (this.f1435b) {
                    f11 = kcVar.f1301w.f1738c;
                } else {
                    f11 = 0.0f;
                }
                kcVar.f1263e0 = f11;
                f6 currentPeerView = kcVar.f1281n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                kcVar.v.invalidate();
                kcVar.f1300v1 = null;
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1436c;
                float f26 = 0.0f;
                boolean z13 = this.f1435b;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zVar.f3947w = f12;
                t91 t91Var = zVar.f3945r;
                if (z13) {
                    f13 = 0.0f;
                } else {
                    f13 = -42.0f;
                }
                t91Var.setTranslationY(AndroidUtilities.dp(f13));
                bi.a aVar = zVar.f3944n;
                if (z13) {
                    f26 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f26));
                return;
            case 5:
                bi.u uVar = (bi.u) this.f1436c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f3926f;
                bi.m mVar = uVar.v;
                uVar.f3923b = false;
                boolean z14 = this.f1435b;
                if (z14) {
                    int i13 = uVar.f3925e;
                    uVar.d = i13;
                    uVar.W.f3949y = i13;
                    SharedConfig.setStoriesColumnsCount(i13);
                }
                int h = mVar.h();
                if (z14) {
                    iVar.y1(uVar.d);
                    jVar.a0();
                    if (mVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(jVar);
                    } else {
                        mVar.l();
                    }
                }
                uVar.f3928r.setVisibility(8);
                int i14 = uVar.S;
                if (i14 >= 0) {
                    if (z14 && (m10 = uVar.f3929s.m(i14)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                ci.d dVar = (ci.d) this.f1436c;
                if (this.f1435b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.M = f14;
                dVar.invalidate();
                return;
            case 7:
                ci.m mVar2 = (ci.m) this.f1436c;
                boolean z15 = this.f1435b;
                if (!z15) {
                    mVar2.f5566r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar2.f5553f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z15);
                return;
            case 8:
                ci.y yVar = (ci.y) this.f1436c;
                ci.v vVar = yVar.f6331a;
                boolean z16 = this.f1435b;
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
                if (!this.f1435b) {
                    ((ci.v3) this.f1436c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f1435b) {
                    ((ci.s4) this.f1436c).f5940b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ci.q6 q6Var = (ci.q6) this.f1436c;
                if (!this.f1435b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    return;
                }
                return;
            case 12:
                ci.w9 w9Var = (ci.w9) this.f1436c;
                if (this.f1435b) {
                    w9Var.setVisibility(8);
                }
                w9Var.f6220c = null;
                return;
            case 13:
                ci.lc lcVar = (ci.lc) this.f1436c;
                if (!this.f1435b) {
                    lcVar.V0.setVisibility(8);
                }
                lcVar.f5477f2 = null;
                return;
            case 14:
                ei.k3 k3Var = (ei.k3) this.f1436c;
                if (this.f1435b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                k3Var.N0 = f16;
                k3Var.h();
                return;
            case 15:
                fi.p pVar = (fi.p) this.f1436c;
                if (pVar.f10027w != null && (radialProgressView = pVar.f10028x) != null) {
                    if (!this.f1435b) {
                        radialProgressView.setVisibility(4);
                        pVar.f10026s.setVisibility(4);
                    }
                    pVar.f10027w = null;
                    return;
                }
                return;
            case 16:
                gg.m1 m1Var = (gg.m1) this.f1436c;
                boolean z17 = this.f1435b;
                if (z17) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                m1Var.f10729e = f17;
                m1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    m1Var.f10728c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10729e));
                    TextView textView = m1Var.f10728c[i15];
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
                    TextView textView2 = m1Var.f10728c[i15];
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
                    textView2.setAlpha(AndroidUtilities.lerp(f18, f19, m1Var.f10729e));
                    m1Var.d[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10729e));
                    TextView textView3 = m1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z17) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = m1Var.d[i15];
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
                    textView4.setAlpha(AndroidUtilities.lerp(f20, f21, m1Var.f10729e));
                }
                return;
            case 17:
                if (this.f1435b) {
                    ((lg.p) this.f1436c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f1436c;
                if (this.f1435b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                e1Var.setTextColor(i0.a.d(f22, -1, -9194260));
                e1Var.setIconColor(i0.a.d(f22, -1, -9194260));
                return;
            case 19:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f1436c;
                boolean z18 = this.f1435b;
                if (z18) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                i4Var.Y0 = f23;
                i4Var.f38660q0.setTranslationY(((1.0f - f23) * AndroidUtilities.dp(51.0f)) + i4Var.f38659p0);
                if (!z18) {
                    i4Var.f38660q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.f1436c;
                if (!this.f1435b) {
                    f5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.u4) f5Var).G;
                    if (mVar3.f7947a) {
                        mVar3.f7947a = false;
                        if (((org.telegram.ui.u4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.f7949c).removeView((org.telegram.ui.u4) mVar3.d);
                        }
                        org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) mVar3.d;
                        u4Var.E = true;
                        org.telegram.ui.c5 c5Var = u4Var.f37638y;
                        if (c5Var != null) {
                            if (c5Var.f36329g) {
                                c5Var.f36329g = false;
                                c5Var.f36325b.removeObserver(c5Var.f36324a, c5Var.f36327e);
                            }
                            u4Var.f37638y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.f7948b).requestDisallowInterceptTouchEvent(false);
                        mVar3.f7948b = null;
                        mVar3.f7949c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1436c;
                org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
                int g10 = t1Var.g();
                int i17 = u1Var.f22991hd;
                if (i17 != g10) {
                    u1Var.t1(i17, g10, this.f1435b);
                    return;
                }
                u1Var.f23035kd = false;
                t1Var.a2 = i17;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1436c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f1435b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1436c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.f1435b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1436c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f1435b) {
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
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.f1436c;
                AnimatorSet animatorSet3 = bbVar.f21656f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f21656f = null;
                    if (!this.f1435b) {
                        bbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((org.telegram.ui.ra) this.f1436c).d;
                if (this.f1435b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 27:
                qd qdVar = (qd) this.f1436c;
                if (qdVar.f41291n != null && (ndVar = qdVar.h) != null) {
                    if (this.f1435b) {
                        ndVar.setVisibility(4);
                    } else {
                        qdVar.f41296r.setVisibility(4);
                    }
                    qdVar.f41291n = null;
                    return;
                }
                return;
            case 28:
                eo eoVar = (eo) this.f1436c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f1435b) {
                        eoVar.G0.setVisibility(4);
                        return;
                    }
                    if (eoVar.C0) {
                        view = eoVar.D0;
                    } else {
                        view = eoVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                xo xoVar = (xo) this.f1436c;
                if (xoVar.h != null && (radialProgressView2 = xoVar.f44069n) != null) {
                    if (!this.f1435b) {
                        radialProgressView2.setVisibility(4);
                        xoVar.f44061f.setVisibility(4);
                    }
                    xoVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1434a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.f1436c).performHapticFeedback(3);
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
