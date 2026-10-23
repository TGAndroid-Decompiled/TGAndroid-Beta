package ei;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class z5 extends rg.d {
    public final Paint h;
    public long f10217n;
    public float f10218r;
    public float f10219s;
    public int v;
    public int f10220w;
    public final xa f10221x;

    public z5(xa xaVar, Context context, y5 y5Var) {
        super(context, y5Var);
        this.f10221x = xaVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f10221x.f9033m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: ei.z5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        xa xaVar = this.f10221x;
        z5 z5Var = xaVar.R0;
        if (xaVar.R1 <= 0) {
            xaVar.R1 = z5Var.getMeasuredWidth();
        }
        if (xaVar.S1 <= 0) {
            xaVar.S1 = z5Var.getMeasuredHeight();
        }
        xaVar.F0();
    }
}
