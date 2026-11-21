package ai;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
public final class g2 extends CharacterStyle implements UpdateAppearance {
    public final long f1208a;
    public long f1209b;
    public final int f1210c;
    public final int d;
    public boolean f1211e;

    public g2(long j3, int i7, int i10) {
        this.f1208a = j3;
        this.f1210c = i7;
        this.d = i10;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        int f10 = i0.a.f(j2.b(Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - this.f1208a)) / 750.0f))), this.f1210c, this.d);
        textPaint.setColor(f10);
        long j3 = this.f1209b;
        if (j3 > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, ((float) (uptimeMillis - j3)) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(f10) * org.telegram.ui.Cells.c0.z(max, max, max, 1.0f)));
        }
    }
}
