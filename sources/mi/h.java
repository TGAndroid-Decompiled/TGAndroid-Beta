package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.k6;
public final class h extends CharacterStyle {
    public final String f17016a;
    public final float f17017b;
    public final boolean f17018c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f17018c = z10;
        this.f17016a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        r rVar = k.f17024a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f17017b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f17018c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f17017b));
        }
        textPaint.setColor(k6.x0(null, k6.f21206ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
