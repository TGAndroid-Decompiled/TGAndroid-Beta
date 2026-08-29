package ih;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
public final class d6 extends f2.v0 {
    public final PointF f9105a = new PointF();
    public final e6 f9106b;

    public d6(e6 e6Var) {
        this.f9106b = e6Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f9;
        float f10;
        cg.h0 h0Var;
        float height = recyclerView.getHeight();
        e6 e6Var = this.f9106b;
        z5 z5Var = e6Var.f9140o0;
        y5 y5Var = e6Var.f9130d0;
        jl0 jl0Var = e6Var.d;
        PointF pointF = this.f9105a;
        if (sg.i.b(y5Var, jl0Var, pointF)) {
            f9 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + y5Var.getMeasuredHeight());
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        if (sg.i.b(z5Var, jl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + z5Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (h0Var = y5Var.H) != null) {
            float height2 = (f10 - height) / h0Var.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f9, height);
            canvas.scale(height2, height2);
            y5Var.H.draw(canvas);
            canvas.restore();
        }
    }
}
