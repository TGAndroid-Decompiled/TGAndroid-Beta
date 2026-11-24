package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
public final class sv4 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final vva e;
    public boolean f;
    public iu4 g;
    public hj3 h;
    public boolean i;

    public sv4(int i, int i2) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i;
        paint.setColor(i2);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new vva(1, 25);
        } else {
            this.e = null;
        }
    }

    public final void a() {
        boolean z;
        if (this.e != null && this.i && e66.e(131072)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (z) {
            rg2 d = rg2.d();
            iu4 iu4Var = new iu4(this, (byte) 4);
            this.g = iu4Var;
            d.a(15, iu4Var);
        } else {
            rg2.d().g(this.g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        vva vvaVar = this.e;
        if (vvaVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    vvaVar.d();
                }
                vvaVar.a(canvas, this.a);
                canvas.restore();
                if (this.g == null) {
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
        RectF rectF = this.b;
        rectF.set(rect);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        vva vvaVar = this.e;
        if (vvaVar != null) {
            vvaVar.g(rectF);
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public sv4(int i) {
        this(bm2.o(i, 128), i);
    }
}
