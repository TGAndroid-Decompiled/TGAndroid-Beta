package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class j6 extends qg.d {
    public final Paint h;
    public long f5245n;
    public float f5246r;
    public float f5247s;
    public int v;
    public int f5248w;
    public final nb f5249x;

    public j6(nb nbVar, Context context, i6 i6Var) {
        super(context, i6Var);
        this.f5249x = nbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5249x.f5813m2) {
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
        nb nbVar = this.f5249x;
        j6 j6Var = nbVar.R0;
        if (nbVar.R1 <= 0) {
            nbVar.R1 = j6Var.getMeasuredWidth();
        }
        if (nbVar.S1 <= 0) {
            nbVar.S1 = j6Var.getMeasuredHeight();
        }
        nbVar.G0();
    }
}
