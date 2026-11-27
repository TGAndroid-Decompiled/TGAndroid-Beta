package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mlb extends ReplacementSpan {
    public ImageReceiver a;
    public int b;
    public int c;
    public final boolean d;
    public final int e;

    public mlb(View view, Bitmap bitmap, int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.f0(bitmap);
        imageReceiver.p1 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        this.e = i4;
        this.d = true;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.b;
        int i7 = this.c;
        ImageReceiver imageReceiver = this.a;
        canvas.save();
        if (this.d) {
            imageReceiver.i0((int) f, i4 - (i7 - this.e), i6, i7);
        } else {
            imageReceiver.i0((int) f, ik8.g(qu6.x(4.0f, i5, i3), i7, 2, i3), i6, i7);
        }
        imageReceiver.h(canvas, null);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.c;
        if (fontMetricsInt != null) {
            if (this.d) {
                int i4 = this.e;
                int i5 = -(i3 - i4);
                fontMetricsInt.ascent = i5;
                fontMetricsInt.top = i5;
                fontMetricsInt.descent = i4;
                fontMetricsInt.bottom = i4;
            } else {
                int L = ((-i3) / 2) - hl.L(4.0f);
                fontMetricsInt.ascent = L;
                fontMetricsInt.top = L;
                int L2 = (i3 - (i3 / 2)) - hl.L(4.0f);
                fontMetricsInt.descent = L2;
                fontMetricsInt.bottom = L2;
            }
        }
        return this.b;
    }
}
