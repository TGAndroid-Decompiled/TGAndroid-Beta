package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class qc8 implements LineHeightSpan {
    public final byte a;

    public qc8(byte b) {
        this.a = b;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = hl.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
            default:
                fontMetricsInt.ascent -= hl.L(2.0f);
                fontMetricsInt.top -= hl.L(2.0f);
                return;
        }
    }
}
