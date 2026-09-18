package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r5 extends qg.l1 {
    public final Path f5407g3;
    public final qb f5408h3;

    public r5(qb qbVar, Context context) {
        super(context);
        this.f5408h3 = qbVar;
        this.f5407g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        qb qbVar = this.f5408h3;
        barView = qbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, qbVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, qbVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), qbVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), qbVar.D1));
        Path path = this.f5407g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
