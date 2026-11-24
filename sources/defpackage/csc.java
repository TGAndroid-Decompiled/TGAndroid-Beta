package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class csc extends FrameLayout {
    public final esc a;

    public csc(esc escVar, Context context) {
        super(context);
        this.a = escVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        trc trcVar = this.a.j;
        trcVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (trcVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
