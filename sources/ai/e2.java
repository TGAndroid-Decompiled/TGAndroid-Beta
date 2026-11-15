package ai;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class e2 extends CharacterStyle implements UpdateAppearance {
    public final long f1190a;
    public long f1191b;
    public final int f1192c;
    public final int d;
    public boolean f1193e;

    public e2(long j3, int i7, int i10) {
        this.f1190a = j3;
        this.f1192c = i7;
        this.d = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int f10 = i0.a.f(h2.b(Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - this.f1190a)) / 750.0f))), this.f1192c, this.d);
        textPaint.setColor(f10);
        long j3 = this.f1191b;
        if (j3 > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - j3)) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(f10) * org.telegram.ui.Cells.y0.x(max, max, max, 1.0f)));
        }
    }
}
