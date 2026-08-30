package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ft0;
public final class z0 extends e2 {
    public final Path f4875d3;
    public final ft0 f4876e3;

    public z0(ft0 ft0Var, Context context) {
        super(context);
        this.f4876e3 = ft0Var;
        this.f4875d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ft0 ft0Var = this.f4876e3;
        barView = ft0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, ft0Var.K1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, ft0Var.K1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), ft0Var.K1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), ft0Var.K1));
        Path path = this.f4875d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
