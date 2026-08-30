package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.hb1;
public final class r extends AnimatorListenerAdapter {
    public final int f9462a;
    public final boolean f9463b;
    public final float f9464c;
    public final KeyEvent.Callback d;

    public r(KeyEvent.Callback callback, boolean z4, float f10, int i10) {
        this.f9462a = i10;
        this.d = callback;
        this.f9463b = z4;
        this.f9464c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9462a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f9463b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                pm0 pm0Var = (pm0) this.d;
                hb1 hb1Var = pm0Var.e;
                pm0Var.f27941e0 = null;
                boolean z4 = this.f9463b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                pm0Var.f27943f0 = f10;
                for (int i10 = 0; i10 < hb1Var.getChildCount(); i10++) {
                    hb1Var.getChildAt(i10).invalidate();
                }
                hb1Var.invalidate();
                pm0Var.p();
                if (!z4) {
                    float childCount = pm0Var.f27945h0 * hb1Var.getChildCount();
                    float f11 = this.f9464c;
                    float scrollX = (pm0Var.getScrollX() + f11) / (pm0Var.f27944g0 * hb1Var.getChildCount());
                    float measuredWidth = (childCount - pm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f11 = 0.0f;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    pm0Var.f27946i0 = (pm0Var.getScrollX() + f11) - f12;
                    int i11 = (int) (f12 - f11);
                    pm0Var.f27947j0 = i11;
                    if (i11 < 0) {
                        pm0Var.f27947j0 = 0;
                    }
                    for (int i12 = 0; i12 < hb1Var.getChildCount(); i12++) {
                        View childAt = hb1Var.getChildAt(i12);
                        if (childAt instanceof fx0) {
                            ((fx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pm0Var.f27940d0 = false;
                    pm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    hb1Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9462a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).f9478y;
                tVar.setVisibility(0);
                if (this.f9463b) {
                    float f10 = this.f9464c;
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
