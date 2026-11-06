package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
public enum p2 {
    IMPACT_LIGHT(new long[]{7}, new int[]{65}, new long[]{60}),
    IMPACT_MEDIUM(new long[]{7}, new int[]{145}, new long[]{70}),
    IMPACT_HEAVY(new long[]{7}, new int[]{255}, new long[]{80}),
    IMPACT_RIGID(new long[]{3}, new int[]{225}, new long[]{50}),
    IMPACT_SOFT(new long[]{10}, new int[]{175}, new long[]{55}),
    NOTIFICATION_ERROR(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{200, 0, 200, 0, 255, 0, 145}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    NOTIFICATION_SUCCESS(new long[]{14, 65, 14}, new int[]{175, 0, 255}, new long[]{50, 60, 65}),
    NOTIFICATION_WARNING(new long[]{14, 64, 14}, new int[]{225, 0, 175}, new long[]{65, 60, 40}),
    SELECTION_CHANGE(new long[]{1}, new int[]{65}, new long[]{30}),
    APP_ERROR(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});
    
    public final long[] f24505a;
    public final int[] f24506b;
    public final long[] f24507c;
    public Object d;

    p2(long[] jArr, int[] iArr, long[] jArr2) {
        this.f24505a = jArr;
        this.f24506b = iArr;
        this.f24507c = jArr2;
    }

    public final void a() {
        int i7 = Build.VERSION.SDK_INT;
        long[] jArr = this.f24507c;
        if (i7 >= 26) {
            Vibrator p12 = g0.p1();
            if (this.d == null) {
                if (!g0.p1().hasAmplitudeControl()) {
                    this.d = VibrationEffect.createWaveform(jArr, -1);
                } else {
                    this.d = VibrationEffect.createWaveform(this.f24505a, this.f24506b, -1);
                }
            }
            p12.vibrate((VibrationEffect) this.d);
            return;
        }
        g0.p1().vibrate(jArr, -1);
    }
}
