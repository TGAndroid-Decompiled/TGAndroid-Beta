package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class g5 extends zf.i1 {

    public final Path f16035c3;

    public final va f16036d3;

    public g5(va vaVar, Context context) {
        super(context);
        this.f16036d3 = vaVar;
        this.f16035c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        va vaVar = this.f16036d3;
        ViewGroup barView = vaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, vaVar.f16006z1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, vaVar.f16006z1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), vaVar.f16006z1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), vaVar.f16006z1));
        Path path = this.f16035c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
