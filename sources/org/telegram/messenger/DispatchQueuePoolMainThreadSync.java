package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.LinkedList;

public class DispatchQueuePoolMainThreadSync {
    private boolean cleanupScheduled;
    private int createdCount;
    private int maxCount;
    private int totalTasksCount;
    private LinkedList<DispatchQueueMainThreadSync> queues = new LinkedList<>();
    private SparseIntArray busyQueuesMap = new SparseIntArray();
    private LinkedList<DispatchQueueMainThreadSync> busyQueues = new LinkedList<>();
    private Runnable cleanupRunnable = new Runnable() {
        @Override
        public void run() {
            if (!DispatchQueuePoolMainThreadSync.this.queues.isEmpty()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int size = DispatchQueuePoolMainThreadSync.this.queues.size();
                int i = 0;
                while (i < size) {
                    DispatchQueueMainThreadSync dispatchQueueMainThreadSync = (DispatchQueueMainThreadSync) DispatchQueuePoolMainThreadSync.this.queues.get(i);
                    if (dispatchQueueMainThreadSync.getLastTaskTime() < elapsedRealtime - 30000) {
                        dispatchQueueMainThreadSync.recycle();
                        DispatchQueuePoolMainThreadSync.this.queues.remove(i);
                        DispatchQueuePoolMainThreadSync.access$110(DispatchQueuePoolMainThreadSync.this);
                        i--;
                        size--;
                    }
                    i++;
                }
            }
            if (!DispatchQueuePoolMainThreadSync.this.queues.isEmpty() || !DispatchQueuePoolMainThreadSync.this.busyQueues.isEmpty()) {
                AndroidUtilities.runOnUIThread(this, 30000L);
                DispatchQueuePoolMainThreadSync.this.cleanupScheduled = true;
                return;
            }
            DispatchQueuePoolMainThreadSync.this.cleanupScheduled = false;
        }
    };
    private int guid = Utilities.random.nextInt();

    static int access$110(DispatchQueuePoolMainThreadSync dispatchQueuePoolMainThreadSync) {
        int i = dispatchQueuePoolMainThreadSync.createdCount;
        dispatchQueuePoolMainThreadSync.createdCount = i - 1;
        return i;
    }

    public DispatchQueuePoolMainThreadSync(int i) {
        this.maxCount = i;
    }

    public void execute(final Runnable runnable) {
        final DispatchQueueMainThreadSync dispatchQueueMainThreadSync;
        if (!this.busyQueues.isEmpty() && (this.totalTasksCount / 2 <= this.busyQueues.size() || (this.queues.isEmpty() && this.createdCount >= this.maxCount))) {
            dispatchQueueMainThreadSync = this.busyQueues.remove(0);
        } else if (this.queues.isEmpty()) {
            dispatchQueueMainThreadSync = new DispatchQueueMainThreadSync("DispatchQueuePool" + this.guid + "_" + Utilities.random.nextInt());
            dispatchQueueMainThreadSync.setPriority(10);
            this.createdCount = this.createdCount + 1;
        } else {
            dispatchQueueMainThreadSync = this.queues.remove(0);
        }
        if (!this.cleanupScheduled) {
            AndroidUtilities.runOnUIThread(this.cleanupRunnable, 30000L);
            this.cleanupScheduled = true;
        }
        this.totalTasksCount++;
        this.busyQueues.add(dispatchQueueMainThreadSync);
        this.busyQueuesMap.put(dispatchQueueMainThreadSync.index, this.busyQueuesMap.get(dispatchQueueMainThreadSync.index, 0) + 1);
        dispatchQueueMainThreadSync.postRunnable(new Runnable() {
            @Override
            public final void run() {
                DispatchQueuePoolMainThreadSync.this.lambda$execute$1(runnable, dispatchQueueMainThreadSync);
            }
        });
    }

    public void lambda$execute$1(Runnable runnable, final DispatchQueueMainThreadSync dispatchQueueMainThreadSync) {
        runnable.run();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DispatchQueuePoolMainThreadSync.this.lambda$execute$0(dispatchQueueMainThreadSync);
            }
        });
    }

    public void lambda$execute$0(DispatchQueueMainThreadSync dispatchQueueMainThreadSync) {
        this.totalTasksCount--;
        int i = this.busyQueuesMap.get(dispatchQueueMainThreadSync.index) - 1;
        if (i == 0) {
            this.busyQueuesMap.delete(dispatchQueueMainThreadSync.index);
            this.busyQueues.remove(dispatchQueueMainThreadSync);
            this.queues.add(dispatchQueueMainThreadSync);
            return;
        }
        this.busyQueuesMap.put(dispatchQueueMainThreadSync.index, i);
    }
}
