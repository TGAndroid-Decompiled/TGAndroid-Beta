package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class jk2 extends CharacterStyle {
    public final String a;
    public final float b;
    public final boolean c;

    public jk2(String str, String str2, boolean z) {
        int length;
        int i;
        this.c = z;
        this.a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        wm8 wm8Var = mk2.a;
        if (length > 120) {
            i = 5;
        } else if (length > 50) {
            i = 3;
        } else {
            i = 2;
        }
        this.b = i;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.c) {
            textPaint.setTextSize(hl.L(xea.S0 - this.b));
        }
        textPaint.setColor(aob.w0(null, aob.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
