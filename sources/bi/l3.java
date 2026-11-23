package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import di.ec;
import org.telegram.messenger.qc;
public final class l3 extends Drawable {
    public final int f3835a;
    public final RectF f3836b;
    public final Path f3837c;
    public final Paint d;
    public final ec f3838e;
    public boolean f3839f;
    public a3.f f3840g;
    public ai.h0 h;
    public boolean f3841i;

    public l3(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3838e != null && this.f3841i && qc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3839f == z10) {
            return;
        }
        this.f3839f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 24);
            this.f3840g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3840g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3837c;
        canvas.drawPath(path, paint);
        ec ecVar = this.f3838e;
        if (ecVar != null) {
            if (this.f3839f || !this.f3841i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3840g == null) {
                    ecVar.d();
                }
                ecVar.a(canvas, this.f3835a);
                canvas.restore();
                if (this.f3840g == null) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.f3836b;
        rectF.set(rect);
        Path path = this.f3837c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ec ecVar = this.f3838e;
        if (ecVar != null) {
            ecVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.d.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public l3(int i7, int i10) {
        this.f3836b = new RectF();
        this.f3837c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3835a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3838e = new ec(1, 25);
        } else {
            this.f3838e = null;
        }
    }
}
