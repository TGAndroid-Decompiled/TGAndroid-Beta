package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class d0 extends CharacterStyle {
    public final boolean f15131a;
    public final int f15132b;
    public final org.telegram.ui.ActionBar.p6 f15133c;

    public d0(boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f15131a = z10;
        this.f15132b = i10;
        this.f15133c = p6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f15131a) {
            textPaint.setTypeface(i0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f15132b, this.f15133c));
    }
}
