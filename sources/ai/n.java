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
import org.telegram.ui.Components.x81;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.so;
import org.telegram.ui.xn;
public final class n extends AnimatorListenerAdapter {
    public final int f1283a;
    public final boolean f1284b;
    public final Object f1285c;

    public n(int i10, Object obj, boolean z10) {
        this.f1283a = i10;
        this.f1285c = obj;
        this.f1284b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1283a) {
            case 15:
                ((fi.p) this.f1285c).f9146w = null;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1285c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1285c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.f1285c;
                AnimatorSet animatorSet3 = dbVar.f20201f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f20201f = null;
                    return;
                }
                return;
            case 27:
                ((nd) this.f1285c).f35950n = null;
                return;
            case 28:
                xn xnVar = (xn) this.f1285c;
                AnimatorSet animatorSet4 = xnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    xnVar.H0 = null;
                    return;
                }
                return;
            case 29:
                ((so) this.f1285c).h = null;
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
        switch (this.f1283a) {
            case 0:
                b0 b0Var = (b0) this.f1285c;
                if (this.f1284b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f553d0 = f7;
                b0Var.b();
                return;
            case 1:
                r3 r3Var = (r3) this.f1285c;
                w0 w0Var = r3Var.f1333c;
                float f25 = 0.0f;
                boolean z12 = this.f1284b;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                w0Var.setAlpha(f10);
                View view2 = r3Var.f1329a;
                if (!z12) {
                    f25 = 0.5f;
                }
                view2.setAlpha(f25);
                r3Var.invalidate();
                return;
            case 2:
                m2 m2Var = (m2) this.f1285c;
                m2Var.f1234b.removeViewImmediate(m2Var.d);
                m2Var.f1236f.b();
                if (this.f1284b && (d2Var = m2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                m2Var.v = null;
                m2Var.f1239s = true;
                m2Var.G = null;
                m2Var.E = false;
                return;
            case 3:
                jc jcVar = (jc) this.f1285c;
                jcVar.J0.unlock();
                if (this.f1284b) {
                    f11 = jcVar.f1109w.f1502c;
                } else {
                    f11 = 0.0f;
                }
                jcVar.f1071e0 = f11;
                e6 currentPeerView = jcVar.f1089n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                jcVar.v.invalidate();
                jcVar.f1108v1 = null;
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1285c;
                float f26 = 0.0f;
                boolean z13 = this.f1284b;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zVar.f3608w = f12;
                x81 x81Var = zVar.f3606r;
                if (z13) {
                    f13 = 0.0f;
                } else {
                    f13 = -42.0f;
                }
                x81Var.setTranslationY(AndroidUtilities.dp(f13));
                bi.a aVar = zVar.f3605n;
                if (z13) {
                    f26 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f26));
                return;
            case 5:
                bi.u uVar = (bi.u) this.f1285c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f3588f;
                bi.m mVar = uVar.v;
                uVar.f3586b = false;
                boolean z14 = this.f1284b;
                if (z14) {
                    int i13 = uVar.e;
                    uVar.d = i13;
                    uVar.W.f3610y = i13;
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
                uVar.f3590r.setVisibility(8);
                int i14 = uVar.S;
                if (i14 >= 0) {
                    if (z14 && (m10 = uVar.f3591s.m(i14)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                ci.d dVar = (ci.d) this.f1285c;
                if (this.f1284b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.M = f14;
                dVar.invalidate();
                return;
            case 7:
                ci.m mVar2 = (ci.m) this.f1285c;
                boolean z15 = this.f1284b;
                if (!z15) {
                    mVar2.f5135r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar2.f5122f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z15);
                return;
            case 8:
                ci.y yVar = (ci.y) this.f1285c;
                ci.v vVar = yVar.f5869a;
                boolean z16 = this.f1284b;
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
                if (!this.f1284b) {
                    ((ci.w3) this.f1285c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f1284b) {
                    ((ci.t4) this.f1285c).f5542b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ci.q6 q6Var = (ci.q6) this.f1285c;
                if (!this.f1284b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    return;
                }
                return;
            case 12:
                ci.v9 v9Var = (ci.v9) this.f1285c;
                if (this.f1284b) {
                    v9Var.setVisibility(8);
                }
                v9Var.f5689c = null;
                return;
            case 13:
                ci.kc kcVar = (ci.kc) this.f1285c;
                if (!this.f1284b) {
                    kcVar.V0.setVisibility(8);
                }
                kcVar.f5002f2 = null;
                return;
            case 14:
                ei.k3 k3Var = (ei.k3) this.f1285c;
                if (this.f1284b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                k3Var.N0 = f16;
                k3Var.h();
                return;
            case 15:
                fi.p pVar = (fi.p) this.f1285c;
                if (pVar.f9146w != null && (radialProgressView = pVar.f9147x) != null) {
                    if (!this.f1284b) {
                        radialProgressView.setVisibility(4);
                        pVar.f9145s.setVisibility(4);
                    }
                    pVar.f9146w = null;
                    return;
                }
                return;
            case 16:
                gg.n1 n1Var = (gg.n1) this.f1285c;
                boolean z17 = this.f1284b;
                if (z17) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                n1Var.e = f17;
                n1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    n1Var.f9857c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    TextView textView = n1Var.f9857c[i15];
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
                    TextView textView2 = n1Var.f9857c[i15];
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
                if (this.f1284b) {
                    ((lg.p) this.f1285c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f1285c;
                if (this.f1284b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f22, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f22, -1, -9194260));
                return;
            case 19:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f1285c;
                boolean z18 = this.f1284b;
                if (z18) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                j4Var.Y0 = f23;
                j4Var.f34623q0.setTranslationY(((1.0f - f23) * AndroidUtilities.dp(51.0f)) + j4Var.f34622p0);
                if (!z18) {
                    j4Var.f34623q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.e5 e5Var = (org.telegram.ui.e5) this.f1285c;
                if (!this.f1284b) {
                    e5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.t4) e5Var).G;
                    if (mVar3.f7317a) {
                        mVar3.f7317a = false;
                        if (((org.telegram.ui.t4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.f7319c).removeView((org.telegram.ui.t4) mVar3.d);
                        }
                        org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) mVar3.d;
                        t4Var.E = true;
                        org.telegram.ui.b5 b5Var = t4Var.f33132y;
                        if (b5Var != null) {
                            if (b5Var.f32241g) {
                                b5Var.f32241g = false;
                                b5Var.f32238b.removeObserver(b5Var.f32237a, b5Var.e);
                            }
                            t4Var.f33132y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.f7318b).requestDisallowInterceptTouchEvent(false);
                        mVar3.f7318b = null;
                        mVar3.f7319c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1285c;
                org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
                int g10 = t1Var.g();
                int i17 = u1Var.f21370hd;
                if (i17 != g10) {
                    u1Var.t1(i17, g10, this.f1284b);
                    return;
                }
                u1Var.f21414kd = false;
                t1Var.a2 = i17;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1285c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f1284b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1285c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.f1284b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1285c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f1284b) {
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
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.f1285c;
                AnimatorSet animatorSet3 = dbVar.f20201f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f20201f = null;
                    if (!this.f1284b) {
                        dbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((org.telegram.ui.qa) this.f1285c).d;
                if (this.f1284b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 27:
                nd ndVar = (nd) this.f1285c;
                if (ndVar.f35950n != null && (kdVar = ndVar.h) != null) {
                    if (this.f1284b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f35955r.setVisibility(4);
                    }
                    ndVar.f35950n = null;
                    return;
                }
                return;
            case 28:
                xn xnVar = (xn) this.f1285c;
                AnimatorSet animatorSet4 = xnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f1284b) {
                        xnVar.G0.setVisibility(4);
                        return;
                    }
                    if (xnVar.C0) {
                        view = xnVar.D0;
                    } else {
                        view = xnVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
            default:
                so soVar = (so) this.f1285c;
                if (soVar.h != null && (radialProgressView2 = soVar.f37519n) != null) {
                    if (!this.f1284b) {
                        radialProgressView2.setVisibility(4);
                        soVar.f37511f.setVisibility(4);
                    }
                    soVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1283a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.f1285c).performHapticFeedback(3);
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
