package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f21591a;
    public final int f21592b;
    public final org.telegram.ui.ActionBar.h6 f21593c;

    public b0(boolean z9, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f21591a = z9;
        this.f21592b = i7;
        this.f21593c = h6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f21591a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(this.f21592b, this.f21593c));
    }
}
