package ci;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class j6 extends qg.d {
    public final Paint h;
    public long f4823n;
    public float f4824r;
    public float f4825s;
    public int v;
    public int f4826w;
    public final nb f4827x;

    public j6(nb nbVar, Context context, i6 i6Var) {
        super(context, i6Var);
        this.f4827x = nbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4827x.f5354m2) {
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
        nb nbVar = this.f4827x;
        j6 j6Var = nbVar.R0;
        if (nbVar.R1 <= 0) {
            nbVar.R1 = j6Var.getMeasuredWidth();
        }
        if (nbVar.S1 <= 0) {
            nbVar.S1 = j6Var.getMeasuredHeight();
        }
        nbVar.H0();
    }
}
