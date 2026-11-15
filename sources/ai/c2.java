package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;
public final class c2 extends CharacterStyle implements UpdateAppearance {
    public long f1172a;

    public final float a(long j3) {
        long j10 = this.f1172a;
        if (j10 == 0) {
            return 0.5f;
        }
        return (g2.b(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - j10)) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * alpha));
        if (SystemClock.uptimeMillis() - g2.f1219o > 300) {
            g2.f1219o = SystemClock.uptimeMillis();
            Log.d("DICTDBG", "draft draw settle=" + this.f1172a + " alpha " + alpha + " -> " + textPaint.getAlpha() + " color=" + Integer.toHexString(textPaint.getColor()));
        }
    }
}
