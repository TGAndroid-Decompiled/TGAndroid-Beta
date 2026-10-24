package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
public class DispatchQueue2 extends Thread {
    private static final int PENDING_FRONT_RUNNABLE = 1;
    private static final int PENDING_MESSAGE = 2;
    private static final int PENDING_RUNNABLE = 0;
    private static final int THREAD_PRIORITY_DEFAULT = -1000;
    private static int indexPointer;
    private volatile Handler handler;
    public final int index;
    private volatile long lastTaskTime;
    private final Object lock;
    private ArrayList<Pending> pending;
    private boolean quitRequested;
    private final CountDownLatch readyLatch;
    private final int threadPriority;

    public static class Pending {
        final Message message;
        final Runnable runnable;
        final int type;
        final long uptime;

        public Pending(int i10, Runnable runnable, Message message, long j10) {
            this.type = i10;
            this.runnable = runnable;
            this.message = message;
            this.uptime = j10;
        }
    }

    public DispatchQueue2(String str) {
        this(str, true, -1000);
    }

    public boolean lambda$run$0(Message message) {
        handleMessage(message);
        return true;
    }

    public void cancelRunnable(Runnable runnable) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(runnable);
            return;
        }
        synchronized (this.lock) {
            try {
                ArrayList<Pending> arrayList = this.pending;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.pending.get(size).runnable == runnable) {
                            this.pending.remove(size);
                        }
                    }
                    return;
                }
                this.handler.removeCallbacks(runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        for (Runnable runnable : runnableArr) {
            cancelRunnable(runnable);
        }
    }

    public void cleanupQueue() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            return;
        }
        synchronized (this.lock) {
            try {
                ArrayList<Pending> arrayList = this.pending;
                if (arrayList != null) {
                    arrayList.clear();
                } else {
                    this.handler.removeCallbacksAndMessages(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Handler getHandlerSync() {
        try {
            this.readyLatch.await();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
        return this.handler;
    }

    public long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public boolean isReady() {
        if (this.handler != null) {
            return true;
        }
        return false;
    }

    public boolean postRunnable(Runnable runnable) {
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public boolean postToFrontRunnable(Runnable runnable) {
        Handler handler = this.handler;
        if (handler != null) {
            return handler.postAtFrontOfQueue(runnable);
        }
        synchronized (this.lock) {
            try {
                ArrayList<Pending> arrayList = this.pending;
                if (arrayList != null) {
                    arrayList.add(new Pending(1, runnable, null, 0L));
                    return true;
                }
                return this.handler.postAtFrontOfQueue(runnable);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void recycle() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.getLooper().quit();
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.pending != null) {
                    this.quitRequested = true;
                } else {
                    this.handler.getLooper().quit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void run() {
        boolean z10;
        Looper.prepare();
        Handler handler = new Handler(Looper.myLooper(), new b2(this, 1));
        synchronized (this.lock) {
            for (int i10 = 0; i10 < this.pending.size(); i10++) {
                try {
                    Pending pending = this.pending.get(i10);
                    int i11 = pending.type;
                    if (i11 == 0) {
                        handler.postAtTime(pending.runnable, pending.uptime);
                    } else if (i11 == 1) {
                        handler.postAtFrontOfQueue(pending.runnable);
                    } else {
                        handler.sendMessageAtTime(pending.message, pending.uptime);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.pending = null;
            z10 = this.quitRequested;
            this.handler = handler;
        }
        this.readyLatch.countDown();
        if (z10) {
            Looper.myLooper().quit();
        }
        int i12 = this.threadPriority;
        if (i12 != -1000) {
            Process.setThreadPriority(i12);
        }
        Looper.loop();
    }

    public void sendMessage(Message message, int i10) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessageDelayed(message, Math.max(0, i10));
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + Math.max(0, i10);
        synchronized (this.lock) {
            try {
                ArrayList<Pending> arrayList = this.pending;
                if (arrayList != null) {
                    arrayList.add(new Pending(2, null, message, uptimeMillis));
                } else {
                    this.handler.sendMessageAtTime(message, uptimeMillis);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public DispatchQueue2(String str, boolean z10) {
        this(str, z10, -1000);
    }

    public DispatchQueue2(String str, boolean z10, int i10) {
        int i11 = indexPointer;
        indexPointer = i11 + 1;
        this.index = i11;
        this.lock = new Object();
        this.pending = new ArrayList<>();
        this.readyLatch = new CountDownLatch(1);
        this.threadPriority = i10;
        setName(str);
        if (z10) {
            start();
        }
    }

    public boolean postRunnable(Runnable runnable, long j10) {
        Handler handler = this.handler;
        if (handler != null) {
            return j10 <= 0 ? handler.post(runnable) : handler.postDelayed(runnable, j10);
        }
        long max = Math.max(0L, j10) + SystemClock.uptimeMillis();
        synchronized (this.lock) {
            try {
                ArrayList<Pending> arrayList = this.pending;
                if (arrayList != null) {
                    arrayList.add(new Pending(0, runnable, null, max));
                    return true;
                }
                return this.handler.postAtTime(runnable, max);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void handleMessage(Message message) {
    }
}
