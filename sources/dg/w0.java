package dg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ft0;
public final class w0 extends d {
    public final Paint h;
    public long f4834n;
    public float f4835r;
    public float f4836s;
    public final ft0 v;

    public w0(ft0 ft0Var, Context context, v0 v0Var) {
        super(context, v0Var);
        this.v = ft0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: dg.w0.onDraw(android.graphics.Canvas):void");
    }
}
