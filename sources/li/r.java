package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r extends ReplacementSpan {
    public static final int h = 0;
    public final String f18800a;
    public final Bitmap f18801b;
    public final int f18802c;
    public final int d;
    public final int f18803e;
    public final Paint f18804f;

    public r(String str, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        Paint paint = new Paint(3);
        this.f18804f = paint;
        this.f18800a = str;
        this.f18801b = bitmap;
        this.f18802c = i7;
        this.d = i10;
        this.f18803e = i12;
        paint.setColor(i11);
    }

    public static r a(String str, int i7, float f10) {
        q a10;
        if (str != null && !str.isEmpty() && (a10 = q.a(str, f10, true)) != null) {
            return new r(str, a10.f18784a, a10.f18785b, a10.f18786c, i7, a10.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Bitmap bitmap = this.f18801b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f18804f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i12 - (this.d - this.f18803e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i11 = this.d;
            int i12 = this.f18803e;
            int i13 = -(i11 - i12);
            fontMetricsInt.ascent = i13;
            fontMetricsInt.top = i13;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return this.f18802c;
    }
}
