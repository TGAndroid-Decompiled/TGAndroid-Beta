package fi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class y5 extends sg.d {
    public final Paint h;
    public long f11997n;
    public float f11998r;
    public float f11999s;
    public int v;
    public int f12000w;
    public final ta f12001x;

    public y5(ta taVar, Context context, x5 x5Var) {
        super(context, x5Var);
        this.f12001x = taVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12001x.f10781b2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ta taVar = this.f12001x;
        y5 y5Var = taVar.G0;
        if (taVar.G1 <= 0) {
            taVar.G1 = y5Var.getMeasuredWidth();
        }
        if (taVar.H1 <= 0) {
            taVar.H1 = y5Var.getMeasuredHeight();
        }
        taVar.E0();
    }
}
