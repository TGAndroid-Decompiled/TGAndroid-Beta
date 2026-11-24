package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class j46 extends jia {
    public final wjb N0;
    public final i46 O0;
    public m46 P0;

    public j46(Context context, wjb wjbVar) {
        super(context);
        this.O0 = new i46(this);
        this.N0 = wjbVar;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j46.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
