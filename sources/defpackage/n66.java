package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class n66 extends ema {
    public final vnb N0;
    public final m66 O0;
    public q66 P0;

    public n66(Context context, vnb vnbVar) {
        super(context);
        this.O0 = new m66(this);
        this.N0 = vnbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getLayoutX(), getLayoutY());
        if (this.O0.g(canvas)) {
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n66.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
