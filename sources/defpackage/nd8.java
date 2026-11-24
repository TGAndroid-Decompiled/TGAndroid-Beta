package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.ui.Components.RadialProgress2;
public final class nd8 extends Drawable {
    public final TextPaint a;
    public final TextPaint b;
    public RadialProgress2 c;
    public boolean d;
    public StaticLayout g;
    public StaticLayout h;
    public String e = "";
    public CharSequence f = "";
    public int m = -1;
    public final int i = gl.L(64.0f);
    public final int j = gl.L(10.66f);
    public final int k = gl.L(12.0f);
    public final int l = gl.L(4.0f);

    public nd8() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setTypeface(gl.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        textPaint2.setTextSize(gl.L(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z = this.d;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (z) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(bkb.w0(null, bkb.F6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(bkb.w0(null, bkb.x6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i = this.i;
        if (width > 0 && (width != this.m || this.g == null || this.h == null)) {
            this.m = width;
            int i2 = (width - i) - this.k;
            if (i2 <= 0) {
                this.g = null;
                this.h = null;
            } else {
                float f = i2;
                CharSequence ellipsize = TextUtils.ellipsize(this.e, textPaint2, f, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f, textPaint, f, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.g = new StaticLayout(ellipsize, textPaint2, i2, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i2, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.g != null && this.h != null) {
            Rect bounds = getBounds();
            float f2 = bounds.left + i;
            float f3 = bounds.top + this.j;
            this.c.p(gl.L(10.0f) + bounds.left, gl.L(9.0f) + bounds.top, gl.L(42.0f) + gl.L(10.0f) + bounds.left, gl.L(42.0f) + gl.L(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f2, f3);
            this.g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f2, this.g.getHeight() + f3 + this.l);
            this.h.draw(canvas);
            canvas.restore();
            this.c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.a.getFontMetricsInt();
        int i = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i2 = this.j;
        int i3 = i + i2 + this.l;
        Paint.FontMetricsInt fontMetricsInt2 = this.b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i3 + i2;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = -1;
        this.g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i) {
        this.c.E = i / 255.0f;
        this.a.setAlpha(i);
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
