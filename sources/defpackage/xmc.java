package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
public final class xmc extends FrameLayout {
    public final anc a;

    public xmc(anc ancVar, Context context) {
        super(context);
        this.a = ancVar;
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
