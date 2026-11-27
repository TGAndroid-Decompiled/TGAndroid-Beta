package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class d39 extends de0 {
    public final boolean H;
    public final e39 I;

    public d39(e39 e39Var, Context context, int i) {
        super(context);
        this.I = e39Var;
        this.H = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e39 e39Var = this.I;
        a82 a82Var = e39Var.F;
        w57 w57Var = e39.I;
        if (this.H) {
            a82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            t6b.h(e39Var.E, canvas, getImageReceiver(), a82Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
