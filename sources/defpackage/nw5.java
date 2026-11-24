package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class nw5 extends as7 {
    public final Path o3;
    public final q88 p3;

    public nw5(q88 q88Var, Context context) {
        super(context);
        this.p3 = q88Var;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        q88 q88Var = this.p3;
        barView = q88Var.getBarView();
        RectF rectF = gl.P;
        rectF.set(gl.U1(q88Var.D1, barView.getLeft() - getLeft(), 0), gl.U1(q88Var.D1, barView.getTop() - getTop(), 0), gl.U1(q88Var.D1, barView.getRight() - getLeft(), getWidth()), gl.U1(q88Var.D1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gl.L(32.0f), gl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
