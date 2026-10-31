package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class u extends CharacterStyle {
    public final int f18203a;
    public int f18204b;

    public u(int i10, int i11) {
        this.f18203a = i11;
        this.f18204b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18203a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(i0.o());
                textPaint.setColor(this.f18204b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f18204b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f18204b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.r1(textPaint.getAlpha() / 255.0f, this.f18204b));
                return;
        }
    }

    public u(int i10, int i11, boolean z10) {
        this.f18203a = i11;
        this.f18204b = i10;
    }

    public u() {
        this.f18203a = 2;
        this.f18204b = 0;
    }
}
