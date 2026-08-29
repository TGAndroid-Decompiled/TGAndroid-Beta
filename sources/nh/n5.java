package nh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends bg.d {
    public final Paint h;
    public long f18185n;
    public float f18186r;
    public float f18187s;
    public int v;
    public int f18188w;
    public final ja f18189x;

    public n5(ja jaVar, Context context, m5 m5Var) {
        super(context, m5Var);
        this.f18189x = jaVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f18189x.f18639i2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: nh.n5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ja jaVar = this.f18189x;
        n5 n5Var = jaVar.N0;
        if (jaVar.N1 <= 0) {
            jaVar.N1 = n5Var.getMeasuredWidth();
        }
        if (jaVar.O1 <= 0) {
            jaVar.O1 = n5Var.getMeasuredHeight();
        }
        jaVar.H0();
    }
}
