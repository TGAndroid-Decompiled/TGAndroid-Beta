package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class y5 extends View {
    public final Paint f5074a;
    public final org.telegram.ui.Components.w5 f5075b;
    public final org.telegram.ui.Components.w5 f5076c;
    public float d;
    public float f5077e;

    public y5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5074a = paint;
        a3.f fVar = new a3.f(this, 26);
        xq xqVar = xq.h;
        this.f5075b = new org.telegram.ui.Components.w5(fVar, 420L, xqVar, 0);
        this.f5076c = new org.telegram.ui.Components.w5(new a3.f(this, 26), 420L, xqVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9 = false;
        float e10 = this.f5075b.e(false, this.d);
        if (this.d > 0.0f) {
            z9 = true;
        }
        float d = this.f5076c.d(z9);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f5077e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -1);
        Paint paint = this.f5074a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
