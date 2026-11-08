package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t9 extends CharacterStyle {
    public final int f12864a;

    public t9(int i7) {
        this.f12864a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12864a) {
            case 0:
                textPaint.setAlpha(128);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.k6.T2.getColor());
                return;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.f28049o2.linkColor);
                return;
            default:
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
