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
public final class id4 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final Object c;

    public id4(View view) {
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
                cf4 cf4Var = (cf4) obj;
                AnimatorSet animatorSet = cf4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cf4Var.p1 = null;
                    return;
                }
                return;
            case 6:
                ((wa5) obj).h = null;
                return;
            case 8:
                zq5 zq5Var = (zq5) obj;
                AnimatorSet animatorSet2 = zq5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    zq5Var.R1 = null;
                    return;
                }
                return;
            case 20:
                o48 o48Var = (o48) obj;
                AnimatorSet animatorSet3 = o48Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    o48Var.L = null;
                    return;
                }
                return;
            case 21:
                u58 u58Var = (u58) obj;
                if (animator.equals(u58Var.l0)) {
                    u58Var.l0 = null;
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
        vh1 vh1Var;
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
                jd4 jd4Var = (jd4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                jd4Var.s = f7;
                jd4Var.invalidate();
                return;
            case 1:
                cf4 cf4Var = (cf4) obj;
                AnimatorSet animatorSet = cf4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z3) {
                        cf4Var.q1.setVisibility(4);
                    }
                    cf4Var.p1 = null;
                    return;
                }
                return;
            case 2:
                hl4 hl4Var = (hl4) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                hl4Var.n = f7;
                hl4Var.invalidate();
                return;
            case 3:
                if (!z3) {
                    ((sr4) obj).J.setVisibility(8);
                    return;
                }
                return;
            case 4:
                h75 h75Var = (h75) obj;
                h75Var.J4 = null;
                jia subtitleTextView = h75Var.H1.getSubtitleTextView();
                if (!z3) {
                    f8 = gl.L(20.0f);
                }
                subtitleTextView.setTranslationY(f8);
                return;
            case 5:
                o85 o85Var = (o85) obj;
                m85 m85Var = o85Var.a;
                if (!o85Var.H) {
                    if (z3) {
                        f8 = 1.0f;
                    }
                    o85Var.d0 = f8;
                    o85Var.W.setPinnedProgress(f8);
                    m85Var.setScaleX(1.0f - (o85Var.d0 * 0.6f));
                    m85Var.setScaleY(1.0f - (o85Var.d0 * 0.6f));
                    if (o85Var.Y) {
                        o85Var.j();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                wa5 wa5Var = (wa5) obj;
                if (wa5Var.h != null && (vh1Var = wa5Var.f) != null) {
                    if (z3) {
                        vh1Var.setVisibility(4);
                    } else {
                        wa5Var.n.setVisibility(4);
                    }
                    wa5Var.h = null;
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
                zq5 zq5Var = (zq5) obj;
                AnimatorSet animatorSet2 = zq5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z3) {
                        zq5Var.S1.setVisibility(4);
                    }
                    zq5Var.R1 = null;
                    return;
                }
                return;
            case 9:
                jr5 jr5Var = (jr5) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                jr5Var.b2 = f7;
                jr5Var.b.invalidate();
                if (!z3) {
                    jr5Var.P1.setVisibility(8);
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
                    gl.r(runnable);
                    limitPreviewView.l0.run();
                    return;
                }
                return;
            case 11:
                l18 l18Var = (l18) obj;
                fu fuVar = l18Var.c;
                if (z3) {
                    f7 = 0.0f;
                }
                fuVar.setAlpha(f7);
                View view2 = l18Var.a;
                if (!z3) {
                    f8 = 0.5f;
                }
                view2.setAlpha(f8);
                l18Var.invalidate();
                return;
            case 12:
                mf6 mf6Var = (mf6) obj;
                if (!z3) {
                    mf6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = mf6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mf6Var.M = null;
                    return;
                }
                return;
            case 13:
                l37 l37Var = (l37) obj;
                if (l37Var.getParent() != null) {
                    ((ViewGroup) l37Var.getParent()).removeView(l37Var);
                }
                wr1 wr1Var = (wr1) l37Var;
                o27 o27Var = wr1Var.I.x5;
                if (o27Var != null) {
                    o27Var.x = null;
                }
                if (z3) {
                    gl.e3(new vr1(wr1Var, (byte) 1), 15L);
                    return;
                }
                return;
            case 14:
                f37 f37Var = (f37) obj;
                f37Var.Q = null;
                f37Var.g(z3, false);
                return;
            case 15:
                qa7 qa7Var = (qa7) obj;
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                qa7Var.e = f;
                qa7Var.invalidate();
                for (int i4 = 0; i4 < 2; i4++) {
                    qa7Var.c[i4].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    TextView textView = qa7Var.c[i4];
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
                    TextView textView2 = qa7Var.c[i4];
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
                    textView2.setAlpha(gl.R1(f2, f3, qa7Var.e));
                    qa7Var.d[i4].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    TextView textView3 = qa7Var.d[i4];
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
                    TextView textView4 = qa7Var.d[i4];
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
                    textView4.setAlpha(gl.R1(f4, f5, qa7Var.e));
                }
                return;
            case 16:
                if (!z3) {
                    ((dh7) obj).b.setVisibility(8);
                    return;
                }
                return;
            case 17:
                wt7 wt7Var = (wt7) obj;
                if (!z3) {
                    wt7Var.P1.setVisibility(8);
                    wt7Var.P1.k();
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
                yv7 yv7Var = (yv7) obj;
                TextView textView5 = yv7Var.x;
                a6 a6Var = yv7Var.e;
                if (z3) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                a6Var.setScaleX(gl.R1(0.8f, 1.0f, f6));
                a6Var.setScaleY(gl.R1(0.8f, 1.0f, f6));
                a6Var.setAlpha(gl.R1(0.0f, 1.0f, f6));
                textView5.setScaleX(gl.R1(1.0f, 0.9f, f6));
                textView5.setScaleY(gl.R1(1.0f, 0.9f, f6));
                textView5.setAlpha(gl.R1(1.0f, 0.0f, f6));
                yv7Var.s.setAlpha(gl.R1(0.0f, 1.0f, f6));
                return;
            case 20:
                o48 o48Var = (o48) obj;
                AnimatorSet animatorSet4 = o48Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o48Var.L = null;
                    if (!z3) {
                        o48Var.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                u58 u58Var = (u58) obj;
                if (animator.equals(u58Var.l0)) {
                    if (!z3) {
                        u58Var.a0.setVisibility(4);
                        u58Var.b0.setVisibility(4);
                    }
                    u58Var.l0 = null;
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
                za8 za8Var = (za8) obj;
                ((ol2) za8Var).E.r1.d();
                if (z3) {
                    za8Var.x.accept(Integer.valueOf(za8Var.s));
                }
                if (za8Var.getParent() != null) {
                    ((ViewGroup) za8Var.getParent()).removeView(za8Var);
                    return;
                }
                return;
            case 24:
                ve8 ve8Var = (ve8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                ve8Var.F = f7;
                return;
            case 25:
                ah8 ah8Var = (ah8) obj;
                if (!z3) {
                    f7 = 0.0f;
                }
                ah8Var.P = f7;
                ah8Var.f.invalidate();
                yg8 yg8Var = ah8Var.h;
                if (yg8Var != null) {
                    yg8Var.invalidate();
                    return;
                }
                return;
            case 26:
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                if (mo8Var.h) {
                    xha xhaVar = profileActivity.U0;
                    if (xhaVar != null) {
                        xhaVar.setClickable(false);
                    }
                } else {
                    mo8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.h4(false);
                return;
            case 27:
                yt8 yt8Var = (yt8) obj;
                if (z3) {
                    yt8Var.c.setVisibility(8);
                    return;
                } else {
                    yt8Var.f.setVisibility(8);
                    return;
                }
            case 28:
                if (!z3) {
                    ((z99) obj).w.setVisibility(8);
                    return;
                }
                return;
            default:
                vs9 vs9Var = (vs9) obj;
                if (animator == vs9Var.H) {
                    if (!z3) {
                        f7 = 0.0f;
                    }
                    vs9Var.G = f7;
                    vs9Var.setShown(f7);
                    if (!z3) {
                        vs9Var.setVisibility(8);
                    }
                    vs9Var.b(true);
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
                    ((mf6) obj).W.setVisibility(0);
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
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                xha xhaVar = profileActivity.U0;
                if (xhaVar != null && !z) {
                    xhaVar.setClickable(true);
                }
                profileActivity.W3(true);
                mo8Var.setVisibility(0);
                profileActivity.h4(false);
                return;
            case 27:
                yt8 yt8Var = (yt8) obj;
                ImageView imageView = yt8Var.c;
                wf2 wf2Var = yt8Var.f;
                if (z) {
                    wf2Var.setAlpha(0.0f);
                    wf2Var.setVisibility(0);
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

    public id4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public id4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
