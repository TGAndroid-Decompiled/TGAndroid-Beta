package fh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.ra1;

public final class r extends AnimatorListenerAdapter {

    public final int f6154a;

    public final boolean f6155b;

    public final float f6156c;
    public final KeyEvent.Callback d;

    public r(KeyEvent.Callback callback, boolean z10, float f10, int i10) {
        this.f6154a = i10;
        this.d = callback;
        this.f6155b = z10;
        this.f6156c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6154a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f6155b) {
                    super/*android.app.Dialog*/.dismiss();
                }
                break;
            default:
                vl0 vl0Var = (vl0) this.d;
                ra1 ra1Var = vl0Var.f33448e;
                vl0Var.f33447d0 = null;
                boolean z10 = this.f6155b;
                vl0Var.f33449e0 = z10 ? 1.0f : 0.0f;
                for (int i10 = 0; i10 < ra1Var.getChildCount(); i10++) {
                    ra1Var.getChildAt(i10).invalidate();
                }
                ra1Var.invalidate();
                vl0Var.p();
                if (!z10) {
                    float childCount = vl0Var.f33452g0 * ra1Var.getChildCount();
                    float scrollX = vl0Var.getScrollX();
                    float f10 = this.f6156c;
                    float childCount2 = (scrollX + f10) / (vl0Var.f33451f0 * ra1Var.getChildCount());
                    float measuredWidth = (childCount - vl0Var.getMeasuredWidth()) / childCount;
                    if (childCount2 > measuredWidth) {
                        childCount2 = measuredWidth;
                        f10 = 0.0f;
                    }
                    float f11 = childCount * childCount2;
                    if (f11 - f10 < 0.0f) {
                        f11 = f10;
                    }
                    vl0Var.f33453h0 = (vl0Var.getScrollX() + f10) - f11;
                    int i11 = (int) (f11 - f10);
                    vl0Var.f33454i0 = i11;
                    if (i11 < 0) {
                        vl0Var.f33454i0 = 0;
                    }
                    for (int i12 = 0; i12 < ra1Var.getChildCount(); i12++) {
                        View childAt = ra1Var.getChildAt(i12);
                        if (childAt instanceof nw0) {
                            ((nw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    vl0Var.f33446c0 = false;
                    vl0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ra1Var.requestLayout();
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f6154a) {
            case 0:
                super.onAnimationStart(animator);
                t tVar = ((u) this.d).f6172y;
                tVar.setVisibility(0);
                if (this.f6155b) {
                    float f10 = this.f6156c;
                    tVar.setScaleX(f10);
                    tVar.setScaleY(f10);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
