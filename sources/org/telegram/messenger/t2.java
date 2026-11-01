package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
public enum t2 {
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
    
    public final long[] f18201a;
    public final int[] f18202b;
    public final long[] f18203c;
    public Object d;

    t2(long[] jArr, int[] iArr, long[] jArr2) {
        this.f18201a = jArr;
        this.f18202b = iArr;
        this.f18203c = jArr2;
    }

    public final void a() {
        int i10 = Build.VERSION.SDK_INT;
        long[] jArr = this.f18203c;
        if (i10 >= 26) {
            Vibrator p12 = i0.p1();
            if (this.d == null) {
                if (!i0.p1().hasAmplitudeControl()) {
                    this.d = VibrationEffect.createWaveform(jArr, -1);
                } else {
                    this.d = VibrationEffect.createWaveform(this.f18201a, this.f18202b, -1);
                }
            }
            p12.vibrate((VibrationEffect) this.d);
            return;
        }
        i0.p1().vibrate(jArr, -1);
    }
}
