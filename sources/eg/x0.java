package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ht0;
public final class x0 extends c2 {
    public final Path f5543d3;
    public final ht0 f5544e3;

    public x0(ht0 ht0Var, Context context) {
        super(context);
        this.f5544e3 = ht0Var;
        this.f5543d3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ht0 ht0Var = this.f5544e3;
        barView = ht0Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, ht0Var.K1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, ht0Var.K1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), ht0Var.K1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), ht0Var.K1));
        Path path = this.f5543d3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
