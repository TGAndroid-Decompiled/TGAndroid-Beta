package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class s82 extends hm {
    public final Bitmap a;

    public s82(t82 t82Var) {
        super(-1L, (Paint.FontMetricsInt) null);
        Bitmap createBitmap = Bitmap.createBitmap(hl.L(24.0f), hl.L(24.0f), Bitmap.Config.ARGB_8888);
        this.a = createBitmap;
        Drawable mutate = t82Var.getParentActivity().getResources().getDrawable(2131232775).mutate();
        mutate.setBounds(0, 0, hl.L(24.0f), hl.L(24.0f));
        mutate.draw(new Canvas(createBitmap));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.save();
        canvas.translate(f, ((i3 + i5) / 2.0f) - hl.L(12.0f));
        float f2 = this.extraScale;
        canvas.scale(f2, f2, f + hl.L(12.0f), hl.L(12.0f));
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return hl.L(5.0f) + super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
