package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class d0 extends CharacterStyle {
    public final boolean f15253a;
    public final int f15254b;
    public final org.telegram.ui.ActionBar.p6 f15255c;

    public d0(boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f15253a = z10;
        this.f15254b = i10;
        this.f15255c = p6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f15253a) {
            textPaint.setTypeface(i0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f15254b, this.f15255c));
    }
}
