package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.EventLoopImplBase;

public class ThreadSafeHeap {
    public static final AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile int _size$volatile;
    public EventLoopImplBase.DelayedTask[] a;

    public final void addImpl(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.setHeap((EventLoopImplBase.DelayedTaskQueue) this);
        EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _size$volatile$FU;
        if (delayedTaskArr == null) {
            delayedTaskArr = new EventLoopImplBase.DelayedTask[4];
            this.a = delayedTaskArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= delayedTaskArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(delayedTaskArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            delayedTaskArr = (EventLoopImplBase.DelayedTask[]) objArrCopyOf;
            this.a = delayedTaskArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        delayedTaskArr[i] = delayedTask;
        delayedTask.index = i;
        siftUpFrom(i);
    }

    public final EventLoopImplBase.DelayedTask peek() {
        EventLoopImplBase.DelayedTask delayedTask;
        synchronized (this) {
            EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
            delayedTask = delayedTaskArr != null ? delayedTaskArr[0] : null;
        }
        return delayedTask;
    }

    public final void remove(EventLoopImplBase.DelayedTask delayedTask) {
        synchronized (this) {
            if (delayedTask.getHeap() != null) {
                removeAtImpl(delayedTask.index);
            }
        }
    }

    public final EventLoopImplBase.DelayedTask removeAtImpl(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        Intrinsics.checkNotNull(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _size$volatile$FU;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            swap(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                EventLoopImplBase.DelayedTask delayedTask = objArr2[i];
                Intrinsics.checkNotNull(delayedTask);
                Object obj2 = objArr2[i5];
                Intrinsics.checkNotNull(obj2);
                if (delayedTask.compareTo(obj2) < 0) {
                    swap(i, i5);
                    siftUpFrom(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        Intrinsics.checkNotNull(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            Intrinsics.checkNotNull(comparable3);
                            obj = objArr[i3];
                            Intrinsics.checkNotNull(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        Intrinsics.checkNotNull(comparable);
                        comparable2 = objArr[i4];
                        Intrinsics.checkNotNull(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        swap(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    Intrinsics.checkNotNull(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        Intrinsics.checkNotNull(comparable3);
                        obj = objArr[i3];
                        Intrinsics.checkNotNull(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    Intrinsics.checkNotNull(comparable);
                    comparable2 = objArr[i4];
                    Intrinsics.checkNotNull(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    swap(i, i4);
                    i = i4;
                }
            }
        }
        EventLoopImplBase.DelayedTask delayedTask2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.checkNotNull(delayedTask2);
        delayedTask2.setHeap(null);
        delayedTask2.index = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return delayedTask2;
    }

    public final void siftUpFrom(int i) {
        while (i > 0) {
            EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
            Intrinsics.checkNotNull(delayedTaskArr);
            int i2 = (i - 1) / 2;
            EventLoopImplBase.DelayedTask delayedTask = delayedTaskArr[i2];
            Intrinsics.checkNotNull(delayedTask);
            EventLoopImplBase.DelayedTask delayedTask2 = delayedTaskArr[i];
            Intrinsics.checkNotNull(delayedTask2);
            if (delayedTask.compareTo(delayedTask2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    public final void swap(int i, int i2) {
        EventLoopImplBase.DelayedTask[] delayedTaskArr = this.a;
        Intrinsics.checkNotNull(delayedTaskArr);
        EventLoopImplBase.DelayedTask delayedTask = delayedTaskArr[i2];
        Intrinsics.checkNotNull(delayedTask);
        EventLoopImplBase.DelayedTask delayedTask2 = delayedTaskArr[i];
        Intrinsics.checkNotNull(delayedTask2);
        delayedTaskArr[i] = delayedTask;
        delayedTaskArr[i2] = delayedTask2;
        delayedTask.index = i;
        delayedTask2.index = i2;
    }
}
