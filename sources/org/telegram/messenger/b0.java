package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f22986a;
    public final int f22987b;
    public final org.telegram.ui.ActionBar.h6 f22988c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f22986a = z10;
        this.f22987b = i7;
        this.f22988c = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f22986a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f22987b, this.f22988c));
    }
}
