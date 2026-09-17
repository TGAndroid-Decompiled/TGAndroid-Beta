package di;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class k6 extends rg.d {
    public final Paint h;
    public long f7469n;
    public float f7470r;
    public float f7471s;
    public int v;
    public int f7472w;
    public final rb f7473x;

    public k6(rb rbVar, Context context, j6 j6Var) {
        super(context, j6Var);
        this.f7473x = rbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7473x.f7976m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.k6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        rb rbVar = this.f7473x;
        k6 k6Var = rbVar.R0;
        if (rbVar.R1 <= 0) {
            rbVar.R1 = k6Var.getMeasuredWidth();
        }
        if (rbVar.S1 <= 0) {
            rbVar.S1 = k6Var.getMeasuredHeight();
        }
        rbVar.H0();
    }
}
