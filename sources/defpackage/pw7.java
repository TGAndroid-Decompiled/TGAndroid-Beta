package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class pw7 extends gv7 {
    public final Path o3;
    public final wab p3;

    public pw7(wab wabVar, Context context) {
        super(context);
        this.p3 = wabVar;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        wab wabVar = this.p3;
        barView = wabVar.getBarView();
        RectF rectF = hl.P;
        rectF.set(hl.U1(wabVar.n1, barView.getLeft() - getLeft(), 0), hl.U1(wabVar.n1, barView.getTop() - getTop(), 0), hl.U1(wabVar.n1, barView.getRight() - getLeft(), getWidth()), hl.U1(wabVar.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, hl.L(32.0f), hl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
