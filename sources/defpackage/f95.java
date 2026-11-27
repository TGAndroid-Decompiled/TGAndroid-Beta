package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
public final class f95 extends Drawable {
    public final Paint a;
    public final Paint b;
    public long c;
    public float d;
    public boolean e;
    public boolean f;
    public ImageView g;

    public f95() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.5f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, hl.L(10.0f), this.a);
        if (this.f) {
            i = -1147527;
        } else {
            i = -1;
        }
        Paint paint = this.b;
        paint.setColor(i);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, hl.L(5.0f), paint);
        if (this.f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.c;
            if (j > 17) {
                j = 17;
            }
            this.c = elapsedRealtime;
            boolean z = this.e;
            if (!z) {
                float f = (((float) j) / 2000.0f) + this.d;
                this.d = f;
                if (f >= 1.0f) {
                    this.d = 1.0f;
                    this.e = true;
                }
            } else if (z) {
                float f2 = this.d - (((float) j) / 2000.0f);
                this.d = f2;
                if (f2 < 0.5f) {
                    this.d = 0.5f;
                    this.e = false;
                }
            }
            this.g.invalidate();
        }
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
