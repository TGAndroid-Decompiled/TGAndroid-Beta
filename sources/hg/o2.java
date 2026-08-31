package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.ij0;
public final class o2 extends ReplacementSpan {
    public final int f7580a;
    public final KeyEvent.Callback f7581b;

    public o2(KeyEvent.Callback callback, int i10) {
        this.f7580a = i10;
        this.f7581b = callback;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f7580a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f7580a) {
            case 0:
                return (int) ((v2) this.f7581b).f7647q0;
            case 1:
                return ((xa0) this.f7581b).f33013x;
            default:
                return (int) ((ij0) this.f7581b).f37880k0;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
