package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class x4 extends bg.h2 {
    public final Path c3;
    public final ja f18826d3;

    public x4(ja jaVar, Context context) {
        super(context);
        this.f18826d3 = jaVar;
        this.c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ja jaVar = this.f18826d3;
        barView = jaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, jaVar.f18671z1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, jaVar.f18671z1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), jaVar.f18671z1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), jaVar.f18671z1));
        Path path = this.c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
