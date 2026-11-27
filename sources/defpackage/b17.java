package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
public final class b17 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final float c;
    public final KeyEvent.Callback d;

    public b17(KeyEvent.Callback callback, boolean z, float f, byte b) {
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
                xu9 xu9Var = (xu9) callback;
                oob oobVar = xu9Var.e;
                xu9Var.i0 = null;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                xu9Var.j0 = f;
                for (int i = 0; i < oobVar.getChildCount(); i++) {
                    oobVar.getChildAt(i).invalidate();
                }
                oobVar.invalidate();
                xu9Var.p();
                if (!z) {
                    float childCount = xu9Var.l0 * oobVar.getChildCount();
                    float f2 = this.c;
                    float scrollX = (xu9Var.getScrollX() + f2) / (xu9Var.k0 * oobVar.getChildCount());
                    float measuredWidth = (childCount - xu9Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f2 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f3 = childCount * scrollX;
                    if (f3 - f2 < 0.0f) {
                        f3 = f2;
                    }
                    xu9Var.m0 = (xu9Var.getScrollX() + f2) - f3;
                    int i2 = (int) (f3 - f2);
                    xu9Var.n0 = i2;
                    if (i2 < 0) {
                        xu9Var.n0 = 0;
                    }
                    for (int i3 = 0; i3 < oobVar.getChildCount(); i3++) {
                        View childAt = oobVar.getChildAt(i3);
                        if (childAt instanceof u3b) {
                            ((u3b) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = hl.L(33.0f);
                    }
                    xu9Var.h0 = false;
                    xu9Var.getLayoutParams().height = hl.L(36.0f);
                    oobVar.requestLayout();
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
                c17 c17Var = ((d17) this.d).E;
                c17Var.setVisibility(0);
                if (this.b) {
                    float f = this.c;
                    c17Var.setScaleX(f);
                    c17Var.setScaleY(f);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
