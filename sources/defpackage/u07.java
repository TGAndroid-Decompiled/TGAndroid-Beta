package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class u07 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final float c;
    public final KeyEvent.Callback d;

    public u07(KeyEvent.Callback callback, boolean z, float f, byte b) {
        this.a = b;
        this.d = callback;
        this.b = z;
        this.c = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        boolean z = this.b;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (!z) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                gt9 gt9Var = (gt9) callback;
                qmb qmbVar = gt9Var.e;
                gt9Var.i0 = null;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                gt9Var.j0 = f;
                for (int i = 0; i < qmbVar.getChildCount(); i++) {
                    qmbVar.getChildAt(i).invalidate();
                }
                qmbVar.invalidate();
                gt9Var.p();
                if (!z) {
                    float childCount = gt9Var.l0 * qmbVar.getChildCount();
                    float f2 = this.c;
                    float scrollX = (gt9Var.getScrollX() + f2) / (gt9Var.k0 * qmbVar.getChildCount());
                    float measuredWidth = (childCount - gt9Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f2 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f3 = childCount * scrollX;
                    if (f3 - f2 < 0.0f) {
                        f3 = f2;
                    }
                    gt9Var.m0 = (gt9Var.getScrollX() + f2) - f3;
                    int i2 = (int) (f3 - f2);
                    gt9Var.n0 = i2;
                    if (i2 < 0) {
                        gt9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < qmbVar.getChildCount(); i3++) {
                        View childAt = qmbVar.getChildAt(i3);
                        if (childAt instanceof y1b) {
                            ((y1b) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = gm.L(33.0f);
                    }
                    gt9Var.h0 = false;
                    gt9Var.getLayoutParams().height = gm.L(36.0f);
                    qmbVar.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                v07 v07Var = ((w07) this.d).E;
                v07Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    v07Var.setScaleX(f);
                    v07Var.setScaleY(f);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
