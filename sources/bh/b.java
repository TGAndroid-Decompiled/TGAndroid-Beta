package bh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.g0;
public final class b extends ReplacementSpan {
    public final int f3302a;

    public b(int i3) {
        this.f3302a = i3;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return g0.L(this.f3302a);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
