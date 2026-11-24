package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class pra extends View {
    public final Paint a;
    public final ln b;
    public final ln c;
    public float d;
    public float e;

    public pra(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        c0a c0aVar = new c0a(this, (byte) 28);
        d53 d53Var = d53.h;
        this.b = new ln(c0aVar, 420L, d53Var, 0);
        this.c = new ln(new c0a(this, (byte) 28), 420L, d53Var, 0);
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
        RectF rectF = gm.P;
        rectF.set(width - f, height - f, width + f, height + f);
        int p1 = cmb.p1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(p1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(cmb.p1(d, -1));
            canvas.drawArc(rectF, 135.0f, e * 270.0f, false, paint);
        }
    }
}
