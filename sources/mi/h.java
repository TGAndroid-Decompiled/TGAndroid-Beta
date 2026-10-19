package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
public final class h extends CharacterStyle {
    public final String f16955a;
    public final float f16956b;
    public final boolean f16957c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f16957c = z10;
        this.f16955a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        r rVar = k.f16963a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f16956b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f16957c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f16956b));
        }
        textPaint.setColor(h6.x0(null, h6.f21011ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
