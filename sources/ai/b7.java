package ai;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.tj0;
public final class b7 extends u4.n0 {
    public final PointF f531a = new PointF();
    public final d7 f532b;

    public b7(d7 d7Var) {
        this.f532b = d7Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        x2 x2Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        d7 d7Var = this.f532b;
        x6 x6Var = d7Var.f588m2;
        w6 w6Var = d7Var.f577a2;
        tj0 tj0Var = d7Var.f36102l1;
        PointF pointF = this.f531a;
        float f11 = 0.0f;
        if (kh.k.b(w6Var, tj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + w6Var.getMeasuredHeight());
            f10 = f12;
            width = w6Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (kh.k.b(x6Var, tj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + x6Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (x2Var = w6Var.M) != null) {
            float height2 = (f11 - height) / x2Var.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            w6Var.M.draw(canvas);
            canvas.restore();
        }
    }
}
