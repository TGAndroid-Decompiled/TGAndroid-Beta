package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pu9 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final Object c;

    public pu9(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 2:
                ((d8a) obj).n = null;
                return;
            case 3:
                ((nfa) obj).R1 = null;
                return;
            case 13:
                p3c p3cVar = (p3c) obj;
                AnimatorSet animatorSet = p3cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p3cVar.J = null;
                    return;
                }
                return;
            case 14:
                j6c j6cVar = (j6c) obj;
                AnimatorSet animatorSet2 = j6cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j6cVar.n1 = null;
                    return;
                }
                return;
            case 15:
                x7c x7cVar = (x7c) obj;
                AnimatorSet animatorSet3 = x7cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x7cVar.s1 = null;
                    return;
                }
                return;
            case 17:
                pqc pqcVar = (pqc) obj;
                AnimatorSet animatorSet4 = pqcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    pqcVar.f = null;
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
        u95 u95Var;
        int i;
        Drawable[] drawableArr;
        Drawable drawable;
        byte b = this.a;
        float f = 1.0f;
        float f2 = 0.0f;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                qu9 qu9Var = (qu9) obj;
                if (!z) {
                    f = 0.0f;
                }
                qu9Var.w = f;
                if (qu9Var.T) {
                    qu9Var.O.invalidate();
                    return;
                }
                return;
            case 1:
                px9 px9Var = (px9) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = px9Var.w;
                if (z) {
                    f2 = 1.0f;
                }
                px9Var.M = f2;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(s33.g.getInterpolation(px9Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i2 = 0; i2 < itemsCount; i2++) {
                    float s = gl.s(px9Var.M, i2, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2).setTranslationY((1.0f - s) * gl.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2).setAlpha(s);
                }
                px9Var.O = null;
                return;
            case 2:
                d8a d8aVar = (d8a) obj;
                if (d8aVar.n != null && (u95Var = d8aVar.r) != null) {
                    if (!z) {
                        u95Var.setVisibility(4);
                    }
                    d8aVar.n = null;
                    return;
                }
                return;
            case 3:
                nfa nfaVar = (nfa) obj;
                if (nfaVar.R1 != null) {
                    nfaVar.R1 = null;
                    if (!z) {
                        nfaVar.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qfa qfaVar = (qfa) obj;
                ValueAnimator valueAnimator = qfaVar.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (!z) {
                        f = 0.0f;
                    }
                    qfaVar.C0 = f;
                    qfaVar.B0 = null;
                    return;
                }
                return;
            case 5:
                r5b r5bVar = (r5b) obj;
                if (z) {
                    r5bVar.setVisibility(8);
                }
                r5bVar.c = null;
                return;
            case 6:
                t7b t7bVar = (t7b) obj;
                if (!z) {
                    t7bVar.W0.setVisibility(8);
                }
                t7bVar.g2 = null;
                return;
            case 7:
                m8b m8bVar = (m8b) obj;
                m8bVar.J0.e();
                if (z) {
                    f2 = m8bVar.x.c;
                }
                m8bVar.f0 = f2;
                y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                m8bVar.w.invalidate();
                m8bVar.v1 = null;
                return;
            case 8:
                super.onAnimationEnd(animator);
                anb anbVar = (anb) obj;
                if (!z) {
                    f = 0.0f;
                }
                anbVar.N = f;
                anbVar.invalidate();
                return;
            case 9:
                jpb jpbVar = (jpb) obj;
                if (!z) {
                    f = 0.0f;
                }
                jpbVar.E = f;
                return;
            case 10:
                kxb kxbVar = (kxb) obj;
                long j = kxbVar.f;
                if (kxbVar.e0 == animator) {
                    if (!z) {
                        f = 0.0f;
                    }
                    kxbVar.V = f;
                    kxbVar.m();
                    kxbVar.W = false;
                    ImageView imageView = kxbVar.I;
                    int i3 = 2131231890;
                    if (kxbVar.T) {
                        i = 2131231890;
                    } else {
                        i = 2131231887;
                    }
                    imageView.setImageResource(i);
                    ImageView imageView2 = kxbVar.H;
                    if (!kxbVar.T) {
                        i3 = 2131231888;
                    }
                    imageView2.setImageResource(i3);
                    kxbVar.e0 = null;
                    na7.q1(kxbVar.e).X3.edit().putBoolean(ls6.n(j, "topicssidetabs"), kxbVar.U).putBoolean(ls6.n(j, "topicssidetabsb"), kxbVar.T).apply();
                    Boolean bool = kxbVar.d0;
                    if (bool != null && z != bool.booleanValue()) {
                        boolean booleanValue = kxbVar.d0.booleanValue();
                        kxbVar.d0 = null;
                        kxbVar.a(booleanValue);
                    }
                    gl.c3(new cib(this, (byte) 14));
                    return;
                }
                return;
            case 11:
                fxb fxbVar = (fxb) obj;
                if (!z) {
                    f = 0.0f;
                }
                fxbVar.G = f;
                fxbVar.h();
                return;
            case 12:
                jxb jxbVar = (jxb) obj;
                if (!z) {
                    f = 0.0f;
                }
                jxbVar.V = f;
                jxbVar.h();
                jxbVar.g();
                return;
            case 13:
                p3c p3cVar = (p3c) obj;
                AnimatorSet animatorSet = p3cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (z) {
                        p3cVar.e.setVisibility(4);
                        return;
                    } else {
                        p3cVar.b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 14:
                j6c j6cVar = (j6c) obj;
                AnimatorSet animatorSet2 = j6cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        j6cVar.o1.setVisibility(4);
                    }
                    j6cVar.n1 = null;
                    return;
                }
                return;
            case 15:
                x7c x7cVar = (x7c) obj;
                AnimatorSet animatorSet3 = x7cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!z) {
                        x7cVar.r1.setVisibility(4);
                    }
                    x7cVar.s1 = null;
                    return;
                }
                return;
            case 16:
                dic dicVar = (dic) obj;
                dicVar.w = null;
                if (z) {
                    TextView[] textViewArr = dicVar.h;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!dicVar.H && (drawable = (drawableArr = dicVar.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                dicVar.H = false;
                if (!dicVar.P) {
                    dicVar.n = dicVar.r;
                }
                dicVar.s = 0.0f;
                dicVar.invalidate();
                return;
            case 17:
                pqc pqcVar = (pqc) obj;
                AnimatorSet animatorSet4 = pqcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    pqcVar.f = null;
                    if (!z) {
                        pqcVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                nsc nscVar = (nsc) obj;
                ps0 ps0Var = nscVar.W;
                if (!nscVar.U) {
                    ps0Var.setVisibility(8);
                    ps0Var.setText("");
                }
                if (!z) {
                    f = 0.0f;
                }
                nscVar.V = f;
                ps0Var.setAlpha(f);
                nscVar.invalidate();
                if (nscVar.U) {
                    ps0Var.requestFocus();
                    gl.E3(ps0Var);
                    return;
                }
                ps0Var.clearFocus();
                gl.t1(ps0Var);
                return;
            default:
                wt wtVar = (wt) obj;
                ps0 ps0Var2 = wtVar.c0;
                if (!wtVar.a0) {
                    ps0Var2.setVisibility(8);
                }
                if (!z) {
                    f = 0.0f;
                }
                wtVar.b0 = f;
                ps0Var2.setAlpha(f);
                wtVar.j(wtVar.b0);
                wtVar.S.setTranslationX(gl.L(56.0f) * wtVar.b0);
                wtVar.P.setTranslationX(gl.L(112.0f) * wtVar.b0);
                wtVar.invalidate();
                return;
        }
    }
}
