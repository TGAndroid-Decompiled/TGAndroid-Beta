package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class pz8 extends be0 {
    public final boolean H;
    public final qz8 I;

    public pz8(qz8 qz8Var, Context context, int i) {
        super(context);
        this.I = qz8Var;
        this.H = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qz8 qz8Var = this.I;
        j72 j72Var = qz8Var.F;
        p37 p37Var = qz8.I;
        if (this.H) {
            j72Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            x2b.h(qz8Var.E, canvas, getImageReceiver(), j72Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
