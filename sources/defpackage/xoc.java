package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class xoc extends FrameLayout {
    public final apc a;

    public xoc(apc apcVar, Context context) {
        super(context);
        this.a = apcVar;
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
