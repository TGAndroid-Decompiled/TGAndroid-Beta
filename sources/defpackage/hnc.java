package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class hnc extends CharacterStyle implements UpdateAppearance {
    public final byte a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(knc.L3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                return;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(vnc.Z1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                return;
        }
    }
}
