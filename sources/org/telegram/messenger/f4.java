package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class f4 extends f6 {
    public static final Paint f23440i = new Paint(2);
    public static final Rect f23441j = new Rect();
    public g4 f23442c;
    public g4 d;
    public org.telegram.ui.Components.u5 f23443e;
    public org.telegram.ui.Components.u5 f23444f;
    public g4 f23445g;
    public g4 h;

    public static void c(Canvas canvas, g4 g4Var, Rect rect, float f10) {
        Paint paint;
        int i7;
        Bitmap bitmap = (Bitmap) g4.f23661e.get(g4Var.f23665c);
        if (bitmap != null) {
            if (g4Var.d) {
                paint = h4.f24057b;
            } else {
                paint = f23440i;
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
        g4 g4Var = this.f23442c;
        SparseArray sparseArray = g4.f23661e;
        if (sparseArray.indexOfKey(g4Var.f23665c) >= 0 && sparseArray.indexOfKey(this.d.f23665c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f23442c.a();
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
            paint.setColor(this.f23450b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f23449a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f23449a;
            if (z10) {
                i7 = j6.f24527c;
            } else {
                i7 = j6.f24526b;
            }
            bounds = f23441j;
            bounds.left = centerX - (i7 / 2);
            if (z10) {
                i10 = j6.f24527c;
            } else {
                i10 = j6.f24526b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z10) {
                i11 = j6.f24527c;
            } else {
                i11 = j6.f24526b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z10) {
                i12 = j6.f24527c;
            } else {
                i12 = j6.f24526b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f23445g != null) {
                if (this.f23443e == null) {
                    this.f23443e = new org.telegram.ui.Components.u5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.er.f34420g);
                }
                float e10 = this.f23443e.e(false, 1.0f);
                c(canvas, this.f23445g, bounds, Math.min(1.0f, e10 * 1.5f));
                c(canvas, this.f23442c, bounds, 1.0f - e10);
                if (e10 >= 1.0f) {
                    this.f23442c = this.f23445g;
                    this.f23445g = null;
                }
            } else {
                c(canvas, this.f23442c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f23444f == null) {
                    this.f23444f = new org.telegram.ui.Components.u5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.er.f34420g);
                }
                float e11 = this.f23444f.e(false, 1.0f);
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
        f23440i.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
