package ni;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.m6;
public final class j extends CharacterStyle {
    public final String f20632a;
    public final float f20633b;
    public final boolean f20634c;

    public j(String str, String str2, boolean z9) {
        int length;
        int i7;
        this.f20634c = z9;
        this.f20632a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        s sVar = m.f20640a;
        if (length > 120) {
            i7 = 5;
        } else if (length > 50) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f20633b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f20634c) {
            textPaint.setTextSize(g0.L(iz.W0 - this.f20633b));
        }
        textPaint.setColor(m6.x0(null, m6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
