package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
public final class sk4 extends View {
    public int E;
    public int F;
    public RectF G;
    public float H;
    public ValueAnimator I;
    public boolean a;
    public boolean b;
    public boolean c;
    public String d;
    public TextPaint e;
    public Paint f;
    public Paint h;
    public Paint n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public final void a(boolean z, boolean z2) {
        this.b = z;
        float f = 0.0f;
        if (this.a && z2) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            float f2 = this.H;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new ch4(this, (byte) 2));
            this.I.setDuration(300L);
            this.I.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.H = f;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Canvas canvas2;
        int i = this.x;
        RectF rectF = this.G;
        Paint paint = this.h;
        Paint paint2 = this.n;
        Paint paint3 = this.f;
        TextPaint textPaint = this.e;
        super.draw(canvas);
        float f2 = this.H;
        if (f2 <= 0.5f) {
            f = f2 / 0.5f;
            paint3.setColor(Color.rgb(Color.red(this.r) + ((int) ((Color.red(this.s) - Color.red(this.r)) * f)), Color.green(this.r) + ((int) ((Color.green(this.s) - Color.green(this.r)) * f)), Color.blue(this.r) + ((int) ((Color.blue(this.s) - Color.blue(this.r)) * f))));
            textPaint.setColor(Color.rgb(Color.red(this.s) + ((int) ((Color.red(this.w) - Color.red(this.s)) * f)), Color.green(this.s) + ((int) ((Color.green(this.w) - Color.green(this.s)) * f)), Color.blue(this.s) + ((int) ((Color.blue(this.w) - Color.blue(this.s)) * f))));
        } else {
            textPaint.setColor(this.w);
            paint3.setColor(this.s);
            f = 1.0f;
        }
        int measuredHeight = getMeasuredHeight() >> 1;
        paint.setColor(this.s);
        canvas.drawRoundRect(rectF, i / 2.0f, i / 2.0f, paint3);
        canvas.drawRoundRect(rectF, i / 2.0f, i / 2.0f, paint);
        String str = this.d;
        if (str != null) {
            canvas.drawText(str, (f * this.E) + (getMeasuredWidth() >> 1), (textPaint.getTextSize() * 0.35f) + measuredHeight, textPaint);
        }
        float f3 = 2.0f - (this.H / 0.5f);
        canvas.save();
        canvas.scale(0.9f, 0.9f, hl.N(7.0f), measuredHeight);
        canvas.translate(hl.L(12.0f), measuredHeight - hl.L(9.0f));
        if (this.H > 0.5f) {
            paint2.setColor(this.w);
            float f4 = 1.0f - f3;
            canvas2 = canvas;
            canvas2.drawLine(hl.N(7.0f), (int) hl.N(13.0f), (int) (hl.N(7.0f) - (hl.L(4.0f) * f4)), (int) (hl.N(13.0f) - (hl.L(4.0f) * f4)), paint2);
            canvas2.drawLine((int) hl.N(7.0f), (int) hl.N(13.0f), (int) ((hl.L(8.0f) * f4) + hl.N(7.0f)), (int) (hl.N(13.0f) - (hl.L(8.0f) * f4)), paint2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int measureText;
        Paint paint = this.h;
        RectF rectF = this.G;
        int i3 = this.F;
        String str = this.d;
        if (str == null) {
            measureText = 0;
        } else {
            measureText = (int) this.e.measureText(str);
        }
        setMeasuredDimension(measureText + (this.y << 1) + (i3 << 1), hl.L(4.0f) + this.x);
        if (getMeasuredWidth() != 0) {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            rectF.inset((paint.getStrokeWidth() / 2.0f) + i3, (paint.getStrokeWidth() / 2.0f) + i3);
        }
    }

    public void setChecked(boolean z) {
        a(z, true);
    }

    public void setText(String str) {
        this.d = str;
        requestLayout();
    }
}
