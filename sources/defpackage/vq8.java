package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class vq8 extends Drawable {
    public final ho a;
    public final Paint b;
    public int c;
    public float d;
    public float e;
    public final jk1 f;
    public cm1 g;

    public vq8(String str) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.d = 1.0f;
        this.e = 1.0f;
        this.f = new jk1(this);
        ho hoVar = new ho(false, false, false);
        this.a = hoVar;
        hoVar.setCallback(new jo(this, (byte) 7));
        hoVar.t(str, true, true);
        hoVar.w(gm.L(11.0f));
        hoVar.b = 17;
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
        RectF rectF = gm.P;
        rectF.set(getBounds());
        canvas.save();
        float a = this.f.a(0.1f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        Paint paint = this.b;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f));
        canvas.drawRoundRect(rectF, gm.L(20.0f), gm.L(20.0f), paint);
        paint.setAlpha(alpha);
        int i = this.c;
        ho hoVar = this.a;
        hoVar.u(i);
        hoVar.C = (int) (f * 255.0f);
        hoVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        hoVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getAlpha() {
        return (int) (this.d * 255.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(17.33f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.a.d + gm.L(11.0f));
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
