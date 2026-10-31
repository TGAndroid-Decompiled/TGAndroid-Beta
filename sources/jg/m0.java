package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.er0;
public final class m0 extends n1 {
    public final Path f10091n3;
    public final er0 f10092o3;

    public m0(er0 er0Var, Context context) {
        super(context);
        this.f10092o3 = er0Var;
        this.f10091n3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        er0 er0Var = this.f10092o3;
        barView = er0Var.getBarView();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.W1(er0Var.f10197w1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.i0.W1(er0Var.f10197w1, barView.getTop() - getTop(), 0), org.telegram.messenger.i0.W1(er0Var.f10197w1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.i0.W1(er0Var.f10197w1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f10091n3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
