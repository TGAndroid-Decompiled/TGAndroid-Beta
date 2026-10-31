package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class v extends ReplacementSpan {
    public static final int h = 0;
    public final String f3392a;
    public final Bitmap f3393b;
    public final int f3394c;
    public final int d;
    public final int e;
    public final Paint f3395f;

    public v(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f3395f = paint;
        this.f3392a = str;
        this.f3393b = bitmap;
        this.f3394c = i10;
        this.d = i11;
        this.e = i13;
        paint.setColor(i12);
    }

    public static v a(String str, int i10, float f7) {
        u a2;
        if (str != null && !str.isEmpty() && (a2 = u.a(str, f7, true)) != null) {
            return new v(str, a2.f3369a, a2.f3370b, a2.f3371c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f3393b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f3395f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f7, i13 - (this.d - this.e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.f3394c;
    }
}
