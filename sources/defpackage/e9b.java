package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class e9b extends ImageSpan {
    public final Drawable a;

    public e9b(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.a = drawable2;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, gm.L(1.0f) + ((i5 - i3) / 2));
        this.a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i, i2, fontMetricsInt) / 3) << 1;
    }
}
