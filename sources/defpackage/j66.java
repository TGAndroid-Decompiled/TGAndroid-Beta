package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class j66 extends lka {
    public final ylb N0;
    public final i66 O0;
    public m66 P0;

    public j66(Context context, ylb ylbVar) {
        super(context);
        this.O0 = new i66(this);
        this.N0 = ylbVar;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j66.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
