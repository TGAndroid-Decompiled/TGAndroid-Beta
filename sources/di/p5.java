package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends rg.k1 {
    public final Path f7584e3;
    public final mb f7585f3;

    public p5(mb mbVar, Context context) {
        super(context);
        this.f7585f3 = mbVar;
        this.f7584e3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        mb mbVar = this.f7585f3;
        barView = mbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, mbVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, mbVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), mbVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), mbVar.D1));
        Path path = this.f7584e3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
