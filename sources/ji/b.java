package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class b extends CharacterStyle implements UpdateAppearance {
    public final int f17809a;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f17809a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(e.f17830s3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                return;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(p.Y1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                return;
        }
    }
}
