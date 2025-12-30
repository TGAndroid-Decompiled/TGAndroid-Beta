package org.telegram.messenger.utils;

import org.telegram.messenger.AndroidUtilities;

public class CountdownTimer {
    private final Callback callback;
    private final Runnable doUpdate = new Runnable() {
        @Override
        public final void run() {
            this.f$0.update();
        }
    };
    private boolean isRunning;
    private long seconds;

    public interface Callback {
        void onTimerUpdate(long j);
    }

    public CountdownTimer(Callback callback) {
        this.callback = callback;
    }

    public void start(long j) {
        if (this.isRunning && this.seconds == j) {
            return;
        }
        this.seconds = j;
        if (j <= 0) {
            stop();
            return;
        }
        this.isRunning = true;
        AndroidUtilities.cancelRunOnUIThread(this.doUpdate);
        AndroidUtilities.runOnUIThread(this.doUpdate, 1000L);
    }

    public void stop() {
        this.isRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.doUpdate);
    }

    public void update() {
        long j = this.seconds;
        if (j > 0) {
            long j2 = j - 1;
            this.seconds = j2;
            this.callback.onTimerUpdate(j2);
        }
        if (this.seconds <= 0) {
            this.isRunning = false;
        }
        if (this.isRunning) {
            AndroidUtilities.runOnUIThread(this.doUpdate, 1000L);
        }
    }
}
