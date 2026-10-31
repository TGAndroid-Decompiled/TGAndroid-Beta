package di;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.t6;
public final class i extends CharacterStyle {
    public final String f5965a;
    public final float f5966b;
    public final boolean f5967c;

    public i(String str, String str2, boolean z10) {
        int length;
        int i10;
        this.f5967c = z10;
        this.f5965a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        s sVar = l.f5973a;
        if (length > 120) {
            i10 = 5;
        } else if (length > 50) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        this.f5966b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f5967c) {
            textPaint.setTextSize(i0.L(tz.W0 - this.f5966b));
        }
        textPaint.setColor(t6.x0(null, t6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
