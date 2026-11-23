package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class g5 extends tg.d {
    public final Paint h;
    public long f14640n;
    public float f14641r;
    public float f14642s;
    public int f14643w;
    public int f14644x;
    public final v9 f14645y;

    public g5(v9 v9Var, Context context, h9.g1 g1Var) {
        super(context, g1Var);
        this.f14645y = v9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14645y.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        v9 v9Var = this.f14645y;
        g5 g5Var = v9Var.B0;
        if (v9Var.B1 <= 0) {
            v9Var.B1 = g5Var.getMeasuredWidth();
        }
        if (v9Var.C1 <= 0) {
            v9Var.C1 = g5Var.getMeasuredHeight();
        }
        v9Var.E0();
    }
}
