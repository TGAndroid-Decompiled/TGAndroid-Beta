package mi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class r extends ReplacementSpan {
    public static final int h = 0;
    public final String f19844a;
    public final Bitmap f19845b;
    public final int f19846c;
    public final int d;
    public final int f19847e;
    public final Paint f19848f;

    public r(String str, Bitmap bitmap, int i3, int i10, int i11, int i12) {
        Paint paint = new Paint(3);
        this.f19848f = paint;
        this.f19844a = str;
        this.f19845b = bitmap;
        this.f19846c = i3;
        this.d = i10;
        this.f19847e = i12;
        paint.setColor(i11);
    }

    public static r a(String str, int i3, float f10) {
        q a10;
        if (str != null && !str.isEmpty() && (a10 = q.a(str, f10, true)) != null) {
            return new r(str, a10.f19824a, a10.f19825b, a10.f19826c, i3, a10.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Bitmap bitmap = this.f19845b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f19848f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i12 - (this.d - this.f19847e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i11 = this.d;
            int i12 = this.f19847e;
            int i13 = -(i11 - i12);
            fontMetricsInt.ascent = i13;
            fontMetricsInt.top = i13;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return this.f19846c;
    }
}
