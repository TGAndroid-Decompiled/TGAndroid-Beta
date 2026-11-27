package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class u94 implements LineHeightSpan {
    public final int a;
    public final int b;

    public u94(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.a = fontMetricsInt.ascent - i;
        this.b = fontMetricsInt.top - i;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i4 == i3) {
            return;
        }
        int i5 = this.a;
        fontMetricsInt.ascent = i5;
        fontMetricsInt.top = Math.min(this.b, i5);
    }
}
