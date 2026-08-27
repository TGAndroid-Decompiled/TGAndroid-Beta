package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u00;

public class ANRDetector implements t00 {
    private static final int MSG_UI_PING = 1;
    private static final long TIMEOUT_MS = 5000;
    private final Runnable anrDetected;
    private volatile boolean anrReported;
    private volatile boolean destroyed;
    private final Thread detectorThread;
    private volatile boolean foreground;
    private volatile int generation;
    private int nextPingId;
    private final Object lock = new Object();
    private volatile int acknowledgedPingId = -1;
    private final Handler mainHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            ANRDetector.this.acknowledgedPingId = message.arg1;
            ANRDetector.this.anrReported = false;
        }
    };

    public ANRDetector(Runnable runnable) {
        this.anrDetected = runnable;
        u00 u00Var = u00.getInstance();
        this.foreground = u00Var.isForeground();
        u00Var.addListener(this);
        Thread thread = new Thread(new d1(this, 11), "ANRDetector");
        this.detectorThread = thread;
        thread.start();
    }

    public void run() {
        while (true) {
            synchronized (this.lock) {
                while (!this.foreground && !this.destroyed) {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.destroyed) {
                    return;
                }
                int i10 = this.generation;
                int i11 = this.nextPingId + 1;
                this.nextPingId = i11;
                this.mainHandler.obtainMessage(1, i11, i10).sendToTarget();
                try {
                    Thread.sleep(5000L);
                    if (this.destroyed) {
                        return;
                    }
                    if (this.foreground && this.generation == i10 && this.acknowledgedPingId != i11 && !this.anrReported) {
                        this.anrReported = true;
                        try {
                            this.anrDetected.run();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public void destroy() {
        synchronized (this.lock) {
            try {
                if (this.destroyed) {
                    return;
                }
                this.destroyed = true;
                this.foreground = false;
                this.generation++;
                this.lock.notifyAll();
                u00.getInstance().removeListener(this);
                this.mainHandler.removeMessages(1);
                this.detectorThread.interrupt();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void onBecameBackground() {
        synchronized (this.lock) {
            try {
                if (this.destroyed) {
                    return;
                }
                this.generation++;
                this.foreground = false;
                this.mainHandler.removeMessages(1);
                this.detectorThread.interrupt();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void onBecameForeground() {
        synchronized (this.lock) {
            try {
                if (this.destroyed) {
                    return;
                }
                this.generation++;
                this.foreground = true;
                this.anrReported = false;
                this.lock.notifyAll();
                this.detectorThread.interrupt();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
