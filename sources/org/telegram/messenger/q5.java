package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
public class q5 extends Thread {
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    public final int index;
    private long lastTaskTime;
    private int threadPriority;
    private volatile Handler handler = null;
    private CountDownLatch syncLatch = new CountDownLatch(1);

    public q5(String str, boolean z9) {
        int i7 = indexPointer;
        indexPointer = i7 + 1;
        this.index = i7;
        this.threadPriority = -1000;
        setName(str);
        if (z9) {
            start();
        }
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e10) {
            a8.g(e10, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e10) {
            a8.g(e10, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e10) {
            a8.g(e10, false);
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
            a8.g(e10, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new n5(this, 0));
        this.syncLatch.countDown();
        int i7 = this.threadPriority;
        if (i7 != -1000) {
            Process.setThreadPriority(i7);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i7) {
        try {
            this.syncLatch.await();
            if (i7 <= 0) {
                this.handler.sendMessage(message);
            } else {
                this.handler.sendMessageDelayed(message, i7);
            }
        } catch (Exception unused) {
        }
    }

    public boolean postRunnable(Runnable runnable, long j3) {
        try {
            this.syncLatch.await();
        } catch (Exception e10) {
            a8.g(e10, false);
        }
        if (j3 <= 0) {
            return this.handler.post(runnable);
        }
        return this.handler.postDelayed(runnable, j3);
    }

    public q5(String str, int i7) {
        int i10 = indexPointer;
        indexPointer = i10 + 1;
        this.index = i10;
        this.threadPriority = i7;
        setName(str);
        start();
    }

    public void handleMessage(Message message) {
    }
}
