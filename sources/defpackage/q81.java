package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;
public final class q81 extends TextView {
    public final Paint a;
    public final wjb b;

    public q81(Context context, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        this.a = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int p1 = bkb.p1(0.8f, bkb.v0(bkb.y6, this.b));
        Paint paint = this.a;
        paint.setColor(p1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i = 0;
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            i = Math.max(i, (int) layout.getLineWidth(i2));
        }
        float f = i / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f) - gl.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f + gl.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
