package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class ppa extends View {
    public final Paint a;
    public final lm b;
    public final lm c;
    public float d;
    public float e;

    public ppa(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        z6a z6aVar = new z6a(this, (byte) 20);
        s33 s33Var = s33.h;
        this.b = new lm(z6aVar, 420L, s33Var, 0);
        this.c = new lm(new z6a(this, (byte) 20), 420L, s33Var, 0);
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
        RectF rectF = gl.P;
        rectF.set(width - f, height - f, width + f, height + f);
        int p1 = bkb.p1(0.25f, -1);
        Paint paint = this.a;
        paint.setColor(p1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (d > 0.0f) {
            paint.setColor(bkb.p1(d, -1));
            canvas.drawArc(rectF, 135.0f, e * 270.0f, false, paint);
        }
    }
}
