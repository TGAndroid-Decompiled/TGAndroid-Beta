package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
public final class h extends CharacterStyle {
    public final String f16953a;
    public final float f16954b;
    public final boolean f16955c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f16955c = z10;
        this.f16953a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        r rVar = k.f16961a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f16954b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f16955c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f16954b));
        }
        textPaint.setColor(h6.x0(null, h6.f21009ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
