package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class l21 extends FrameLayout {
    public final mm a;
    public final mm b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final m21 f;

    public l21(m21 m21Var, Activity activity) {
        super(activity);
        this.f = m21Var;
        k43 k43Var = k43.h;
        this.a = new mm(320L, this, k43Var);
        this.b = new mm(320L, this, k43Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(hl.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        m21 m21Var = this.f;
        float e = this.a.e(false, m21Var.a);
        if (m21Var.a >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float d = this.b.d(z);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - hl.N(13.0f), height - hl.N(13.0f), hl.N(13.0f) + width, hl.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            x84 x84Var = di2.h;
            x84Var.getInterpolation((currentTimeMillis - (i2 * 1350)) / 667.0f);
            max += x84Var.getInterpolation((currentTimeMillis - (i + 667)) / 667.0f) * 250.0f;
        }
        int p1 = aob.p1((1.0f - d) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(p1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e) * (-360.0f), false, paint);
        if (e < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
