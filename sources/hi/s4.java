package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class s4 extends tg.z0 {
    public final Path f15373o3;
    public final u9 f15374p3;

    public s4(u9 u9Var, Context context) {
        super(context);
        this.f15374p3 = u9Var;
        this.f15373o3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        u9 u9Var = this.f15374p3;
        barView = u9Var.getBarView();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.W1(u9Var.n1, barView.getLeft() - getLeft(), 0), org.telegram.messenger.g0.W1(u9Var.n1, barView.getTop() - getTop(), 0), org.telegram.messenger.g0.W1(u9Var.n1, barView.getRight() - getLeft(), getWidth()), org.telegram.messenger.g0.W1(u9Var.n1, barView.getBottom() - getTop(), getHeight()));
        Path path = this.f15373o3;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
