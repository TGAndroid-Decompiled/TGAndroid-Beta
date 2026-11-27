package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class qta extends View {
    public final Paint a;
    public final mm b;
    public final mm c;
    public float d;
    public float e;

    public qta(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        uoa uoaVar = new uoa(this, (byte) 7);
        k43 k43Var = k43.h;
        this.b = new mm(uoaVar, 420L, k43Var, 0);
        this.c = new mm(new uoa(this, (byte) 7), 420L, k43Var, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        float e = this.b.e(false, this.d);
        if (this.d > 0.0f) {
            z = true;
        }
        float d = this.c.d(z);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.e;
        RectF rectF = hl.P;
        rectF.set(width - f, height - f, width + f, height + f);
        int p1 = aob.p1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(p1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(aob.p1(d, -1));
            canvas.drawArc(rectF, 135.0f, e * 270.0f, false, paint);
        }
    }
}
