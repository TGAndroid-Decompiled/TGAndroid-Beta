package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class u extends ReplacementSpan {
    public static final int h = 0;
    public final String f9876a;
    public final Bitmap f9877b;
    public final int f9878c;
    public final int d;
    public final int e;
    public final Paint f9879f;

    public u(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f9879f = paint;
        this.f9876a = str;
        this.f9877b = bitmap;
        this.f9878c = i10;
        this.d = i11;
        this.e = i13;
        paint.setColor(i12);
    }

    public static u a(String str, int i10, float f7) {
        t a2;
        if (str != null && !str.isEmpty() && (a2 = t.a(str, f7, true)) != null) {
            return new u(str, a2.f9850a, a2.f9851b, a2.f9852c, i10, a2.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.f9877b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f9879f;
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
        return this.f9878c;
    }
}
