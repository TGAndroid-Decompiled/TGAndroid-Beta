package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import di.ac;
import org.telegram.messenger.qc;
public final class n2 extends Drawable {
    public final int f3728a;
    public final RectF f3729b;
    public final Path f3730c;
    public final Paint d;
    public final ac f3731e;
    public boolean f3732f;
    public a3.f f3733g;
    public ai.g0 h;
    public boolean f3734i;

    public n2(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z10;
        if (this.f3731e != null && this.f3734i && qc.e(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f3732f == z10) {
            return;
        }
        this.f3732f = z10;
        if (z10) {
            bg.k d = bg.k.d();
            a3.f fVar = new a3.f(this, 23);
            this.f3733g = fVar;
            d.a(15, fVar);
        } else {
            bg.k.d().f(this.f3733g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f3730c;
        canvas.drawPath(path, paint);
        ac acVar = this.f3731e;
        if (acVar != null) {
            if (this.f3732f || !this.f3734i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f3733g == null) {
                    acVar.d();
                }
                acVar.a(canvas, this.f3728a);
                canvas.restore();
                if (this.f3733g == null) {
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
        RectF rectF = this.f3729b;
        rectF.set(rect);
        Path path = this.f3730c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ac acVar = this.f3731e;
        if (acVar != null) {
            acVar.g(rectF);
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
        this.f3729b = new RectF();
        this.f3730c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f3728a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3731e = new ac(1, 25);
        } else {
            this.f3731e = null;
        }
    }
}
