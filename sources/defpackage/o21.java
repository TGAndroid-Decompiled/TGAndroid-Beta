package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class o21 extends View {
    public final Paint a;
    public long b;
    public int c;
    public String d;
    public int e;
    public StaticLayout f;
    public StaticLayout h;
    public int n;
    public float r;
    public final TextPaint s;
    public long w;
    public final RectF x;

    public o21(Context context, vnb vnbVar) {
        super(context);
        this.r = 1.0f;
        this.x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.s = textPaint;
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.n1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(aob.v0(aob.yj, vnbVar));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j;
        int i;
        String valueOf;
        super.onDraw(canvas);
        if (this.b > 0) {
            i = (int) Math.ceil(((float) j) / 1000.0f);
        } else {
            i = 0;
        }
        RectF rectF = this.x;
        rectF.set(hl.L(1.0f), hl.L(1.0f), getMeasuredWidth() - hl.L(1.0f), getMeasuredHeight() - hl.L(1.0f));
        int i2 = this.c;
        TextPaint textPaint = this.s;
        if (i2 != i) {
            this.c = i;
            this.d = String.valueOf(Math.max(0, i));
            StaticLayout staticLayout = this.f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.r = 0.0f;
                this.n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(valueOf));
            this.f = new StaticLayout(this.d, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f = this.r;
        if (f < 1.0f) {
            float f2 = f + 0.10666667f;
            this.r = f2;
            if (f2 > 1.0f) {
                this.r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f3 = this.r;
            if (f3 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f3) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.n / 2.0f), ((hl.L(10.0f) * this.r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - hl.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f != null) {
            float f4 = this.r;
            if (f4 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f4));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), qu6.B(1.0f, this.r, hl.L(10.0f), rectF.centerY() - (this.f.getHeight() / 2.0f)) - hl.L(0.5f));
            this.f.draw(canvas);
            if (this.r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (((float) Math.max(0L, this.b)) / 5000.0f) * (-360.0f), false, this.a);
        if (this.w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.b -= currentTimeMillis - this.w;
            this.w = currentTimeMillis;
        } else {
            this.w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i) {
        this.s.setColor(i);
        this.a.setColor(i);
    }
}
