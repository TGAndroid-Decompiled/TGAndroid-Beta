package hi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class r9 extends CharacterStyle {
    public final int f15336a;

    public r9(int i7) {
        this.f15336a = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15336a) {
            case 0:
                textPaint.setAlpha(128);
                return;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.n6.T2.getColor());
                return;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.f29593o2.linkColor);
                return;
            default:
                return;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
