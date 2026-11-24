package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
public final class tx4 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final yxa e;
    public boolean f;
    public qn4 g;
    public sk3 h;
    public boolean i;

    public tx4(int i, int i2) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i;
        paint.setColor(i2);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new yxa(1, 25);
        } else {
            this.e = null;
        }
    }

    public final void a() {
        boolean z;
        if (this.e != null && this.i && e86.e(131072)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (z) {
            fi2 d = fi2.d();
            qn4 qn4Var = new qn4(this, (byte) 11);
            this.g = qn4Var;
            d.a(15, qn4Var);
        } else {
            fi2.d().g(this.g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        yxa yxaVar = this.e;
        if (yxaVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    yxaVar.d();
                }
                yxaVar.a(canvas, this.a);
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
        yxa yxaVar = this.e;
        if (yxaVar != null) {
            yxaVar.g(rectF);
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

    public tx4(int i) {
        this(on2.p(i, 128), i);
    }
}
