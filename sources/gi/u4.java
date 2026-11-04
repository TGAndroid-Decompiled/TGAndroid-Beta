package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class u4 extends ug.x0 {
    public final Path f13657o3;
    public final x9 f13658p3;

    public u4(x9 x9Var, Context context) {
        super(context);
        this.f13658p3 = x9Var;
        this.f13657o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        x9 x9Var = this.f13658p3;
        barView = x9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(x9Var.f13218n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f13657o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
