package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.s71;
public final class n extends AnimatorListenerAdapter {
    public final int f14277a;
    public final boolean f14278b;
    public final float f14279c;
    public final KeyEvent.Callback d;

    public n(KeyEvent.Callback callback, boolean z10, float f7, int i10) {
        this.f14277a = i10;
        this.d = callback;
        this.f14278b = z10;
        this.f14279c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f14277a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f14278b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                vl0 vl0Var = (vl0) this.d;
                s71 s71Var = vl0Var.e;
                vl0Var.f31327h0 = null;
                boolean z10 = this.f14278b;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                vl0Var.f31328i0 = f7;
                for (int i10 = 0; i10 < s71Var.getChildCount(); i10++) {
                    s71Var.getChildAt(i10).invalidate();
                }
                s71Var.invalidate();
                vl0Var.p();
                if (!z10) {
                    float childCount = vl0Var.f31330k0 * s71Var.getChildCount();
                    float f10 = this.f14279c;
                    float scrollX = (vl0Var.getScrollX() + f10) / (vl0Var.f31329j0 * s71Var.getChildCount());
                    float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        f10 = 0.0f;
                        scrollX = measuredWidth;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vl0Var.f31331l0 = (vl0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    vl0Var.m0 = i11;
                    if (i11 < 0) {
                        vl0Var.m0 = 0;
                    }
                    for (int i12 = 0; i12 < s71Var.getChildCount(); i12++) {
                        View childAt = s71Var.getChildAt(i12);
                        if (childAt instanceof kw0) {
                            ((kw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = i0.L(33.0f);
                    }
                    vl0Var.f31326g0 = false;
                    vl0Var.getLayoutParams().height = i0.L(36.0f);
                    s71Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14277a) {
            case 0:
                super.onAnimationStart(animator);
                o oVar = ((p) this.d).D;
                oVar.setVisibility(0);
                if (this.f14278b) {
                    float f7 = this.f14279c;
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
