package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class u extends CharacterStyle {
    public final int f18328a;
    public int f18329b;

    public u(int i10, int i11) {
        this.f18328a = i11;
        this.f18329b = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18328a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(i0.o());
                textPaint.setColor(this.f18329b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f18329b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f18329b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.r1(textPaint.getAlpha() / 255.0f, this.f18329b));
                return;
        }
    }

    public u(int i10, int i11, boolean z10) {
        this.f18328a = i11;
        this.f18329b = i10;
    }

    public u() {
        this.f18328a = 2;
        this.f18329b = 0;
    }
}
