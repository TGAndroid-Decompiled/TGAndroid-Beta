package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.ib1;
public final class r extends AnimatorListenerAdapter {
    public final int f11285a;
    public final boolean f11286b;
    public final float f11287c;
    public final KeyEvent.Callback d;

    public r(KeyEvent.Callback callback, boolean z4, float f10, int i10) {
        this.f11285a = i10;
        this.d = callback;
        this.f11286b = z4;
        this.f11287c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f11285a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f11286b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                qm0 qm0Var = (qm0) this.d;
                ib1 ib1Var = qm0Var.f30429e;
                qm0Var.f30430e0 = null;
                boolean z4 = this.f11286b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                qm0Var.f30432f0 = f10;
                for (int i10 = 0; i10 < ib1Var.getChildCount(); i10++) {
                    ib1Var.getChildAt(i10).invalidate();
                }
                ib1Var.invalidate();
                qm0Var.p();
                if (!z4) {
                    float childCount = qm0Var.f30434h0 * ib1Var.getChildCount();
                    float f11 = this.f11287c;
                    float scrollX = (qm0Var.getScrollX() + f11) / (qm0Var.f30433g0 * ib1Var.getChildCount());
                    float measuredWidth = (childCount - qm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f11 = 0.0f;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    qm0Var.f30435i0 = (qm0Var.getScrollX() + f11) - f12;
                    int i11 = (int) (f12 - f11);
                    qm0Var.f30436j0 = i11;
                    if (i11 < 0) {
                        qm0Var.f30436j0 = 0;
                    }
                    for (int i12 = 0; i12 < ib1Var.getChildCount(); i12++) {
                        View childAt = ib1Var.getChildAt(i12);
                        if (childAt instanceof gx0) {
                            ((gx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    qm0Var.f30428d0 = false;
                    qm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ib1Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11285a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).f11303y;
                tVar.setVisibility(0);
                if (this.f11286b) {
                    float f10 = this.f11287c;
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
