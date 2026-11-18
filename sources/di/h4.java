package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g71;
public final class h4 extends g71 {
    public final f6 W;

    public h4(f6 f6Var, Context context) {
        super(context, null);
        this.W = f6Var;
    }

    @Override
    public final void B(View view, float f10) {
        View view2;
        bi.v2 v2Var;
        bi.v2 v2Var2;
        k4 k4Var;
        k4 k4Var2;
        k4 k4Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f10);
            return;
        }
        float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
        f6 f6Var = this.W;
        view.setTranslationX(((-i7) * 2.0f * f6Var.f30225u0) + f10);
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
                v2Var = f6Var.Y1;
                if (v2Var != null && view2 == v2Var.U1 && (k4Var3 = v2Var.f8768a2) != null) {
                    k4Var3.invalidate();
                }
                if (view2 == f6Var.U1 && (k4Var2 = f6Var.f8768a2) != null) {
                    k4Var2.invalidate();
                }
                v2Var2 = f6Var.Z1;
                if (v2Var2 == null && view2 == v2Var2.U1 && (k4Var = v2Var2.f8768a2) != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        v2Var = f6Var.Y1;
        if (v2Var != null) {
            k4Var3.invalidate();
        }
        if (view2 == f6Var.U1) {
            k4Var2.invalidate();
        }
        v2Var2 = f6Var.Z1;
        if (v2Var2 == null) {
        }
    }

    @Override
    public final void C() {
        super.C();
        int i7 = this.f35376b;
        f6 f6Var = this.W;
        boolean z10 = false;
        if (i7 != f6Var.N1(false)) {
            if (this.f35376b > f6Var.N1(false)) {
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
        canvas.clipRect(f6Var.f30225u0, -getHeight(), getWidth() - f6Var.f30225u0, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth() - (this.W.f30225u0 * 2));
    }
}
