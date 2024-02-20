package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.LinkedList;
import org.telegram.ui.Components.Reactions.HwEmojis;
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
                return;
            }
            AndroidUtilities.runOnUIThread(this, 30000L);
            DispatchQueuePool.this.cleanupScheduled = true;
        }
    };
    private int guid = Utilities.random.nextInt();

    static int access$110(DispatchQueuePool dispatchQueuePool) {
        int i = dispatchQueuePool.createdCount;
        dispatchQueuePool.createdCount = i - 1;
        return i;
    }

    public DispatchQueuePool(int i) {
        this.maxCount = i;
    }

    public void execute(final Runnable runnable) {
        final DispatchQueue remove;
        if (!this.busyQueues.isEmpty() && (this.totalTasksCount / 2 <= this.busyQueues.size() || (this.queues.isEmpty() && this.createdCount >= this.maxCount))) {
            remove = this.busyQueues.remove(0);
        } else if (this.queues.isEmpty()) {
            remove = new DispatchQueue("DispatchQueuePool" + this.guid + "_" + Utilities.random.nextInt());
            remove.setPriority(10);
            this.createdCount = this.createdCount + 1;
        } else {
            remove = this.queues.remove(0);
        }
        if (!this.cleanupScheduled) {
            AndroidUtilities.runOnUIThread(this.cleanupRunnable, 30000L);
            this.cleanupScheduled = true;
        }
        this.totalTasksCount++;
        this.busyQueues.add(remove);
        this.busyQueuesMap.put(remove.index, this.busyQueuesMap.get(remove.index, 0) + 1);
        if (HwEmojis.isHwEnabled()) {
            remove.setPriority(1);
        } else if (remove.getPriority() != 10) {
            remove.setPriority(10);
        }
        remove.postRunnable(new Runnable() {
            @Override
            public final void run() {
                DispatchQueuePool.this.lambda$execute$1(runnable, remove);
            }
        });
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

    public void lambda$execute$0(DispatchQueue dispatchQueue) {
        this.totalTasksCount--;
        int i = this.busyQueuesMap.get(dispatchQueue.index) - 1;
        if (i == 0) {
            this.busyQueuesMap.delete(dispatchQueue.index);
            this.busyQueues.remove(dispatchQueue);
            this.queues.add(dispatchQueue);
            return;
        }
        this.busyQueuesMap.put(dispatchQueue.index, i);
    }
}
