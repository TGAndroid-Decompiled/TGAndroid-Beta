package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class uy6 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final float c;
    public final KeyEvent.Callback d;

    public uy6(KeyEvent.Callback callback, boolean z, float f, byte b) {
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
                er9 er9Var = (er9) callback;
                pkb pkbVar = er9Var.e;
                er9Var.i0 = null;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                er9Var.j0 = f;
                for (int i = 0; i < pkbVar.getChildCount(); i++) {
                    pkbVar.getChildAt(i).invalidate();
                }
                pkbVar.invalidate();
                er9Var.p();
                if (!z) {
                    float childCount = er9Var.l0 * pkbVar.getChildCount();
                    float f2 = this.c;
                    float scrollX = (er9Var.getScrollX() + f2) / (er9Var.k0 * pkbVar.getChildCount());
                    float measuredWidth = (childCount - er9Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f2 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f3 = childCount * scrollX;
                    if (f3 - f2 < 0.0f) {
                        f3 = f2;
                    }
                    er9Var.m0 = (er9Var.getScrollX() + f2) - f3;
                    int i2 = (int) (f3 - f2);
                    er9Var.n0 = i2;
                    if (i2 < 0) {
                        er9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < pkbVar.getChildCount(); i3++) {
                        View childAt = pkbVar.getChildAt(i3);
                        if (childAt instanceof xza) {
                            ((xza) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = gl.L(33.0f);
                    }
                    er9Var.h0 = false;
                    er9Var.getLayoutParams().height = gl.L(36.0f);
                    pkbVar.requestLayout();
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
                vy6 vy6Var = ((wy6) this.d).E;
                vy6Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    vy6Var.setScaleX(f);
                    vy6Var.setScaleY(f);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
