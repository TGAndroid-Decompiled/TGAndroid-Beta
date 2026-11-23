package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f27010a;
    public int f27011b;

    public t(int i7, int i10) {
        this.f27010a = i10;
        this.f27011b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f27010a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f27011b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f27011b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f27011b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.r1(textPaint.getAlpha() / 255.0f, this.f27011b));
                return;
        }
    }

    public t(int i7, int i10, boolean z10) {
        this.f27010a = i10;
        this.f27011b = i7;
    }

    public t() {
        this.f27010a = 2;
        this.f27011b = 0;
    }
}
