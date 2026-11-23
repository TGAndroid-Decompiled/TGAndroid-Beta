package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f23107a;
    public final int f23108b;
    public final org.telegram.ui.ActionBar.i6 f23109c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f23107a = z10;
        this.f23108b = i7;
        this.f23109c = i6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f23107a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(this.f23108b, this.f23109c));
    }
}
