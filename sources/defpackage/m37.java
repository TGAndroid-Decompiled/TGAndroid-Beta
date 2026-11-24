package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class m37 extends jia {
    public final Paint N0;
    public final wjb O0;

    public m37(Context context, wjb wjbVar) {
        super(context);
        this.O0 = wjbVar;
        this.N0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v0 = bkb.v0(bkb.J5, this.O0);
        Paint paint = this.N0;
        paint.setColor(v0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - gl.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + gl.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
