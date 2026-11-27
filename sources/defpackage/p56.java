package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class p56 extends u1 {
    public final byte b = 1;

    public p56(Context context) {
        super(context, (byte) 9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.b) {
            case 0:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                invalidate();
                return;
        }
    }

    public p56(v56 v56Var, Context context) {
        super(context, (byte) 9);
    }
}
