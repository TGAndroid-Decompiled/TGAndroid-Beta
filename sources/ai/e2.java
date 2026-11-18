package ai;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e2 extends CharacterStyle implements UpdateAppearance {
    public final long f1187a;
    public long f1188b;
    public final int f1189c;
    public final int d;
    public boolean f1190e;

    public e2(long j3, int i7, int i10) {
        this.f1187a = j3;
        this.f1189c = i7;
        this.d = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int f10 = i0.a.f(h2.b(Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - this.f1187a)) / 750.0f))), this.f1189c, this.d);
        textPaint.setColor(f10);
        long j3 = this.f1188b;
        if (j3 > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - j3)) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(f10) * org.telegram.ui.Cells.c0.z(max, max, max, 1.0f)));
        }
    }
}
