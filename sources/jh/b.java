package jh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f10390a;
    public final TextPaint f10391b;
    public RadialProgress2 f10392c;
    public boolean d;
    public StaticLayout f10394g;
    public StaticLayout h;
    public CharSequence e = "";
    public CharSequence f10393f = "";
    public int f10399m = -1;
    public final int f10395i = i0.L(64.0f);
    public final int f10396j = i0.L(10.66f);
    public final int f10397k = i0.L(12.0f);
    public final int f10398l = i0.L(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f10390a = textPaint;
        textPaint.setTextSize(i0.L(15.0f));
        textPaint.setTypeface(i0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f10391b = textPaint2;
        textPaint2.setTextSize(i0.L(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.f10391b;
        TextPaint textPaint2 = this.f10390a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(t6.x0(null, t6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(t6.x0(null, t6.f21312y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i10 = this.f10395i;
        if (width > 0 && (width != this.f10399m || this.f10394g == null || this.h == null)) {
            this.f10399m = width;
            int i11 = (width - i10) - this.f10397k;
            if (i11 <= 0) {
                this.f10394g = null;
                this.h = null;
            } else {
                float f7 = i11;
                CharSequence ellipsize = TextUtils.ellipsize(this.e, textPaint2, f7, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f10393f, textPaint, f7, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f10394g = new StaticLayout(ellipsize, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f10394g != null && this.h != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f10396j;
            this.f10392c.r(i0.L(10.0f) + bounds.left, i0.L(9.0f) + bounds.top, i0.L(42.0f) + i0.L(10.0f) + bounds.left, i0.L(42.0f) + i0.L(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f10394g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f10394g.getHeight() + f11 + this.f10398l);
            this.h.draw(canvas);
            canvas.restore();
            this.f10392c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f10390a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f10396j;
        int i12 = i10 + i11 + this.f10398l;
        Paint.FontMetricsInt fontMetricsInt2 = this.f10391b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10399m = -1;
        this.f10394g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f10392c.E = i10 / 255.0f;
        this.f10390a.setAlpha(i10);
        this.f10391b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10390a.setColorFilter(colorFilter);
        this.f10391b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
