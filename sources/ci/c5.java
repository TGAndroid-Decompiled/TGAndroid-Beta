package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.xq;
public final class c5 extends View {
    public final Paint f4913a;
    public final org.telegram.ui.Components.u5 f4914b;
    public final org.telegram.ui.Components.u5 f4915c;
    public float d;
    public float f4916e;

    public c5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f4913a = paint;
        d1 d1Var = new d1(this, 6);
        xq xqVar = xq.h;
        this.f4914b = new org.telegram.ui.Components.u5(d1Var, 420L, xqVar, 0);
        this.f4915c = new org.telegram.ui.Components.u5(new d1(this, 6), 420L, xqVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float e10 = this.f4914b.e(false, this.d);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float d = this.f4915c.d(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f4916e;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -1);
        Paint paint = this.f4913a;
        paint.setColor(r12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(d, -1));
            canvas.drawArc(rectF, 135.0f, e10 * 270.0f, false, paint);
        }
    }
}
