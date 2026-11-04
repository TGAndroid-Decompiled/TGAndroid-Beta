package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class b0 extends CharacterStyle {
    public final boolean f21691a;
    public final int f21692b;
    public final org.telegram.ui.ActionBar.e6 f21693c;

    public b0(boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f21691a = z10;
        this.f21692b = i3;
        this.f21693c = e6Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f21691a) {
            textPaint.setTypeface(g0.o());
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(this.f21692b, this.f21693c));
    }
}
