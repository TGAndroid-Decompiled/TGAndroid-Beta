package gg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.jj0;
public final class o2 extends ReplacementSpan {
    public final int f6715a;
    public final KeyEvent.Callback f6716b;

    public o2(KeyEvent.Callback callback, int i10) {
        this.f6715a = i10;
        this.f6716b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f6715a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f6715a) {
            case 0:
                return (int) ((v2) this.f6716b).f6778q0;
            case 1:
                return ((wa0) this.f6716b).f30200x;
            default:
                return (int) ((jj0) this.f6716b).f35308k0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
