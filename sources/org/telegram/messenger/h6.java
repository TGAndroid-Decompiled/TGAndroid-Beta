package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
public final class h6 extends e6 {
    public static final Paint f22887e = new Paint(2);
    public static final Rect f22888f = new Rect();
    public d6 f22889c;
    public boolean d;

    @Override
    public final boolean a() {
        Bitmap[][] bitmapArr = i6.f23450f;
        d6 d6Var = this.f22889c;
        if (bitmapArr[d6Var.f22158a][d6Var.f22159b] != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            d6 d6Var = this.f22889c;
            i6.i(d6Var.f22158a, d6Var.f22159b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10 = this.d;
        d6 d6Var = this.f22889c;
        if (!a()) {
            i6.i(d6Var.f22158a, d6Var.f22159b);
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
            boolean z11 = this.f22319a;
            if (z11) {
                i3 = i6.f23448c;
            } else {
                i3 = i6.f23447b;
            }
            bounds = f22888f;
            bounds.left = centerX - (i3 / 2);
            if (z11) {
                i10 = i6.f23448c;
            } else {
                i10 = i6.f23447b;
            }
            bounds.right = (i10 / 2) + centerX;
            if (z11) {
                i11 = i6.f23448c;
            } else {
                i11 = i6.f23447b;
            }
            bounds.top = centerY - (i11 / 2);
            if (z11) {
                i12 = i6.f23448c;
            } else {
                i12 = i6.f23447b;
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
            canvas.drawBitmap(i6.f23450f[d6Var.f22158a][d6Var.f22159b], (Rect) null, bounds, f22887e);
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
    public final void setAlpha(int i3) {
        f22887e.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
