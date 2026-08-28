package kh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class a6 extends yf.d {
    public final Paint h;
    public long f14894n;
    public float f14895r;
    public float f14896s;
    public int v;
    public int f14897w;
    public final ya f14898x;

    public a6(ya yaVar, Context context, z5 z5Var) {
        super(context, z5Var);
        this.f14898x = yaVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14898x.f15284i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: kh.a6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        ya yaVar = this.f14898x;
        a6 a6Var = yaVar.N0;
        if (yaVar.N1 <= 0) {
            yaVar.N1 = a6Var.getMeasuredWidth();
        }
        if (yaVar.O1 <= 0) {
            yaVar.O1 = a6Var.getMeasuredHeight();
        }
        yaVar.H0();
    }
}
