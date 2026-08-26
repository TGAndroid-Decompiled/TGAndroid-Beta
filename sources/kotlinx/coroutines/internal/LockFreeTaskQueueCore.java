package kotlinx.coroutines.internal;

import com.google.common.base.Joiner;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class LockFreeTaskQueueCore {
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final AtomicReferenceArray array;
    public final int capacity;
    public final int mask;
    public final boolean singleConsumer;
    public static final AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater _state$volatile$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Joiner REMOVE_FROZEN = new Joiner("REMOVE_FROZEN", 2);

    public final class Placeholder {
        public final int index;

        public Placeholder(int i) {
            this.index = i;
        }
    }

    public LockFreeTaskQueueCore(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.array = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int addLast(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.array;
            if (!this.singleConsumer && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.capacity;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                LockFreeTaskQueueCore next = this;
                while ((atomicLongFieldUpdater.get(next) & 1152921504606846976L) != 0) {
                    next = next.next();
                    AtomicReferenceArray atomicReferenceArray2 = next.array;
                    int i5 = next.mask & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof Placeholder) && ((Placeholder) obj).index == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        next = null;
                    }
                    if (next == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean close() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = _state$volatile$FU;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final LockFreeTaskQueueCore next() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        LockFreeTaskQueueCore lockFreeTaskQueueCore;
        while (true) {
            atomicLongFieldUpdater = _state$volatile$FU;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lockFreeTaskQueueCore = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore2 != null) {
                return lockFreeTaskQueueCore2;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore3 = new LockFreeTaskQueueCore(lockFreeTaskQueueCore.capacity * 2, lockFreeTaskQueueCore.singleConsumer);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = lockFreeTaskQueueCore.mask;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object placeholder = lockFreeTaskQueueCore.array.get(i4);
                if (placeholder == null) {
                    placeholder = new Placeholder(i);
                }
                lockFreeTaskQueueCore3.array.set(lockFreeTaskQueueCore3.mask & i, placeholder);
                i++;
            }
            atomicLongFieldUpdater.set(lockFreeTaskQueueCore3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeTaskQueueCore3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object removeFirstOrNull() {
        LockFreeTaskQueueCore next = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = _state$volatile$FU;
            long j = atomicLongFieldUpdater.get(next);
            if ((j & 1152921504606846976L) != 0) {
                return REMOVE_FROZEN;
            }
            int i = (int) (j & 1073741823);
            int i2 = next.mask;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = next.array;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = next.singleConsumer;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof Placeholder)) {
                    long j2 = (i + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(next, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    next = this;
                    if (z) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = _state$volatile$FU;
                            long j3 = atomicLongFieldUpdater2.get(next);
                            int i5 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                next = next.next();
                            } else {
                                LockFreeTaskQueueCore lockFreeTaskQueueCore = next;
                                next = lockFreeTaskQueueCore;
                                if (atomicLongFieldUpdater2.compareAndSet(lockFreeTaskQueueCore, j3, (j3 & (-1073741824)) | j2)) {
                                    next.array.set(next.mask & i5, null);
                                    next = null;
                                } else {
                                    continue;
                                }
                            }
                            if (next == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
