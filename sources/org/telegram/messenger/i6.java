package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
public final class i6 extends f6 {
    public static final Paint f24584e = new Paint(2);
    public static final Rect f24585f = new Rect();
    public e6 f24586c;
    public boolean d;

    @Override
    public final boolean a() {
        Bitmap[][] bitmapArr = j6.f24817f;
        e6 e6Var = this.f24586c;
        if (bitmapArr[e6Var.f23667a][e6Var.f23668b] != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            e6 e6Var = this.f24586c;
            j6.i(e6Var.f23667a, e6Var.f23668b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.d;
        e6 e6Var = this.f24586c;
        if (!a()) {
            j6.i(e6Var.f23667a, e6Var.f23668b);
            Paint paint = j6.d;
            paint.setColor(this.f23852b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f23851a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z11 = this.f23851a;
            if (z11) {
                i7 = j6.f24815c;
            } else {
                i7 = j6.f24814b;
            }
            bounds = f24585f;
            bounds.left = centerX - (i7 / 2);
            if (z11) {
                i10 = j6.f24815c;
            } else {
                i10 = j6.f24814b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z11) {
                i11 = j6.f24815c;
            } else {
                i11 = j6.f24814b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z11) {
                i12 = j6.f24815c;
            } else {
                i12 = j6.f24814b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (z10) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            canvas.drawBitmap(j6.f24817f[e6Var.f23667a][e6Var.f23668b], (Rect) null, bounds, f24584e);
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        f24584e.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
