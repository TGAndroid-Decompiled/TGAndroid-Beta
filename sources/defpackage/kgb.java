package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class kgb extends hq7 {
    public final lgb z0;

    public kgb(lgb lgbVar, Context context) {
        super(13, null, context);
        this.z0 = lgbVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = aob.w0(null, aob.j5, false);
        lgb lgbVar = this.z0;
        Paint paint = lgbVar.e;
        if (w0 != lgbVar.a) {
            lgbVar.a = w0;
            setTextColor(w0);
        }
        super.onDraw(canvas);
        float L = hl.L(31.0f);
        paint.setColor(aob.w0(null, aob.h7, false));
        canvas.drawLine(hl.L(2.0f), L, getMeasuredWidth() - hl.L(2.0f), L, paint);
        float measuredHeight = getMeasuredHeight() - hl.L(31.0f);
        canvas.drawLine(hl.L(2.0f), measuredHeight, getMeasuredWidth() - hl.L(2.0f), measuredHeight, paint);
    }
}
