package ci;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import org.telegram.messenger.AndroidUtilities;
public final class b9 implements LineHeightSpan {
    public final int f5258a;

    public b9(int i10) {
        this.f5258a = i10;
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f5258a) {
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
