package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class pb1 extends Drawable {
    public final Paint a;
    public final Paint b;
    public final ob1 c;
    public final ob1 d;
    public boolean e;
    public final mm f;
    public final Path g;
    public final byte h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public float o;
    public boolean p;
    public long q;
    public boolean r;
    public final float[] s;
    public final float[] t;
    public final float[] u;
    public final boolean[] v;
    public int w;

    public pb1(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        ob1 ob1Var = new ob1(this, (byte) 0);
        this.c = ob1Var;
        ob1 ob1Var2 = new ob1(this, (byte) 1);
        this.d = ob1Var2;
        this.e = false;
        fv0 fv0Var = new fv0(this, (byte) 19);
        k43 k43Var = k43.h;
        this.f = new mm(fv0Var, 350L, k43Var, 0);
        this.g = new Path();
        this.i = 21.0f;
        this.s = new float[12];
        this.t = new float[12];
        this.u = new float[12];
        this.v = new boolean[12];
        this.w = 1831565813;
        this.h = i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        ob1Var.n(0.3f, 250L, k43Var);
        ob1Var.x(hl.n1("fonts/num.otf"));
        ob1Var.w(hl.N(12.0f));
        ob1Var.b = 17;
        ob1Var2.n(0.3f, 250L, k43Var);
        ob1Var2.x(hl.n1("fonts/num.otf"));
        ob1Var2.w(hl.N(12.0f));
        ob1Var2.b = 17;
        g(-1, -15033089, -1);
    }

    public static float a(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb1.b(android.graphics.Canvas, float):void");
    }

    public final float c() {
        int i = this.w;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        this.w = i4;
        return (i4 >>> 8) / 1.6777216E7f;
    }

    public final void d(boolean z) {
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

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 1.0f);
    }

    public final void e(float f) {
        this.d.w(hl.N(f));
        this.c.w(hl.N(f));
    }

    public final void f(int i, boolean z, boolean z2) {
        boolean z3;
        this.c.t(String.valueOf(i), z2, true);
        this.d.t(String.valueOf(i), z2, true);
        boolean z4 = this.p;
        mm mmVar = this.f;
        if (z4 && z2 && z != this.e) {
            this.q = SystemClock.uptimeMillis();
            this.r = z;
            if (z) {
                for (int i2 = 0; i2 < 12; i2++) {
                    this.s[i2] = (float) Math.toRadians((((c() * 2.0f) - 1.0f) * 12.0f) + ((i2 * 360.0f) / 12.0f));
                    this.t[i2] = hl.N((c() * 5.0f) + 7.0f);
                    this.u[i2] = hl.N((c() * 0.8f) + 1.0f) / 2.0f;
                    if ((i2 & 1) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.v[i2] = z3;
                }
            }
            this.e = z;
            mmVar.f(z, true);
            invalidateSelf();
            return;
        }
        if (z4 && !z2) {
            this.q = 0L;
        }
        this.e = z;
        if (!z2) {
            mmVar.f(z, true);
        }
        invalidateSelf();
    }

    public final void g(int i, int i2, int i3) {
        this.l = i;
        this.a.setColor(i);
        this.c.u(i);
        this.d.u(i3);
        this.b.setColor(i2);
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
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
