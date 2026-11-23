package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
public final class a9 extends v4.o0 {
    public final PointF f3417a = new PointF();
    public final c9 f3418b;

    public a9(c9 c9Var) {
        this.f3418b = c9Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        m3 m3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        c9 c9Var = this.f3418b;
        w8 w8Var = c9Var.f3521p2;
        v8 v8Var = c9Var.d2;
        ek0 ek0Var = c9Var.f39532o1;
        PointF pointF = this.f3417a;
        float f11 = 0.0f;
        if (jh.k.b(v8Var, ek0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + v8Var.getMeasuredHeight());
            f10 = f12;
            width = v8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(w8Var, ek0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + w8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (m3Var = v8Var.M) != null) {
            float height2 = (f11 - height) / m3Var.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            v8Var.M.draw(canvas);
            canvas.restore();
        }
    }
}
