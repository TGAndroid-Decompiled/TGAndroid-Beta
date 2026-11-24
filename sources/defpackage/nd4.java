package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public class nd4 extends ReplacementSpan {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final int h;
    public boolean n;
    public int r;
    public wjb s;
    public String w;

    public nd4(int i) {
        float f;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        this.h = i;
        textPaint.setTypeface(gl.o());
        paint.setStyle(Paint.Style.FILL);
        if (i < 0) {
            f = 12.0f;
        } else {
            f = i;
        }
        textPaint.setTextSize(gl.L(f));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(this.w, this.a, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float f2;
        a();
        if (this.n) {
            this.f = bkb.v0(this.r, this.s);
        }
        int i7 = this.f;
        if (i7 == 0) {
            i7 = paint.getColor();
        }
        Paint paint2 = this.b;
        paint2.setColor(i7);
        if (gl.B(i7) > 0.721f) {
            i6 = -16777216;
        } else {
            i6 = -1;
        }
        TextPaint textPaint = this.a;
        textPaint.setColor(i6);
        paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
        textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
        float L = f + gl.L(2.0f);
        float L2 = (i4 - this.e) + gl.L(1.0f);
        RectF rectF = gl.P;
        rectF.set(L, L2, this.d + L, this.e + L2);
        float L3 = gl.L(4.4f);
        float L4 = gl.L(-4.0f);
        if (this.h == 8) {
            f2 = -3.66f;
        } else {
            f2 = -2.33f;
        }
        rectF.inset(L4, gl.L(f2));
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        canvas.save();
        canvas.translate(L, L2);
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (gl.L(10.0f) + this.d);
    }

    public nd4() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.w = "NEW";
        textPaint.setTypeface(gl.o());
        paint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(gl.L(10.0f));
    }
}
