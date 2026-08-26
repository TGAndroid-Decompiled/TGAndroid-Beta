package org.telegram.messenger.utils;

import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import org.telegram.messenger.AndroidUtilities;

public final class CountdownTimer {
    public final Callback callback;
    public final ComponentDialog$$ExternalSyntheticLambda1 doUpdate = new ComponentDialog$$ExternalSyntheticLambda1(this, 25);
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
        ComponentDialog$$ExternalSyntheticLambda1 componentDialog$$ExternalSyntheticLambda1 = this.doUpdate;
        if (j <= 0) {
            this.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(componentDialog$$ExternalSyntheticLambda1);
        } else {
            this.isRunning = true;
            AndroidUtilities.cancelRunOnUIThread(componentDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(componentDialog$$ExternalSyntheticLambda1, 1000L);
        }
    }
}
