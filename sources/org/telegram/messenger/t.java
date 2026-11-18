package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f26912a;
    public int f26913b;

    public t(int i7, int i10) {
        this.f26912a = i10;
        this.f26913b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26912a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f26913b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f26913b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f26913b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.r1(textPaint.getAlpha() / 255.0f, this.f26913b));
                return;
        }
    }

    public t(int i7, int i10, boolean z10) {
        this.f26912a = i10;
        this.f26913b = i7;
    }

    public t() {
        this.f26912a = 2;
        this.f26913b = 0;
    }
}
