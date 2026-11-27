package defpackage;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class do3 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j) {
        long j2 = this.a;
        if (j2 == 0) {
            return 0.5f;
        }
        return (ho3.b(Math.max(0.0f, Math.min(1.0f, ((float) (j - j2)) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
