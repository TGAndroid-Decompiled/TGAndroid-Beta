package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
public final class fe1 {
    public final Paint a;
    public LinearGradient b;
    public final Paint c;
    public LinearGradient d;
    public final int e;
    public int f;
    public float g;
    public long h;
    public final Matrix i;
    public boolean j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public yfc o;
    public x38 p;

    public fe1(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        this.i = new Matrix();
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = 1.2f;
        this.n = 1.0f;
        int L = hl.L(i3);
        this.e = L;
        float f = L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, vm2.o(-1, i), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, vm2.o(-1, i2), 0}, (float[]) null, tileMode);
        paint.setShader(this.b);
        paint2.setShader(this.d);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(2.0f));
    }

    public final void a(float f, Canvas canvas, RectF rectF, View view) {
        c(view);
        canvas.drawRoundRect(rectF, f, f, this.a);
        if (this.k) {
            boolean z = this.l;
            Paint paint = this.c;
            if (z) {
                rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            }
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void b(int i, int i2) {
        float f = this.e;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.b = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, vm2.o(i, i2), 0}, (float[]) null, tileMode);
        this.d = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, vm2.o(i, 204), 0}, (float[]) null, tileMode);
        this.a.setShader(this.b);
        this.c.setShader(this.d);
    }

    public final void c(View view) {
        if (this.j || this.g < 1.0f) {
            if (view != null) {
                view.invalidate();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.h;
            if (j != 0) {
                long j2 = currentTimeMillis - j;
                if (j2 > 10) {
                    float f = ((((float) j2) / 1200.0f) * this.n) + this.g;
                    this.g = f;
                    if (f > this.m) {
                        this.g = 0.0f;
                        x38 x38Var = this.p;
                        if (x38Var != null) {
                            x38Var.run();
                        }
                    }
                    this.h = currentTimeMillis;
                }
            } else {
                this.h = currentTimeMillis;
            }
        }
        int i = this.f;
        int i2 = this.e;
        float f2 = ((i + (i2 << 1)) * this.g) - i2;
        Matrix matrix = this.i;
        matrix.reset();
        matrix.setTranslate(f2, 0.0f);
        this.b.setLocalMatrix(matrix);
        this.d.setLocalMatrix(matrix);
    }

    public fe1(int i, int i2) {
        this(i, i2, 160);
    }

    public fe1() {
        this(64, 204, 160);
    }
}
