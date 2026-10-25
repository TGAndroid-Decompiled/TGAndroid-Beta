package di;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.telegram.messenger.AndroidUtilities;
public final class z8 implements LineHeightSpan {
    public final int f9512a;

    public z8(int i10) {
        this.f9512a = i10;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f9512a) {
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
