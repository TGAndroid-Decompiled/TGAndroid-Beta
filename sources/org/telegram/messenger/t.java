package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f26892a;
    public int f26893b;

    public t(int i7, int i10) {
        this.f26892a = i10;
        this.f26893b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f26892a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f26893b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f26893b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f26893b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.m6.r1(textPaint.getAlpha() / 255.0f, this.f26893b));
                return;
        }
    }

    public t(int i7, int i10, boolean z10) {
        this.f26892a = i10;
        this.f26893b = i7;
    }

    public t() {
        this.f26892a = 2;
        this.f26893b = 0;
    }
}
