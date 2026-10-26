package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.y6;
public final class h extends CharacterStyle {
    public final String f18879a;
    public final float f18880b;
    public final boolean f18881c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f18881c = z10;
        this.f18879a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        q qVar = k.f18887a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f18880b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f18881c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f18880b));
        }
        textPaint.setColor(y6.x0(null, y6.f23380ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
