package ih;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class y7 extends CharacterStyle {
    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (textPaint.getAlpha() * 0.66f));
    }
}
