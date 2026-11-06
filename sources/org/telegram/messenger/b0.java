package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f21562a;
    public final int f21563b;
    public final org.telegram.ui.ActionBar.f6 f21564c;

    public b0(boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f21562a = z9;
        this.f21563b = i7;
        this.f21564c = f6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f21562a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f21563b, this.f21564c));
    }
}
