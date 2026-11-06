package fi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class j5 extends tg.d {
    public final Paint h;
    public long f12227n;
    public float f12228r;
    public float f12229s;
    public int f12230w;
    public int f12231x;
    public final x9 f12232y;

    public j5(x9 x9Var, Context context, aa.n nVar) {
        super(context, nVar);
        this.f12232y = x9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12232y.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.j5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        x9 x9Var = this.f12232y;
        j5 j5Var = x9Var.A0;
        if (x9Var.A1 <= 0) {
            x9Var.A1 = j5Var.getMeasuredWidth();
        }
        if (x9Var.B1 <= 0) {
            x9Var.B1 = j5Var.getMeasuredHeight();
        }
        x9Var.E0();
    }
}
