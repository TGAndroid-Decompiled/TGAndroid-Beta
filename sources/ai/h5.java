package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d91;
public final class h5 extends d91 {
    public final k7 T;

    public h5(k7 k7Var, Context context) {
        super(context, null);
        this.T = k7Var;
    }

    @Override
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.k2 k2Var;
        yh.k2 k2Var2;
        k5 k5Var;
        k5 k5Var2;
        k5 k5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        k7 k7Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) k7Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        float f10 = 0.0f;
        if (clamp <= 0.0f) {
            f10 = view.getMeasuredWidth();
        }
        view.setPivotX(f10);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                k2Var = k7Var.f1651c0;
                if (k2Var != null && view2 == k2Var.Y && (k5Var3 = k2Var.f1655e0) != null) {
                    k5Var3.invalidate();
                }
                if (view2 == k7Var.Y && (k5Var2 = k7Var.f1655e0) != null) {
                    k5Var2.invalidate();
                }
                k2Var2 = k7Var.f1653d0;
                if (k2Var2 == null && view2 == k2Var2.Y && (k5Var = k2Var2.f1655e0) != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        k2Var = k7Var.f1651c0;
        if (k2Var != null) {
            k5Var3.invalidate();
        }
        if (view2 == k7Var.Y) {
            k5Var2.invalidate();
        }
        k2Var2 = k7Var.f1653d0;
        if (k2Var2 == null) {
        }
    }

    @Override
    public final void F() {
        super.F();
        int i10 = this.f25501b;
        k7 k7Var = this.T;
        boolean z10 = false;
        if (i10 != k7Var.g2(false)) {
            if (this.f25501b > k7Var.g2(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new ah.t(3, this, z10));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        canvas.save();
        k7 k7Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) k7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) k7Var).backgroundPaddingLeft;
        canvas.clipRect(i10, -getHeight(), width - i11, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) this.T).backgroundPaddingLeft;
        return Math.max(1, measuredWidth - (i10 * 2));
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        g6 g6Var = this.T.f1650b1;
        if (g6Var != null && !g6Var.c(0)) {
            return false;
        }
        return true;
    }
}
