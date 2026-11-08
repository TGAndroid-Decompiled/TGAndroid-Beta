package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
public final class h6 extends e6 {
    public static final Paint f22844e = new Paint(2);
    public static final Rect f22845f = new Rect();
    public d6 f22846c;
    public boolean d;

    @Override
    public final boolean a() {
        Bitmap[][] bitmapArr = i6.f23056f;
        d6 d6Var = this.f22846c;
        if (bitmapArr[d6Var.f21997a][d6Var.f21998b] != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            d6 d6Var = this.f22846c;
            i6.i(d6Var.f21997a, d6Var.f21998b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9 = this.d;
        d6 d6Var = this.f22846c;
        if (!a()) {
            i6.i(d6Var.f21997a, d6Var.f21998b);
            Paint paint = i6.d;
            paint.setColor(this.f22192b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.f22191a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.f22191a;
            if (z10) {
                i7 = i6.f23054c;
            } else {
                i7 = i6.f23053b;
            }
            bounds = f22845f;
            bounds.left = centerX - (i7 / 2);
            if (z10) {
                i10 = i6.f23054c;
            } else {
                i10 = i6.f23053b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z10) {
                i11 = i6.f23054c;
            } else {
                i11 = i6.f23053b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z10) {
                i12 = i6.f23054c;
            } else {
                i12 = i6.f23053b;
            }
            bounds.bottom = (i12 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (z9) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            canvas.drawBitmap(i6.f23056f[d6Var.f21997a][d6Var.f21998b], (Rect) null, bounds, f22844e);
            if (z9) {
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
        f22844e.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
