package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class zy3 extends FrameLayout {
    public final boolean a;
    public final t14 b;

    public zy3(t14 t14Var, Context context, boolean z) {
        super(context);
        this.b = t14Var;
        this.a = z;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.b;
        gz3 gz3Var = t14Var.C0;
        bz3 bz3Var = t14Var.E0;
        fz3 fz3Var = t14Var.H0;
        if (!this.a && (view == bz3Var || view == fz3Var)) {
            canvas.save();
            float y = gz3Var.getY() + gz3Var.getMeasuredHeight() + 1.0f;
            if (view == bz3Var) {
                y = Math.max(y, fz3Var.getY() + fz3Var.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y - (gl.L(16.0f) * t14Var.a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t14 t14Var = this.b;
        t14Var.L0 = true;
        t14Var.Z();
        mz3 mz3Var = t14Var.U0;
        if (mz3Var != null) {
            mz3Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t14 t14Var = this.b;
        t14Var.L0 = false;
        t14Var.Z();
        mz3 mz3Var = t14Var.U0;
        if (mz3Var != null) {
            mz3Var.a();
        }
    }
}
