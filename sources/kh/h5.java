package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class h5 extends yf.i1 {
    public final Path f15394c3;
    public final ya f15395d3;

    public h5(ya yaVar, Context context) {
        super(context);
        this.f15395d3 = yaVar;
        this.f15394c3 = new Path();
    }

    @Override
    public final void draw(Canvas canvas) {
        ViewGroup barView;
        ya yaVar = this.f15395d3;
        barView = yaVar.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, yaVar.f15316z1), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, yaVar.f15316z1), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), yaVar.f15316z1), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), yaVar.f15316z1));
        Path path = this.f15394c3;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
