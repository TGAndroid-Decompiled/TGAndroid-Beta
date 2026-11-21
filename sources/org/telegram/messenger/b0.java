package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f23024a;
    public final int f23025b;
    public final org.telegram.ui.ActionBar.h6 f23026c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f23024a = z10;
        this.f23025b = i7;
        this.f23026c = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f23024a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f23025b, this.f23026c));
    }
}
