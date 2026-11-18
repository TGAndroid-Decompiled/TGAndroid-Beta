package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f22996a;
    public final int f22997b;
    public final org.telegram.ui.ActionBar.i6 f22998c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f22996a = z10;
        this.f22997b = i7;
        this.f22998c = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f22996a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f22997b, this.f22998c));
    }
}
