package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p6 extends pg.i1 {
    public final Path f3397g3;
    public final ad f3398h3;

    public p6(ad adVar, Context context) {
        super(context);
        this.f3398h3 = adVar;
        this.f3397g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ad adVar = this.f3398h3;
        barView = adVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, adVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, adVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), adVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), adVar.D1));
        Path path = this.f3397g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
