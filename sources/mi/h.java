package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
public final class h extends CharacterStyle {
    public final String f16947a;
    public final float f16948b;
    public final boolean f16949c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f16949c = z10;
        this.f16947a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        r rVar = k.f16955a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f16948b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f16949c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f16948b));
        }
        textPaint.setColor(h6.x0(null, h6.f21008ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
