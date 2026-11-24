package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
public final class jf4 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final Object c;

    public jf4(View view) {
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
                dh4 dh4Var = (dh4) obj;
                AnimatorSet animatorSet = dh4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dh4Var.p1 = null;
                    return;
                }
                return;
            case 6:
                ((uc5) obj).h = null;
                return;
            case 8:
                xs5 xs5Var = (xs5) obj;
                AnimatorSet animatorSet2 = xs5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xs5Var.R1 = null;
                    return;
                }
                return;
            case 20:
                q68 q68Var = (q68) obj;
                AnimatorSet animatorSet3 = q68Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    q68Var.L = null;
                    return;
                }
                return;
            case 21:
                w78 w78Var = (w78) obj;
                if (animator.equals(w78Var.l0)) {
                    w78Var.l0 = null;
                    return;
                }
                return;
            case 22:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
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
        cj1 cj1Var;
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
                kf4 kf4Var = (kf4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                kf4Var.s = f7;
                kf4Var.invalidate();
                return;
            case 1:
                dh4 dh4Var = (dh4) obj;
                AnimatorSet animatorSet = dh4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z3) {
                        dh4Var.q1.setVisibility(4);
                    }
                    dh4Var.p1 = null;
                    return;
                }
                return;
            case 2:
                hn4 hn4Var = (hn4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                hn4Var.n = f7;
                hn4Var.invalidate();
                return;
            case 3:
                if (!z3) {
                    ((tt4) obj).J.setVisibility(8);
                    return;
                }
                return;
            case 4:
                g95 g95Var = (g95) obj;
                g95Var.J4 = null;
                lka subtitleTextView = g95Var.H1.getSubtitleTextView();
                if (!z3) {
                    f8 = gm.L(20.0f);
                }
                subtitleTextView.setTranslationY(f8);
                return;
            case 5:
                oa5 oa5Var = (oa5) obj;
                ma5 ma5Var = oa5Var.a;
                if (!oa5Var.H) {
                    if (z3) {
                        f8 = 1.0f;
                    }
                    oa5Var.d0 = f8;
                    oa5Var.W.setPinnedProgress(f8);
                    ma5Var.setScaleX(1.0f - (oa5Var.d0 * 0.6f));
                    ma5Var.setScaleY(1.0f - (oa5Var.d0 * 0.6f));
                    if (oa5Var.Y) {
                        oa5Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                uc5 uc5Var = (uc5) obj;
                if (uc5Var.h != null && (cj1Var = uc5Var.f) != null) {
                    if (z3) {
                        cj1Var.setVisibility(4);
                    } else {
                        uc5Var.n.setVisibility(4);
                    }
                    uc5Var.h = null;
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
                xs5 xs5Var = (xs5) obj;
                AnimatorSet animatorSet2 = xs5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z3) {
                        xs5Var.S1.setVisibility(4);
                    }
                    xs5Var.R1 = null;
                    return;
                }
                return;
            case 9:
                it5 it5Var = (it5) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                it5Var.b2 = f7;
                it5Var.b.invalidate();
                if (!z3) {
                    it5Var.P1.setVisibility(8);
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
                    gm.r(runnable);
                    limitPreviewView.l0.run();
                    return;
                }
                return;
            case 11:
                n38 n38Var = (n38) obj;
                fv fvVar = n38Var.c;
                if (z3) {
                    f7 = 0.0f;
                }
                fvVar.setAlpha(f7);
                View view2 = n38Var.a;
                if (!z3) {
                    f8 = 0.5f;
                }
                view2.setAlpha(f8);
                n38Var.invalidate();
                return;
            case 12:
                mh6 mh6Var = (mh6) obj;
                if (!z3) {
                    mh6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = mh6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mh6Var.M = null;
                    return;
                }
                return;
            case 13:
                l57 l57Var = (l57) obj;
                if (l57Var.getParent() != null) {
                    ((ViewGroup) l57Var.getParent()).removeView(l57Var);
                }
                jt1 jt1Var = (jt1) l57Var;
                o47 o47Var = jt1Var.I.x5;
                if (o47Var != null) {
                    o47Var.x = null;
                }
                if (z3) {
                    gm.d3(new it1(jt1Var, (byte) 1), 15L);
                    return;
                }
                return;
            case 14:
                f57 f57Var = (f57) obj;
                f57Var.Q = null;
                f57Var.g(z3, false);
                return;
            case 15:
                rc7 rc7Var = (rc7) obj;
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                rc7Var.e = f;
                rc7Var.invalidate();
                for (int i4 = 0; i4 < 2; i4++) {
                    rc7Var.c[i4].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    TextView textView = rc7Var.c[i4];
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
                    TextView textView2 = rc7Var.c[i4];
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
                    textView2.setAlpha(gm.R1(f2, f3, rc7Var.e));
                    rc7Var.d[i4].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    TextView textView3 = rc7Var.d[i4];
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
                    TextView textView4 = rc7Var.d[i4];
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
                    textView4.setAlpha(gm.R1(f4, f5, rc7Var.e));
                }
                return;
            case 16:
                if (!z3) {
                    ((gj7) obj).b.setVisibility(8);
                    return;
                }
                return;
            case 17:
                xv7 xv7Var = (xv7) obj;
                if (!z3) {
                    xv7Var.P1.setVisibility(8);
                    xv7Var.P1.k();
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
                by7 by7Var = (by7) obj;
                TextView textView5 = by7Var.x;
                a6 a6Var = by7Var.e;
                if (z3) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                a6Var.setScaleX(gm.R1(0.8f, 1.0f, f6));
                a6Var.setScaleY(gm.R1(0.8f, 1.0f, f6));
                a6Var.setAlpha(gm.R1(0.0f, 1.0f, f6));
                textView5.setScaleX(gm.R1(1.0f, 0.9f, f6));
                textView5.setScaleY(gm.R1(1.0f, 0.9f, f6));
                textView5.setAlpha(gm.R1(1.0f, 0.0f, f6));
                by7Var.s.setAlpha(gm.R1(0.0f, 1.0f, f6));
                return;
            case 20:
                q68 q68Var = (q68) obj;
                AnimatorSet animatorSet4 = q68Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q68Var.L = null;
                    if (!z3) {
                        q68Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                w78 w78Var = (w78) obj;
                if (animator.equals(w78Var.l0)) {
                    if (!z3) {
                        w78Var.a0.setVisibility(4);
                        w78Var.b0.setVisibility(4);
                    }
                    w78Var.l0 = null;
                    return;
                }
                return;
            case 22:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!z3) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    return;
                }
                return;
            case 23:
                cd8 cd8Var = (cd8) obj;
                ((bn2) cd8Var).E.r1.d();
                if (z3) {
                    cd8Var.x.accept(Integer.valueOf(cd8Var.s));
                }
                if (cd8Var.getParent() != null) {
                    ((ViewGroup) cd8Var.getParent()).removeView(cd8Var);
                    return;
                }
                return;
            case 24:
                xg8 xg8Var = (xg8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                xg8Var.F = f7;
                return;
            case 25:
                cj8 cj8Var = (cj8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                cj8Var.P = f7;
                cj8Var.f.invalidate();
                aj8 aj8Var = cj8Var.h;
                if (aj8Var != null) {
                    aj8Var.invalidate();
                    return;
                }
                return;
            case 26:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                if (nq8Var.h) {
                    zja zjaVar = profileActivity.U0;
                    if (zjaVar != null) {
                        zjaVar.setClickable(false);
                    }
                } else {
                    nq8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.e7;
                profileActivity.l4(false);
                return;
            case 27:
                zv8 zv8Var = (zv8) obj;
                if (z3) {
                    zv8Var.c.setVisibility(8);
                    return;
                } else {
                    zv8Var.f.setVisibility(8);
                    return;
                }
            case 28:
                if (!z3) {
                    ((zb9) obj).w.setVisibility(8);
                    return;
                }
                return;
            default:
                xu9 xu9Var = (xu9) obj;
                if (animator == xu9Var.H) {
                    if (!z3) {
                        f7 = 0.0f;
                    }
                    xu9Var.G = f7;
                    xu9Var.setShown(f7);
                    if (!z3) {
                        xu9Var.setVisibility(8);
                    }
                    xu9Var.b(true);
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
                    ((mh6) obj).W.setVisibility(0);
                    return;
                }
                return;
            case 18:
                if (z) {
                    ((PasscodeActivity) obj).w.setVisibility(0);
                    return;
                }
                return;
            case 26:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                zja zjaVar = profileActivity.U0;
                if (zjaVar != null && !z) {
                    zjaVar.setClickable(true);
                }
                profileActivity.a4(true);
                nq8Var.setVisibility(0);
                profileActivity.l4(false);
                return;
            case 27:
                zv8 zv8Var = (zv8) obj;
                ImageView imageView = zv8Var.c;
                jh2 jh2Var = zv8Var.f;
                if (z) {
                    jh2Var.setAlpha(0.0f);
                    jh2Var.setVisibility(0);
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

    public jf4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public jf4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
