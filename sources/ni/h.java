package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.y6;
public final class h extends CharacterStyle {
    public final String f18878a;
    public final float f18879b;
    public final boolean f18880c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f18880c = z10;
        this.f18878a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        q qVar = k.f18886a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f18879b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f18880c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f18879b));
        }
        textPaint.setColor(y6.x0(null, y6.f23381ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
