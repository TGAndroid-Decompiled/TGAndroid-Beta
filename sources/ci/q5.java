package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends qg.j1 {
    public final Path f5329g3;
    public final nb f5330h3;

    public q5(nb nbVar, Context context) {
        super(context);
        this.f5330h3 = nbVar;
        this.f5329g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        nb nbVar = this.f5330h3;
        barView = nbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, nbVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, nbVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), nbVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), nbVar.D1));
        Path path = this.f5329g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
