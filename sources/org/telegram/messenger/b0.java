package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f22999a;
    public final int f23000b;
    public final org.telegram.ui.ActionBar.i6 f23001c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f22999a = z10;
        this.f23000b = i7;
        this.f23001c = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f22999a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f23000b, this.f23001c));
    }
}
