package bi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class tc extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(128);
    }
}
