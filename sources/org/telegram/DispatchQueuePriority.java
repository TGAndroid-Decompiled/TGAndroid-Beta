package org.telegram;

import androidx.palette.graphics.ColorCutQuantizer;
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
                    return ((ViewPager.ItemInfo) obj).position - ((ViewPager.ItemInfo) obj2).position;
                case 3:
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
