package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ws0;
public final class a1 extends h2 {
    public final Path c3;
    public final ws0 f2080d3;

    public a1(ws0 ws0Var, Context context) {
        super(context);
        this.f2080d3 = ws0Var;
        this.c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ws0 ws0Var = this.f2080d3;
        barView = ws0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, ws0Var.J1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, ws0Var.J1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), ws0Var.J1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), ws0Var.J1));
        Path path = this.c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
