package ah;

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

    public final TextPaint f741a;

    public final TextPaint f742b;

    public RadialProgress2 f743c;

    public StaticLayout f745f;

    public StaticLayout f746g;
    public CharSequence d = "";

    public CharSequence f744e = "";

    public int f750l = -1;
    public final int h = AndroidUtilities.dp(64.0f);

    public final int f747i = AndroidUtilities.dp(10.66f);

    public final int f748j = AndroidUtilities.dp(12.0f);

    public final int f749k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f741a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f742b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int i10 = this.h;
        if (iWidth > 0 && (iWidth != this.f750l || this.f745f == null || this.f746g == null)) {
            this.f750l = iWidth;
            int i11 = (iWidth - i10) - this.f748j;
            if (i11 <= 0) {
                this.f745f = null;
                this.f746g = null;
            } else {
                CharSequence charSequence = this.d;
                float f10 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f741a;
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequence, textPaint, f10, truncateAt);
                CharSequence charSequence2 = this.f744e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f742b;
                CharSequence charSequenceEllipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f10, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f745f = new StaticLayout(charSequenceEllipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f746g = new StaticLayout(charSequenceEllipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f745f == null || this.f746g == null) {
            return;
        }
        Rect bounds = getBounds();
        float f11 = bounds.left + i10;
        float f12 = bounds.top + this.f747i;
        float height = this.f745f.getHeight() + f12 + this.f749k;
        this.f743c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
        canvas.save();
        canvas.translate(f11, f12);
        this.f745f.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f11, height);
        this.f746g.draw(canvas);
        canvas.restore();
        this.f743c.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f741a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f747i;
        int i12 = i10 + i11 + this.f749k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f742b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f750l = -1;
        this.f745f = null;
        this.f746g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f743c.E = i10 / 255.0f;
        this.f741a.setAlpha(i10);
        this.f742b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f741a.setColorFilter(colorFilter);
        this.f742b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
