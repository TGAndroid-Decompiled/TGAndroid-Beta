package org.telegram.messenger.pip.utils;

import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.core.math.MathUtils;
import org.telegram.messenger.ApplicationLoader;

public final class PipDuration {
    public int count;
    public long estimated;
    public final SharedPreferences mPrefs;
    public long start;

    public PipDuration(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.mPrefs = sharedPreferences;
        this.estimated = sharedPreferences.getLong("estimated", 400L);
        this.count = sharedPreferences.getInt("count", 0);
    }

    public final void end() {
        if (this.start == 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.start;
        int iClamp = MathUtils.clamp(this.count, 0, 9);
        this.estimated = ((jUptimeMillis * ((long) (10 - iClamp))) / 10) + ((this.estimated * ((long) iClamp)) / 10);
        this.start = 0L;
        this.count++;
        this.mPrefs.edit().putLong("estimated", this.estimated).putInt("count", this.count).apply();
    }
}
