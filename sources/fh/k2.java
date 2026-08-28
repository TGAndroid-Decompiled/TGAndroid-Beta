package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import gh.bb;
import org.telegram.messenger.LiteMode;
public final class k2 extends Drawable {
    public final int f6578a;
    public final RectF f6579b;
    public final Path f6580c;
    public final Paint d;
    public final bb f6581e;
    public boolean f6582f;
    public o1 f6583g;
    public bg.i h;
    public boolean f6584i;

    public k2(int i9) {
        this(i0.a.k(i9, 128), i9);
    }

    public final void a() {
        boolean z10;
        if (this.f6581e != null && this.f6584i && LiteMode.isEnabled(131072)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6582f == z10) {
            return;
        }
        this.f6582f = z10;
        if (z10) {
            ff.k d = ff.k.d();
            o1 o1Var = new o1(this, 2);
            this.f6583g = o1Var;
            d.a(15, o1Var);
        } else {
            ff.k.d().g(this.f6583g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.f6580c;
        canvas.drawPath(path, paint);
        bb bbVar = this.f6581e;
        if (bbVar != null) {
            if (this.f6582f || !this.f6584i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.f6583g == null) {
                    bbVar.d();
                }
                bbVar.a(canvas, this.f6578a);
                canvas.restore();
                if (this.f6583g == null) {
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
        RectF rectF = this.f6579b;
        rectF.set(rect);
        Path path = this.f6580c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        bb bbVar = this.f6581e;
        if (bbVar != null) {
            bbVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i9) {
        this.d.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public k2(int i9, int i10) {
        this.f6579b = new RectF();
        this.f6580c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f6578a = i9;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6581e = new bb(1, 25);
        } else {
            this.f6581e = null;
        }
    }
}
