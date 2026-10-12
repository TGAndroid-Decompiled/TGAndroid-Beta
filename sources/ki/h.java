package ki;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
public final class h extends CharacterStyle {
    public final String f14884a;
    public final float f14885b;
    public final boolean f14886c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f14886c = z10;
        this.f14884a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        q qVar = k.f14892a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f14885b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f14886c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f14885b));
        }
        textPaint.setColor(h6.x0(null, h6.ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
