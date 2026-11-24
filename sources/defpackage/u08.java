package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class u08 extends Drawable {
    public static final int j = 0;
    public float a = gl.N(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final tl i;

    public u08(int i, int i2, int i3, long j2) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i3 != i;
        paint.setColor(i);
        paint2.setColor(i2);
        paint3.setColor(i3);
        d();
        tl tlVar = new tl(gl.L(14.0f), null);
        this.i = tlVar;
        tlVar.j(j2, false);
    }

    public static u08 a(int i, int i2) {
        da7 da7Var = null;
        if (i2 < 7) {
            int[] iArr = bkb.q8;
            return new u08(bkb.w0(null, iArr[i2], false), bkb.w0(null, iArr[i2], false), bkb.w0(null, iArr[i2], false));
        }
        ea7 ea7Var = na7.q1(i).E3;
        if (ea7Var != null) {
            da7Var = ea7Var.d(i2);
        }
        return b(da7Var, false);
    }

    public static u08 b(da7 da7Var, boolean z) {
        int g;
        int i;
        if (da7Var == null) {
            return new u08(0, 0, 0);
        }
        int f = da7Var.f();
        if (z && !da7Var.o(bkb.I.o())) {
            g = da7Var.f();
        } else {
            g = da7Var.g();
        }
        if (z) {
            i = da7Var.f();
        } else {
            i = da7Var.i();
        }
        return new u08(f, g, i);
    }

    public static u08 c(int i, int i2) {
        da7 d;
        ea7 ea7Var = na7.q1(i).F3;
        if (ea7Var == null) {
            d = null;
        } else {
            d = ea7Var.d(i2);
        }
        return b(d, true);
    }

    public final void d() {
        Path path = this.h;
        path.rewind();
        float f = this.a;
        path.addCircle(f, f, f, Path.Direction.CW);
        Path path2 = this.g;
        path2.rewind();
        path2.moveTo(this.a * 2.0f, 0.0f);
        float f2 = this.a;
        path2.lineTo(f2 * 2.0f, f2 * 2.0f);
        path2.lineTo(0.0f, this.a * 2.0f);
        path2.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().centerX() - this.a, getBounds().centerY() - this.a);
        Paint paint = this.c;
        if (paint != null) {
            float f = this.a;
            canvas.drawCircle(f, f, f, paint);
        }
        canvas.clipPath(this.h);
        canvas.drawPaint(this.d);
        canvas.drawPath(this.g, this.e);
        if (this.b) {
            RectF rectF = gl.P;
            rectF.set(this.a - gl.L(3.66f), this.a - gl.L(3.66f), this.a + gl.L(3.66f), this.a + gl.L(3.66f));
            float f2 = this.a;
            canvas.rotate(45.0f, f2, f2);
            canvas.drawRoundRect(rectF, gl.L(2.33f), gl.L(2.33f), this.f);
        }
        canvas.restore();
        tl tlVar = this.i;
        if (tlVar != null) {
            int L = gl.L(14.0f) / 2;
            tlVar.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            tlVar.draw(canvas);
        }
    }

    public final void e(View view) {
        tl tlVar = this.i;
        if (view == null) {
            if (tlVar != null) {
                tlVar.b();
                tlVar.l(null);
                return;
            }
            return;
        }
        if (tlVar != null) {
            tlVar.l(view);
        }
        view.addOnAttachStateChangeListener(new wc(this, (byte) 12));
    }

    public final void f(float f, int i) {
        if (this.c == null) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.c.setStrokeWidth(f);
        this.c.setColor(i);
    }

    @Override
    public final int getIntrinsicHeight() {
        return (int) (this.a * 2.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (this.a * 2.0f);
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

    public u08(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        this.g = new Path();
        this.h = new Path();
        this.b = i3 != i;
        paint.setColor(i);
        paint2.setColor(i2);
        paint3.setColor(i3);
        this.i = null;
        d();
    }
}
