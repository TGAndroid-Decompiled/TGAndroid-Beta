package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class gz0 extends xk7 {
    public final boolean s0;
    public final mz0 t0;

    public gz0(mz0 mz0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.t0 = mz0Var;
        this.s0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mz0 mz0Var = this.t0;
        mz0Var.R0(canvas, this);
        super.dispatchDraw(canvas);
        mz0Var.Q0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            mz0 mz0Var = this.t0;
            if (y < mz0Var.s0.getBounds().top) {
                mz0Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        mz0 mz0Var = this.t0;
        mz0Var.q1 = size;
        mz0Var.N0(i, i2);
        if (this.s0) {
            i2 = View.MeasureSpec.makeMeasureSpec(mz0Var.q1, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
