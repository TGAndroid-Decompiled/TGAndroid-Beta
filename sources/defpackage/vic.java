package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class vic extends CharacterStyle implements UpdateAppearance {
    public final byte a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(yic.u3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                return;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(jjc.Y1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                return;
        }
    }
}
