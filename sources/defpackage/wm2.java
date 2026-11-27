package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.a;
public class wm2 extends ReplacementSpan {
    public int E;
    public int F;
    public final byte G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public Paint.FontMetricsInt L;
    public boolean a;
    public int b;
    public Drawable c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public float r;
    public float s;
    public float w;
    public float x;
    public int y;

    public wm2(int i, Drawable drawable) {
        this.a = true;
        this.d = true;
        this.e = true;
        this.f = false;
        this.n = 0;
        this.x = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        this.c = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.G = i;
    }

    public final void a(int i) {
        boolean z;
        this.h = i;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final void b(Paint.FontMetricsInt fontMetricsInt) {
        this.K = true;
        this.L = fontMetricsInt;
        if (fontMetricsInt != null) {
            c(Math.abs(this.L.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.E == 0) {
                c(hl.L(20.0f));
            }
        }
    }

    public final void c(int i) {
        this.E = i;
        this.c.setBounds(0, 0, i, i);
    }

    public final void d(float f) {
        this.r = 0.0f;
        this.s = f;
    }

    @Override
    public void draw(android.graphics.Canvas r4, java.lang.CharSequence r5, int r6, int r7, float r8, int r9, int r10, int r11, android.graphics.Paint r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm2.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.K && this.L != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.L;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            return (int) (Math.abs(this.H) * Math.abs(this.I) * this.E);
        }
        int i3 = this.F;
        float f = this.I;
        if (i3 != 0) {
            return (int) (Math.abs(f) * this.F);
        }
        float abs = Math.abs(this.H) * Math.abs(f);
        int i4 = this.E;
        if (i4 == 0) {
            i4 = this.c.getIntrinsicWidth();
        }
        return (int) (abs * i4);
    }

    public wm2(Drawable drawable) {
        this(0, drawable);
    }

    public wm2(int i, int i2) {
        this(i2, a.b.getDrawable(i).mutate());
    }

    public wm2(int i) {
        this(i, 0);
    }
}
