package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class f04 extends FrameLayout {
    public final e34 a;

    public f04(e34 e34Var, Context context) {
        super(context);
        this.a = e34Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e34 e34Var = this.a;
        i04 i04Var = e34Var.p0;
        if (view == e34Var.i0) {
            canvas.save();
            canvas.clipRect(0.0f, i04Var.getY() + i04Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }
}
