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
import bi.ce;
import bi.ib;
import bi.p4;
import bi.p5;
import bi.r7;
import di.n3;
import fg.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.fb;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.c5;
import org.telegram.ui.eo;
import org.telegram.ui.j4;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.oa;
import org.telegram.ui.s4;
import org.telegram.ui.yo;
import org.telegram.ui.z4;
public final class e extends AnimatorListenerAdapter {
    public final int f431a;
    public boolean f432b;
    public final Object f433c;

    public e(int i10, Object obj, boolean z10) {
        this.f431a = i10;
        this.f433c = obj;
        this.f432b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f431a) {
            case 11:
                ((ei.p) this.f433c).f7603w = null;
                return;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 27:
            default:
                super.onAnimationCancel(animator);
                return;
            case 18:
                e2 e2Var = (e2) this.f433c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    return;
                }
                return;
            case 19:
                t5 t5Var = (t5) this.f433c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    return;
                }
                return;
            case 21:
                fb fbVar = (fb) this.f433c;
                AnimatorSet animatorSet3 = fbVar.f19172f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fbVar.f19172f = null;
                    return;
                }
                return;
            case 23:
                ((nd) this.f433c).f35234n = null;
                return;
            case 24:
                eo eoVar = (eo) this.f433c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    eoVar.H0 = null;
                    return;
                }
                return;
            case 25:
                ((yo) this.f433c).h = null;
                return;
            case 26:
                ca caVar = (ca) this.f433c;
                AnimatorSet animatorSet5 = caVar.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    caVar.h = null;
                    return;
                }
                return;
            case 28:
                ((yi) this.f433c).Y0 = null;
                return;
            case 29:
                this.f432b = true;
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        View m10;
        float f11;
        float f12;
        int i10;
        float f13;
        RadialProgressView radialProgressView;
        float f14;
        boolean z10;
        int i11;
        float f15;
        float f16;
        boolean z11;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i12;
        kd kdVar;
        View view;
        RadialProgressView radialProgressView2;
        float f22;
        switch (this.f431a) {
            case 0:
                g0 g0Var = (g0) this.f433c;
                boolean z12 = this.f432b;
                float f23 = 0.0f;
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g0Var.f449w = f7;
                u81 u81Var = g0Var.f447r;
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = -42.0f;
                }
                u81Var.setTranslationY(AndroidUtilities.dp(f10));
                c cVar = g0Var.f446n;
                if (z12) {
                    f23 = 42.0f;
                }
                cVar.setTranslationY(AndroidUtilities.dp(f23));
                return;
            case 1:
                a0 a0Var = (a0) this.f433c;
                n nVar = a0Var.h;
                o oVar = a0Var.f414f;
                r rVar = a0Var.v;
                a0Var.f412b = false;
                boolean z13 = this.f432b;
                if (z13) {
                    int i13 = a0Var.e;
                    a0Var.d = i13;
                    a0Var.W.f451y = i13;
                    SharedConfig.setStoriesColumnsCount(i13);
                }
                int h = rVar.h();
                if (z13) {
                    nVar.y1(a0Var.d);
                    oVar.a0();
                    if (rVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(oVar);
                    } else {
                        rVar.l();
                    }
                }
                a0Var.f416r.setVisibility(8);
                int i14 = a0Var.S;
                if (i14 >= 0) {
                    if (z13 && (m10 = a0Var.f417s.m(i14)) != null) {
                        a0Var.T = m10.getTop();
                    }
                    nVar.h1(a0Var.S, (-oVar.getPaddingTop()) + a0Var.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 2:
                bi.d dVar = (bi.d) this.f433c;
                if (this.f432b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                dVar.M = f11;
                dVar.invalidate();
                return;
            case 3:
                bi.o oVar2 = (bi.o) this.f433c;
                boolean z14 = this.f432b;
                if (!z14) {
                    oVar2.f3281r.setVisibility(8);
                    bi.k kVar = oVar2.M;
                    if (kVar != null) {
                        kVar.setVisibility(8);
                    }
                }
                if (z14) {
                    oVar2.f3268f.getEditText().setAllowDrawCursor(true);
                }
                oVar2.c(z14);
                return;
            case 4:
                bi.c0 c0Var = (bi.c0) this.f433c;
                bi.z zVar = c0Var.f2392a;
                boolean z15 = this.f432b;
                if (z15) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                c0Var.d = f12;
                zVar.invalidate();
                if (z15) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                zVar.setVisibility(i10);
                return;
            case 5:
                if (!this.f432b) {
                    ((p4) this.f433c).I.setVisibility(8);
                    return;
                }
                return;
            case 6:
                if (!this.f432b) {
                    ((p5) this.f433c).f3388b.setVisibility(8);
                    return;
                }
                return;
            case 7:
                r7 r7Var = (r7) this.f433c;
                if (!this.f432b) {
                    r7Var.Z1.setVisibility(8);
                    r7Var.Z1.n();
                    return;
                }
                return;
            case 8:
                ib ibVar = (ib) this.f433c;
                if (this.f432b) {
                    ibVar.setVisibility(8);
                }
                ibVar.f2890c = null;
                return;
            case 9:
                ce ceVar = (ce) this.f433c;
                if (!this.f432b) {
                    ceVar.V0.setVisibility(8);
                }
                ceVar.f2450f2 = null;
                return;
            case 10:
                n3 n3Var = (n3) this.f433c;
                if (this.f432b) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                n3Var.N0 = f13;
                n3Var.h();
                return;
            case 11:
                ei.p pVar = (ei.p) this.f433c;
                if (pVar.f7603w != null && (radialProgressView = pVar.f7604x) != null) {
                    if (!this.f432b) {
                        radialProgressView.setVisibility(4);
                        pVar.f7602s.setVisibility(4);
                    }
                    pVar.f7603w = null;
                    return;
                }
                return;
            case 12:
                o1 o1Var = (o1) this.f433c;
                boolean z16 = this.f432b;
                if (z16) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                o1Var.e = f14;
                o1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    o1Var.f8160c[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    TextView textView = o1Var.f8160c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z16) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = o1Var.f8160c[i15];
                    if (i15 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (i15 == 1) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f15, f16, o1Var.e));
                    o1Var.d[i15].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    TextView textView3 = o1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z16) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = o1Var.d[i15];
                    if (i15 == 0) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (i15 == 1) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    textView4.setAlpha(AndroidUtilities.lerp(f17, f18, o1Var.e));
                }
                return;
            case 13:
                if (this.f432b) {
                    ((kg.p) this.f433c).e(false, false, true, false);
                    return;
                }
                return;
            case 14:
                g1 g1Var = (g1) this.f433c;
                if (this.f432b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                g1Var.setTextColor(i0.a.d(f19, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f19, -1, -9194260));
                return;
            case 15:
                j4 j4Var = (j4) this.f433c;
                boolean z17 = this.f432b;
                if (z17) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                j4Var.Y0 = f20;
                j4Var.f33916q0.setTranslationY(((1.0f - f20) * AndroidUtilities.dp(51.0f)) + j4Var.f33915p0);
                if (!z17) {
                    j4Var.f33916q0.setVisibility(8);
                    return;
                }
                return;
            case 16:
                c5 c5Var = (c5) this.f433c;
                if (!this.f432b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar = ((s4) c5Var).G;
                    if (mVar.f6100a) {
                        mVar.f6100a = false;
                        if (((s4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.f6102c).removeView((s4) mVar.d);
                        }
                        s4 s4Var = (s4) mVar.d;
                        s4Var.E = true;
                        z4 z4Var = s4Var.f31540y;
                        if (z4Var != null) {
                            if (z4Var.f39209g) {
                                z4Var.f39209g = false;
                                z4Var.f39206b.removeObserver(z4Var.f39205a, z4Var.e);
                            }
                            s4Var.f31540y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.f6101b).requestDisallowInterceptTouchEvent(false);
                        mVar.f6101b = null;
                        mVar.f6102c = null;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                t1 t1Var = (t1) this.f433c;
                s1 s1Var = t1Var.Zc;
                int g10 = s1Var.g();
                int i17 = t1Var.f20163hd;
                if (i17 != g10) {
                    t1Var.t1(i17, g10, this.f432b);
                    return;
                }
                t1Var.f20207kd = false;
                s1Var.a2 = i17;
                return;
            case 18:
                e2 e2Var = (e2) this.f433c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    if (!this.f432b) {
                        e2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                t5 t5Var = (t5) this.f433c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.f432b) {
                        t5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                u7 u7Var = (u7) this.f433c;
                ValueAnimator valueAnimator = u7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f432b) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    u7Var.B0 = f21;
                    u7Var.A0 = null;
                    return;
                }
                return;
            case 21:
                fb fbVar = (fb) this.f433c;
                AnimatorSet animatorSet3 = fbVar.f19172f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fbVar.f19172f = null;
                    if (!this.f432b) {
                        fbVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ImageView imageView = ((oa) this.f433c).d;
                if (this.f432b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 23:
                nd ndVar = (nd) this.f433c;
                if (ndVar.f35234n != null && (kdVar = ndVar.h) != null) {
                    if (this.f432b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f35239r.setVisibility(4);
                    }
                    ndVar.f35234n = null;
                    return;
                }
                return;
            case 24:
                eo eoVar = (eo) this.f433c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f432b) {
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
            case 25:
                yo yoVar = (yo) this.f433c;
                if (yoVar.h != null && (radialProgressView2 = yoVar.f39055n) != null) {
                    if (!this.f432b) {
                        radialProgressView2.setVisibility(4);
                        yoVar.f39047f.setVisibility(4);
                    }
                    yoVar.h = null;
                    return;
                }
                return;
            case 26:
                ca caVar = (ca) this.f433c;
                AnimatorSet animatorSet5 = caVar.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f432b) {
                        caVar.f22060c.setVisibility(4);
                        return;
                    } else {
                        caVar.f22059b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 27:
                xc xcVar = (xc) this.f433c;
                if (animator == xcVar.f29007g) {
                    xcVar.f29007g = null;
                    if (this.f432b) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    xcVar.f29008i = f22;
                    xcVar.b();
                    return;
                }
                return;
            case 28:
                yi yiVar = (yi) this.f433c;
                if (yiVar.Y0 != null) {
                    if (this.f432b) {
                        if (yiVar.S0) {
                            qi qiVar = yiVar.f29427y0;
                            if (qiVar == null || qiVar.J()) {
                                yiVar.f29424x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    w0 w0Var = yiVar.f29363e1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                    }
                    if (yiVar.Q0 != 0 || !yiVar.f29399q1) {
                        yiVar.f29350a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            default:
                oo ooVar = (oo) this.f433c;
                if (!this.f432b) {
                    w9 w9Var = ooVar.h;
                    ooVar.h = ooVar.f25852n;
                    ooVar.f25852n = w9Var;
                    w9Var.setVisibility(8);
                    ooVar.f25852n.setAlpha(0.0f);
                    ooVar.h.setVisibility(0);
                    ooVar.h.setAlpha(1.0f);
                    return;
                }
                return;
        }
    }

    public e(oo ooVar) {
        this.f431a = 29;
        this.f433c = ooVar;
    }
}
