package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class qz3 extends FrameLayout {
    public final o24 a;

    public qz3(o24 o24Var, Context context) {
        super(context);
        this.a = o24Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o24 o24Var = this.a;
        tz3 tz3Var = o24Var.p0;
        if (view == o24Var.i0) {
            canvas.save();
            canvas.clipRect(0.0f, tz3Var.getY() + tz3Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }
}
