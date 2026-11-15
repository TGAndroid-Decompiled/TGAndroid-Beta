package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f26597a;
    public int f26598b;

    public t(int i7, int i10) {
        this.f26597a = i10;
        this.f26598b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26597a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f26598b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f26598b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f26598b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.r1(textPaint.getAlpha() / 255.0f, this.f26598b));
                return;
        }
    }

    public t(int i7, int i10, boolean z10) {
        this.f26597a = i10;
        this.f26598b = i7;
    }

    public t() {
        this.f26597a = 2;
        this.f26598b = 0;
    }
}
