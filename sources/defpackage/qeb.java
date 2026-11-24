package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class qeb extends lp7 {
    public final reb z0;

    public qeb(reb rebVar, Context context) {
        super(13, null, context);
        this.z0 = rebVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = cmb.w0(null, cmb.i5, false);
        reb rebVar = this.z0;
        Paint paint = rebVar.e;
        if (w0 != rebVar.a) {
            rebVar.a = w0;
            setTextColor(w0);
        }
        super.onDraw(canvas);
        float L = gm.L(31.0f);
        paint.setColor(cmb.w0(null, cmb.g7, false));
        canvas.drawLine(gm.L(2.0f), L, getMeasuredWidth() - gm.L(2.0f), L, paint);
        float measuredHeight = getMeasuredHeight() - gm.L(31.0f);
        canvas.drawLine(gm.L(2.0f), measuredHeight, getMeasuredWidth() - gm.L(2.0f), measuredHeight, paint);
    }
}
