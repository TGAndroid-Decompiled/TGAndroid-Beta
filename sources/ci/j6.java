package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class j6 extends qg.d {
    public final Paint h;
    public long f5210n;
    public float f5211r;
    public float f5212s;
    public int v;
    public int f5213w;
    public final mb f5214x;

    public j6(mb mbVar, Context context, i6 i6Var) {
        super(context, i6Var);
        this.f5214x = mbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5214x.f5768m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.j6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        mb mbVar = this.f5214x;
        j6 j6Var = mbVar.R0;
        if (mbVar.R1 <= 0) {
            mbVar.R1 = j6Var.getMeasuredWidth();
        }
        if (mbVar.S1 <= 0) {
            mbVar.S1 = j6Var.getMeasuredHeight();
        }
        mbVar.H0();
    }
}
