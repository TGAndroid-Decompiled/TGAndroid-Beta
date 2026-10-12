package di;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class i6 extends rg.d {
    public final Paint h;
    public long f7040n;
    public float f7041r;
    public float f7042s;
    public int v;
    public int f7043w;
    public final mb f7044x;

    public i6(mb mbVar, Context context, h6 h6Var) {
        super(context, h6Var);
        this.f7044x = mbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7044x.f7535m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.i6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        mb mbVar = this.f7044x;
        i6 i6Var = mbVar.R0;
        if (mbVar.R1 <= 0) {
            mbVar.R1 = i6Var.getMeasuredWidth();
        }
        if (mbVar.S1 <= 0) {
            mbVar.S1 = i6Var.getMeasuredHeight();
        }
        mbVar.G0();
    }
}
