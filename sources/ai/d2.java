package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;
public final class d2 extends CharacterStyle implements UpdateAppearance {
    public long f1180a;

    public final float a(long j3) {
        long j10 = this.f1180a;
        if (j10 == 0) {
            return 0.5f;
        }
        return (h2.b(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - j10)) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * alpha));
        if (SystemClock.uptimeMillis() - h2.f1228o > 300) {
            h2.f1228o = SystemClock.uptimeMillis();
            Log.d("DICTDBG", "draft draw settle=" + this.f1180a + " alpha " + alpha + " -> " + textPaint.getAlpha() + " color=" + Integer.toHexString(textPaint.getColor()));
        }
    }
}
