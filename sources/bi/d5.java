package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v91;
public final class d5 extends v91 {
    public final h7 V;

    public d5(h7 h7Var, Context context) {
        super(context, null);
        this.V = h7Var;
    }

    @Override
    public final void F(View view, float f7) {
        int i10;
        View view2;
        zh.l2 l2Var;
        zh.l2 l2Var2;
        g5 g5Var;
        g5 g5Var2;
        g5 g5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        h7 h7Var = this.V;
        i10 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
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
                l2Var = h7Var.f4731c0;
                if (l2Var != null && view2 == l2Var.Y && (g5Var3 = l2Var.f4735e0) != null) {
                    g5Var3.invalidate();
                }
                if (view2 == h7Var.Y && (g5Var2 = h7Var.f4735e0) != null) {
                    g5Var2.invalidate();
                }
                l2Var2 = h7Var.f4733d0;
                if (l2Var2 == null && view2 == l2Var2.Y && (g5Var = l2Var2.f4735e0) != null) {
                    g5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = h7Var.f4731c0;
        if (l2Var != null) {
            g5Var3.invalidate();
        }
        if (view2 == h7Var.Y) {
            g5Var2.invalidate();
        }
        l2Var2 = h7Var.f4733d0;
        if (l2Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i10 = this.f33632b;
        h7 h7Var = this.V;
        boolean z10 = false;
        if (i10 != h7Var.f2(false)) {
            if (this.f33632b > h7Var.f2(false)) {
                z10 = true;
            }
            AndroidUtilities.runOnUIThread(new bh.n(3, this, z10));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        canvas.save();
        h7 h7Var = this.V;
        i10 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) h7Var).backgroundPaddingLeft;
        canvas.clipRect(i10, -getHeight(), width - i11, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        i10 = ((org.telegram.ui.ActionBar.k3) this.V).backgroundPaddingLeft;
        return Math.max(1, measuredWidth - (i10 * 2));
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        c6 c6Var = this.V.f4730b1;
        if (c6Var != null && !c6Var.c(0)) {
            return false;
        }
        return true;
    }
}
