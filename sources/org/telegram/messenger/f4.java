package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class f4 extends e6 {
    public static final Paint f22364i = new Paint(2);
    public static final Rect f22365j = new Rect();
    public g4 f22366c;
    public g4 d;
    public org.telegram.ui.Components.v5 f22367e;
    public org.telegram.ui.Components.v5 f22368f;
    public g4 f22369g;
    public g4 h;

    public static void c(Canvas canvas, g4 g4Var, Rect rect, float f10) {
        Paint paint;
        int i7;
        Bitmap bitmap = (Bitmap) g4.f22594e.get(g4Var.f22598c);
        if (bitmap != null) {
            if (g4Var.d) {
                paint = h4.f22845b;
            } else {
                paint = f22364i;
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
        g4 g4Var = this.f22366c;
        SparseArray sparseArray = g4.f22594e;
        if (sparseArray.indexOfKey(g4Var.f22598c) >= 0 && sparseArray.indexOfKey(this.d.f22598c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f22366c.a();
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
            Paint paint = i6.d;
            paint.setColor(this.f22196b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f22195a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z9 = this.f22195a;
            if (z9) {
                i7 = i6.f23058c;
            } else {
                i7 = i6.f23057b;
            }
            bounds = f22365j;
            bounds.left = centerX - (i7 / 2);
            if (z9) {
                i10 = i6.f23058c;
            } else {
                i10 = i6.f23057b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z9) {
                i11 = i6.f23058c;
            } else {
                i11 = i6.f23057b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z9) {
                i12 = i6.f23058c;
            } else {
                i12 = i6.f23057b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f22369g != null) {
                if (this.f22367e == null) {
                    this.f22367e = new org.telegram.ui.Components.v5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.wq.f40047g);
                }
                float e10 = this.f22367e.e(false, 1.0f);
                c(canvas, this.f22369g, bounds, Math.min(1.0f, e10 * 1.5f));
                c(canvas, this.f22366c, bounds, 1.0f - e10);
                if (e10 >= 1.0f) {
                    this.f22366c = this.f22369g;
                    this.f22369g = null;
                }
            } else {
                c(canvas, this.f22366c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f22368f == null) {
                    this.f22368f = new org.telegram.ui.Components.v5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.wq.f40047g);
                }
                float e11 = this.f22368f.e(false, 1.0f);
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
        f22364i.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
