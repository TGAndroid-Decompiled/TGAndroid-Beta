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
import org.telegram.ui.Components.p91;
import org.telegram.ui.id;
import org.telegram.ui.ld;
import org.telegram.ui.uo;
import org.telegram.ui.zn;
public final class n extends AnimatorListenerAdapter {
    public final int f1436a;
    public final boolean f1437b;
    public final Object f1438c;

    public n(int i10, Object obj, boolean z10) {
        this.f1436a = i10;
        this.f1438c = obj;
        this.f1437b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1436a) {
            case 15:
                ((fi.p) this.f1438c).f10028w = null;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1438c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1438c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.f1438c;
                AnimatorSet animatorSet3 = bbVar.f21885f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f21885f = null;
                    return;
                }
                return;
            case 27:
                ((ld) this.f1438c).f39609n = null;
                return;
            case 28:
                zn znVar = (zn) this.f1438c;
                AnimatorSet animatorSet4 = znVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    znVar.H0 = null;
                    return;
                }
                return;
            case 29:
                ((uo) this.f1438c).h = null;
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
        id idVar;
        View view;
        RadialProgressView radialProgressView2;
        switch (this.f1436a) {
            case 0:
                b0 b0Var = (b0) this.f1438c;
                if (this.f1437b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f666d0 = f7;
                b0Var.b();
                return;
            case 1:
                s3 s3Var = (s3) this.f1438c;
                w0 w0Var = s3Var.f1509c;
                float f25 = 0.0f;
                boolean z12 = this.f1437b;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                w0Var.setAlpha(f10);
                View view2 = s3Var.f1505a;
                if (!z12) {
                    f25 = 0.5f;
                }
                view2.setAlpha(f25);
                s3Var.invalidate();
                return;
            case 2:
                n2 n2Var = (n2) this.f1438c;
                n2Var.f1447b.removeViewImmediate(n2Var.d);
                n2Var.f1450f.b();
                if (this.f1437b && (d2Var = n2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                n2Var.v = null;
                n2Var.f1453s = true;
                n2Var.G = null;
                n2Var.E = false;
                return;
            case 3:
                kc kcVar = (kc) this.f1438c;
                kcVar.J0.unlock();
                if (this.f1437b) {
                    f11 = kcVar.f1303w.f1740c;
                } else {
                    f11 = 0.0f;
                }
                kcVar.f1265e0 = f11;
                f6 currentPeerView = kcVar.f1283n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                kcVar.v.invalidate();
                kcVar.f1302v1 = null;
                return;
            case 4:
                bi.z zVar = (bi.z) this.f1438c;
                float f26 = 0.0f;
                boolean z13 = this.f1437b;
                if (z13) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                zVar.f3948w = f12;
                p91 p91Var = zVar.f3946r;
                if (z13) {
                    f13 = 0.0f;
                } else {
                    f13 = -42.0f;
                }
                p91Var.setTranslationY(AndroidUtilities.dp(f13));
                bi.a aVar = zVar.f3945n;
                if (z13) {
                    f26 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f26));
                return;
            case 5:
                bi.u uVar = (bi.u) this.f1438c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f3927f;
                bi.m mVar = uVar.v;
                uVar.f3924b = false;
                boolean z14 = this.f1437b;
                if (z14) {
                    int i13 = uVar.f3926e;
                    uVar.d = i13;
                    uVar.W.f3950y = i13;
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
                uVar.f3929r.setVisibility(8);
                int i14 = uVar.S;
                if (i14 >= 0) {
                    if (z14 && (m10 = uVar.f3930s.m(i14)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 6:
                ci.d dVar = (ci.d) this.f1438c;
                if (this.f1437b) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                dVar.M = f14;
                dVar.invalidate();
                return;
            case 7:
                ci.m mVar2 = (ci.m) this.f1438c;
                boolean z15 = this.f1437b;
                if (!z15) {
                    mVar2.f5567r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z15) {
                    mVar2.f5554f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z15);
                return;
            case 8:
                ci.y yVar = (ci.y) this.f1438c;
                ci.v vVar = yVar.f6332a;
                boolean z16 = this.f1437b;
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
                if (!this.f1437b) {
                    ((ci.v3) this.f1438c).I.setVisibility(8);
                    return;
                }
                return;
            case 10:
                if (!this.f1437b) {
                    ((ci.s4) this.f1438c).f5941b.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ci.q6 q6Var = (ci.q6) this.f1438c;
                if (!this.f1437b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    return;
                }
                return;
            case 12:
                ci.w9 w9Var = (ci.w9) this.f1438c;
                if (this.f1437b) {
                    w9Var.setVisibility(8);
                }
                w9Var.f6221c = null;
                return;
            case 13:
                ci.lc lcVar = (ci.lc) this.f1438c;
                if (!this.f1437b) {
                    lcVar.V0.setVisibility(8);
                }
                lcVar.f5478f2 = null;
                return;
            case 14:
                ei.k3 k3Var = (ei.k3) this.f1438c;
                if (this.f1437b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                k3Var.N0 = f16;
                k3Var.h();
                return;
            case 15:
                fi.p pVar = (fi.p) this.f1438c;
                if (pVar.f10028w != null && (radialProgressView = pVar.f10029x) != null) {
                    if (!this.f1437b) {
                        radialProgressView.setVisibility(4);
                        pVar.f10027s.setVisibility(4);
                    }
                    pVar.f10028w = null;
                    return;
                }
                return;
            case 16:
                gg.m1 m1Var = (gg.m1) this.f1438c;
                boolean z17 = this.f1437b;
                if (z17) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                m1Var.f10730e = f17;
                m1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    m1Var.f10729c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10730e));
                    TextView textView = m1Var.f10729c[i15];
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
                    TextView textView2 = m1Var.f10729c[i15];
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
                    textView2.setAlpha(AndroidUtilities.lerp(f18, f19, m1Var.f10730e));
                    m1Var.d[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10730e));
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
                    textView4.setAlpha(AndroidUtilities.lerp(f20, f21, m1Var.f10730e));
                }
                return;
            case 17:
                if (this.f1437b) {
                    ((lg.p) this.f1438c).e(false, false, true, false);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f1438c;
                if (this.f1437b) {
                    f22 = 1.0f;
                } else {
                    f22 = 0.0f;
                }
                e1Var.setTextColor(i0.a.d(f22, -1, -9194260));
                e1Var.setIconColor(i0.a.d(f22, -1, -9194260));
                return;
            case 19:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f1438c;
                boolean z18 = this.f1437b;
                if (z18) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                h4Var.Y0 = f23;
                h4Var.f38281q0.setTranslationY(((1.0f - f23) * AndroidUtilities.dp(51.0f)) + h4Var.f38280p0);
                if (!z18) {
                    h4Var.f38281q0.setVisibility(8);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f1438c;
                if (!this.f1437b) {
                    b5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.q4) b5Var).G;
                    if (mVar3.f7950a) {
                        mVar3.f7950a = false;
                        if (((org.telegram.ui.q4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.f7952c).removeView((org.telegram.ui.q4) mVar3.d);
                        }
                        org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) mVar3.d;
                        q4Var.E = true;
                        org.telegram.ui.y4 y4Var = q4Var.f36275y;
                        if (y4Var != null) {
                            if (y4Var.f44254g) {
                                y4Var.f44254g = false;
                                y4Var.f44250b.removeObserver(y4Var.f44249a, y4Var.f44252e);
                            }
                            q4Var.f36275y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.f7951b).requestDisallowInterceptTouchEvent(false);
                        mVar3.f7951b = null;
                        mVar3.f7952c = null;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f1438c;
                org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
                int g10 = t1Var.g();
                int i17 = u1Var.f23210hd;
                if (i17 != g10) {
                    u1Var.t1(i17, g10, this.f1437b);
                    return;
                }
                u1Var.f23254kd = false;
                t1Var.a2 = i17;
                return;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.f1438c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.f1437b) {
                        f2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f1438c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.f1437b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1438c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f1437b) {
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
                org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) this.f1438c;
                AnimatorSet animatorSet3 = bbVar.f21885f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f21885f = null;
                    if (!this.f1437b) {
                        bbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageView imageView = ((org.telegram.ui.na) this.f1438c).d;
                if (this.f1437b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 27:
                ld ldVar = (ld) this.f1438c;
                if (ldVar.f39609n != null && (idVar = ldVar.h) != null) {
                    if (this.f1437b) {
                        idVar.setVisibility(4);
                    } else {
                        ldVar.f39614r.setVisibility(4);
                    }
                    ldVar.f39609n = null;
                    return;
                }
                return;
            case 28:
                zn znVar = (zn) this.f1438c;
                AnimatorSet animatorSet4 = znVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f1437b) {
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
                uo uoVar = (uo) this.f1438c;
                if (uoVar.h != null && (radialProgressView2 = uoVar.f42671n) != null) {
                    if (!this.f1437b) {
                        radialProgressView2.setVisibility(4);
                        uoVar.f42663f.setVisibility(4);
                    }
                    uoVar.h = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1436a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.f1438c).performHapticFeedback(3);
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
