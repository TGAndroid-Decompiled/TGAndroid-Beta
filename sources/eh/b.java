package eh;

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
    public final TextPaint f5591a;
    public final TextPaint f5592b;
    public RadialProgress2 f5593c;
    public StaticLayout f5594f;
    public StaticLayout f5595g;
    public CharSequence d = "";
    public CharSequence e = "";
    public int f5599l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f5596i = AndroidUtilities.dp(10.66f);
    public final int f5597j = AndroidUtilities.dp(12.0f);
    public final int f5598k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f5591a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f5592b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f5599l || this.f5594f == null || this.f5595g == null)) {
            this.f5599l = width;
            int i11 = (width - i10) - this.f5597j;
            if (i11 <= 0) {
                this.f5594f = null;
                this.f5595g = null;
            } else {
                CharSequence charSequence = this.d;
                float f10 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f5591a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f10, truncateAt);
                CharSequence charSequence2 = this.e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f5592b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f10, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f5594f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f5595g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f5594f != null && this.f5595g != null) {
            Rect bounds = getBounds();
            float f11 = bounds.left + i10;
            float f12 = bounds.top + this.f5596i;
            this.f5593c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f11, f12);
            this.f5594f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f11, this.f5594f.getHeight() + f12 + this.f5598k);
            this.f5595g.draw(canvas);
            canvas.restore();
            this.f5593c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f5591a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f5596i;
        int i12 = i10 + i11 + this.f5598k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f5592b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5599l = -1;
        this.f5594f = null;
        this.f5595g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5593c.E = i10 / 255.0f;
        this.f5591a.setAlpha(i10);
        this.f5592b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5591a.setColorFilter(colorFilter);
        this.f5592b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
