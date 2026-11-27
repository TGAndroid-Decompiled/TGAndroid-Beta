package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
public final class xx4 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final yza e;
    public boolean f;
    public rj4 g;
    public zj3 h;
    public boolean i;

    public xx4(int i, int i2) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i;
        paint.setColor(i2);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new yza(1, 25);
        } else {
            this.e = null;
        }
    }

    public final void a() {
        boolean z;
        if (this.e != null && this.i && i86.e(131072)) {
            z = true;
        } else {
            z = false;
        }
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (z) {
            jh2 d = jh2.d();
            rj4 rj4Var = new rj4(this, (byte) 18);
            this.g = rj4Var;
            d.a(15, rj4Var);
        } else {
            jh2.d().g(this.g);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        yza yzaVar = this.e;
        if (yzaVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    yzaVar.d();
                }
                yzaVar.a(canvas, this.a);
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
        yza yzaVar = this.e;
        if (yzaVar != null) {
            yzaVar.g(rectF);
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

    public xx4(int i) {
        this(vm2.o(i, 128), i);
    }
}
