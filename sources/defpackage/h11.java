package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
public final class h11 implements LeadingMarginSpan {
    public final int a;
    public final int b;

    public h11(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setColor(-11491093);
            paint.setStyle(Paint.Style.FILL);
            if (layout != null) {
                if (layout.getLineForOffset(i6) != layout.getLineCount() - 1) {
                    i8 = (int) layout.getSpacingAdd();
                } else {
                    i8 = 0;
                }
                i5 -= i8;
            }
            int i9 = this.b;
            canvas.drawCircle((i2 * i9) + i, (i3 + i5) / 2.0f, i9, paint);
            paint.setColor(color);
            paint.setStyle(style);
        }
    }

    @Override
    public final int getLeadingMargin(boolean z) {
        return (this.b << 1) + this.a;
    }
}
