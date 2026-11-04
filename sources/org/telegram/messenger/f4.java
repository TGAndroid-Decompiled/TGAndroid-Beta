package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
public final class f4 extends e6 {
    public static final Paint f22443i = new Paint(2);
    public static final Rect f22444j = new Rect();
    public g4 f22445c;
    public g4 d;
    public org.telegram.ui.Components.u5 f22446e;
    public org.telegram.ui.Components.u5 f22447f;
    public g4 f22448g;
    public g4 h;

    public static void c(Canvas canvas, g4 g4Var, Rect rect, float f10) {
        Paint paint;
        int i3;
        Bitmap bitmap = (Bitmap) g4.f22633e.get(g4Var.f22637c);
        if (bitmap != null) {
            if (g4Var.d) {
                paint = h4.f22884b;
            } else {
                paint = f22443i;
            }
            int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i10 < 0) {
                i3 = paint.getAlpha();
                paint.setAlpha((int) (i3 * f10));
            } else {
                i3 = 255;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (i10 < 0) {
                paint.setAlpha(i3);
            }
        }
    }

    @Override
    public final boolean a() {
        g4 g4Var = this.f22445c;
        SparseArray sparseArray = g4.f22633e;
        if (sparseArray.indexOfKey(g4Var.f22637c) >= 0 && sparseArray.indexOfKey(this.d.f22637c) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            this.f22445c.a();
            this.d.a();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i3;
        int i10;
        int i11;
        int i12;
        if (!a()) {
            b();
            Paint paint = i6.d;
            paint.setColor(this.f22320b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f22319a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f22319a;
            if (z10) {
                i3 = i6.f23448c;
            } else {
                i3 = i6.f23447b;
            }
            bounds = f22444j;
            bounds.left = centerX - (i3 / 2);
            if (z10) {
                i10 = i6.f23448c;
            } else {
                i10 = i6.f23447b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z10) {
                i11 = i6.f23448c;
            } else {
                i11 = i6.f23447b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z10) {
                i12 = i6.f23448c;
            } else {
                i12 = i6.f23447b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (this.f22448g != null) {
                if (this.f22446e == null) {
                    this.f22446e = new org.telegram.ui.Components.u5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.xq.f40453g);
                }
                float e10 = this.f22446e.e(false, 1.0f);
                c(canvas, this.f22448g, bounds, Math.min(1.0f, e10 * 1.5f));
                c(canvas, this.f22445c, bounds, 1.0f - e10);
                if (e10 >= 1.0f) {
                    this.f22445c = this.f22448g;
                    this.f22448g = null;
                }
            } else {
                c(canvas, this.f22445c, bounds, 1.0f);
            }
            if (this.h != null) {
                if (this.f22447f == null) {
                    this.f22447f = new org.telegram.ui.Components.u5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.xq.f40453g);
                }
                float e11 = this.f22447f.e(false, 1.0f);
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
    public final void setAlpha(int i3) {
        f22443i.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
