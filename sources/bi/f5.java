package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p61;
public final class f5 extends p61 {
    public final k7 V;

    public f5(k7 k7Var, Context context) {
        super(context, null);
        this.V = k7Var;
    }

    @Override
    public final void F(View view, float f10) {
        View view2;
        i5 i5Var;
        i5 i5Var2;
        j5 j5Var;
        j5 j5Var2;
        j5 j5Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        k7 k7Var = this.V;
        view.setTranslationX(((-i7) * 2.0f * k7Var.f28645t0) + f10);
        float f11 = 0.0f;
        if (i7 <= 0.0f) {
            f11 = view.getMeasuredWidth();
        }
        view.setPivotX(f11);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * i7));
        view.setRotationY(i7 * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                i5Var = k7Var.U1;
                if (i5Var != null && view2 == i5Var.Q1 && (j5Var3 = i5Var.W1) != null) {
                    j5Var3.invalidate();
                }
                if (view2 == k7Var.Q1 && (j5Var2 = k7Var.W1) != null) {
                    j5Var2.invalidate();
                }
                i5Var2 = k7Var.V1;
                if (i5Var2 == null && view2 == i5Var2.Q1 && (j5Var = i5Var2.W1) != null) {
                    j5Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        i5Var = k7Var.U1;
        if (i5Var != null) {
            j5Var3.invalidate();
        }
        if (view2 == k7Var.Q1) {
            j5Var2.invalidate();
        }
        i5Var2 = k7Var.V1;
        if (i5Var2 == null) {
        }
    }

    @Override
    public final void G() {
        super.G();
        int i7 = this.f36904b;
        k7 k7Var = this.V;
        boolean z9 = false;
        if (i7 != k7Var.I1(false)) {
            if (this.f36904b > k7Var.I1(false)) {
                z9 = true;
            }
            org.telegram.messenger.g0.h3(new k1(2, this, z9));
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        g6 g6Var = this.V.T2;
        if (g6Var != null && !g6Var.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        k7 k7Var = this.V;
        canvas.clipRect(k7Var.f28645t0, -getHeight(), getWidth() - k7Var.f28645t0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.V.f28645t0 * 2));
    }
}
