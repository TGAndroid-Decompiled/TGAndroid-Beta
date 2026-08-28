package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
public class DispatchQueue extends Thread {
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    private volatile Handler handler;
    public final int index;
    private long lastTaskTime;
    private CountDownLatch syncLatch;
    private int threadPriority;

    public DispatchQueue(String str) {
        this(str, true);
    }

    public boolean lambda$run$0(Message message) {
        handleMessage(message);
        return true;
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
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
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new y1(this, 0));
        this.syncLatch.countDown();
        int i9 = this.threadPriority;
        if (i9 != -1000) {
            Process.setThreadPriority(i9);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i9) {
        try {
            this.syncLatch.await();
            if (i9 <= 0) {
                this.handler.sendMessage(message);
            } else {
                this.handler.sendMessageDelayed(message, i9);
            }
        } catch (Exception unused) {
        }
    }

    public DispatchQueue(String str, boolean z10) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i9 = indexPointer;
        indexPointer = i9 + 1;
        this.index = i9;
        this.threadPriority = -1000;
        setName(str);
        if (z10) {
            start();
        }
    }

    public boolean postRunnable(Runnable runnable, long j10) {
        try {
            this.syncLatch.await();
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
        if (j10 <= 0) {
            return this.handler.post(runnable);
        }
        return this.handler.postDelayed(runnable, j10);
    }

    public DispatchQueue(String str, boolean z10, int i9) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i10 = indexPointer;
        indexPointer = i10 + 1;
        this.index = i10;
        this.threadPriority = i9;
        setName(str);
        if (z10) {
            start();
        }
    }

    public void handleMessage(Message message) {
    }
}
