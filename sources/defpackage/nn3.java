package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class nn3 extends CharacterStyle implements UpdateAppearance {
    public final long a;
    public long b;
    public final int c;
    public final int d;
    public boolean e;

    public nn3(long j, int i, int i2) {
        this.a = j;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int f = bm2.f(qn3.b(Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - this.a)) / 750.0f))), this.c, this.d);
        textPaint.setColor(f);
        long j = this.b;
        if (j > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - j)) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(f) * oo1.v(max, max, max, 1.0f)));
        }
    }
}
