package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
public final class d9 extends v4.o0 {
    public final PointF f3472a = new PointF();
    public final f9 f3473b;

    public d9(f9 f9Var) {
        this.f3473b = f9Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        o3 o3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        f9 f9Var = this.f3473b;
        z8 z8Var = f9Var.f3592p2;
        y8 y8Var = f9Var.d2;
        ek0 ek0Var = f9Var.f39246o1;
        PointF pointF = this.f3472a;
        float f11 = 0.0f;
        if (jh.k.b(y8Var, ek0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + y8Var.getMeasuredHeight());
            f10 = f12;
            width = y8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(z8Var, ek0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + z8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (o3Var = y8Var.M) != null) {
            float height2 = (f11 - height) / o3Var.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            y8Var.M.draw(canvas);
            canvas.restore();
        }
    }
}
