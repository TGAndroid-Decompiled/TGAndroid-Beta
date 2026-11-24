package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class it7 extends as7 {
    public final Path o3;
    public final x6b p3;

    public it7(x6b x6bVar, Context context) {
        super(context);
        this.p3 = x6bVar;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        x6b x6bVar = this.p3;
        barView = x6bVar.getBarView();
        RectF rectF = gl.P;
        rectF.set(gl.U1(x6bVar.t1, barView.getLeft() - getLeft(), 0), gl.U1(x6bVar.t1, barView.getTop() - getTop(), 0), gl.U1(x6bVar.t1, barView.getRight() - getLeft(), getWidth()), gl.U1(x6bVar.t1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gl.L(32.0f), gl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
