package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
public final class j6 extends g6 {
    public static final Paint e = new Paint(2);
    public static final Rect f16418f = new Rect();
    public f6 f16419c;
    public boolean d;

    @Override
    public final boolean a() {
        Bitmap[][] bitmapArr = k6.f16567f;
        f6 f6Var = this.f16419c;
        if (bitmapArr[f6Var.f15702a][f6Var.f15703b] != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            f6 f6Var = this.f16419c;
            k6.i(f6Var.f15702a, f6Var.f15703b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10 = this.d;
        f6 f6Var = this.f16419c;
        if (!a()) {
            k6.i(f6Var.f15702a, f6Var.f15703b);
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
            boolean z11 = this.f15863a;
            if (z11) {
                i10 = k6.f16566c;
            } else {
                i10 = k6.f16565b;
            }
            bounds = f16418f;
            bounds.left = centerX - (i10 / 2);
            if (z11) {
                i11 = k6.f16566c;
            } else {
                i11 = k6.f16565b;
            }
            bounds.right = (i11 / 2) + centerX;
            if (z11) {
                i12 = k6.f16566c;
            } else {
                i12 = k6.f16565b;
            }
            bounds.top = centerY - (i12 / 2);
            if (z11) {
                i13 = k6.f16566c;
            } else {
                i13 = k6.f16565b;
            }
            bounds.bottom = (i13 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (z10) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            canvas.drawBitmap(k6.f16567f[f6Var.f15702a][f6Var.f15703b], (Rect) null, bounds, e);
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
    public final void setAlpha(int i10) {
        e.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
