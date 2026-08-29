package bg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ws0;
public final class x0 extends d {
    public final Paint h;
    public long f2604n;
    public float f2605r;
    public float f2606s;
    public final ws0 v;

    public x0(ws0 ws0Var, Context context, w0 w0Var) {
        super(context, w0Var);
        this.v = ws0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: bg.x0.onDraw(android.graphics.Canvas):void");
    }
}
