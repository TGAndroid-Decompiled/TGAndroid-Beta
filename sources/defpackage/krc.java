package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class krc extends FrameLayout {
    public final nrc a;

    public krc(nrc nrcVar, Context context) {
        super(context);
        this.a = nrcVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        guc gucVar = this.a.j;
        gucVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (gucVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
