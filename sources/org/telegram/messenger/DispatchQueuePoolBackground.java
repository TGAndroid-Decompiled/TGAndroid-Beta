package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.ui.Components.Reactions.HwEmojis;

public class DispatchQueuePoolBackground {
    public static final String THREAD_PREFIX = "DispatchQueuePoolThreadSafety_";
    private static DispatchQueuePoolBackground backgroundQueue;
    static ArrayList<Runnable> updateTaskCollection;
    private boolean cleanupScheduled;
    private int createdCount;
    private int maxCount;
    private int totalTasksCount;
    private static final ArrayList<ArrayList<Runnable>> freeCollections = new ArrayList<>();
    private static final Runnable finishCollectUpdateRunnable = new Runnable() {
        @Override
        public void run() {
            DispatchQueuePoolBackground.finishCollectUpdateRunnables();
        }
    };
    private ArrayList<DispatchQueue> queues = new ArrayList<>(10);
    private SparseIntArray busyQueuesMap = new SparseIntArray();
    private ArrayList<DispatchQueue> busyQueues = new ArrayList<>(10);
    private Runnable cleanupRunnable = new Runnable() {
        @Override
        public void run() {
            if (!DispatchQueuePoolBackground.this.queues.isEmpty()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int i = 0;
                while (i < DispatchQueuePoolBackground.this.queues.size()) {
                    DispatchQueue dispatchQueue = (DispatchQueue) DispatchQueuePoolBackground.this.queues.get(i);
                    if (dispatchQueue.getLastTaskTime() < jElapsedRealtime - 30000) {
                        dispatchQueue.recycle();
                        DispatchQueuePoolBackground.this.queues.remove(i);
                        DispatchQueuePoolBackground.access$110(DispatchQueuePoolBackground.this);
                        i--;
                    }
                    i++;
                }
            }
            if (DispatchQueuePoolBackground.this.queues.isEmpty() && DispatchQueuePoolBackground.this.busyQueues.isEmpty()) {
                DispatchQueuePoolBackground.this.cleanupScheduled = false;
            } else {
                Utilities.globalQueue.postRunnable(this, 30000L);
                DispatchQueuePoolBackground.this.cleanupScheduled = true;
            }
        }
    };
    private int guid = Utilities.random.nextInt();

    private DispatchQueuePoolBackground(int i) {
        this.maxCount = i;
    }

    public static int access$110(DispatchQueuePoolBackground dispatchQueuePoolBackground) {
        int i = dispatchQueuePoolBackground.createdCount;
        dispatchQueuePoolBackground.createdCount = i - 1;
        return i;
    }

    private void execute(ArrayList<Runnable> arrayList) {
        DispatchQueue dispatchQueueRemove;
        for (int i = 0; i < arrayList.size(); i++) {
            Runnable runnable = arrayList.get(i);
            if (runnable != null) {
                if (!this.busyQueues.isEmpty() && (this.totalTasksCount / 2 <= this.busyQueues.size() || (this.queues.isEmpty() && this.createdCount >= this.maxCount))) {
                    dispatchQueueRemove = this.busyQueues.remove(0);
                } else if (this.queues.isEmpty()) {
                    dispatchQueueRemove = new DispatchQueue("DispatchQueuePoolThreadSafety_" + this.guid + "_" + Utilities.random.nextInt());
                    dispatchQueueRemove.setPriority(10);
                    this.createdCount = this.createdCount + 1;
                } else {
                    dispatchQueueRemove = this.queues.remove(0);
                }
                if (!this.cleanupScheduled) {
                    Utilities.globalQueue.postRunnable(this.cleanupRunnable, 30000L);
                    this.cleanupScheduled = true;
                }
                this.totalTasksCount++;
                this.busyQueues.add(dispatchQueueRemove);
                this.busyQueuesMap.put(dispatchQueueRemove.index, this.busyQueuesMap.get(dispatchQueueRemove.index, 0) + 1);
                if (HwEmojis.hwEnabled) {
                    dispatchQueueRemove.setPriority(1);
                } else if (dispatchQueueRemove.getPriority() != 10) {
                    dispatchQueueRemove.setPriority(10);
                }
                dispatchQueueRemove.postRunnable(new FileLoader$$ExternalSyntheticLambda0(this, runnable, dispatchQueueRemove, 17));
            }
        }
    }

    public static void finishCollectUpdateRunnables() {
        ArrayList<Runnable> arrayList = updateTaskCollection;
        if (arrayList == null || arrayList.isEmpty()) {
            updateTaskCollection = null;
            return;
        }
        ArrayList<Runnable> arrayList2 = updateTaskCollection;
        updateTaskCollection = null;
        if (backgroundQueue == null) {
            backgroundQueue = new DispatchQueuePoolBackground(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        Utilities.globalQueue.postRunnable(new AndroidUtilities$$ExternalSyntheticLambda45(arrayList2, 2));
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

    public void lambda$execute$1(Runnable runnable, DispatchQueue dispatchQueue) {
        runnable.run();
        Utilities.globalQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(28, this, dispatchQueue));
    }

    public static void lambda$finishCollectUpdateRunnables$2(ArrayList arrayList) {
        freeCollections.add(arrayList);
    }

    public static void lambda$finishCollectUpdateRunnables$3(ArrayList arrayList) {
        backgroundQueue.execute((ArrayList<Runnable>) arrayList);
        arrayList.clear();
        AndroidUtilities.runOnUIThread(new AndroidUtilities$$ExternalSyntheticLambda45(arrayList, 3));
    }

    public static void execute(Runnable runnable) {
        execute(runnable, false);
    }

    public static void execute(Runnable runnable, boolean z) {
        if (Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.e(new RuntimeException("wrong thread"));
                return;
            }
            return;
        }
        if (updateTaskCollection == null) {
            ArrayList<ArrayList<Runnable>> arrayList = freeCollections;
            if (!arrayList.isEmpty()) {
                updateTaskCollection = (ArrayList) arrayList.remove(arrayList.size() - 1);
            } else {
                updateTaskCollection = new ArrayList<>(100);
            }
            if (!z) {
                AndroidUtilities.runOnUIThread(finishCollectUpdateRunnable);
            }
        }
        updateTaskCollection.add(runnable);
        if (z) {
            Runnable runnable2 = finishCollectUpdateRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            runnable2.run();
        }
    }
}
