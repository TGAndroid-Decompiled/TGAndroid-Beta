package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class g2 extends CharacterStyle implements UpdateAppearance {
    public long f1217a;

    public final float a(long j3) {
        long j10 = this.f1217a;
        if (j10 == 0) {
            return 0.5f;
        }
        return (k2.b(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - j10)) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
