package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class h4 extends f6 {
    public static final Paint f24408i = new Paint(2);
    public static final Rect f24409j = new Rect();
    public i4 f24410c;
    public i4 d;
    public org.telegram.ui.Components.d6 f24411e;
    public org.telegram.ui.Components.d6 f24412f;
    public i4 f24413g;
    public i4 h;

    public static void c(Canvas canvas, i4 i4Var, Rect rect, float f10) {
        Paint paint;
        int i7;
        Bitmap bitmap = (Bitmap) i4.f24575e.get(i4Var.f24579c);
        if (bitmap != null) {
            if (i4Var.d) {
                paint = j4.f24835b;
            } else {
                paint = f24408i;
            }
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i10 < 0) {
                i7 = paint.getAlpha();
                paint.setAlpha((int) (i7 * f10));
            } else {
                i7 = 255;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (i10 < 0) {
                paint.setAlpha(i7);
            }
        }
    }

    @Override
    public final boolean a() {
        i4 i4Var = this.f24410c;
        SparseArray sparseArray = i4.f24575e;
        if (sparseArray.indexOfKey(i4Var.f24579c) >= 0 && sparseArray.indexOfKey(this.d.f24579c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f24410c.a();
            this.d.a();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i7;
        int i10;
        int i11;
        int i12;
        if (!a()) {
            b();
            Paint paint = j6.d;
            paint.setColor(this.f23877b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f23876a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f23876a;
            if (z10) {
                i7 = j6.f24840c;
            } else {
                i7 = j6.f24839b;
            }
            bounds = f24409j;
            bounds.left = centerX - (i7 / 2);
            if (z10) {
                i10 = j6.f24840c;
            } else {
                i10 = j6.f24839b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z10) {
                i11 = j6.f24840c;
            } else {
                i11 = j6.f24839b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z10) {
                i12 = j6.f24840c;
            } else {
                i12 = j6.f24839b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f24413g != null) {
                if (this.f24411e == null) {
                    this.f24411e = new org.telegram.ui.Components.d6(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.nr.f37957g);
                }
                float e10 = this.f24411e.e(false, 1.0f);
                c(canvas, this.f24413g, bounds, Math.min(1.0f, e10 * 1.5f));
                c(canvas, this.f24410c, bounds, 1.0f - e10);
                if (e10 >= 1.0f) {
                    this.f24410c = this.f24413g;
                    this.f24413g = null;
                }
            } else {
                c(canvas, this.f24410c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f24412f == null) {
                    this.f24412f = new org.telegram.ui.Components.d6(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.nr.f37957g);
                }
                float e11 = this.f24412f.e(false, 1.0f);
                c(canvas, this.h, bounds, Math.min(1.0f, 1.5f * e11));
                c(canvas, this.d, bounds, 1.0f - e11);
                if (e11 >= 1.0f) {
                    this.d = this.h;
                    this.h = null;
                    return;
                }
                return;
            }
            c(canvas, this.d, bounds, 1.0f);
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        f24408i.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
