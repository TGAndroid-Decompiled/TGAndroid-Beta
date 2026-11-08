package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f25563a;
    public int f25564b;

    public t(int i7, int i10) {
        this.f25563a = i10;
        this.f25564b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25563a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f25564b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f25564b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f25564b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(textPaint.getAlpha() / 255.0f, this.f25564b));
                return;
        }
    }

    public t(int i7, int i10, boolean z9) {
        this.f25563a = i10;
        this.f25564b = i7;
    }

    public t() {
        this.f25563a = 2;
        this.f25564b = 0;
    }
}
