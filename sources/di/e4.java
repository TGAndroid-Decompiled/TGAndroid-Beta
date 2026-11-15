package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w61;
public final class e4 extends w61 {
    public final c6 W;

    public e4(c6 c6Var, Context context) {
        super(context, null);
        this.W = c6Var;
    }

    @Override
    public final void D(View view, float f10) {
        View view2;
        bi.b2 b2Var;
        bi.b2 b2Var2;
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        c6 c6Var = this.W;
        view.setTranslationX(((-i7) * 2.0f * c6Var.f29717u0) + f10);
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
                b2Var = c6Var.Y1;
                if (b2Var != null && view2 == b2Var.U1 && (h4Var3 = b2Var.f8308a2) != null) {
                    h4Var3.invalidate();
                }
                if (view2 == c6Var.U1 && (h4Var2 = c6Var.f8308a2) != null) {
                    h4Var2.invalidate();
                }
                b2Var2 = c6Var.Z1;
                if (b2Var2 == null && view2 == b2Var2.U1 && (h4Var = b2Var2.f8308a2) != null) {
                    h4Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        b2Var = c6Var.Y1;
        if (b2Var != null) {
            h4Var3.invalidate();
        }
        if (view2 == c6Var.U1) {
            h4Var2.invalidate();
        }
        b2Var2 = c6Var.Z1;
        if (b2Var2 == null) {
        }
    }

    @Override
    public final void E() {
        super.E();
        int i7 = this.f41298b;
        c6 c6Var = this.W;
        boolean z10 = false;
        if (i7 != c6Var.I1(false)) {
            if (this.f41298b > c6Var.I1(false)) {
                z10 = true;
            }
            org.telegram.messenger.g0.h3(new ai.q(4, this, z10));
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        b5 b5Var = this.W.X2;
        if (b5Var != null && !b5Var.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        c6 c6Var = this.W;
        canvas.clipRect(c6Var.f29717u0, -getHeight(), getWidth() - c6Var.f29717u0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.f29717u0 * 2));
    }
}
