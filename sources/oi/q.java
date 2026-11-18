package oi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
public final class q extends ReplacementSpan {
    public static final int h = 0;
    public final String f22250a;
    public final Bitmap f22251b;
    public final int f22252c;
    public final int d;
    public final int f22253e;
    public final Paint f22254f;

    public q(String str, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        Paint paint = new Paint(3);
        this.f22254f = paint;
        this.f22250a = str;
        this.f22251b = bitmap;
        this.f22252c = i7;
        this.d = i10;
        this.f22253e = i12;
        paint.setColor(i11);
    }

    public static q a(String str, int i7, float f10) {
        p a10;
        if (str != null && !str.isEmpty() && (a10 = p.a(str, f10, true)) != null) {
            return new q(str, a10.f22229a, a10.f22230b, a10.f22231c, i7, a10.d);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Bitmap bitmap = this.f22251b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f22254f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i12 - (this.d - this.f22253e), paint2);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i11 = this.d;
            int i12 = this.f22253e;
            int i13 = -(i11 - i12);
            fontMetricsInt.ascent = i13;
            fontMetricsInt.top = i13;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return this.f22252c;
    }
}
