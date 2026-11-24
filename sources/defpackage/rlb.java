package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class rlb extends Drawable {
    public final byte a = 1;
    public final int b;
    public final int c;
    public Object d;

    public rlb(int i, int i2, int i3) {
        this.b = i;
        this.c = i3;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i);
        paint.setColor(i2);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        float f;
        byte b = this.a;
        int i2 = this.c;
        switch (b) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), i2 / 2.0f, (Paint) this.d);
                return;
            default:
                Rect bounds2 = getBounds();
                int i3 = this.b;
                if (i3 == 7) {
                    RectF rectF = (RectF) this.d;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.d = rectF;
                    }
                    rectF.set(bounds2);
                    if (i2 <= 0) {
                        f = gm.L(6.0f);
                    } else {
                        f = i2;
                    }
                    canvas.drawRoundRect((RectF) this.d, f, f, cmb.z);
                    return;
                }
                if (i3 != 1 && i3 != 6) {
                    if (i3 == 3) {
                        i = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        i = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                } else {
                    if (i2 <= 0) {
                        i2 = gm.L(20.0f);
                    }
                    i = i2;
                }
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i, cmb.z);
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setAlpha(i);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public rlb(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
