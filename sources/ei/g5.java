package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class g5 extends rg.j1 {
    public final Path f9076h3;
    public final xa f9077i3;

    public g5(xa xaVar, Context context) {
        super(context);
        this.f9077i3 = xaVar;
        this.f9076h3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        xa xaVar = this.f9077i3;
        barView = xaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, xaVar.D1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, xaVar.D1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), xaVar.D1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), xaVar.D1));
        Path path = this.f9076h3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
