package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
public class DispatchQueueMainThreadSync extends Thread {
    private static int indexPointer;
    private volatile Handler handler;
    public final int index;
    private boolean isRecycled;
    private boolean isRunning;
    private long lastTaskTime;
    private ArrayList<PostponedTask> postponedTasks;

    public DispatchQueueMainThreadSync(String str) {
        this(str, true);
    }

    private void checkThread() {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            Thread.currentThread();
            ApplicationLoader.applicationHandler.getLooper().getThread();
        }
    }

    public void lambda$recycle$0() {
        this.handler.getLooper().quit();
    }

    public boolean lambda$run$1(Message message) {
        handleMessage(message);
        return true;
    }

    public void cancelRunnable(Runnable runnable) {
        checkThread();
        if (this.isRunning) {
            this.handler.removeCallbacks(runnable);
            return;
        }
        int i10 = 0;
        while (i10 < this.postponedTasks.size()) {
            if (this.postponedTasks.get(i10).runnable == runnable) {
                this.postponedTasks.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public void cancelRunnables(Runnable[] runnableArr) {
        checkThread();
        for (Runnable runnable : runnableArr) {
            cancelRunnable(runnable);
        }
    }

    public void cleanupQueue() {
        checkThread();
        this.postponedTasks.clear();
        this.handler.removeCallbacksAndMessages(null);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public boolean isReady() {
        return this.isRunning;
    }

    public boolean postRunnable(Runnable runnable) {
        checkThread();
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public void recycle() {
        checkThread();
        postRunnable(new d1(this, 18));
        this.isRecycled = true;
    }

    @Override
    public void run() {
        Looper.prepare();
        this.handler = new Handler(Looper.myLooper(), new y1(this, 1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            {
                DispatchQueueMainThreadSync.this = this;
            }

            @Override
            public void run() {
                DispatchQueueMainThreadSync.this.isRunning = true;
                for (int i10 = 0; i10 < DispatchQueueMainThreadSync.this.postponedTasks.size(); i10++) {
                    ((PostponedTask) DispatchQueueMainThreadSync.this.postponedTasks.get(i10)).run();
                }
                DispatchQueueMainThreadSync.this.postponedTasks.clear();
            }
        });
        Looper.loop();
    }

    public void sendMessage(Message message, int i10) {
        checkThread();
        if (this.isRecycled) {
            return;
        }
        if (!this.isRunning) {
            this.postponedTasks.add(new PostponedTask(message, i10));
        } else if (i10 <= 0) {
            this.handler.sendMessage(message);
        } else {
            this.handler.sendMessageDelayed(message, i10);
        }
    }

    public DispatchQueueMainThreadSync(String str, boolean z10) {
        this.handler = null;
        int i10 = indexPointer;
        indexPointer = i10 + 1;
        this.index = i10;
        this.postponedTasks = new ArrayList<>();
        setName(str);
        if (z10) {
            start();
        }
    }

    public class PostponedTask {
        long delay;
        Message message;
        Runnable runnable;

        public PostponedTask(Message message, int i10) {
            DispatchQueueMainThreadSync.this = r1;
            this.message = message;
            this.delay = i10;
        }

        public void run() {
            Runnable runnable = this.runnable;
            if (runnable != null) {
                DispatchQueueMainThreadSync.this.postRunnable(runnable, this.delay);
            } else {
                DispatchQueueMainThreadSync.this.sendMessage(this.message, (int) this.delay);
            }
        }

        public PostponedTask(Runnable runnable, long j10) {
            DispatchQueueMainThreadSync.this = r1;
            this.runnable = runnable;
            this.delay = j10;
        }
    }

    public boolean postRunnable(Runnable runnable, long j10) {
        checkThread();
        if (this.isRecycled) {
            return false;
        }
        if (!this.isRunning) {
            this.postponedTasks.add(new PostponedTask(runnable, j10));
            return true;
        } else if (j10 <= 0) {
            return this.handler.post(runnable);
        } else {
            return this.handler.postDelayed(runnable, j10);
        }
    }

    public void handleMessage(Message message) {
    }
}
