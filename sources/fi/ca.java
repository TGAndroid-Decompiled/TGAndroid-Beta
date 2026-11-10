package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class ca extends ImageSpan {
    public final Drawable f11748a;

    public ca(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.f11748a = drawable2;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f) + ((i13 - i11) / 2));
        this.f11748a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i7, i10, fontMetricsInt) / 3) * 2;
    }
}
