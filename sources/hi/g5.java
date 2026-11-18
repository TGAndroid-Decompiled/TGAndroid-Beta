package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class g5 extends tg.d {
    public final Paint h;
    public long f14691n;
    public float f14692r;
    public float f14693s;
    public int f14694w;
    public int f14695x;
    public final v9 f14696y;

    public g5(v9 v9Var, Context context, h9.g1 g1Var) {
        super(context, g1Var);
        this.f14696y = v9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14696y.W1) {
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
        v9 v9Var = this.f14696y;
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
