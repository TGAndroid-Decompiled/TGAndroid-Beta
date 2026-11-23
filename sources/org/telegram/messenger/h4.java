package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class h4 extends f6 {
    public static final Paint f24355i = new Paint(2);
    public static final Rect f24356j = new Rect();
    public i4 f24357c;
    public i4 d;
    public org.telegram.ui.Components.d6 f24358e;
    public org.telegram.ui.Components.d6 f24359f;
    public i4 f24360g;
    public i4 h;

    public static void c(Canvas canvas, i4 i4Var, Rect rect, float f10) {
        Paint paint;
        int i7;
        Bitmap bitmap = (Bitmap) i4.f24549e.get(i4Var.f24553c);
        if (bitmap != null) {
            if (i4Var.d) {
                paint = j4.f24791b;
            } else {
                paint = f24355i;
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
        i4 i4Var = this.f24357c;
        SparseArray sparseArray = i4.f24549e;
        if (sparseArray.indexOfKey(i4Var.f24553c) >= 0 && sparseArray.indexOfKey(this.d.f24553c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f24357c.a();
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
            paint.setColor(this.f23836b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f23835a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f23835a;
            if (z10) {
                i7 = j6.f24796c;
            } else {
                i7 = j6.f24795b;
            }
            bounds = f24356j;
            bounds.left = centerX - (i7 / 2);
            if (z10) {
                i10 = j6.f24796c;
            } else {
                i10 = j6.f24795b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z10) {
                i11 = j6.f24796c;
            } else {
                i11 = j6.f24795b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z10) {
                i12 = j6.f24796c;
            } else {
                i12 = j6.f24795b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f24360g != null) {
                if (this.f24358e == null) {
                    this.f24358e = new org.telegram.ui.Components.d6(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.nr.f37918g);
                }
                float e10 = this.f24358e.e(false, 1.0f);
                c(canvas, this.f24360g, bounds, Math.min(1.0f, e10 * 1.5f));
                c(canvas, this.f24357c, bounds, 1.0f - e10);
                if (e10 >= 1.0f) {
                    this.f24357c = this.f24360g;
                    this.f24360g = null;
                }
            } else {
                c(canvas, this.f24357c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f24359f == null) {
                    this.f24359f = new org.telegram.ui.Components.d6(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.nr.f37918g);
                }
                float e11 = this.f24359f.e(false, 1.0f);
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
        f24355i.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
