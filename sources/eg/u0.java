package eg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ht0;
public final class u0 extends d {
    public final Paint h;
    public long f5500n;
    public float f5501r;
    public float f5502s;
    public final ht0 v;

    public u0(ht0 ht0Var, Context context, t0 t0Var) {
        super(context, t0Var);
        this.v = ht0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: eg.u0.onDraw(android.graphics.Canvas):void");
    }
}
