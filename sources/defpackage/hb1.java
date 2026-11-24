package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class hb1 extends Drawable {
    public final Paint a;
    public final Paint b;
    public final gb1 c;
    public final gb1 d;
    public boolean e;
    public final lm f;
    public final Path g;
    public final byte h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public hb1(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        gb1 gb1Var = new gb1(this, (byte) 0);
        this.c = gb1Var;
        gb1 gb1Var2 = new gb1(this, (byte) 1);
        this.d = gb1Var2;
        this.e = false;
        nv0 nv0Var = new nv0(this, (byte) 16);
        s33 s33Var = s33.h;
        this.f = new lm(nv0Var, 350L, s33Var, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        gb1Var.n(0.3f, 250L, s33Var);
        gb1Var.x(gl.n1("fonts/num.otf"));
        gb1Var.w(gl.N(12.0f));
        gb1Var.b = 17;
        gb1Var2.n(0.3f, 250L, s33Var);
        gb1Var2.x(gl.n1("fonts/num.otf"));
        gb1Var2.w(gl.N(12.0f));
        gb1Var2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f) {
        float N = gl.N(this.i) / 2.0f;
        float d = this.f.d(this.e);
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i > 0) {
            Paint paint = this.b;
            paint.setAlpha((int) (f * 255.0f * d));
            canvas.drawCircle(this.n, this.o, gl.N(11.33f) * d, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f));
        RectF rectF = gl.P;
        float f2 = this.n;
        float f3 = this.o;
        rectF.set(f2 - N, f3 - N, f2 + N, f3 + N);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        byte b = this.h;
        float f4 = ((b + 1) * 1.5f) + (b * 1.0f);
        float f5 = (1.0f / f4) * 180.0f;
        float f6 = (1.5f / f4) * 180.0f;
        int i2 = 0;
        float f7 = f6;
        while (i2 < b) {
            float f8 = f5;
            canvas.drawArc(gl.P, f7 + 270.0f, f8, false, paint2);
            f7 = f8 + f6 + f7;
            i2++;
            f5 = f8;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = gl.Q;
        rect.set((int) (this.n - gl.L(20.0f)), (int) (this.o - gl.L(20.0f)), (int) (this.n + gl.L(20.0f)), (int) (this.o + gl.L(20.0f)));
        gb1 gb1Var = this.c;
        gb1Var.setBounds(rect);
        gb1Var.C = (int) (Color.alpha(this.l) * f);
        gb1Var.draw(canvas);
        if (i > 0) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + gl.L(1.0f), gl.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            gb1 gb1Var2 = this.d;
            gb1Var2.setBounds(rect);
            gb1Var2.C = (int) (f * 255.0f);
            gb1Var2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.m != z) {
            this.m = z;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.c.a;
            if (z) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f) {
        this.d.w(gl.N(f));
        this.c.w(gl.N(f));
    }

    public final void d(int i, boolean z, boolean z2) {
        this.c.t(String.valueOf(i), z2, true);
        this.d.t(String.valueOf(i), z2, true);
        this.e = z;
        if (!z2) {
            this.f.f(z, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i, int i2, int i3) {
        this.l = i;
        this.a.setColor(i);
        this.c.u(i);
        this.d.u(i3);
        this.b.setColor(i2);
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.n = getBounds().centerX();
        this.o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
