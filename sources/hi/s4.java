package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class s4 extends tg.y0 {
    public final Path f15376o3;
    public final v9 f15377p3;

    public s4(v9 v9Var, Context context) {
        super(context);
        this.f15377p3 = v9Var;
        this.f15376o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        v9 v9Var = this.f15377p3;
        barView = v9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(v9Var.n1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(v9Var.n1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(v9Var.n1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(v9Var.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f15376o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
