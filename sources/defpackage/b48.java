package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class b48 extends Drawable {
    public static final int j = 0;
    public float a = hl.N(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final ul i;

    public b48(int i, int i2, int i3, long j2) {
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
        ul ulVar = new ul(hl.L(14.0f), null);
        this.i = ulVar;
        ulVar.j(j2, false);
    }

    public static b48 a(int i, int i2) {
        kc7 kc7Var = null;
        if (i2 < 7) {
            int[] iArr = aob.r8;
            return new b48(aob.w0(null, iArr[i2], false), aob.w0(null, iArr[i2], false), aob.w0(null, iArr[i2], false));
        }
        lc7 lc7Var = uc7.s1(i).F3;
        if (lc7Var != null) {
            kc7Var = lc7Var.d(i2);
        }
        return b(kc7Var, false);
    }

    public static b48 b(kc7 kc7Var, boolean z) {
        int g;
        int i;
        if (kc7Var == null) {
            return new b48(0, 0, 0);
        }
        int f = kc7Var.f();
        if (z && !kc7Var.o(aob.I.o())) {
            g = kc7Var.f();
        } else {
            g = kc7Var.g();
        }
        if (z) {
            i = kc7Var.f();
        } else {
            i = kc7Var.i();
        }
        return new b48(f, g, i);
    }

    public static b48 c(int i, int i2) {
        kc7 d;
        lc7 lc7Var = uc7.s1(i).G3;
        if (lc7Var == null) {
            d = null;
        } else {
            d = lc7Var.d(i2);
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
            RectF rectF = hl.P;
            rectF.set(this.a - hl.L(3.66f), this.a - hl.L(3.66f), this.a + hl.L(3.66f), this.a + hl.L(3.66f));
            float f2 = this.a;
            canvas.rotate(45.0f, f2, f2);
            canvas.drawRoundRect(rectF, hl.L(2.33f), hl.L(2.33f), this.f);
        }
        canvas.restore();
        ul ulVar = this.i;
        if (ulVar != null) {
            int L = hl.L(14.0f) / 2;
            ulVar.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            ulVar.draw(canvas);
        }
    }

    public final void e(View view) {
        ul ulVar = this.i;
        if (view == null) {
            if (ulVar != null) {
                ulVar.b();
                ulVar.l(null);
                return;
            }
            return;
        }
        if (ulVar != null) {
            ulVar.l(view);
        }
        view.addOnAttachStateChangeListener(new xc(this, (byte) 12));
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

    public b48(int i, int i2, int i3) {
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
