package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class j04 extends FrameLayout {
    public final boolean a;
    public final e34 b;

    public j04(e34 e34Var, Context context, boolean z) {
        super(context);
        this.b = e34Var;
        this.a = z;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e34 e34Var = this.b;
        q04 q04Var = e34Var.C0;
        l04 l04Var = e34Var.E0;
        p04 p04Var = e34Var.H0;
        if (!this.a && (view == l04Var || view == p04Var)) {
            canvas.save();
            float y = q04Var.getY() + q04Var.getMeasuredHeight() + 1.0f;
            if (view == l04Var) {
                y = Math.max(y, p04Var.getY() + p04Var.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y - (gm.L(16.0f) * e34Var.a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e34 e34Var = this.b;
        e34Var.L0 = true;
        e34Var.Z();
        w04 w04Var = e34Var.U0;
        if (w04Var != null) {
            w04Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e34 e34Var = this.b;
        e34Var.L0 = false;
        e34Var.Z();
        w04 w04Var = e34Var.U0;
        if (w04Var != null) {
            w04Var.a();
        }
    }
}
