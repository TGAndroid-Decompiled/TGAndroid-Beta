package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
public final class fw3 extends cw3 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public bw3 c;
    public boolean d;

    @Override
    public final boolean a() {
        Bitmap[][] bitmapArr = gw3.f;
        bw3 bw3Var = this.c;
        if (bitmapArr[bw3Var.a][bw3Var.b] != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        if (!a()) {
            bw3 bw3Var = this.c;
            gw3.i(bw3Var.a, bw3Var.b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.d;
        bw3 bw3Var = this.c;
        if (!a()) {
            gw3.i(bw3Var.a, bw3Var.b);
            Paint paint = gw3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z2 = this.a;
            if (z2) {
                i = gw3.c;
            } else {
                i = gw3.b;
            }
            bounds = f;
            bounds.left = centerX - (i / 2);
            if (z2) {
                i2 = gw3.c;
            } else {
                i2 = gw3.b;
            }
            bounds.right = (i2 / 2) + centerX;
            if (z2) {
                i3 = gw3.c;
            } else {
                i3 = gw3.b;
            }
            bounds.top = centerY - (i3 / 2);
            if (z2) {
                i4 = gw3.c;
            } else {
                i4 = gw3.b;
            }
            bounds.bottom = (i4 / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            canvas.drawBitmap(gw3.f[bw3Var.a][bw3Var.b], (Rect) null, bounds, e);
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        e.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
