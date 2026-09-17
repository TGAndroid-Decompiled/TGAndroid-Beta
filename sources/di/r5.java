package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r5 extends rg.k1 {
    public final Path f8065g3;
    public final rb f8066h3;

    public r5(rb rbVar, Context context) {
        super(context);
        this.f8066h3 = rbVar;
        this.f8065g3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        rb rbVar = this.f8066h3;
        barView = rbVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, rbVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, rbVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), rbVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), rbVar.D1));
        Path path = this.f8065g3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
