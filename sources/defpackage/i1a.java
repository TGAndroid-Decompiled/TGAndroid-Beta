package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i1a extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final Object c;

    public i1a(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((uba) obj).n = null;
                return;
            case 2:
                ((eja) obj).R1 = null;
                return;
            case 12:
                o7c o7cVar = (o7c) obj;
                AnimatorSet animatorSet = o7cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7cVar.J = null;
                    return;
                }
                return;
            case 13:
                jac jacVar = (jac) obj;
                AnimatorSet animatorSet2 = jacVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jacVar.n1 = null;
                    return;
                }
                return;
            case 14:
                xbc xbcVar = (xbc) obj;
                AnimatorSet animatorSet3 = xbcVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xbcVar.s1 = null;
                    return;
                }
                return;
            case 16:
                dvc dvcVar = (dvc) obj;
                AnimatorSet animatorSet4 = dvcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    dvcVar.f = null;
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
        vb5 vb5Var;
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
                j1a j1aVar = (j1a) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j1aVar.w;
                if (z) {
                    f2 = 1.0f;
                }
                j1aVar.M = f2;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(k43.g.getInterpolation(j1aVar.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i2 = 0; i2 < itemsCount; i2++) {
                    float s = hl.s(j1aVar.M, i2, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2).setTranslationY((1.0f - s) * hl.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2).setAlpha(s);
                }
                j1aVar.O = null;
                return;
            case 1:
                uba ubaVar = (uba) obj;
                if (ubaVar.n != null && (vb5Var = ubaVar.r) != null) {
                    if (!z) {
                        vb5Var.setVisibility(4);
                    }
                    ubaVar.n = null;
                    return;
                }
                return;
            case 2:
                eja ejaVar = (eja) obj;
                if (ejaVar.R1 != null) {
                    ejaVar.R1 = null;
                    if (!z) {
                        ejaVar.E0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                jja jjaVar = (jja) obj;
                ValueAnimator valueAnimator = jjaVar.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    if (!z) {
                        f = 0.0f;
                    }
                    jjaVar.C0 = f;
                    jjaVar.B0 = null;
                    return;
                }
                return;
            case 4:
                p9b p9bVar = (p9b) obj;
                if (z) {
                    p9bVar.setVisibility(8);
                }
                p9bVar.c = null;
                return;
            case 5:
                sbb sbbVar = (sbb) obj;
                if (!z) {
                    sbbVar.W0.setVisibility(8);
                }
                sbbVar.g2 = null;
                return;
            case 6:
                lcb lcbVar = (lcb) obj;
                lcbVar.J0.e();
                if (z) {
                    f2 = lcbVar.x.c;
                }
                lcbVar.f0 = f2;
                o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                lcbVar.w.invalidate();
                lcbVar.v1 = null;
                return;
            case 7:
                super.onAnimationEnd(animator);
                zqb zqbVar = (zqb) obj;
                if (!z) {
                    f = 0.0f;
                }
                zqbVar.N = f;
                zqbVar.invalidate();
                return;
            case 8:
                ktb ktbVar = (ktb) obj;
                if (!z) {
                    f = 0.0f;
                }
                ktbVar.E = f;
                return;
            case 9:
                l1c l1cVar = (l1c) obj;
                long j = l1cVar.f;
                if (l1cVar.e0 == animator) {
                    if (!z) {
                        f = 0.0f;
                    }
                    l1cVar.V = f;
                    l1cVar.m();
                    l1cVar.W = false;
                    ImageView imageView = l1cVar.I;
                    int i3 = 2131231890;
                    if (l1cVar.T) {
                        i = 2131231890;
                    } else {
                        i = 2131231887;
                    }
                    imageView.setImageResource(i);
                    ImageView imageView2 = l1cVar.H;
                    if (!l1cVar.T) {
                        i3 = 2131231888;
                    }
                    imageView2.setImageResource(i3);
                    l1cVar.e0 = null;
                    uc7.s1(l1cVar.e).Y3.edit().putBoolean(qu6.n(j, "topicssidetabs"), l1cVar.U).putBoolean(qu6.n(j, "topicssidetabsb"), l1cVar.T).apply();
                    Boolean bool = l1cVar.d0;
                    if (bool != null && z != bool.booleanValue()) {
                        boolean booleanValue = l1cVar.d0.booleanValue();
                        l1cVar.d0 = null;
                        l1cVar.a(booleanValue);
                    }
                    hl.c3(new azb(this, (byte) 1));
                    return;
                }
                return;
            case 10:
                g1c g1cVar = (g1c) obj;
                if (!z) {
                    f = 0.0f;
                }
                g1cVar.G = f;
                g1cVar.h();
                return;
            case 11:
                k1c k1cVar = (k1c) obj;
                if (!z) {
                    f = 0.0f;
                }
                k1cVar.V = f;
                k1cVar.h();
                k1cVar.g();
                return;
            case 12:
                o7c o7cVar = (o7c) obj;
                AnimatorSet animatorSet = o7cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (z) {
                        o7cVar.e.setVisibility(4);
                        return;
                    } else {
                        o7cVar.b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                jac jacVar = (jac) obj;
                AnimatorSet animatorSet2 = jacVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        jacVar.o1.setVisibility(4);
                    }
                    jacVar.n1 = null;
                    return;
                }
                return;
            case 14:
                xbc xbcVar = (xbc) obj;
                AnimatorSet animatorSet3 = xbcVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!z) {
                        xbcVar.r1.setVisibility(4);
                    }
                    xbcVar.s1 = null;
                    return;
                }
                return;
            case 15:
                kmc kmcVar = (kmc) obj;
                kmcVar.w = null;
                if (z) {
                    TextView[] textViewArr = kmcVar.h;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!kmcVar.H && (drawable = (drawableArr = kmcVar.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                kmcVar.H = false;
                if (!kmcVar.P) {
                    kmcVar.n = kmcVar.r;
                }
                kmcVar.s = 0.0f;
                kmcVar.invalidate();
                return;
            case 16:
                dvc dvcVar = (dvc) obj;
                AnimatorSet animatorSet4 = dvcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    dvcVar.f = null;
                    if (!z) {
                        dvcVar.setBackgroundColor(0);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                dxc dxcVar = (dxc) obj;
                xs0 xs0Var = dxcVar.W;
                if (!dxcVar.U) {
                    xs0Var.setVisibility(8);
                    xs0Var.setText("");
                }
                if (!z) {
                    f = 0.0f;
                }
                dxcVar.V = f;
                xs0Var.setAlpha(f);
                dxcVar.invalidate();
                if (dxcVar.U) {
                    xs0Var.requestFocus();
                    hl.E3(xs0Var);
                    return;
                }
                xs0Var.clearFocus();
                hl.t1(xs0Var);
                return;
            default:
                xt xtVar = (xt) obj;
                xs0 xs0Var2 = xtVar.c0;
                if (!xtVar.a0) {
                    xs0Var2.setVisibility(8);
                }
                if (!z) {
                    f = 0.0f;
                }
                xtVar.b0 = f;
                xs0Var2.setAlpha(f);
                xtVar.j(xtVar.b0);
                xtVar.S.setTranslationX(hl.L(56.0f) * xtVar.b0);
                xtVar.P.setTranslationX(hl.L(112.0f) * xtVar.b0);
                xtVar.invalidate();
                return;
        }
    }
}
