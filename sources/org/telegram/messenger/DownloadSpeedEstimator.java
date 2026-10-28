package org.telegram.messenger;

import android.os.SystemClock;
public class DownloadSpeedEstimator {
    private static final long MAX_AGE_MS = 60000;
    private static double bitrate;
    private static long updatedAt;

    public static synchronized long getBitrate() {
        synchronized (DownloadSpeedEstimator.class) {
            if (updatedAt != 0 && SystemClock.elapsedRealtime() - updatedAt <= 60000) {
                return (long) bitrate;
            }
            return y2.f.c(ApplicationLoader.applicationContext).a();
        }
    }

    public static boolean isFast() {
        if (getBitrate() >= 3000000) {
            return true;
        }
        return false;
    }

    public static synchronized void onSample(long j10, long j11) {
        synchronized (DownloadSpeedEstimator.class) {
            if (j10 > 0 && j11 > 0) {
                double d = (j10 * 1000.0d) / j11;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j12 = updatedAt;
                    if (j12 != 0 && elapsedRealtime - j12 <= 60000) {
                        d = (d * 0.3d) + (bitrate * 0.7d);
                    }
                    bitrate = d;
                    updatedAt = elapsedRealtime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
