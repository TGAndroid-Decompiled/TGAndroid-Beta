package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
public final class bb8 implements LineHeightSpan {
    public final byte a;

    public bb8(byte b) {
        this.a = b;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = gm.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
            default:
                fontMetricsInt.ascent -= gm.L(2.0f);
                fontMetricsInt.top -= gm.L(2.0f);
                return;
        }
    }
}
