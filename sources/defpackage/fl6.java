package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
public final class fl6 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final pg6 n;
    public boolean r;
    public int s;

    public fl6(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new pg6(this, (byte) 5);
    }

    public final void a() {
        float min = Math.min(gm.L(10.0f) / this.c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i = 1048575 & currentTextColor;
        this.b = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{i, currentTextColor, currentTextColor, i}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.b);
        } else {
            getPaint().setShader(null);
        }
        this.b.setLocalMatrix(this.a);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        boolean z;
        long j;
        boolean z2;
        int measuredWidth = getMeasuredWidth();
        int L = gm.L(40.0f);
        float f2 = this.f;
        float f3 = measuredWidth;
        if (f2 < f3) {
            f = pqe.a(f2 / gm.L(10.0f), 0.0f, 1.0f);
        } else {
            f = 0.0f;
        }
        Matrix matrix = this.a;
        matrix.reset();
        float f4 = this.c;
        matrix.postScale(td4.A(1.0f, f, gm.L(10.0f) / f4, 1.0f), 1.0f, f4, 0.0f);
        matrix.postScale(1.0f - (this.s / this.c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f, 0.0f);
        this.b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f5 = this.f;
            if (f5 > 0.0f && f5 + getWidth() > f3 && this.d && this.e) {
                float f6 = -this.f;
                float f7 = L;
                matrix.postTranslate(f6 - ((f6 + f3) + f7), 0.0f);
                this.b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f) + f3 + f7, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        if (this.f < 1.0E-4d) {
            z = true;
        } else {
            z = false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.h;
        if (j2 != 0 && !z) {
            j = Math.min(uptimeMillis - j2, 120L);
        } else {
            j = 16;
        }
        this.h = uptimeMillis;
        boolean z3 = this.d;
        pg6 pg6Var = this.n;
        if ((z3 && this.e) || !z) {
            float A = b10.A((float) j, 1000.0f, gm.L(60.0f), this.f);
            this.f = A;
            if (A > measuredWidth + L) {
                gm.r(pg6Var);
                this.r = false;
                this.e = false;
                this.f = 0.0f;
            }
            invalidate();
        }
        if (this.d && !this.e && !(z2 = this.r) && !z2) {
            this.r = true;
            gm.d3(pg6Var, 1500L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        super.onMeasure(0, i2);
        this.c = View.MeasureSpec.getSize(i);
        if (getMeasuredWidth() > this.c - this.s) {
            z = true;
        }
        this.d = z;
        a();
    }

    public void setCustomPaddingRight(int i) {
        boolean z;
        this.s = i;
        if (getMeasuredWidth() > this.c - this.s) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if (z) {
            getPaint().setShader(this.b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        gm.r(this.n);
        this.r = false;
        this.e = false;
        this.f = 0.0f;
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        a();
    }
}
