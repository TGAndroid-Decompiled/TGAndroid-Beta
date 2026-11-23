package hi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class la extends CharacterStyle {
    public final int f14847a;

    public la(int i7) {
        this.f14847a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f14847a) {
            case 0:
                textPaint.setAlpha(128);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.n6.T2.getColor());
                return;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.f29648o2.linkColor);
                return;
            default:
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
