package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class s9 extends CharacterStyle {
    public final int f12818a;

    public s9(int i7) {
        this.f12818a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f12818a) {
            case 0:
                textPaint.setAlpha(128);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.l6.T2.getColor());
                return;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.l6.f28062o2.linkColor);
                return;
            default:
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
