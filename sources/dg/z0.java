package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mt0;
public final class z0 extends e2 {
    public final Path f4881d3;
    public final mt0 f4882e3;

    public z0(mt0 mt0Var, Context context) {
        super(context);
        this.f4882e3 = mt0Var;
        this.f4881d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        mt0 mt0Var = this.f4882e3;
        barView = mt0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, mt0Var.K1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, mt0Var.K1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), mt0Var.K1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), mt0Var.K1));
        Path path = this.f4881d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
