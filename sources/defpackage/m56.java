package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class m56 extends t1 {
    public final byte b = 1;

    public m56(Context context) {
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

    public m56(s56 s56Var, Context context) {
        super(context, (byte) 9);
    }
}
