package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class zx0 extends vi7 {
    public final boolean s0;
    public final fy0 t0;

    public zx0(fy0 fy0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.t0 = fy0Var;
        this.s0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fy0 fy0Var = this.t0;
        fy0Var.R0(canvas, this);
        super.dispatchDraw(canvas);
        fy0Var.Q0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            fy0 fy0Var = this.t0;
            if (y < fy0Var.s0.getBounds().top) {
                fy0Var.dismiss();
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
        fy0 fy0Var = this.t0;
        fy0Var.q1 = size;
        fy0Var.N0(i, i2);
        if (this.s0) {
            i2 = View.MeasureSpec.makeMeasureSpec(fy0Var.q1, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
