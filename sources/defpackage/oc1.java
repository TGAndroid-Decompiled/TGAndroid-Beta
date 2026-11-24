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
public final class oc1 extends Drawable {
    public final Paint a;
    public final Paint b;
    public final nc1 c;
    public final nc1 d;
    public boolean e;
    public final ln f;
    public final Path g;
    public final byte h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;

    public oc1(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        nc1 nc1Var = new nc1(this, (byte) 0);
        this.c = nc1Var;
        nc1 nc1Var2 = new nc1(this, (byte) 1);
        this.d = nc1Var2;
        this.e = false;
        yt0 yt0Var = new yt0(this, (byte) 19);
        d53 d53Var = d53.h;
        this.f = new ln(yt0Var, 350L, d53Var, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.h = i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        nc1Var.n(0.3f, 250L, d53Var);
        nc1Var.x(gm.n1("fonts/num.otf"));
        nc1Var.w(gm.N(12.0f));
        nc1Var.b = 17;
        nc1Var2.n(0.3f, 250L, d53Var);
        nc1Var2.x(gm.n1("fonts/num.otf"));
        nc1Var2.w(gm.N(12.0f));
        nc1Var2.b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f) {
        float N = gm.N(this.i) / 2.0f;
        float d = this.f.d(this.e);
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i > 0) {
            Paint paint = this.b;
            paint.setAlpha((int) (f * 255.0f * d));
            canvas.drawCircle(this.n, this.o, gm.N(11.33f) * d, paint);
        }
        Paint paint2 = this.a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.l) * f));
        RectF rectF = gm.P;
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
            canvas.drawArc(gm.P, f7 + 270.0f, f8, false, paint2);
            f7 = f8 + f6 + f7;
            i2++;
            f5 = f8;
        }
        canvas.save();
        canvas.translate(this.j + 0.0f, this.k);
        Rect rect = gm.Q;
        rect.set((int) (this.n - gm.L(20.0f)), (int) (this.o - gm.L(20.0f)), (int) (this.n + gm.L(20.0f)), (int) (this.o + gm.L(20.0f)));
        nc1 nc1Var = this.c;
        nc1Var.setBounds(rect);
        nc1Var.C = (int) (Color.alpha(this.l) * f);
        nc1Var.draw(canvas);
        if (i > 0) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.n, this.o + gm.L(1.0f), gm.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            nc1 nc1Var2 = this.d;
            nc1Var2.setBounds(rect);
            nc1Var2.C = (int) (f * 255.0f);
            nc1Var2.draw(canvas);
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
        this.d.w(gm.N(f));
        this.c.w(gm.N(f));
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
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
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
