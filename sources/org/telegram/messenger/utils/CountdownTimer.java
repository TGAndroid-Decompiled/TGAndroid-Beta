package org.telegram.messenger.utils;

import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;

public final class CountdownTimer {
    public final Callback callback;
    public final ActivityCompat$$ExternalSyntheticLambda0 doUpdate = new ActivityCompat$$ExternalSyntheticLambda0(this, 24);
    public boolean isRunning;
    public long seconds;

    public interface Callback {
        void onTimerUpdate(long j);
    }

    public CountdownTimer(Callback callback) {
        this.callback = callback;
    }

    public final void start(long j) {
        if (this.isRunning && this.seconds == j) {
            return;
        }
        this.seconds = j;
        ActivityCompat$$ExternalSyntheticLambda0 activityCompat$$ExternalSyntheticLambda0 = this.doUpdate;
        if (j <= 0) {
            this.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(activityCompat$$ExternalSyntheticLambda0);
        } else {
            this.isRunning = true;
            AndroidUtilities.cancelRunOnUIThread(activityCompat$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(activityCompat$$ExternalSyntheticLambda0, 1000L);
        }
    }
}
