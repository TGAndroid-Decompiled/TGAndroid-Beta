package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class q19 extends bf0 {
    public final boolean H;
    public final r19 I;

    public q19(r19 r19Var, Context context, int i) {
        super(context);
        this.I = r19Var;
        this.H = i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        r19 r19Var = this.I;
        u82 u82Var = r19Var.F;
        p57 p57Var = r19.I;
        if (this.H) {
            u82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            y4b.h(r19Var.E, canvas, getImageReceiver(), u82Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
