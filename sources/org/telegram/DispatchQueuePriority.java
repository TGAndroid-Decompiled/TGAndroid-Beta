package org.telegram;

import android.view.View;
import androidx.palette.graphics.ColorCutQuantizer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.FileLog;

public final class DispatchQueuePriority {
    public volatile CountDownLatch pauseLatch;
    public final AnonymousClass1 threadPoolExecutor;

    public final class AnonymousClass1 extends ThreadPoolExecutor implements AutoCloseable {
        public final DispatchQueuePriority this$0;

        public AnonymousClass1(DispatchQueuePriority dispatchQueuePriority, PriorityBlockingQueue priorityBlockingQueue) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.this$0 = dispatchQueuePriority;
            super(1, 1, 60L, timeUnit, priorityBlockingQueue);
        }

        @Override
        public final void beforeExecute(Thread thread, Runnable runnable) {
            CountDownLatch countDownLatch = this.this$0.pauseLatch;
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    FileLog.e(e);
                }
            }
        }

        @Override
        public final void close() {
            AndroidUtilities$$ExternalSyntheticApiModelOutline0.m(this);
        }
    }

    public final class AnonymousClass2 implements Comparator {
        public final int $r8$classId;

        public AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final int compare(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    Runnable runnable = (Runnable) obj;
                    Runnable runnable2 = (Runnable) obj2;
                    return (runnable2 instanceof PriorityRunnable ? ((PriorityRunnable) runnable2).priority : 1) - (runnable instanceof PriorityRunnable ? ((PriorityRunnable) runnable).priority : 1);
                case 1:
                    return ((ColorCutQuantizer.Vbox) obj2).getVolume() - ((ColorCutQuantizer.Vbox) obj).getVolume();
                case 2:
                    DiffUtil.Snake snake = (DiffUtil.Snake) obj;
                    DiffUtil.Snake snake2 = (DiffUtil.Snake) obj2;
                    int i = snake.x - snake2.x;
                    return i == 0 ? snake.y - snake2.y : i;
                case 3:
                    GapWorker.Task task = (GapWorker.Task) obj;
                    GapWorker.Task task2 = (GapWorker.Task) obj2;
                    RecyclerView recyclerView = task.view;
                    if ((recyclerView == null) != (task2.view == null)) {
                        if (recyclerView == null) {
                            return 1;
                        }
                        return -1;
                    }
                    boolean z = task.immediate;
                    if (z != task2.immediate) {
                        if (z) {
                            return -1;
                        }
                        return 1;
                    }
                    int i2 = task2.viewVelocity - task.viewVelocity;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = task.distanceToItem - task2.distanceToItem;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                case 4:
                    return ((ViewPager.ItemInfo) obj).position - ((ViewPager.ItemInfo) obj2).position;
                case 5:
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) ((View) obj).getLayoutParams();
                    ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) ((View) obj2).getLayoutParams();
                    boolean z2 = layoutParams.isDecor;
                    if (z2 != layoutParams2.isDecor) {
                        return z2 ? 1 : -1;
                    }
                    return layoutParams.position - layoutParams2.position;
                case 6:
                    Map.Entry entry = (Map.Entry) obj;
                    Map.Entry entry2 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry);
                    Objects.requireNonNull(entry2);
                    Comparable comparable = (Comparable) entry.getKey();
                    Comparable comparable2 = (Comparable) entry2.getKey();
                    comparable.getClass();
                    comparable2.getClass();
                    return comparable.compareTo(comparable2);
                default:
                    return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        }
    }

    public final class PriorityRunnable implements Runnable {
        public final int priority;
        public final Runnable runnable;

        public PriorityRunnable(int i, Runnable runnable) {
            this.priority = i;
            this.runnable = runnable;
        }

        @Override
        public final void run() {
            this.runnable.run();
        }
    }

    public DispatchQueuePriority() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.threadPoolExecutor = new AnonymousClass1(this, new PriorityBlockingQueue(10, new AnonymousClass2(0)));
    }
}
