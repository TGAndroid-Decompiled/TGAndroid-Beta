package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class m36 extends t1 {
    public final byte b = 1;

    public m36(Context context) {
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

    public m36(s36 s36Var, Context context) {
        super(context, (byte) 9);
    }
}
