package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.kr;
public final class w4 extends View {
    public final Paint f9947a;
    public final org.telegram.ui.Components.c6 f9948b;
    public final org.telegram.ui.Components.c6 f9949c;
    public float d;
    public float f9950e;

    public w4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9947a = paint;
        ca.r rVar = new ca.r(this, 20);
        kr krVar = kr.h;
        this.f9948b = new org.telegram.ui.Components.c6(rVar, 420L, krVar, 0);
        this.f9949c = new org.telegram.ui.Components.c6(new ca.r(this, 20), 420L, krVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f9948b.e(false, this.d);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float d = this.f9949c.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f9950e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.25f, -1);
        Paint paint = this.f9947a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
