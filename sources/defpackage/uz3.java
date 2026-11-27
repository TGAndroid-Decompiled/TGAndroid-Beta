package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class uz3 extends FrameLayout {
    public final boolean a;
    public final o24 b;

    public uz3(o24 o24Var, Context context, boolean z) {
        super(context);
        this.b = o24Var;
        this.a = z;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o24 o24Var = this.b;
        b04 b04Var = o24Var.C0;
        wz3 wz3Var = o24Var.E0;
        a04 a04Var = o24Var.H0;
        if (!this.a && (view == wz3Var || view == a04Var)) {
            canvas.save();
            float y = b04Var.getY() + b04Var.getMeasuredHeight() + 1.0f;
            if (view == wz3Var) {
                y = Math.max(y, a04Var.getY() + a04Var.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y - (hl.L(16.0f) * o24Var.a.e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o24 o24Var = this.b;
        o24Var.L0 = true;
        o24Var.Y();
        h04 h04Var = o24Var.U0;
        if (h04Var != null) {
            h04Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o24 o24Var = this.b;
        o24Var.L0 = false;
        o24Var.Y();
        h04 h04Var = o24Var.U0;
        if (h04Var != null) {
            h04Var.a();
        }
    }
}
