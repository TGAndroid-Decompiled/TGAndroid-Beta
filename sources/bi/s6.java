package bi;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.uj0;
public final class s6 extends v4.n0 {
    public final PointF f3870a = new PointF();
    public final u6 f3871b;

    public s6(u6 u6Var) {
        this.f3871b = u6Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        o2 o2Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        u6 u6Var = this.f3871b;
        o6 o6Var = u6Var.f3921p2;
        n6 n6Var = u6Var.d2;
        uj0 uj0Var = u6Var.f35931o1;
        PointF pointF = this.f3870a;
        float f11 = 0.0f;
        if (jh.k.b(n6Var, uj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + n6Var.getMeasuredHeight());
            f10 = f12;
            width = n6Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(o6Var, uj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + o6Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (o2Var = n6Var.M) != null) {
            float height2 = (f11 - height) / o2Var.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            n6Var.M.draw(canvas);
            canvas.restore();
        }
    }
}
