package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tz3 extends FrameLayout {
    public final t14 a;

    public tz3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.a;
        yz3 yz3Var = t14Var.J;
        ty3 ty3Var = t14Var.W;
        g04 g04Var = t14Var.Q;
        if (view != g04Var && view != ty3Var) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = yz3Var.getY() + yz3Var.getMeasuredHeight() + 1.0f;
        if (view == g04Var && ty3Var != null) {
            y = Math.max(y, ty3Var.getY() + ty3Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (gl.L(16.0f) * t14Var.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }
}
