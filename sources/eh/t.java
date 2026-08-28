package eh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.ta1;
public final class t extends AnimatorListenerAdapter {
    public final int f5227a;
    public final boolean f5228b;
    public final float f5229c;
    public final KeyEvent.Callback d;

    public t(KeyEvent.Callback callback, boolean z10, float f10, int i9) {
        this.f5227a = i9;
        this.d = callback;
        this.f5228b = z10;
        this.f5229c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f5227a) {
            case 0:
                super.onAnimationEnd(animator);
                if (!this.f5228b) {
                    super/*android.app.Dialog*/.dismiss();
                    return;
                }
                return;
            default:
                sl0 sl0Var = (sl0) this.d;
                ta1 ta1Var = sl0Var.f32500e;
                sl0Var.f32499d0 = null;
                boolean z10 = this.f5228b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                sl0Var.f32501e0 = f10;
                for (int i9 = 0; i9 < ta1Var.getChildCount(); i9++) {
                    ta1Var.getChildAt(i9).invalidate();
                }
                ta1Var.invalidate();
                sl0Var.p();
                if (!z10) {
                    float childCount = sl0Var.f32504g0 * ta1Var.getChildCount();
                    float f11 = this.f5229c;
                    float scrollX = (sl0Var.getScrollX() + f11) / (sl0Var.f32503f0 * ta1Var.getChildCount());
                    float measuredWidth = (childCount - sl0Var.getMeasuredWidth()) / childCount;
                    if (scrollX > measuredWidth) {
                        scrollX = measuredWidth;
                        f11 = 0.0f;
                    }
                    float f12 = childCount * scrollX;
                    if (f12 - f11 < 0.0f) {
                        f12 = f11;
                    }
                    sl0Var.f32505h0 = (sl0Var.getScrollX() + f11) - f12;
                    int i10 = (int) (f12 - f11);
                    sl0Var.f32506i0 = i10;
                    if (i10 < 0) {
                        sl0Var.f32506i0 = 0;
                    }
                    for (int i11 = 0; i11 < ta1Var.getChildCount(); i11++) {
                        View childAt = ta1Var.getChildAt(i11);
                        if (childAt instanceof lw0) {
                            ((lw0) childAt).setExpanded(false);
                        }
                        childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                    }
                    sl0Var.f32498c0 = false;
                    sl0Var.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                    ta1Var.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f5227a) {
            case 0:
                super.onAnimationStart(animator);
                v vVar = ((w) this.d).f5245y;
                vVar.setVisibility(0);
                if (this.f5228b) {
                    float f10 = this.f5229c;
                    vVar.setScaleX(f10);
                    vVar.setScaleY(f10);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
