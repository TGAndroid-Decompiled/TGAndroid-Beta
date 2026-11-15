package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class h5 extends tg.d {
    public final Paint h;
    public long f14375n;
    public float f14376r;
    public float f14377s;
    public int f14378w;
    public int f14379x;
    public final u9 f14380y;

    public h5(u9 u9Var, Context context, l0 l0Var) {
        super(context, l0Var);
        this.f14380y = u9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14380y.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.h5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        u9 u9Var = this.f14380y;
        h5 h5Var = u9Var.B0;
        if (u9Var.B1 <= 0) {
            u9Var.B1 = h5Var.getMeasuredWidth();
        }
        if (u9Var.C1 <= 0) {
            u9Var.C1 = h5Var.getMeasuredHeight();
        }
        u9Var.E0();
    }
}
