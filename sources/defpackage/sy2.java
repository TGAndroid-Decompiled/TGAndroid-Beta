package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class sy2 extends Drawable {
    public final byte a = 0;
    public final TextPaint b;
    public String c;
    public final RectF d;
    public float e;
    public final Paint f;
    public final Object g;

    public sy2(pp9 pp9Var) {
        this.g = pp9Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Paint(1);
        String M0 = jb6.M0(2131743158, null);
        this.c = M0;
        this.d = new RectF();
        textPaint.setTextSize(gm.L(11.0f));
        textPaint.setTypeface(gm.o());
        textPaint.setColor(-1);
        this.e = textPaint.measureText(M0);
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        Object obj = this.g;
        Paint paint = this.f;
        RectF rectF = this.d;
        switch (b) {
            case 0:
                Rect bounds = getBounds();
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), (TextPaint) paint);
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(gm.L(2.0f) + bounds.left, gm.L(1.0f) + bounds.top, drawable.getIntrinsicWidth() + gm.L(2.0f) + bounds.left, drawable.getIntrinsicHeight() + gm.L(1.0f) + getBounds().top);
                drawable.draw(canvas);
                String str = this.c;
                if (str != null) {
                    canvas.drawText(str, gm.L(16.5f) + bounds.left, gm.L(13.0f) + bounds.top, textPaint);
                    return;
                }
                return;
            default:
                Rect bounds2 = getBounds();
                int i = bounds2.left;
                int L = gm.L(6.0f) + bounds2.left;
                float f = this.e;
                rectF.set(gm.L(6.0f) + i, bounds2.top, hg9.v(16.0f, (int) Math.ceil(f), L), bounds2.bottom);
                pp9 pp9Var = (pp9) obj;
                paint.setColor(on2.f(pp9Var.x0, -12761513, -1163700));
                canvas.drawRoundRect(rectF, gm.L(9.0f), gm.L(9.0f), paint);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                canvas.drawText(this.c, rectF.centerX() - (f / 2.0f), rectF.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
                if (pp9Var.w0) {
                    paint.setColor(-1163700);
                    canvas.drawCircle(rectF.right + gm.L(10.0f), rectF.centerY(), gm.L(4.0f), paint);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return gm.L(18.0f);
            default:
                return gm.L(18.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        int i;
        switch (this.a) {
            case 0:
                return (int) (gm.L(23.0f) + this.e);
            default:
                int v = hg9.v(16.0f, (int) Math.ceil(this.e), gm.L(6.0f));
                if (((pp9) this.g).w0) {
                    i = gm.L(14.0f);
                } else {
                    i = 0;
                }
                return v + i;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -3;
        }
    }

    @Override
    public final void setAlpha(int i) {
        byte b = this.a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    public sy2(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        this.d = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(12.0f));
        textPaint2.setColor(-6915073);
        this.g = context.getDrawable(2131231933);
    }
}
