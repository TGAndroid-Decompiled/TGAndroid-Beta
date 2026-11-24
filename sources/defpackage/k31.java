package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class k31 extends FrameLayout {
    public final ln a;
    public final ln b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final l31 f;

    public k31(l31 l31Var, Activity activity) {
        super(activity);
        this.f = l31Var;
        d53 d53Var = d53.h;
        this.a = new ln(320L, this, d53Var);
        this.b = new ln(320L, this, d53Var);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(gm.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        l31 l31Var = this.f;
        float e = this.a.e(false, l31Var.a);
        if (l31Var.a >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        float d = this.b.d(z);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        RectF rectF = this.d;
        rectF.set(width - gm.N(13.0f), height - gm.N(13.0f), gm.N(13.0f) + width, gm.N(13.0f) + height);
        float currentTimeMillis = (((float) (System.currentTimeMillis() - this.e)) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            l94 l94Var = wi2.h;
            l94Var.getInterpolation((currentTimeMillis - (i2 * 1350)) / 667.0f);
            max += l94Var.getInterpolation((currentTimeMillis - (i + 667)) / 667.0f) * 250.0f;
        }
        int p1 = cmb.p1((1.0f - d) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(p1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e) * (-360.0f), false, paint);
        if (e < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
