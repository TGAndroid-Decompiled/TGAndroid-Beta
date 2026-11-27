package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class sy5 extends gv7 {
    public final Path o3;
    public final hc8 p3;

    public sy5(hc8 hc8Var, Context context) {
        super(context);
        this.p3 = hc8Var;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        hc8 hc8Var = this.p3;
        barView = hc8Var.getBarView();
        RectF rectF = hl.P;
        rectF.set(hl.U1(hc8Var.x1, barView.getLeft() - getLeft(), 0), hl.U1(hc8Var.x1, barView.getTop() - getTop(), 0), hl.U1(hc8Var.x1, barView.getRight() - getLeft(), getWidth()), hl.U1(hc8Var.x1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, hl.L(32.0f), hl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
