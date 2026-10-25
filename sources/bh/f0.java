package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import bi.r1;
import di.h1;
import di.m2;
import di.o1;
import di.q4;
import di.y9;
import fi.e6;
import fi.e9;
import fi.k4;
import fi.o3;
import fi.sb;
import hi.m3;
import ig.m1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x5;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.t91;
import org.telegram.ui.c5;
import org.telegram.ui.f5;
import org.telegram.ui.j4;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.qa;
import org.telegram.ui.un;
import org.telegram.ui.v4;
public final class f0 extends AnimatorListenerAdapter {
    public final int f4027a;
    public final boolean f4028b;
    public final Object f4029c;

    public f0(int i10, Object obj, boolean z10) {
        this.f4027a = i10;
        this.f4029c = obj;
        this.f4028b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4027a) {
            case 17:
                ((ii.o) this.f4029c).f14398x = null;
                return;
            case 23:
                d2 d2Var = (d2) this.f4029c;
                AnimatorSet animatorSet = d2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.R = null;
                    return;
                }
                return;
            case 24:
                x5 x5Var = (x5) this.f4029c;
                AnimatorSet animatorSet2 = x5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x5Var.J = null;
                    return;
                }
                return;
            case 26:
                eb ebVar = (eb) this.f4029c;
                AnimatorSet animatorSet3 = ebVar.f24045f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f24045f = null;
                    return;
                }
                return;
            case 28:
                ((nd) this.f4029c).f41860r = null;
                return;
            case 29:
                un unVar = (un) this.f4029c;
                AnimatorSet animatorSet4 = unVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    unVar.T0 = null;
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
        h1 h1Var;
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
        kd kdVar;
        View view;
        switch (this.f4027a) {
            case 0:
                i0 i0Var = (i0) this.f4029c;
                fl0 fl0Var = i0Var.f4057n;
                i0Var.k();
                i0Var.l();
                boolean z12 = this.f4028b;
                i0.a(i0Var, z12);
                i0Var.f4056m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                i0Var.f4053j = f7;
                boolean z13 = true;
                if (z12) {
                    i0Var.f4054k = true;
                    i0Var.f4047a.invalidate();
                }
                fl0Var.setCustomEmojiEnterProgress(Utilities.clamp(i0Var.f4053j, 1.0f, 0.0f));
                if (!z12) {
                    fl0Var.setImportantForAccessibility(0);
                    fl0Var.setSkipDraw(false);
                    i0Var.f();
                    Runtime.getRuntime().gc();
                    int i13 = i0Var.f4067y;
                    fl0Var.setCustomEmojiReactionsBackground((i13 == 4 || i13 == 5) ? false : false);
                }
                i0Var.C = false;
                return;
            case 1:
                di.r rVar = (di.r) this.f4029c;
                if (this.f4028b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar.f9077d0 = f10;
                rVar.b();
                return;
            case 2:
                m2 m2Var = (m2) this.f4029c;
                r1 r1Var = m2Var.f9344c;
                float f26 = 0.0f;
                boolean z14 = this.f4028b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                r1Var.setAlpha(f11);
                View view2 = m2Var.f9340a;
                if (!z14) {
                    f26 = 0.5f;
                }
                view2.setAlpha(f26);
                m2Var.invalidate();
                return;
            case 3:
                o1 o1Var = (o1) this.f4029c;
                o1Var.f8858b.removeViewImmediate(o1Var.d);
                o1Var.f8860f.b();
                if (this.f4028b && (h1Var = o1Var.v) != null && h1Var != h1.W) {
                    h1Var.e();
                }
                o1Var.v = null;
                o1Var.f8863s = true;
                o1Var.G = null;
                o1Var.E = false;
                return;
            case 4:
                y9 y9Var = (y9) this.f4029c;
                y9Var.J0.unlock();
                if (this.f4028b) {
                    f12 = y9Var.f9465w.f8428c;
                } else {
                    f12 = 0.0f;
                }
                y9Var.f9427e0 = f12;
                q4 currentPeerView = y9Var.f9445n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                y9Var.v.invalidate();
                y9Var.f9464v1 = null;
                return;
            case 5:
                ei.v vVar = (ei.v) this.f4029c;
                float f27 = 0.0f;
                boolean z15 = this.f4028b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                vVar.f10022w = f13;
                t91 t91Var = vVar.f10020r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                t91Var.setTranslationY(AndroidUtilities.dp(f14));
                ei.a aVar = vVar.f10019n;
                if (z15) {
                    f27 = 42.0f;
                }
                aVar.setTranslationY(AndroidUtilities.dp(f27));
                return;
            case 6:
                ei.r rVar2 = (ei.r) this.f4029c;
                ei.h hVar = rVar2.h;
                ei.i iVar = rVar2.f10004f;
                ei.l lVar = rVar2.v;
                rVar2.f10002b = false;
                boolean z16 = this.f4028b;
                if (z16) {
                    int i14 = rVar2.e;
                    rVar2.d = i14;
                    rVar2.W.f10024y = i14;
                    SharedConfig.setStoriesColumnsCount(i14);
                }
                int h = lVar.h();
                if (z16) {
                    hVar.z1(rVar2.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar2.f10006r.setVisibility(8);
                int i15 = rVar2.S;
                if (i15 >= 0) {
                    if (z16 && (m10 = rVar2.f10007s.m(i15)) != null) {
                        rVar2.T = m10.getTop();
                    }
                    hVar.h1(rVar2.S, (-iVar.getPaddingTop()) + rVar2.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                fi.d dVar = (fi.d) this.f4029c;
                if (this.f4028b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.P = f15;
                dVar.invalidate();
                return;
            case 8:
                fi.m mVar = (fi.m) this.f4029c;
                boolean z17 = this.f4028b;
                if (!z17) {
                    mVar.f11212r.setVisibility(8);
                    fi.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z17) {
                    mVar.f11199f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z17);
                return;
            case 9:
                fi.y yVar = (fi.y) this.f4029c;
                fi.v vVar2 = yVar.f11977a;
                boolean z18 = this.f4028b;
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
                if (!this.f4028b) {
                    ((o3) this.f4029c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f4028b) {
                    ((k4) this.f4029c).f11107b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                e6 e6Var = (e6) this.f4029c;
                if (!this.f4028b) {
                    e6Var.O1.setVisibility(8);
                    e6Var.O1.n();
                    return;
                }
                return;
            case 13:
                e9 e9Var = (e9) this.f4029c;
                if (this.f4028b) {
                    e9Var.setVisibility(8);
                }
                e9Var.f10836c = null;
                return;
            case 14:
                sb sbVar = (sb) this.f4029c;
                if (!this.f4028b) {
                    sbVar.V0.setVisibility(8);
                }
                sbVar.f11625f2 = null;
                return;
            case 15:
                m3 m3Var = (m3) this.f4029c;
                if (this.f4028b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                m3Var.R0 = f17;
                m3Var.h();
                return;
            case 16:
                m1 m1Var = (m1) this.f4029c;
                boolean z19 = this.f4028b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                m1Var.e = f18;
                m1Var.invalidate();
                for (int i16 = 0; i16 < 2; i16++) {
                    m1Var.f14165c[i16].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    TextView textView = m1Var.f14165c[i16];
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
                    TextView textView2 = m1Var.f14165c[i16];
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
                ii.o oVar = (ii.o) this.f4029c;
                if (oVar.f14398x != null && (radialProgressView = oVar.f14399y) != null) {
                    if (!this.f4028b) {
                        radialProgressView.setVisibility(4);
                        oVar.v.setVisibility(4);
                    }
                    oVar.f14398x = null;
                    return;
                }
                return;
            case 18:
                if (this.f4028b) {
                    ((ng.p) this.f4029c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                g1 g1Var = (g1) this.f4029c;
                if (this.f4028b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                g1Var.setTextColor(i0.a.f(f23, -1, -9194260));
                g1Var.setIconColor(i0.a.f(f23, -1, -9194260));
                return;
            case 20:
                j4 j4Var = (j4) this.f4029c;
                boolean z20 = this.f4028b;
                if (z20) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                j4Var.Z0 = f24;
                j4Var.f40442q0.setTranslationY(((1.0f - f24) * AndroidUtilities.dp(51.0f)) + j4Var.f40441p0);
                if (!z20) {
                    j4Var.f40442q0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                f5 f5Var = (f5) this.f4029c;
                if (!this.f4028b) {
                    f5Var.setVisibility(4);
                    c2.b bVar = ((v4) f5Var).G;
                    if (bVar.f5929a) {
                        bVar.f5929a = false;
                        if (((v4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.f5931c).removeView((v4) bVar.d);
                        }
                        v4 v4Var = (v4) bVar.d;
                        v4Var.E = true;
                        c5 c5Var = v4Var.f39259y;
                        if (c5Var != null) {
                            if (c5Var.f38265g) {
                                c5Var.f38265g = false;
                                c5Var.f38262b.removeObserver(c5Var.f38261a, c5Var.e);
                            }
                            v4Var.f39259y = null;
                        }
                        bVar.d = null;
                        ((ViewGroup) bVar.f5930b).requestDisallowInterceptTouchEvent(false);
                        bVar.f5930b = null;
                        bVar.f5931c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                s1 s1Var = (s1) this.f4029c;
                org.telegram.ui.Cells.r1 r1Var2 = s1Var.Zc;
                int g7 = r1Var2.g();
                int i18 = s1Var.f25124hd;
                if (i18 != g7) {
                    s1Var.t1(i18, g7, this.f4028b);
                    return;
                }
                s1Var.f25166kd = false;
                r1Var2.a2 = i18;
                return;
            case 23:
                d2 d2Var = (d2) this.f4029c;
                AnimatorSet animatorSet = d2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.R = null;
                    if (!this.f4028b) {
                        d2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                x5 x5Var = (x5) this.f4029c;
                AnimatorSet animatorSet2 = x5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x5Var.J = null;
                    if (!this.f4028b) {
                        x5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                w7 w7Var = (w7) this.f4029c;
                ValueAnimator valueAnimator = w7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f4028b) {
                        f25 = 1.0f;
                    } else {
                        f25 = 0.0f;
                    }
                    w7Var.B0 = f25;
                    w7Var.A0 = null;
                    return;
                }
                return;
            case 26:
                eb ebVar = (eb) this.f4029c;
                AnimatorSet animatorSet3 = ebVar.f24045f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f24045f = null;
                    if (!this.f4028b) {
                        ebVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((qa) this.f4029c).d;
                if (this.f4028b) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                return;
            case 28:
                nd ndVar = (nd) this.f4029c;
                if (ndVar.f41860r != null && (kdVar = ndVar.f41855n) != null) {
                    if (this.f4028b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.f41862s.setVisibility(4);
                    }
                    ndVar.f41860r = null;
                    return;
                }
                return;
            default:
                un unVar = (un) this.f4029c;
                AnimatorSet animatorSet4 = unVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f4028b) {
                        unVar.G0.setVisibility(4);
                        return;
                    }
                    if (unVar.C0) {
                        view = unVar.D0;
                    } else {
                        view = unVar.B0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4027a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((di.r) this.f4029c).performHapticFeedback(3);
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
