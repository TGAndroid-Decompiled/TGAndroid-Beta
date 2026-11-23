package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;
public final class h4 extends k71 {
    public final f6 W;

    public h4(f6 f6Var, Context context) {
        super(context, null);
        this.W = f6Var;
    }

    @Override
    public final void D(View view, float f10) {
        View view2;
        bi.b3 b3Var;
        bi.b3 b3Var2;
        k4 k4Var;
        k4 k4Var2;
        k4 k4Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        f6 f6Var = this.W;
        view.setTranslationX(((-i7) * 2.0f * f6Var.f30261u0) + f10);
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
                b3Var = f6Var.Y1;
                if (b3Var != null && view2 == b3Var.U1 && (k4Var3 = b3Var.f8756a2) != null) {
                    k4Var3.invalidate();
                }
                if (view2 == f6Var.U1 && (k4Var2 = f6Var.f8756a2) != null) {
                    k4Var2.invalidate();
                }
                b3Var2 = f6Var.Z1;
                if (b3Var2 == null && view2 == b3Var2.U1 && (k4Var = b3Var2.f8756a2) != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        b3Var = f6Var.Y1;
        if (b3Var != null) {
            k4Var3.invalidate();
        }
        if (view2 == f6Var.U1) {
            k4Var2.invalidate();
        }
        b3Var2 = f6Var.Z1;
        if (b3Var2 == null) {
        }
    }

    @Override
    public final void E() {
        super.E();
        int i7 = this.f36663b;
        f6 f6Var = this.W;
        boolean z10 = false;
        if (i7 != f6Var.N1(false)) {
            if (this.f36663b > f6Var.N1(false)) {
                z10 = true;
            }
            org.telegram.messenger.g0.g3(new ch.k(3, this, z10));
        }
    }

    @Override
    public final boolean b(MotionEvent motionEvent) {
        e5 e5Var = this.W.X2;
        if (e5Var != null && !e5Var.c(0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        f6 f6Var = this.W;
        canvas.clipRect(f6Var.f30261u0, -getHeight(), getWidth() - f6Var.f30261u0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.f30261u0 * 2));
    }
}
