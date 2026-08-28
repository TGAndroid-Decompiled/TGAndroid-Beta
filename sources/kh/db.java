package kh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class db extends ImageSpan {
    public final Drawable f15124a;

    public db(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.f15124a = drawable2;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f) + ((i13 - i11) / 2));
        this.f15124a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i9, i10, fontMetricsInt) / 3) * 2;
    }
}
