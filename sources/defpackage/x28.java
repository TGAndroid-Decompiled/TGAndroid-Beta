package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class x28 extends Drawable {
    public static final int j = 0;
    public float a = gm.N(10.6665f);
    public final boolean b;
    public Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final Path h;
    public final tm i;

    public x28(int i, int i2, int i3, long j2) {
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
        tm tmVar = new tm(gm.L(14.0f), null);
        this.i = tmVar;
        tmVar.j(j2, false);
    }

    public static x28 a(int i, int i2) {
        ec7 ec7Var = null;
        if (i2 < 7) {
            int[] iArr = cmb.q8;
            return new x28(cmb.w0(null, iArr[i2], false), cmb.w0(null, iArr[i2], false), cmb.w0(null, iArr[i2], false));
        }
        fc7 fc7Var = oc7.r1(i).E3;
        if (fc7Var != null) {
            ec7Var = fc7Var.d(i2);
        }
        return b(ec7Var, false);
    }

    public static x28 b(ec7 ec7Var, boolean z) {
        int g;
        int i;
        if (ec7Var == null) {
            return new x28(0, 0, 0);
        }
        int f = ec7Var.f();
        if (z && !ec7Var.o(cmb.I.o())) {
            g = ec7Var.f();
        } else {
            g = ec7Var.g();
        }
        if (z) {
            i = ec7Var.f();
        } else {
            i = ec7Var.i();
        }
        return new x28(f, g, i);
    }

    public static x28 c(int i, int i2) {
        ec7 d;
        fc7 fc7Var = oc7.r1(i).F3;
        if (fc7Var == null) {
            d = null;
        } else {
            d = fc7Var.d(i2);
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
            RectF rectF = gm.P;
            rectF.set(this.a - gm.L(3.66f), this.a - gm.L(3.66f), this.a + gm.L(3.66f), this.a + gm.L(3.66f));
            float f2 = this.a;
            canvas.rotate(45.0f, f2, f2);
            canvas.drawRoundRect(rectF, gm.L(2.33f), gm.L(2.33f), this.f);
        }
        canvas.restore();
        tm tmVar = this.i;
        if (tmVar != null) {
            int L = gm.L(14.0f) / 2;
            tmVar.setBounds(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
            tmVar.draw(canvas);
        }
    }

    public final void e(View view) {
        tm tmVar = this.i;
        if (view == null) {
            if (tmVar != null) {
                tmVar.b();
                tmVar.l(null);
                return;
            }
            return;
        }
        if (tmVar != null) {
            tmVar.l(view);
        }
        view.addOnAttachStateChangeListener(new wd(this, (byte) 12));
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

    public x28(int i, int i2, int i3) {
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
