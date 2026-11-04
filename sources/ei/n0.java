package ei;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class n0 extends CharacterStyle {
    public final float f10646a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f10646a * textPaint.getAlpha()));
    }
}
