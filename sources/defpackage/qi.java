package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
public final class qi extends bf0 {
    public final Path H;

    public qi(Context context) {
        super(context);
        this.H = new Path();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.H;
        path.rewind();
        path.addCircle(gm.L(54.0f), gm.L(53.0f), gm.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
