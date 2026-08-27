package gh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;

public final class l6 extends f2.w0 {

    public final PointF f7418a = new PointF();

    public final m6 f7419b;

    public l6(m6 m6Var) {
        this.f7419b = m6Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float fMax;
        ag.s0 s0Var;
        float height = recyclerView.getHeight();
        m6 m6Var = this.f7419b;
        h6 h6Var = m6Var.f7451o0;
        g6 g6Var = m6Var.f7441d0;
        zk0 zk0Var = m6Var.d;
        PointF pointF = this.f7418a;
        if (qg.j.b(g6Var, zk0Var, pointF)) {
            f10 = pointF.x;
            height = Math.min(height, pointF.y);
            fMax = Math.max(0.0f, pointF.y + g6Var.getMeasuredHeight());
        } else {
            f10 = 0.0f;
            fMax = 0.0f;
        }
        if (qg.j.b(h6Var, zk0Var, pointF)) {
            height = Math.min(height, pointF.y);
            fMax = Math.max(fMax, pointF.y + h6Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height >= fMax || (s0Var = g6Var.H) == null) {
            return;
        }
        float height2 = (fMax - height) / s0Var.getHeight();
        canvas.save();
        canvas.clipRect(0.0f, height, recyclerView.getWidth(), fMax);
        canvas.translate(f10, height);
        canvas.scale(height2, height2);
        g6Var.H.draw(canvas);
        canvas.restore();
    }
}
