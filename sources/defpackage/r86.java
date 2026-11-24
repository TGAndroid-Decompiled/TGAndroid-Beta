package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class r86 extends Drawable {
    public Rect A;
    public final float[] B;
    public final RectF C;
    public boolean D;
    public int E;
    public Paint F;
    public LinearGradient G;
    public Matrix H;
    public int I;
    public Paint J;
    public LinearGradient K;
    public Matrix L;
    public final wjb a;
    public long b;
    public long c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public int s;
    public float t;
    public float u;
    public long v;
    public final Paint w;
    public final Paint x;
    public Path y;
    public final Path z;

    public r86() {
        this.b = -1L;
        this.c = -1L;
        this.f = new Matrix();
        this.g = new Matrix();
        this.l = bkb.g5;
        this.m = bkb.h5;
        this.t = 1.0f;
        this.u = 1.0f;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.p > 2.0f ? 2.0f : 1.0f);
    }

    public final void a() {
        if (!c() && !d()) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.w);
        if (this.n) {
            canvas.drawPath(path, this.x);
        }
    }

    public final boolean c() {
        if (this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) >= 320.0f) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) < 320.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final void draw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.draw(android.graphics.Canvas):void");
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i, int i2) {
        this.o = Integer.valueOf(i);
        this.p = Integer.valueOf(i2);
        this.n = false;
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.o = Integer.valueOf(i);
        this.p = Integer.valueOf(i2);
        this.n = true;
        this.q = Integer.valueOf(i3);
        this.r = Integer.valueOf(i4);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f) {
        boolean z;
        if (this.y != null) {
            this.w.setPathEffect(new CornerPathEffect(f));
            this.x.setPathEffect(new CornerPathEffect(f));
            return;
        }
        float[] fArr = this.B;
        if (fArr[0] == f && fArr[2] == f && fArr[4] == f && fArr[6] == f) {
            z = false;
        } else {
            z = true;
        }
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = f;
        fArr[4] = f;
        fArr[7] = f;
        fArr[6] = f;
        if (this.A != null && z) {
            Path path = this.z;
            path.rewind();
            Rect rect = this.A;
            RectF rectF = this.C;
            rectF.set(rect);
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }

    public final void i(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            boolean z = false;
            for (int i = 0; i < 8; i++) {
                float[] fArr2 = this.B;
                float f = fArr2[i];
                float f2 = fArr[i];
                if (f != f2) {
                    fArr2[i] = f2;
                    z = true;
                }
            }
            if (this.A != null && z) {
                Path path = this.z;
                path.rewind();
                Rect rect = this.A;
                RectF rectF = this.C;
                rectF.set(rect);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
        }
    }

    public final void j(float f) {
        h(gl.L(f));
    }

    public final void k() {
        Path path = this.y;
        if (path != null) {
            RectF rectF = gl.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.w.setAlpha(i);
        this.x.setAlpha(i);
        if (i > 0) {
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    public r86(wjb wjbVar) {
        this();
        this.a = wjbVar;
    }
}
