package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import fi.f9;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.ia;
import org.telegram.ui.xc;
public final class e7 extends AnimatorListenerAdapter {
    public final int f3586a;
    public final boolean f3587b;
    public final Object f3588c;

    public e7(int i7, Object obj, boolean z10) {
        this.f3586a = i7;
        this.f3588c = obj;
        this.f3587b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3586a) {
            case 17:
                ((li.p) this.f3588c).f19990y = null;
                return;
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.f3588c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) this.f3588c;
                AnimatorSet animatorSet2 = r5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.L = null;
                    return;
                }
                return;
            case 26:
                ta taVar = (ta) this.f3588c;
                AnimatorSet animatorSet3 = taVar.f32001f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f32001f = null;
                    return;
                }
                return;
            case 28:
                ((ad) this.f3588c).f45560r = null;
                return;
            case 29:
                bn bnVar = (bn) this.f3588c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bnVar.W0 = null;
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View m10;
        float f16;
        float f17;
        int i7;
        float f18;
        boolean z10;
        int i10;
        float f19;
        float f20;
        boolean z11;
        float f21;
        float f22;
        float f23;
        RadialProgressView radialProgressView;
        float f24;
        float f25;
        float f26;
        int i11;
        xc xcVar;
        View view;
        switch (this.f3586a) {
            case 0:
                if (!this.f3587b) {
                    ((h8) this.f3588c).f3712w.setVisibility(8);
                    return;
                }
                return;
            case 1:
                ch.b0 b0Var = (ch.b0) this.f3588c;
                vi0 vi0Var = b0Var.f5308n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f3587b;
                ch.b0.a(b0Var, z12);
                b0Var.f5307m.invalidateOutline();
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b0Var.f5304j = f10;
                boolean z13 = true;
                if (z12) {
                    b0Var.f5305k = true;
                    b0Var.f5297a.invalidate();
                }
                vi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5304j, 1.0f, 0.0f));
                if (!z12) {
                    vi0Var.setImportantForAccessibility(0);
                    vi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f5318y;
                    vi0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 2:
                fi.q qVar = (fi.q) this.f3588c;
                if (this.f3587b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                qVar.f12420e0 = f11;
                qVar.b();
                return;
            case 3:
                fi.a2 a2Var = (fi.a2) this.f3588c;
                di.b1 b1Var = a2Var.f12561c;
                float f27 = 0.0f;
                boolean z14 = this.f3587b;
                if (z14) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                b1Var.setAlpha(f12);
                View view2 = a2Var.f12557a;
                if (!z14) {
                    f27 = 0.5f;
                }
                view2.setAlpha(f27);
                a2Var.invalidate();
                return;
            case 4:
                f9 f9Var = (f9) this.f3588c;
                f9Var.J0.e();
                if (this.f3587b) {
                    f13 = f9Var.f12007x.f12103c;
                } else {
                    f13 = 0.0f;
                }
                f9Var.f11970f0 = f13;
                fi.z3 currentPeerView = f9Var.f11986o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9Var.f12004w.invalidate();
                f9Var.f12003v1 = null;
                return;
            case 5:
                gi.q qVar2 = (gi.q) this.f3588c;
                float f28 = 0.0f;
                boolean z15 = this.f3587b;
                if (z15) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                qVar2.f13676x = f14;
                f71 f71Var = qVar2.f13673r;
                if (z15) {
                    f15 = 0.0f;
                } else {
                    f15 = -42.0f;
                }
                f71Var.setTranslationY(org.telegram.messenger.g0.L(f15));
                n5 n5Var = qVar2.f13672n;
                if (z15) {
                    f28 = 42.0f;
                }
                n5Var.setTranslationY(org.telegram.messenger.g0.L(f28));
                return;
            case 6:
                gi.m mVar = (gi.m) this.f3588c;
                c51 c51Var = mVar.h;
                gi.e eVar = mVar.f13656f;
                gi.h hVar = mVar.f13660w;
                mVar.f13653b = false;
                boolean z16 = this.f3587b;
                if (z16) {
                    int i13 = mVar.f13655e;
                    mVar.d = i13;
                    mVar.f13652a0.E = i13;
                    bz.F(i13);
                }
                int b10 = hVar.b();
                if (z16) {
                    c51Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.Z3(eVar);
                    } else {
                        hVar.f();
                    }
                }
                mVar.f13658r.setVisibility(8);
                int i14 = mVar.T;
                if (i14 >= 0) {
                    if (z16 && (m10 = mVar.f13659s.m(i14)) != null) {
                        mVar.U = m10.getTop();
                    }
                    c51Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                hi.d dVar = (hi.d) this.f3588c;
                if (this.f3587b) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                dVar.Q = f16;
                dVar.invalidate();
                return;
            case 8:
                hi.n nVar = (hi.n) this.f3588c;
                boolean z17 = this.f3587b;
                if (!z17) {
                    nVar.f15064r.setVisibility(8);
                    hi.i iVar = nVar.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z17) {
                    nVar.f15051f.getEditText().setAllowDrawCursor(true);
                }
                nVar.c(z17);
                return;
            case 9:
                hi.z zVar = (hi.z) this.f3588c;
                hi.w wVar = zVar.f15794a;
                boolean z18 = this.f3587b;
                if (z18) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                zVar.d = f17;
                wVar.invalidate();
                if (z18) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                wVar.setVisibility(i7);
                return;
            case 10:
                if (!this.f3587b) {
                    ((hi.e3) this.f3588c).J.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f3587b) {
                    ((hi.x3) this.f3588c).f15716b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                hi.l5 l5Var = (hi.l5) this.f3588c;
                if (!this.f3587b) {
                    l5Var.J1.setVisibility(8);
                    l5Var.J1.n();
                    return;
                }
                return;
            case 13:
                hi.j8 j8Var = (hi.j8) this.f3588c;
                if (this.f3587b) {
                    j8Var.setVisibility(8);
                }
                j8Var.f14827c = null;
                return;
            case 14:
                hi.ta taVar = (hi.ta) this.f3588c;
                if (!this.f3587b) {
                    taVar.W0.setVisibility(8);
                }
                taVar.f15447g2 = null;
                return;
            case 15:
                jg.k1 k1Var = (jg.k1) this.f3588c;
                boolean z19 = this.f3587b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                k1Var.f17562e = f18;
                k1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    k1Var.f17561c[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17562e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView = k1Var.f17561c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z19) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    textView.setVisibility(i10);
                    TextView textView2 = k1Var.f17561c[i15];
                    if (i15 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i15 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f19, f20, k1Var.f17562e));
                    k1Var.d[i15].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17562e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    TextView textView3 = k1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = k1Var.d[i15];
                    if (i15 == 0) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (i15 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    textView4.setAlpha(org.telegram.messenger.g0.T1(f21, f22, k1Var.f17562e));
                }
                return;
            case 16:
                ki.t2 t2Var = (ki.t2) this.f3588c;
                if (this.f3587b) {
                    f23 = 1.0f;
                } else {
                    f23 = 0.0f;
                }
                t2Var.S0 = f23;
                t2Var.l();
                return;
            case 17:
                li.p pVar = (li.p) this.f3588c;
                if (pVar.f19990y != null && (radialProgressView = pVar.E) != null) {
                    if (!this.f3587b) {
                        radialProgressView.setVisibility(4);
                        pVar.f19988w.setVisibility(4);
                    }
                    pVar.f19990y = null;
                    return;
                }
                return;
            case 18:
                if (this.f3587b) {
                    ((og.o) this.f3588c).e(false, false, true, false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f3588c;
                if (this.f3587b) {
                    f24 = 1.0f;
                } else {
                    f24 = 0.0f;
                }
                z0Var.setTextColor(i0.a.f(f24, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f24, -1, -9194260));
                return;
            case 20:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f3588c;
                boolean z20 = this.f3587b;
                if (z20) {
                    f25 = 1.0f;
                } else {
                    f25 = 0.0f;
                }
                g4Var.f47913a1 = f25;
                g4Var.f47931r0.setTranslationY(((1.0f - f25) * org.telegram.messenger.g0.L(51.0f)) + g4Var.f47930q0);
                if (!z20) {
                    g4Var.f47931r0.setVisibility(8);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f3588c;
                if (!this.f3587b) {
                    b5Var.setVisibility(4);
                    ab.q qVar3 = ((org.telegram.ui.r4) b5Var).H;
                    if (qVar3.f987a) {
                        qVar3.f987a = false;
                        if (((org.telegram.ui.r4) qVar3.d).getParent() != null) {
                            ((WindowManager) qVar3.f989c).removeView((org.telegram.ui.r4) qVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) qVar3.d;
                        r4Var.F = true;
                        org.telegram.ui.y4 y4Var = r4Var.E;
                        if (y4Var != null) {
                            if (y4Var.f54022g) {
                                y4Var.f54022g = false;
                                y4Var.f54018b.n(y4Var.f54017a, y4Var.f54020e);
                            }
                            r4Var.E = null;
                        }
                        qVar3.d = null;
                        ((ViewGroup) qVar3.f988b).requestDisallowInterceptTouchEvent(false);
                        qVar3.f988b = null;
                        qVar3.f989c = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f3588c;
                org.telegram.ui.Cells.x1 x1Var = q1Var.f31390ib;
                int b11 = x1Var.b();
                int i17 = q1Var.f31495qb;
                if (i17 != b11) {
                    q1Var.B0(i17, b11, this.f3587b);
                    return;
                }
                q1Var.f31536tb = false;
                x1Var.f32305b2 = i17;
                return;
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.f3588c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    if (!this.f3587b) {
                        h2Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) this.f3588c;
                AnimatorSet animatorSet2 = r5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.L = null;
                    if (!this.f3587b) {
                        r5Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f3588c;
                ValueAnimator valueAnimator = o7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (this.f3587b) {
                        f26 = 1.0f;
                    } else {
                        f26 = 0.0f;
                    }
                    o7Var.C0 = f26;
                    o7Var.B0 = null;
                    return;
                }
                return;
            case 26:
                ta taVar2 = (ta) this.f3588c;
                AnimatorSet animatorSet3 = taVar2.f32001f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar2.f32001f = null;
                    if (!this.f3587b) {
                        taVar2.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ImageView imageView = ((ia) this.f3588c).d;
                if (this.f3587b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                return;
            case 28:
                ad adVar = (ad) this.f3588c;
                if (adVar.f45560r != null && (xcVar = adVar.f45555n) != null) {
                    if (this.f3587b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.f45562s.setVisibility(4);
                    }
                    adVar.f45560r = null;
                    return;
                }
                return;
            default:
                bn bnVar = (bn) this.f3588c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f3587b) {
                        bnVar.J0.setVisibility(4);
                        return;
                    }
                    if (bnVar.F0) {
                        view = bnVar.G0;
                    } else {
                        view = bnVar.E0;
                    }
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3586a) {
            case 2:
                super.onAnimationStart(animator);
                try {
                    ((fi.q) this.f3588c).performHapticFeedback(3);
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
