package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class vy3 extends FrameLayout {
    public final t14 a;

    public vy3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.a;
        yy3 yy3Var = t14Var.p0;
        if (view == t14Var.i0) {
            canvas.save();
            canvas.clipRect(0.0f, yy3Var.getY() + yy3Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }
}
