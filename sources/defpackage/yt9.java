package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class yt9 extends Drawable {
    public final RectF a = new RectF();
    public final Paint b;
    public final TextPaint c;
    public int d;
    public String e;
    public final int f;
    public int g;
    public final short h;

    public yt9(int i) {
        String M0;
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.g = 255;
        this.h = (short) 255;
        this.f = i;
        uh9.p(textPaint, hl.L(11.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        if (i != 0) {
            if (i != 2) {
                M0 = ob6.M0(2131750808, null);
            } else {
                M0 = ob6.M0(2131745000, null);
            }
        } else {
            M0 = ob6.M0(2131745590, null);
        }
        this.e = M0;
        this.d = (int) Math.ceil(textPaint.measureText(M0));
    }

    public final void a() {
        String M0;
        int i = this.f;
        if (i != 0) {
            if (i != 2) {
                M0 = ob6.M0(2131750808, null);
            } else {
                M0 = ob6.M0(2131745000, null);
            }
        } else {
            M0 = ob6.M0(2131745590, null);
        }
        if (!M0.equals(this.e)) {
            this.e = M0;
            this.d = (int) Math.ceil(this.c.measureText(M0));
        }
    }

    public final void b(int i) {
        this.c.setColor(i);
        this.b.setColor(i);
        this.g = Color.alpha(i);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), this.b);
        canvas.drawText(this.e, rectF.left + hl.L(5.0f), rectF.top + hl.L(12.0f), this.c);
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(16.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(10.0f) + this.d;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        if (this.h != i) {
            int i2 = (int) ((i / 255.0f) * this.g);
            this.b.setAlpha(i2);
            this.c.setAlpha(i2);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
