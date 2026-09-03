package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.pb1;
public final class r extends AnimatorListenerAdapter {
    public final int f9443a;
    public final boolean f9444b;
    public final float f9445c;
    public final KeyEvent.Callback d;

    public r(KeyEvent.Callback callback, boolean z4, float f10, int i10) {
        this.f9443a = i10;
        this.d = callback;
        this.f9444b = z4;
        this.f9445c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9443a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f9444b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                om0 om0Var = (om0) this.d;
                pb1 pb1Var = om0Var.e;
                om0Var.f27601e0 = null;
                boolean z4 = this.f9444b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                om0Var.f27603f0 = f10;
                for (int i10 = 0; i10 < pb1Var.getChildCount(); i10++) {
                    pb1Var.getChildAt(i10).invalidate();
                }
                pb1Var.invalidate();
                om0Var.p();
                if (!z4) {
                    float childCount = om0Var.f27605h0 * pb1Var.getChildCount();
                    float f11 = this.f9445c;
                    float scrollX = (om0Var.getScrollX() + f11) / (om0Var.f27604g0 * pb1Var.getChildCount());
                    float measuredWidth = (childCount - om0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f11 = 0.0f;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    om0Var.f27606i0 = (om0Var.getScrollX() + f11) - f12;
                    int i11 = (int) (f12 - f11);
                    om0Var.f27607j0 = i11;
                    if (i11 < 0) {
                        om0Var.f27607j0 = 0;
                    }
                    for (int i12 = 0; i12 < pb1Var.getChildCount(); i12++) {
                        View childAt = pb1Var.getChildAt(i12);
                        if (childAt instanceof fx0) {
                            ((fx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    om0Var.f27600d0 = false;
                    om0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    pb1Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9443a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).f9459y;
                tVar.setVisibility(0);
                if (this.f9444b) {
                    float f10 = this.f9445c;
                    tVar.setScaleX(f10);
                    tVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
