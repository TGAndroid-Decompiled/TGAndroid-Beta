package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.ob1;
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
                pm0 pm0Var = (pm0) this.d;
                ob1 ob1Var = pm0Var.f30135e;
                pm0Var.f30136e0 = null;
                boolean z4 = this.f11286b;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                pm0Var.f30138f0 = f10;
                for (int i10 = 0; i10 < ob1Var.getChildCount(); i10++) {
                    ob1Var.getChildAt(i10).invalidate();
                }
                ob1Var.invalidate();
                pm0Var.p();
                if (!z4) {
                    float childCount = pm0Var.f30140h0 * ob1Var.getChildCount();
                    float f11 = this.f11287c;
                    float scrollX = (pm0Var.getScrollX() + f11) / (pm0Var.f30139g0 * ob1Var.getChildCount());
                    float measuredWidth = (childCount - pm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f11 = 0.0f;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    pm0Var.f30141i0 = (pm0Var.getScrollX() + f11) - f12;
                    int i11 = (int) (f12 - f11);
                    pm0Var.f30142j0 = i11;
                    if (i11 < 0) {
                        pm0Var.f30142j0 = 0;
                    }
                    for (int i12 = 0; i12 < ob1Var.getChildCount(); i12++) {
                        View childAt = ob1Var.getChildAt(i12);
                        if (childAt instanceof fx0) {
                            ((fx0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    pm0Var.f30134d0 = false;
                    pm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ob1Var.requestLayout();
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
