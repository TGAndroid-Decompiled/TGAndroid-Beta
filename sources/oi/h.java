package oi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
public final class h extends CharacterStyle {
    public final String f21141a;
    public final float f21142b;
    public final boolean f21143c;

    public h(String str, String str2, boolean z10) {
        int length;
        int i3;
        this.f21143c = z10;
        this.f21141a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        q qVar = k.f21149a;
        if (length > 120) {
            i3 = 5;
        } else if (length > 50) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        this.f21142b = i3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f21143c) {
            textPaint.setTextSize(g0.L(az.W0 - this.f21142b));
        }
        textPaint.setColor(k6.x0(null, k6.Sc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
