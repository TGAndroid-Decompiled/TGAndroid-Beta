package bi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class x0 extends CharacterStyle {
    public final float f3999a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f3999a * textPaint.getAlpha()));
    }
}
