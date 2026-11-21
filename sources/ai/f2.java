package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class f2 extends CharacterStyle implements UpdateAppearance {
    public long f1199a;

    public final float a(long j3) {
        long j10 = this.f1199a;
        if (j10 == 0) {
            return 0.5f;
        }
        return (j2.b(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - j10)) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
