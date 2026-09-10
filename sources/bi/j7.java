package bi;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class j7 extends pg.d {
    public final Paint h;
    public long f2962n;
    public float f2963r;
    public float f2964s;
    public int v;
    public int f2965w;
    public final ad f2966x;

    public j7(ad adVar, Context context, i7 i7Var) {
        super(context, i7Var);
        this.f2966x = adVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2966x.f3523m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ad adVar = this.f2966x;
        j7 j7Var = adVar.R0;
        if (adVar.R1 <= 0) {
            adVar.R1 = j7Var.getMeasuredWidth();
        }
        if (adVar.S1 <= 0) {
            adVar.S1 = j7Var.getMeasuredHeight();
        }
        adVar.H0();
    }
}
