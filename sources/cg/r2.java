package cg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.dj0;

public final class r2 extends ReplacementSpan {

    public final int f2812a;

    public final KeyEvent.Callback f2813b;

    public r2(KeyEvent.Callback callback, int i10) {
        this.f2812a = i10;
        this.f2813b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f2812a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f2812a) {
            case 0:
                return (int) ((y2) this.f2813b).f2882p0;
            case 1:
                return ((ga0) this.f2813b).f28578x;
            default:
                return (int) ((dj0) this.f2813b).f37426j0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
