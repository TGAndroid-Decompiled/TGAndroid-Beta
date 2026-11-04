package gi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class h5 extends ug.d {
    public final Paint h;
    public long f12877n;
    public float f12878r;
    public float f12879s;
    public int f12880w;
    public int f12881x;
    public final x9 f12882y;

    public h5(x9 x9Var, Context context, bb.c cVar) {
        super(context, cVar);
        this.f12882y = x9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12882y.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: gi.h5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        x9 x9Var = this.f12882y;
        h5 h5Var = x9Var.B0;
        if (x9Var.B1 <= 0) {
            x9Var.B1 = h5Var.getMeasuredWidth();
        }
        if (x9Var.C1 <= 0) {
            x9Var.C1 = h5Var.getMeasuredHeight();
        }
        x9Var.E0();
    }
}
