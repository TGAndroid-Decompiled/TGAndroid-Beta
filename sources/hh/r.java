package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.ua1;
public final class r extends AnimatorListenerAdapter {
    public final int f8101a;
    public final boolean f8102b;
    public final float f8103c;
    public final KeyEvent.Callback d;

    public r(KeyEvent.Callback callback, boolean z10, float f9, int i10) {
        this.f8101a = i10;
        this.d = callback;
        this.f8102b = z10;
        this.f8103c = f9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        switch (this.f8101a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f8102b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                fm0 fm0Var = (fm0) this.d;
                ua1 ua1Var = fm0Var.f28490e;
                fm0Var.f28489d0 = null;
                boolean z10 = this.f8102b;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                fm0Var.f28491e0 = f9;
                for (int i10 = 0; i10 < ua1Var.getChildCount(); i10++) {
                    ua1Var.getChildAt(i10).invalidate();
                }
                ua1Var.invalidate();
                fm0Var.p();
                if (!z10) {
                    float childCount = fm0Var.f28494g0 * ua1Var.getChildCount();
                    float f10 = this.f8103c;
                    float scrollX = (fm0Var.getScrollX() + f10) / (fm0Var.f28493f0 * ua1Var.getChildCount());
                    float measuredWidth = (childCount - fm0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * scrollX;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    fm0Var.f28495h0 = (fm0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    fm0Var.f28496i0 = i11;
                    if (i11 < 0) {
                        fm0Var.f28496i0 = 0;
                    }
                    for (int i12 = 0; i12 < ua1Var.getChildCount(); i12++) {
                        View childAt = ua1Var.getChildAt(i12);
                        if (childAt instanceof vw0) {
                            ((vw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    fm0Var.f28488c0 = false;
                    fm0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ua1Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8101a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).f8119y;
                tVar.setVisibility(0);
                if (this.f8102b) {
                    float f9 = this.f8103c;
                    tVar.setScaleX(f9);
                    tVar.setScaleY(f9);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
