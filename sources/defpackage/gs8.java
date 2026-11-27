package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class gs8 extends Drawable {
    public final hn a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final kj1 f;
    public dl1 g;

    public gs8(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new kj1(this);
        hn hnVar = new hn(false, false, false);
        this.a = hnVar;
        hnVar.setCallback(new jn(this, (byte) 7));
        hnVar.t(str, true, true);
        hnVar.w(hl.L(11.0f));
        hnVar.b = 17;
        paint.setColor(520093696);
    }

    public final void a(int i) {
        Paint paint = this.b;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f = this.d * this.e;
        if (f <= 0.0f) {
            return;
        }
        RectF rectF = hl.P;
        rectF.set(getBounds());
        canvas.save();
        float a = this.f.a(0.1f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, hl.L(20.0f), hl.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i = this.c;
        hn hnVar = this.a;
        hnVar.u(i);
        hnVar.C = (int) (f * 255.0f);
        hnVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        hnVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + hl.L(11.0f));
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
