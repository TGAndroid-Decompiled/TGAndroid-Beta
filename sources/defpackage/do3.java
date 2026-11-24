package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
public class do3 extends Thread {
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    public final int index;
    private long lastTaskTime;
    private int threadPriority;
    private volatile Handler handler = null;
    private CountDownLatch syncLatch = new CountDownLatch(1);

    public do3(String str, boolean z) {
        int i = indexPointer;
        indexPointer = i + 1;
        this.index = i;
        this.threadPriority = -1000;
        setName(str);
        if (z) {
            start();
        }
    }

    public void cancelRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacks(runnable);
        } catch (Exception e) {
            fa4.g(e, false);
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnableArr) {
                this.handler.removeCallbacks(runnable);
            }
        } catch (Exception e) {
            fa4.g(e, false);
        }
    }

    public void cleanupQueue() {
        try {
            this.syncLatch.await();
            this.handler.removeCallbacksAndMessages(null);
        } catch (Exception e) {
            fa4.g(e, false);
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

    public boolean postRunnable(Runnable runnable, long j) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            fa4.g(e, false);
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        Handler handler = this.handler;
        if (i <= 0) {
            return handler.post(runnable);
        }
        return handler.postDelayed(runnable, j);
    }

    public boolean postToFrontRunnable(Runnable runnable) {
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            fa4.g(e, false);
        }
        return this.handler.postAtFrontOfQueue(runnable);
    }

    public void recycle() {
        this.handler.getLooper().quit();
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new zn3(this, (byte) 0));
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
            Handler handler = this.handler;
            if (i <= 0) {
                handler.sendMessage(message);
            } else {
                handler.sendMessageDelayed(message, i);
            }
        } catch (Exception unused) {
        }
    }

    public void handleMessage(Message message) {
    }

    public boolean postRunnable(Runnable runnable) {
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public do3(String str, int i) {
        int i2 = indexPointer;
        indexPointer = i2 + 1;
        this.index = i2;
        this.threadPriority = i;
        setName(str);
        start();
    }
}
