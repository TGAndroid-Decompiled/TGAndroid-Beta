package ch;

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
    public final TextPaint f3474a;
    public final TextPaint f3475b;
    public RadialProgress2 f3476c;
    public StaticLayout f3478f;
    public StaticLayout f3479g;
    public CharSequence d = "";
    public CharSequence f3477e = "";
    public int f3483l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f3480i = AndroidUtilities.dp(10.66f);
    public final int f3481j = AndroidUtilities.dp(12.0f);
    public final int f3482k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f3474a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f3475b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f3483l || this.f3478f == null || this.f3479g == null)) {
            this.f3483l = width;
            int i11 = (width - i10) - this.f3481j;
            if (i11 <= 0) {
                this.f3478f = null;
                this.f3479g = null;
            } else {
                CharSequence charSequence = this.d;
                float f9 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f3474a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f9, truncateAt);
                CharSequence charSequence2 = this.f3477e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f3475b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f9, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f3478f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f3479g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f3478f != null && this.f3479g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f3480i;
            this.f3476c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f3478f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f3478f.getHeight() + f11 + this.f3482k);
            this.f3479g.draw(canvas);
            canvas.restore();
            this.f3476c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f3474a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f3480i;
        int i12 = i10 + i11 + this.f3482k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f3475b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3483l = -1;
        this.f3478f = null;
        this.f3479g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3476c.E = i10 / 255.0f;
        this.f3474a.setAlpha(i10);
        this.f3475b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3474a.setColorFilter(colorFilter);
        this.f3475b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
