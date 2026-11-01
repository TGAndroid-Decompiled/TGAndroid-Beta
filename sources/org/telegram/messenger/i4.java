package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class i4 extends g6 {
    public static final Paint f16201i = new Paint(2);
    public static final Rect f16202j = new Rect();
    public j4 f16203c;
    public j4 d;
    public org.telegram.ui.Components.t5 e;
    public org.telegram.ui.Components.t5 f16204f;
    public j4 f16205g;
    public j4 h;

    public static void c(Canvas canvas, j4 j4Var, Rect rect, float f7) {
        Paint paint;
        int i10;
        Bitmap bitmap = (Bitmap) j4.e.get(j4Var.f16415c);
        if (bitmap != null) {
            if (j4Var.d) {
                paint = k4.f16558b;
            } else {
                paint = f16201i;
            }
            int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i11 < 0) {
                i10 = paint.getAlpha();
                paint.setAlpha((int) (i10 * f7));
            } else {
                i10 = 255;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (i11 < 0) {
                paint.setAlpha(i10);
            }
        }
    }

    @Override
    public final boolean a() {
        j4 j4Var = this.f16203c;
        SparseArray sparseArray = j4.e;
        if (sparseArray.indexOfKey(j4Var.f16415c) >= 0 && sparseArray.indexOfKey(this.d.f16415c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f16203c.a();
            this.d.a();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i10;
        int i11;
        int i12;
        int i13;
        if (!a()) {
            b();
            Paint paint = k6.d;
            paint.setColor(this.f15864b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f15863a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f15863a;
            if (z10) {
                i10 = k6.f16566c;
            } else {
                i10 = k6.f16565b;
            }
            bounds = f16202j;
            bounds.left = centerX - (i10 / 2);
            if (z10) {
                i11 = k6.f16566c;
            } else {
                i11 = k6.f16565b;
            }
            bounds.right = (i11 / 2) + centerX;
            if (z10) {
                i12 = k6.f16566c;
            } else {
                i12 = k6.f16565b;
            }
            bounds.top = centerY - (i12 / 2);
            if (z10) {
                i13 = k6.f16566c;
            } else {
                i13 = k6.f16565b;
            }
            bounds.bottom = (i13 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f16205g != null) {
                if (this.e == null) {
                    this.e = new org.telegram.ui.Components.t5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.gr.f26524g);
                }
                float e = this.e.e(false, 1.0f);
                c(canvas, this.f16205g, bounds, Math.min(1.0f, e * 1.5f));
                c(canvas, this.f16203c, bounds, 1.0f - e);
                if (e >= 1.0f) {
                    this.f16203c = this.f16205g;
                    this.f16205g = null;
                }
            } else {
                c(canvas, this.f16203c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f16204f == null) {
                    this.f16204f = new org.telegram.ui.Components.t5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.gr.f26524g);
                }
                float e7 = this.f16204f.e(false, 1.0f);
                c(canvas, this.h, bounds, Math.min(1.0f, 1.5f * e7));
                c(canvas, this.d, bounds, 1.0f - e7);
                if (e7 >= 1.0f) {
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
    public final void setAlpha(int i10) {
        f16201i.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
