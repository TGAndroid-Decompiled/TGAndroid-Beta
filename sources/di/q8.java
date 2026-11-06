package di;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class q8 implements LineHeightSpan {
    public final int f9662a;

    public q8(int i7) {
        this.f9662a = i7;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f9662a) {
            case 0:
                fontMetricsInt.ascent -= org.telegram.messenger.g0.L(2.0f);
                fontMetricsInt.top -= org.telegram.messenger.g0.L(2.0f);
                return;
            default:
                fontMetricsInt.descent = org.telegram.messenger.g0.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
        }
    }
}
