package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class aj extends CharacterStyle {
    public final int f14637a;

    public aj(int i10) {
        this.f14637a = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f14637a) {
            case 0:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.t6.T2.getColor());
                return;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.f21131o2.linkColor);
                return;
            case 2:
                return;
            default:
                textPaint.setAlpha(128);
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
