package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.h6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.wh0;
public final class d2 extends ReplacementSpan {
    public final int f13094a;
    public final Object f13095b;

    public d2(Object obj, int i10) {
        this.f13094a = i10;
        this.f13095b = obj;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.f13094a;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f13094a) {
            case 0:
                return (int) ((i2) this.f13095b).f13148l2;
            case 1:
                return ((h6) this.f13095b).getSize(paint, charSequence, i10, i11, fontMetricsInt);
            case 2:
                return ((da0) this.f13095b).f25382y;
            default:
                return (int) ((wh0) this.f13095b).f43310f2;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
