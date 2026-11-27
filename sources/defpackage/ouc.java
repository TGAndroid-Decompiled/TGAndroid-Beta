package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class ouc extends FrameLayout {
    public final quc a;

    public ouc(quc qucVar, Context context) {
        super(context);
        this.a = qucVar;
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
