package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
public class s5 extends Thread {
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    public final int index;
    private long lastTaskTime;
    private int threadPriority;
    private volatile Handler handler = null;
    private CountDownLatch syncLatch = new CountDownLatch(1);

    public s5(String str, boolean z10) {
        int i10 = indexPointer;
        indexPointer = i10 + 1;
        this.index = i10;
        this.threadPriority = -1000;
        setName(str);
        if (z10) {
            start();
        }
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e) {
            f8.g(e, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e) {
            f8.g(e, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e) {
            f8.g(e, false);
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public boolean isReady() {
        if (this.syncLatch.getCount() == 0) {
            return true;
        }
        return false;
    }

    public boolean postRunnable(Runnable runnable) {
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public boolean postToFrontRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            f8.g(e, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new p5(this, 0));
        this.syncLatch.countDown();
        int i10 = this.threadPriority;
        if (i10 != -1000) {
            Process.setThreadPriority(i10);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i10) {
        try {
            this.syncLatch.await();
            if (i10 <= 0) {
                this.handler.sendMessage(message);
            } else {
                this.handler.sendMessageDelayed(message, i10);
            }
        } catch (Exception unused) {
        }
    }

    public boolean postRunnable(Runnable runnable, long j10) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            f8.g(e, false);
        }
        if (j10 <= 0) {
            return this.handler.post(runnable);
        }
        return this.handler.postDelayed(runnable, j10);
    }

    public s5(String str, int i10) {
        int i11 = indexPointer;
        indexPointer = i11 + 1;
        this.index = i11;
        this.threadPriority = i10;
        setName(str);
        start();
    }

    public void handleMessage(Message message) {
    }
}
