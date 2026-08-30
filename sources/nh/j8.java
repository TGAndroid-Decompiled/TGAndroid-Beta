package nh;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.telegram.messenger.AndroidUtilities;
public final class j8 implements LineHeightSpan {
    public final int f15525a;

    public j8(int i10) {
        this.f15525a = i10;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f15525a) {
            case 0:
                fontMetricsInt.ascent -= AndroidUtilities.dp(2.0f);
                fontMetricsInt.top -= AndroidUtilities.dp(2.0f);
                return;
            default:
                fontMetricsInt.descent = AndroidUtilities.dp(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                return;
        }
    }
}
