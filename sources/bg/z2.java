package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.bj0;
public final class z2 extends ReplacementSpan {
    public final int f2011a;
    public final KeyEvent.Callback f2012b;

    public z2(KeyEvent.Callback callback, int i9) {
        this.f2011a = i9;
        this.f2012b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = this.f2011a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f2011a) {
            case 0:
                return (int) ((g3) this.f2012b).f1787p0;
            case 1:
                return ((ca0) this.f2012b).f27450x;
            default:
                return (int) ((bj0) this.f2012b).f36888j0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
