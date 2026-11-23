package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class q5 extends tg.h {
    public final Paint h;
    public long f15222n;
    public float f15223r;
    public float f15224s;
    public int f15225w;
    public int f15226x;
    public final pa f15227y;

    public q5(pa paVar, Context context, f5 f5Var) {
        super(context, f5Var);
        this.f15227y = paVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15227y.f15554a2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        pa paVar = this.f15227y;
        q5 q5Var = paVar.B0;
        if (paVar.B1 <= 0) {
            paVar.B1 = q5Var.getMeasuredWidth();
        }
        if (paVar.C1 <= 0) {
            paVar.C1 = q5Var.getMeasuredHeight();
        }
        paVar.H0();
    }
}
