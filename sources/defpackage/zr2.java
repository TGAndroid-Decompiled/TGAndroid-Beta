package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class zr2 extends cw3 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public as2 c;
    public as2 d;
    public ln e;
    public ln f;
    public as2 g;
    public as2 h;

    public static void c(Canvas canvas, as2 as2Var, Rect rect, float f) {
        Paint paint;
        int i2;
        Bitmap bitmap = (Bitmap) as2.e.get(as2Var.c);
        if (bitmap != null) {
            if (as2Var.d) {
                paint = bs2.b;
            } else {
                paint = i;
            }
            int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i3 < 0) {
                i2 = paint.getAlpha();
                paint.setAlpha((int) (i2 * f));
            } else {
                i2 = 255;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (i3 < 0) {
                paint.setAlpha(i2);
            }
        }
    }

    @Override
    public final boolean a() {
        as2 as2Var = this.c;
        SparseArray sparseArray = as2.e;
        if (sparseArray.indexOfKey(as2Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.c.a();
            this.d.a();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!a()) {
            b();
            Paint paint = gw3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z = this.a;
            if (z) {
                i2 = gw3.c;
            } else {
                i2 = gw3.b;
            }
            bounds = j;
            bounds.left = centerX - (i2 / 2);
            if (z) {
                i3 = gw3.c;
            } else {
                i3 = gw3.b;
            }
            bounds.right = (i3 / 2) + centerX;
            if (z) {
                i4 = gw3.c;
            } else {
                i4 = gw3.b;
            }
            bounds.top = centerY - (i4 / 2);
            if (z) {
                i5 = gw3.c;
            } else {
                i5 = gw3.b;
            }
            bounds.bottom = (i5 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        Rect rect = bounds;
        if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom, Canvas.EdgeType.AA)) {
            if (this.g != null) {
                ln lnVar = this.e;
                if (lnVar == null) {
                    ln lnVar2 = new ln(0.0f, new xf2(this, (byte) 12), 0L, 320L, d53.g);
                    this.e = lnVar2;
                    lnVar = lnVar2;
                }
                float e = lnVar.e(false, 1.0f);
                c(canvas, this.g, rect, Math.min(1.0f, e * 1.5f));
                c(canvas, this.c, rect, 1.0f - e);
                if (e >= 1.0f) {
                    this.c = this.g;
                    this.g = null;
                }
            } else {
                c(canvas, this.c, rect, 1.0f);
            }
            if (this.h != null) {
                ln lnVar3 = this.f;
                if (lnVar3 == null) {
                    ln lnVar4 = new ln(0.0f, new xf2(this, (byte) 12), 0L, 320L, d53.g);
                    this.f = lnVar4;
                    lnVar3 = lnVar4;
                }
                float e2 = lnVar3.e(false, 1.0f);
                c(canvas, this.h, rect, Math.min(1.0f, 1.5f * e2));
                c(canvas, this.d, rect, 1.0f - e2);
                if (e2 >= 1.0f) {
                    this.d = this.h;
                    this.h = null;
                    return;
                }
                return;
            }
            c(canvas, this.d, rect, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i2) {
        i.setAlpha(i2);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
