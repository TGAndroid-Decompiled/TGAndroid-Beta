package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.u71;
public final class n extends AnimatorListenerAdapter {
    public final int f14276a;
    public final boolean f14277b;
    public final float f14278c;
    public final KeyEvent.Callback d;

    public n(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f14276a = i10;
        this.d = callback;
        this.f14277b = z10;
        this.f14278c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f14276a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f14277b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                ul0 ul0Var = (ul0) this.d;
                u71 u71Var = ul0Var.e;
                ul0Var.f30975h0 = null;
                boolean z10 = this.f14277b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ul0Var.f30976i0 = f7;
                for (int i10 = 0; i10 < u71Var.getChildCount(); i10++) {
                    u71Var.getChildAt(i10).invalidate();
                }
                u71Var.invalidate();
                ul0Var.p();
                if (!z10) {
                    float childCount = ul0Var.f30978k0 * u71Var.getChildCount();
                    float f10 = this.f14278c;
                    float scrollX = (ul0Var.getScrollX() + f10) / (ul0Var.f30977j0 * u71Var.getChildCount());
                    float measuredWidth = (childCount - ul0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    ul0Var.f30979l0 = (ul0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    ul0Var.m0 = i11;
                    if (i11 < 0) {
                        ul0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < u71Var.getChildCount(); i12++) {
                        View childAt = u71Var.getChildAt(i12);
                        if (childAt instanceof jw0) {
                            ((jw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = i0.L(33.0f);
                    }
                    ul0Var.f30974g0 = false;
                    ul0Var.getLayoutParams().height = i0.L(36.0f);
                    u71Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14276a) {
            case 0:
                super.onAnimationStart(animator);
                o oVar = ((p) this.d).D;
                oVar.setVisibility(0);
                if (this.f14277b) {
                    float f7 = this.f14278c;
                    oVar.setScaleX(f7);
                    oVar.setScaleY(f7);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
