package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.k6;
public final class j extends CharacterStyle {
    public final String f20627a;
    public final float f20628b;
    public final boolean f20629c;

    public j(String str, String str2, boolean z9) {
        int length;
        int i7;
        this.f20629c = z9;
        this.f20627a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        s sVar = m.f20635a;
        if (length > 120) {
            i7 = 5;
        } else if (length > 50) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f20628b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f20629c) {
            textPaint.setTextSize(g0.L(iz.W0 - this.f20628b));
        }
        textPaint.setColor(k6.x0(null, k6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
