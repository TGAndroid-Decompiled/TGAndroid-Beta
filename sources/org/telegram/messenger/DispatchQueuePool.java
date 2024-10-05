package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.LinkedList;

public class DispatchQueuePool {
    private boolean cleanupScheduled;
    private int createdCount;
    private int maxCount;
    private int totalTasksCount;
    private LinkedList<DispatchQueue> queues = new LinkedList<>();
    private SparseIntArray busyQueuesMap = new SparseIntArray();
    private LinkedList<DispatchQueue> busyQueues = new LinkedList<>();
    private Runnable cleanupRunnable = new Runnable() {
        @Override
        public void run() {
            if (!DispatchQueuePool.this.queues.isEmpty()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int size = DispatchQueuePool.this.queues.size();
                int i = 0;
                while (i < size) {
                    DispatchQueue dispatchQueue = (DispatchQueue) DispatchQueuePool.this.queues.get(i);
                    if (dispatchQueue.getLastTaskTime() < elapsedRealtime - 30000) {
                        dispatchQueue.recycle();
                        DispatchQueuePool.this.queues.remove(i);
                        DispatchQueuePool.access$110(DispatchQueuePool.this);
                        i--;
                        size--;
                    }
                    i++;
                }
            }
            if (DispatchQueuePool.this.queues.isEmpty() && DispatchQueuePool.this.busyQueues.isEmpty()) {
                DispatchQueuePool.this.cleanupScheduled = false;
            } else {
                AndroidUtilities.runOnUIThread(this, 30000L);
                DispatchQueuePool.this.cleanupScheduled = true;
            }
        }
    };
    private int guid = Utilities.random.nextInt();

    public DispatchQueuePool(int i) {
        this.maxCount = i;
    }

    static int access$110(DispatchQueuePool dispatchQueuePool) {
        int i = dispatchQueuePool.createdCount;
        dispatchQueuePool.createdCount = i - 1;
        return i;
    }

    public void lambda$execute$0(DispatchQueue dispatchQueue) {
        this.totalTasksCount--;
        int i = this.busyQueuesMap.get(dispatchQueue.index) - 1;
        if (i != 0) {
            this.busyQueuesMap.put(dispatchQueue.index, i);
            return;
        }
        this.busyQueuesMap.delete(dispatchQueue.index);
        this.busyQueues.remove(dispatchQueue);
        this.queues.add(dispatchQueue);
    }

    public void lambda$execute$1(Runnable runnable, final DispatchQueue dispatchQueue) {
        runnable.run();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DispatchQueuePool.this.lambda$execute$0(dispatchQueue);
            }
        });
    }

    public void execute(final java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.DispatchQueuePool.execute(java.lang.Runnable):void");
    }
}
