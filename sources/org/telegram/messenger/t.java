package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f25454a;
    public int f25455b;

    public t(int i3, int i10) {
        this.f25454a = i10;
        this.f25455b = i3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25454a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f25455b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f25455b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f25455b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(textPaint.getAlpha() / 255.0f, this.f25455b));
                return;
        }
    }

    public t(int i3, int i10, boolean z10) {
        this.f25454a = i10;
        this.f25455b = i3;
    }

    public t() {
        this.f25454a = 2;
        this.f25455b = 0;
    }
}
