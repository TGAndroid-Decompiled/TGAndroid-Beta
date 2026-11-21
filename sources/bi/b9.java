package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
public final class b9 extends v4.o0 {
    public final PointF f3444a = new PointF();
    public final d9 f3445b;

    public b9(d9 d9Var) {
        this.f3445b = d9Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        m3 m3Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        d9 d9Var = this.f3445b;
        x8 x8Var = d9Var.f3545p2;
        w8 w8Var = d9Var.d2;
        ek0 ek0Var = d9Var.f39539o1;
        PointF pointF = this.f3444a;
        float f11 = 0.0f;
        if (jh.k.b(w8Var, ek0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + w8Var.getMeasuredHeight());
            f10 = f12;
            width = w8Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(x8Var, ek0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + x8Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (m3Var = w8Var.M) != null) {
            float height2 = (f11 - height) / m3Var.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            w8Var.M.draw(canvas);
            canvas.restore();
        }
    }
}
