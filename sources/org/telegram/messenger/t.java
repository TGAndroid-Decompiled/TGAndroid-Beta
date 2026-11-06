package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t extends CharacterStyle {
    public final int f25560a;
    public int f25561b;

    public t(int i7, int i10) {
        this.f25560a = i10;
        this.f25561b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f25560a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setTypeface(g0.o());
                textPaint.setColor(this.f25561b);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.f25561b);
                return;
            case 2:
                textPaint.setAlpha((int) ((this.f25561b / 255.0f) * textPaint.getAlpha()));
                return;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.r1(textPaint.getAlpha() / 255.0f, this.f25561b));
                return;
        }
    }

    public t(int i7, int i10, boolean z9) {
        this.f25560a = i10;
        this.f25561b = i7;
    }

    public t() {
        this.f25560a = 2;
        this.f25561b = 0;
    }
}
