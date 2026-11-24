package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class aqc extends FrameLayout {
    public final cqc a;

    public aqc(cqc cqcVar, Context context) {
        super(context);
        this.a = cqcVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        spc spcVar = this.a.j;
        spcVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (spcVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
