package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class k0 extends CharacterStyle {
    public final float f12169a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f12169a * textPaint.getAlpha()));
    }
}
