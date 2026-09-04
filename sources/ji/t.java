package ji;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class t extends ReplacementSpan {
    public static final int h = 0;
    public final String f14172a;
    public final Bitmap f14173b;
    public final int f14174c;
    public final int d;
    public final int f14175e;
    public final Paint f14176f;

    public t(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f14176f = paint;
        this.f14172a = str;
        this.f14173b = bitmap;
        this.f14174c = i10;
        this.d = i11;
        this.f14175e = i13;
        paint.setColor(i12);
    }

    public static t a(String str, int i10, float f7) {
        s a2;
        if (str != null && !str.isEmpty() && (a2 = s.a(str, f7, true)) != null) {
            return new t(str, a2.f14154a, a2.f14155b, a2.f14156c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f14173b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f14176f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f7, i13 - (this.d - this.f14175e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.f14175e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f14174c;
    }
}
