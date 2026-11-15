package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.er;
public final class t4 extends View {
    public final Paint f9466a;
    public final org.telegram.ui.Components.u5 f9467b;
    public final org.telegram.ui.Components.u5 f9468c;
    public float d;
    public float f9469e;

    public t4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9466a = paint;
        ch.w wVar = new ch.w(this, 17);
        er erVar = er.h;
        this.f9467b = new org.telegram.ui.Components.u5(wVar, 420L, erVar, 0);
        this.f9468c = new org.telegram.ui.Components.u5(new ch.w(this, 17), 420L, erVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f9467b.e(false, this.d);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float d = this.f9468c.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f9469e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.25f, -1);
        Paint paint = this.f9466a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
