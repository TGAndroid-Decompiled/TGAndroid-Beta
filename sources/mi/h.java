package mi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
public final class h extends CharacterStyle {
    public final String f15860a;
    public final float f15861b;
    public final boolean f15862c;

    public h(boolean z10, String str, String str2) {
        int length;
        int i10;
        this.f15862c = z10;
        this.f15860a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        q qVar = k.f15868a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f15861b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f15862c) {
            textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - this.f15861b));
        }
        textPaint.setColor(g6.x0(null, g6.f19923ec, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
