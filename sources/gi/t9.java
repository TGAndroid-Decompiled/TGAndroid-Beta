package gi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class t9 extends CharacterStyle {
    public final int f13636a;

    public t9(int i3) {
        this.f13636a = i3;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f13636a) {
            case 0:
                textPaint.setAlpha(128);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.k6.T2.getColor());
                return;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.f28077o2.linkColor);
                return;
            default:
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
