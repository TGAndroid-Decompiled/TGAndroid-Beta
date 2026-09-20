package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class k6 extends qg.d {
    public final Paint h;
    public long f4887n;
    public float f4888r;
    public float f4889s;
    public int v;
    public int f4890w;
    public final qb f4891x;

    public k6(qb qbVar, Context context, j6 j6Var) {
        super(context, j6Var);
        this.f4891x = qbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4891x.f5433m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.k6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        qb qbVar = this.f4891x;
        k6 k6Var = qbVar.R0;
        if (qbVar.R1 <= 0) {
            qbVar.R1 = k6Var.getMeasuredWidth();
        }
        if (qbVar.S1 <= 0) {
            qbVar.S1 = k6Var.getMeasuredHeight();
        }
        qbVar.H0();
    }
}
