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

    public DispatchQueue(String str, boolean z) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i = indexPointer;
        indexPointer = i + 1;
        this.index = i;
        this.threadPriority = -1000;
        setName(str);
        if (z) {
            start();
        }
    }

    public DispatchQueue(String str, boolean z, int i) {
        this.handler = null;
        this.syncLatch = new CountDownLatch(1);
        int i2 = indexPointer;
        indexPointer = i2 + 1;
        this.index = i2;
        this.threadPriority = i;
        setName(str);
        if (z) {
            start();
        }
    }

    public boolean lambda$run$0(Message message) {
        handleMessage(message);
        return true;
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public void handleMessage(Message message) {
    }

    public boolean isReady() {
        return this.syncLatch.getCount() == 0;
    }

    public boolean postRunnable(Runnable runnable) {
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public boolean postRunnable(Runnable runnable, long j) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        return j <= 0 ? this.handler.post(runnable) : this.handler.postDelayed(runnable, j);
    }

    public boolean postToFrontRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                boolean lambda$run$0;
                lambda$run$0 = DispatchQueue.this.lambda$run$0(message);
                return lambda$run$0;
            }
        });
        this.syncLatch.countDown();
        int i = this.threadPriority;
        if (i != -1000) {
            Process.setThreadPriority(i);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i) {
        try {
            this.syncLatch.await();
            if (i <= 0) {
                this.handler.sendMessage(message);
            } else {
                this.handler.sendMessageDelayed(message, i);
            }
        } catch (Exception unused) {
        }
    }
}
