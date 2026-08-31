package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f6642a;
    public final TextPaint f6643b;
    public RadialProgress2 f6644c;
    public StaticLayout f6646f;
    public StaticLayout f6647g;
    public CharSequence d = "";
    public CharSequence f6645e = "";
    public int f6651l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f6648i = AndroidUtilities.dp(10.66f);
    public final int f6649j = AndroidUtilities.dp(12.0f);
    public final int f6650k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f6642a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f6643b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f6651l || this.f6646f == null || this.f6647g == null)) {
            this.f6651l = width;
            int i11 = (width - i10) - this.f6649j;
            if (i11 <= 0) {
                this.f6646f = null;
                this.f6647g = null;
            } else {
                CharSequence charSequence = this.d;
                float f10 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f6642a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f10, truncateAt);
                CharSequence charSequence2 = this.f6645e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f6643b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f10, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f6646f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f6647g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f6646f != null && this.f6647g != null) {
            Rect bounds = getBounds();
            float f11 = bounds.left + i10;
            float f12 = bounds.top + this.f6648i;
            this.f6644c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f11, f12);
            this.f6646f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f11, this.f6646f.getHeight() + f12 + this.f6650k);
            this.f6647g.draw(canvas);
            canvas.restore();
            this.f6644c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f6642a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f6648i;
        int i12 = i10 + i11 + this.f6650k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f6643b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6651l = -1;
        this.f6646f = null;
        this.f6647g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f6644c.E = i10 / 255.0f;
        this.f6642a.setAlpha(i10);
        this.f6643b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6642a.setColorFilter(colorFilter);
        this.f6643b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
