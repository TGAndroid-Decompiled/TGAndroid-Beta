package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class pw7 extends gv7 {
    public final Path o3;
    public final vab p3;

    public pw7(vab vabVar, Context context) {
        super(context);
        this.p3 = vabVar;
        this.o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        vab vabVar = this.p3;
        barView = vabVar.getBarView();
        RectF rectF = hl.P;
        rectF.set(hl.U1(vabVar.n1, barView.getLeft() - getLeft(), 0), hl.U1(vabVar.n1, barView.getTop() - getTop(), 0), hl.U1(vabVar.n1, barView.getRight() - getLeft(), getWidth()), hl.U1(vabVar.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.o3;
        path.rewind();
        path.addRoundRect(rectF, hl.L(32.0f), hl.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
