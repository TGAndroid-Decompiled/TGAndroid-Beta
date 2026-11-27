package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class hy0 extends dl7 {
    public final boolean m0;
    public final ny0 n0;

    public hy0(ny0 ny0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.n0 = ny0Var;
        this.m0 = z;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ny0 ny0Var = this.n0;
        ny0Var.S0(canvas, this);
        super.dispatchDraw(canvas);
        ny0Var.R0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            ny0 ny0Var = this.n0;
            if (y < ny0Var.s0.getBounds().top) {
                ny0Var.dismiss();
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
        ny0 ny0Var = this.n0;
        ny0Var.q1 = size;
        ny0Var.O0(i, i2);
        if (this.m0) {
            i2 = View.MeasureSpec.makeMeasureSpec(ny0Var.q1, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
