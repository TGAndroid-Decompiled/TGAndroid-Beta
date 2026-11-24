package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class jv7 extends bu7 {
    public final Path o3;
    public final z8b p3;

    public jv7(z8b z8bVar, Context context) {
        super(context);
        this.p3 = z8bVar;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        z8b z8bVar = this.p3;
        barView = z8bVar.getBarView();
        RectF rectF = gm.P;
        rectF.set(gm.U1(z8bVar.t1, barView.getLeft() - getLeft(), 0), gm.U1(z8bVar.t1, barView.getTop() - getTop(), 0), gm.U1(z8bVar.t1, barView.getRight() - getLeft(), getWidth()), gm.U1(z8bVar.t1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, gm.L(32.0f), gm.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
