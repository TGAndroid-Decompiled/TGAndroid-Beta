package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
public final class gf4 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final Object c;

    public gf4(View view) {
        this.a = (byte) 7;
        this.c = view;
        this.b = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                ah4 ah4Var = (ah4) obj;
                AnimatorSet animatorSet = ah4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ah4Var.p1 = null;
                    return;
                }
                return;
            case 6:
                ((xc5) obj).h = null;
                return;
            case 8:
                bt5 bt5Var = (bt5) obj;
                AnimatorSet animatorSet2 = bt5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bt5Var.R1 = null;
                    return;
                }
                return;
            case 20:
                d88 d88Var = (d88) obj;
                AnimatorSet animatorSet3 = d88Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    d88Var.L = null;
                    return;
                }
                return;
            case 21:
                l98 l98Var = (l98) obj;
                if (animator.equals(l98Var.l0)) {
                    l98Var.l0 = null;
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
        di1 di1Var;
        float f;
        boolean z;
        int i;
        float f2;
        float f3;
        boolean z2;
        int i2;
        float f4;
        float f5;
        float f6;
        byte b = this.a;
        int i3 = 4;
        float f7 = 1.0f;
        float f8 = 0.0f;
        boolean z3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                hf4 hf4Var = (hf4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                hf4Var.s = f7;
                hf4Var.invalidate();
                return;
            case 1:
                ah4 ah4Var = (ah4) obj;
                AnimatorSet animatorSet = ah4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z3) {
                        ah4Var.q1.setVisibility(4);
                    }
                    ah4Var.p1 = null;
                    return;
                }
                return;
            case 2:
                mn4 mn4Var = (mn4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                mn4Var.n = f7;
                mn4Var.invalidate();
                return;
            case 3:
                if (!z3) {
                    ((wt4) obj).J.setVisibility(8);
                    return;
                }
                return;
            case 4:
                j95 j95Var = (j95) obj;
                j95Var.J4 = null;
                ema subtitleTextView = j95Var.H1.getSubtitleTextView();
                if (!z3) {
                    f8 = hl.L(20.0f);
                }
                subtitleTextView.setTranslationY(f8);
                return;
            case 5:
                ra5 ra5Var = (ra5) obj;
                pa5 pa5Var = ra5Var.a;
                if (!ra5Var.H) {
                    if (z3) {
                        f8 = 1.0f;
                    }
                    ra5Var.d0 = f8;
                    ra5Var.W.setPinnedProgress(f8);
                    pa5Var.setScaleX(1.0f - (ra5Var.d0 * 0.6f));
                    pa5Var.setScaleY(1.0f - (ra5Var.d0 * 0.6f));
                    if (ra5Var.Y) {
                        ra5Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                xc5 xc5Var = (xc5) obj;
                if (xc5Var.h != null && (di1Var = xc5Var.f) != null) {
                    if (z3) {
                        di1Var.setVisibility(4);
                    } else {
                        xc5Var.n.setVisibility(4);
                    }
                    xc5Var.h = null;
                    return;
                }
                return;
            case 7:
                super.onAnimationEnd(animator);
                View view = (View) obj;
                if (z3) {
                    i3 = 8;
                }
                view.setVisibility(i3);
                return;
            case 8:
                bt5 bt5Var = (bt5) obj;
                AnimatorSet animatorSet2 = bt5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z3) {
                        bt5Var.S1.setVisibility(4);
                    }
                    bt5Var.R1 = null;
                    return;
                }
                return;
            case 9:
                lt5 lt5Var = (lt5) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                lt5Var.b2 = f7;
                lt5Var.b.invalidate();
                if (!z3) {
                    lt5Var.P1.setVisibility(8);
                    return;
                }
                return;
            case 10:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z3) {
                    limitPreviewView.k0 = false;
                }
                Runnable runnable = limitPreviewView.l0;
                if (runnable != null) {
                    hl.r(runnable);
                    limitPreviewView.l0.run();
                    return;
                }
                return;
            case 11:
                b58 b58Var = (b58) obj;
                gu guVar = b58Var.c;
                if (z3) {
                    f7 = 0.0f;
                }
                guVar.setAlpha(f7);
                View view2 = b58Var.a;
                if (!z3) {
                    f8 = 0.5f;
                }
                view2.setAlpha(f8);
                b58Var.invalidate();
                return;
            case 12:
                qh6 qh6Var = (qh6) obj;
                if (!z3) {
                    qh6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = qh6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    qh6Var.M = null;
                    return;
                }
                return;
            case 13:
                s57 s57Var = (s57) obj;
                if (s57Var.getParent() != null) {
                    ((ViewGroup) s57Var.getParent()).removeView(s57Var);
                }
                ks1 ks1Var = (ks1) s57Var;
                v47 v47Var = ks1Var.I.x5;
                if (v47Var != null) {
                    v47Var.x = null;
                }
                if (z3) {
                    hl.d3(new js1(ks1Var, (byte) 1), 15L);
                    return;
                }
                return;
            case 14:
                m57 m57Var = (m57) obj;
                m57Var.Q = null;
                m57Var.g(z3, false);
                return;
            case 15:
                xc7 xc7Var = (xc7) obj;
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                xc7Var.e = f;
                xc7Var.invalidate();
                for (int i4 = 0; i4 < 2; i4++) {
                    xc7Var.c[i4].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    TextView textView = xc7Var.c[i4];
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z == z3) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    TextView textView2 = xc7Var.c[i4];
                    if (i4 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (i4 == 1) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    textView2.setAlpha(hl.R1(f2, f3, xc7Var.e));
                    xc7Var.d[i4].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    TextView textView3 = xc7Var.d[i4];
                    if (i4 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 == z3) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    textView3.setVisibility(i2);
                    TextView textView4 = xc7Var.d[i4];
                    if (i4 == 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    if (i4 == 1) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    textView4.setAlpha(hl.R1(f4, f5, xc7Var.e));
                }
                return;
            case 16:
                if (!z3) {
                    ((mj7) obj).b.setVisibility(8);
                    return;
                }
                return;
            case 17:
                dx7 dx7Var = (dx7) obj;
                if (!z3) {
                    dx7Var.J1.setVisibility(8);
                    dx7Var.J1.k();
                    return;
                }
                return;
            case 18:
                if (!z3) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    return;
                }
                return;
            case 19:
                fz7 fz7Var = (fz7) obj;
                TextView textView5 = fz7Var.x;
                b6 b6Var = fz7Var.e;
                if (z3) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                b6Var.setScaleX(hl.R1(0.8f, 1.0f, f6));
                b6Var.setScaleY(hl.R1(0.8f, 1.0f, f6));
                b6Var.setAlpha(hl.R1(0.0f, 1.0f, f6));
                textView5.setScaleX(hl.R1(1.0f, 0.9f, f6));
                textView5.setScaleY(hl.R1(1.0f, 0.9f, f6));
                textView5.setAlpha(hl.R1(1.0f, 0.0f, f6));
                fz7Var.s.setAlpha(hl.R1(0.0f, 1.0f, f6));
                return;
            case 20:
                d88 d88Var = (d88) obj;
                AnimatorSet animatorSet4 = d88Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    d88Var.L = null;
                    if (!z3) {
                        d88Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                l98 l98Var = (l98) obj;
                if (animator.equals(l98Var.l0)) {
                    if (!z3) {
                        l98Var.a0.setVisibility(4);
                        l98Var.b0.setVisibility(4);
                    }
                    l98Var.l0 = null;
                    return;
                }
                return;
            case 22:
                oe8 oe8Var = (oe8) obj;
                ((im2) oe8Var).E.r1.e();
                if (z3) {
                    oe8Var.x.accept(Integer.valueOf(oe8Var.s));
                }
                if (oe8Var.getParent() != null) {
                    ((ViewGroup) oe8Var.getParent()).removeView(oe8Var);
                    return;
                }
                return;
            case 23:
                ji8 ji8Var = (ji8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                ji8Var.F = f7;
                return;
            case 24:
                ok8 ok8Var = (ok8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                ok8Var.P = f7;
                ok8Var.f.invalidate();
                mk8 mk8Var = ok8Var.h;
                if (mk8Var != null) {
                    mk8Var.invalidate();
                    return;
                }
                return;
            case 25:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                if (yr8Var.h) {
                    sla slaVar = profileActivity.U0;
                    if (slaVar != null) {
                        slaVar.setClickable(false);
                    }
                } else {
                    yr8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.i4(false);
                return;
            case 26:
                hx8 hx8Var = (hx8) obj;
                if (z3) {
                    hx8Var.c.setVisibility(8);
                    return;
                } else {
                    hx8Var.f.setVisibility(8);
                    return;
                }
            case 27:
                if (!z3) {
                    ((nd9) obj).x.setVisibility(8);
                    return;
                }
                return;
            case 28:
                ow9 ow9Var = (ow9) obj;
                if (animator == ow9Var.H) {
                    if (!z3) {
                        f7 = 0.0f;
                    }
                    ow9Var.G = f7;
                    ow9Var.setShown(f7);
                    if (!z3) {
                        ow9Var.setVisibility(8);
                    }
                    ow9Var.b(true);
                    return;
                }
                return;
            default:
                ky9 ky9Var = (ky9) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                ky9Var.w = f7;
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 12:
                if (z) {
                    ((qh6) obj).W.setVisibility(0);
                    return;
                }
                return;
            case 18:
                if (z) {
                    ((PasscodeActivity) obj).w.setVisibility(0);
                    return;
                }
                return;
            case 25:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                sla slaVar = profileActivity.U0;
                if (slaVar != null && !z) {
                    slaVar.setClickable(true);
                }
                profileActivity.X3(true);
                yr8Var.setVisibility(0);
                profileActivity.i4(false);
                return;
            case 26:
                hx8 hx8Var = (hx8) obj;
                ImageView imageView = hx8Var.c;
                og2 og2Var = hx8Var.f;
                if (z) {
                    og2Var.setAlpha(0.0f);
                    og2Var.setVisibility(0);
                    return;
                }
                imageView.setAlpha(0.0f);
                imageView.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public gf4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public gf4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
