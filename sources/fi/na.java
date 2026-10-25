package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class na extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(128);
    }
}
