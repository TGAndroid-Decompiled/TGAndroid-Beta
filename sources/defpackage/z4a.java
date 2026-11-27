package defpackage;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
public final class z4a extends p79 {
    public final PointF a = new PointF();
    public final a5a b;

    public z4a(a5a a5aVar) {
        this.b = a5aVar;
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        nf9 nf9Var;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        a5a a5aVar = this.b;
        v4a v4aVar = a5aVar.o2;
        u4a u4aVar = a5aVar.c2;
        d79 d79Var = a5aVar.n1;
        PointF pointF = this.a;
        float f2 = 0.0f;
        if (yic.b(u4aVar, d79Var, pointF)) {
            float f3 = pointF.x;
            height = Math.min(height, pointF.y);
            f2 = Math.max(0.0f, pointF.y + u4aVar.getMeasuredHeight());
            f = f3;
            width = u4aVar.getMeasuredWidth() + f3;
        } else {
            f = 0.0f;
        }
        if (yic.b(v4aVar, d79Var, pointF)) {
            height = Math.min(height, pointF.y);
            f2 = Math.max(f2, pointF.y + v4aVar.getMeasuredHeight() + hl.L(12.0f));
        }
        if (height < f2 && (nf9Var = u4aVar.M) != null) {
            float height2 = (f2 - height) / nf9Var.getHeight();
            canvas.save();
            canvas.clipRect(f, height, width, f2);
            canvas.translate(f, height);
            canvas.scale(height2, height2);
            u4aVar.M.draw(canvas);
            canvas.restore();
        }
    }
}
