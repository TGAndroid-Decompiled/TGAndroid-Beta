package org.telegram.messenger.pip.utils;

import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.core.math.MathUtils;
import org.telegram.messenger.ApplicationLoader;

public class PipDuration {
    private int count;
    private long estimated;
    private final SharedPreferences mPrefs;
    private long start;

    public PipDuration(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_" + str, 0);
        this.mPrefs = sharedPreferences;
        this.estimated = sharedPreferences.getLong("estimated", 400L);
        this.count = sharedPreferences.getInt("count", 0);
    }

    public void start() {
        this.start = SystemClock.uptimeMillis();
    }

    public long estimated() {
        return this.estimated;
    }

    public float progress() {
        if (this.estimated > 0) {
            return MathUtils.clamp((SystemClock.uptimeMillis() - this.start) / this.estimated, 0.0f, 1.0f);
        }
        return 0.5f;
    }

    public boolean isStarted() {
        return this.start != 0;
    }

    public long end() {
        if (this.start == 0) {
            return 0L;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.start;
        int iClamp = MathUtils.clamp(this.count, 0, 9);
        this.estimated = ((this.estimated * ((long) iClamp)) / 10) + ((((long) (10 - iClamp)) * jUptimeMillis) / 10);
        this.start = 0L;
        this.count++;
        this.mPrefs.edit().putLong("estimated", this.estimated).putInt("count", this.count).apply();
        return jUptimeMillis;
    }
}
