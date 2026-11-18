package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.lr;
public final class w4 extends View {
    public final Paint f9967a;
    public final org.telegram.ui.Components.c6 f9968b;
    public final org.telegram.ui.Components.c6 f9969c;
    public float d;
    public float f9970e;

    public w4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9967a = paint;
        ca.r rVar = new ca.r(this, 21);
        lr lrVar = lr.h;
        this.f9968b = new org.telegram.ui.Components.c6(rVar, 420L, lrVar, 0);
        this.f9969c = new org.telegram.ui.Components.c6(new ca.r(this, 21), 420L, lrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f9968b.e(false, this.d);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float d = this.f9969c.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f9970e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.25f, -1);
        Paint paint = this.f9967a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
