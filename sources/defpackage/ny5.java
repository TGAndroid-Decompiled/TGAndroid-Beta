package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class ny5 extends bu7 {
    public final Path o3;
    public final sa8 p3;

    public ny5(sa8 sa8Var, Context context) {
        super(context);
        this.p3 = sa8Var;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        sa8 sa8Var = this.p3;
        barView = sa8Var.getBarView();
        RectF rectF = gm.P;
        rectF.set(gm.U1(sa8Var.D1, barView.getLeft() - getLeft(), 0), gm.U1(sa8Var.D1, barView.getTop() - getTop(), 0), gm.U1(sa8Var.D1, barView.getRight() - getLeft(), getWidth()), gm.U1(sa8Var.D1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gm.L(32.0f), gm.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
