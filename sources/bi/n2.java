package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import di.bc;
import org.telegram.messenger.qc;
public final class n2 extends Drawable {
    public final int f3725a;
    public final RectF f3726b;
    public final Path f3727c;
    public final Paint d;
    public final bc f3728e;
    public boolean f3729f;
    public a3.f f3730g;
    public ai.f0 h;
    public boolean f3731i;

    public n2(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3728e != null && this.f3731i && qc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3729f == z10) {
            return;
        }
        this.f3729f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 23);
            this.f3730g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3730g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3727c;
        canvas.drawPath(path, paint);
        bc bcVar = this.f3728e;
        if (bcVar != null) {
            if (this.f3729f || !this.f3731i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3730g == null) {
                    bcVar.d();
                }
                bcVar.a(canvas, this.f3725a);
                canvas.restore();
                if (this.f3730g == null) {
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
        RectF rectF = this.f3726b;
        rectF.set(rect);
        Path path = this.f3727c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        bc bcVar = this.f3728e;
        if (bcVar != null) {
            bcVar.g(rectF);
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

    public n2(int i7, int i10) {
        this.f3726b = new RectF();
        this.f3727c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3725a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3728e = new bc(1, 25);
        } else {
            this.f3728e = null;
        }
    }
}
