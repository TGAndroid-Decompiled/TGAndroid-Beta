package hi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class f5 extends tg.d {
    public final Paint h;
    public long f14643n;
    public float f14644r;
    public float f14645s;
    public int f14646w;
    public int f14647x;
    public final u9 f14648y;

    public f5(u9 u9Var, Context context, h9.g1 g1Var) {
        super(context, g1Var);
        this.f14648y = u9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14648y.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        u9 u9Var = this.f14648y;
        f5 f5Var = u9Var.B0;
        if (u9Var.B1 <= 0) {
            u9Var.B1 = f5Var.getMeasuredWidth();
        }
        if (u9Var.C1 <= 0) {
            u9Var.C1 = f5Var.getMeasuredHeight();
        }
        u9Var.E0();
    }
}
