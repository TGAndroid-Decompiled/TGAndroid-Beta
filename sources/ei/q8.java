package ei;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class q8 implements LineHeightSpan {
    public final int f10819a;

    public q8(int i3) {
        this.f10819a = i3;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i3, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f10819a) {
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
