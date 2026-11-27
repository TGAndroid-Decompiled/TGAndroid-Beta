package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
public final class g95 extends Drawable {
    public long b;
    public boolean d;
    public final View e;
    public final Paint a = new Paint(1);
    public float c = 1.0f;

    public g95(View view) {
        this.e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof ema) {
            L = hl.L(1.0f) + centerY;
            centerX -= hl.L(3.0f);
        } else {
            L = hl.L(2.0f) + centerY;
        }
        Paint paint = this.a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.c * 255.0f));
        canvas.drawCircle(centerX, L, hl.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        if (j > 17) {
            j = 17;
        }
        this.b = elapsedRealtime;
        boolean z = this.d;
        if (!z) {
            float f = (((float) j) / 2000.0f) + this.c;
            this.c = f;
            if (f >= 1.0f) {
                this.c = 1.0f;
                this.d = true;
            }
        } else if (z) {
            float f2 = this.c - (((float) j) / 2000.0f);
            this.c = f2;
            if (f2 < 0.5f) {
                this.c = 0.5f;
                this.d = false;
            }
        }
        view.invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
