package kh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public final class d6 extends f2.u0 {
    public final PointF f10542a = new PointF();
    public final e6 f10543b;

    public d6(e6 e6Var) {
        this.f10543b = e6Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        eg.h0 h0Var;
        float height = recyclerView.getHeight();
        e6 e6Var = this.f10543b;
        z5 z5Var = e6Var.f10579p0;
        y5 y5Var = e6Var.f10569e0;
        sl0 sl0Var = e6Var.d;
        PointF pointF = this.f10542a;
        if (ug.i.b(y5Var, sl0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + y5Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (ug.i.b(z5Var, sl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + z5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f11 && (h0Var = y5Var.I) != null) {
            float height2 = (f11 - height) / h0Var.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            y5Var.I.draw(canvas);
            canvas.restore();
        }
    }
}
