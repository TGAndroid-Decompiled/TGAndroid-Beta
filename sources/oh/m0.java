package oh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class m0 extends CharacterStyle {
    public final float f17425a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f17425a * textPaint.getAlpha()));
    }
}
