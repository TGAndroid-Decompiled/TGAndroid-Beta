package eg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.zi0;
public final class p2 extends ReplacementSpan {
    public final int f6111a;
    public final KeyEvent.Callback f6112b;

    public p2(KeyEvent.Callback callback, int i10) {
        this.f6111a = i10;
        this.f6112b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f6111a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f6111a) {
            case 0:
                return (int) ((w2) this.f6112b).f6176p0;
            case 1:
                return ((qa0) this.f6112b).f31884x;
            default:
                return (int) ((zi0) this.f6112b).f45246j0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
    }
}
