package kh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;
public final class c6 extends f2.u0 {
    public final PointF f10639a = new PointF();
    public final d6 f10640b;

    public c6(d6 d6Var) {
        this.f10640b = d6Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        eg.h0 h0Var;
        float height = recyclerView.getHeight();
        d6 d6Var = this.f10640b;
        y5 y5Var = d6Var.f10669p0;
        x5 x5Var = d6Var.f10659e0;
        rl0 rl0Var = d6Var.d;
        PointF pointF = this.f10639a;
        if (ug.i.b(x5Var, rl0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + x5Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (ug.i.b(y5Var, rl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + y5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f11 && (h0Var = x5Var.I) != null) {
            float height2 = (f11 - height) / h0Var.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            x5Var.I.draw(canvas);
            canvas.restore();
        }
    }
}
