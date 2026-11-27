package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
public final class dca extends ImageSpan {
    public static t2c b;
    public final byte a = 1;

    public dca() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dca.<init>():void");
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i6 = fontMetricsInt.descent;
                canvas.translate(f, ((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (ob6.a0) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i3 = fontMetricsInt2.descent;
                    int i4 = fontMetricsInt2.ascent;
                    int i5 = ((i3 - i4) / 2) + i4;
                    int i6 = (bounds.bottom - bounds.top) / 2;
                    int i7 = i5 - i6;
                    fontMetricsInt.ascent = i7;
                    fontMetricsInt.top = i7;
                    int i8 = i5 + i6;
                    fontMetricsInt.bottom = i8;
                    fontMetricsInt.descent = i8;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
                super.updateDrawState(textPaint);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }

    public dca(Drawable drawable) {
        super(drawable);
    }
}
