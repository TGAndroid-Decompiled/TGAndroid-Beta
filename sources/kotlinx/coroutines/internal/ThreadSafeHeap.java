package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

public class ThreadSafeHeap {
    private static final AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile int _size$volatile;
    private ThreadSafeHeapNode[] a;

    public final ThreadSafeHeapNode peek() {
        ThreadSafeHeapNode threadSafeHeapNodeFirstImpl;
        synchronized (this) {
            threadSafeHeapNodeFirstImpl = firstImpl();
        }
        return threadSafeHeapNodeFirstImpl;
    }

    public final boolean remove(ThreadSafeHeapNode threadSafeHeapNode) {
        boolean z;
        synchronized (this) {
            if (threadSafeHeapNode.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(threadSafeHeapNode.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final ThreadSafeHeapNode removeFirstOrNull() {
        ThreadSafeHeapNode threadSafeHeapNodeRemoveAtImpl;
        synchronized (this) {
            threadSafeHeapNodeRemoveAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return threadSafeHeapNodeRemoveAtImpl;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    private final void setSize(int i) {
        _size$volatile$FU.set(this, i);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final ThreadSafeHeapNode firstImpl() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        if (threadSafeHeapNodeArr != null) {
            return threadSafeHeapNodeArr[0];
        }
        return null;
    }

    public final ThreadSafeHeapNode removeAtImpl(int i) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        setSize(getSize() - 1);
        if (i < getSize()) {
            swap(i, getSize());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    swap(i, i2);
                    siftUpFrom(i2);
                } else {
                    siftDownFrom(i);
                }
            } else {
                siftDownFrom(i);
            }
        }
        ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[getSize()];
        Intrinsics.checkNotNull(threadSafeHeapNode3);
        threadSafeHeapNode3.setHeap(null);
        threadSafeHeapNode3.setIndex(-1);
        threadSafeHeapNodeArr[getSize()] = null;
        return threadSafeHeapNode3;
    }

    public final void addImpl(ThreadSafeHeapNode threadSafeHeapNode) {
        threadSafeHeapNode.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = threadSafeHeapNode;
        threadSafeHeapNode.setIndex(size);
        siftUpFrom(size);
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
            Intrinsics.checkNotNull(threadSafeHeapNodeArr);
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            Intrinsics.checkNotNull(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            Intrinsics.checkNotNull(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= getSize()) {
                return;
            }
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
            Intrinsics.checkNotNull(threadSafeHeapNodeArr);
            int i4 = i2 + 2;
            if (i4 < getSize()) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i4];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i3];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr[i];
            Intrinsics.checkNotNull(threadSafeHeapNode3);
            ThreadSafeHeapNode threadSafeHeapNode4 = threadSafeHeapNodeArr[i4];
            Intrinsics.checkNotNull(threadSafeHeapNode4);
            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) <= 0) {
                return;
            }
            swap(i, i4);
            i = i4;
        }
    }

    private final ThreadSafeHeapNode[] realloc() {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        if (threadSafeHeapNodeArr == null) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = new ThreadSafeHeapNode[4];
            this.a = threadSafeHeapNodeArr2;
            return threadSafeHeapNodeArr2;
        }
        if (getSize() < threadSafeHeapNodeArr.length) {
            return threadSafeHeapNodeArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(threadSafeHeapNodeArr, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        ThreadSafeHeapNode[] threadSafeHeapNodeArr3 = (ThreadSafeHeapNode[]) objArrCopyOf;
        this.a = threadSafeHeapNodeArr3;
        return threadSafeHeapNodeArr3;
    }

    private final void swap(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
        Intrinsics.checkNotNull(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        Intrinsics.checkNotNull(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        Intrinsics.checkNotNull(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i);
        threadSafeHeapNode2.setIndex(i2);
    }
}
