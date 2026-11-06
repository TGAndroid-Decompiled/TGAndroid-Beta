package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f21561a;
    public final int f21562b;
    public final org.telegram.ui.ActionBar.f6 f21563c;

    public b0(boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f21561a = z9;
        this.f21562b = i7;
        this.f21563c = f6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f21561a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f21562b, this.f21563c));
    }
}
