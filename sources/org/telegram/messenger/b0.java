package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f22633a;
    public final int f22634b;
    public final org.telegram.ui.ActionBar.e6 f22635c;

    public b0(boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f22633a = z10;
        this.f22634b = i7;
        this.f22635c = e6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f22633a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(this.f22634b, this.f22635c));
    }
}
