package gg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.va0;
import org.telegram.ui.hj0;
public final class o2 extends ReplacementSpan {
    public final int f6728a;
    public final KeyEvent.Callback f6729b;

    public o2(KeyEvent.Callback callback, int i10) {
        this.f6728a = i10;
        this.f6729b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f6728a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f6728a) {
            case 0:
                return (int) ((v2) this.f6729b).f6791q0;
            case 1:
                return ((va0) this.f6729b).f29412x;
            default:
                return (int) ((hj0) this.f6729b).f34901k0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
