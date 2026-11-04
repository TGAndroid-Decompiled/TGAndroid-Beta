package be;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f3274e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f3275f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");
    public static final t f3276g = new t("REMOVE_FROZEN", 0);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f3277a;
    public final boolean f3278b;
    public final int f3279c;
    public final AtomicReferenceArray d;

    public m(int i3, boolean z10) {
        this.f3277a = i3;
        this.f3278b = z10;
        int i10 = i3 - 1;
        this.f3279c = i10;
        this.d = new AtomicReferenceArray(i3);
        if (i10 <= 1073741823) {
            if ((i3 & i10) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3275f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i3 = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f3279c;
            if (((i10 + 2) & i11) != (i3 & i11)) {
                boolean z10 = this.f3278b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z10 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f3277a;
                    if (i12 < 1024 || ((i10 - i3) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f3275f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        m mVar = this;
                        while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = mVar.d;
                            int i13 = mVar.f3279c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof l) && ((l) obj2).f3273a == i10) {
                                atomicReferenceArray2.set(i13, obj);
                                continue;
                            } else {
                                mVar = null;
                                continue;
                            }
                            if (mVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f3275f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f3275f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3274e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f3277a * 2, mVar.f3278b);
            int i3 = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i11 = mVar.f3279c;
                int i12 = i3 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = mVar.d.get(i12);
                if (obj == null) {
                    obj = new l(i3);
                }
                mVar3.d.set(mVar3.f3279c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3275f;
            long j10 = atomicLongFieldUpdater.get(mVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return f3276g;
            }
            int i3 = (int) (j10 & 1073741823);
            int i10 = mVar.f3279c;
            int i11 = i3 & i10;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z10 = mVar.f3278b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof l) {
                break;
            } else {
                long j11 = (i3 + 1) & 1073741823;
                if (f3275f.compareAndSet(mVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                mVar = this;
                if (z10) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(mVar);
                        int i12 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f3275f.compareAndSet(mVar2, j12, (j12 & (-1073741824)) | j11)) {
                                mVar2.d.set(i12 & mVar2.f3279c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
