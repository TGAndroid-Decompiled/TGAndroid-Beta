package nd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n {

    public static final AtomicReferenceFieldUpdater f18498e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    public static final AtomicLongFieldUpdater f18499f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    public static final ec.a f18500g = new ec.a("REMOVE_FROZEN", 3);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;

    public final int f18501a;

    public final boolean f18502b;

    public final int f18503c;
    public final AtomicReferenceArray d;

    public n(int i10, boolean z10) {
        this.f18501a = i10;
        this.f18502b = z10;
        int i11 = i10 - 1;
        this.f18503c = i11;
        this.d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18499f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f18503c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.f18502b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z10 || atomicReferenceArray.get(i11 & i12) == null) {
                if (f18499f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    n nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.d;
                        int i13 = nVarC.f18503c & i11;
                        Object obj2 = atomicReferenceArray2.get(i13);
                        if ((obj2 instanceof m) && ((m) obj2).f18497a == i11) {
                            atomicReferenceArray2.set(i13, obj);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i14 = this.f18501a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f18499f;
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

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f18499f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18498e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f18501a * 2, nVar.f18502b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = nVar.f18503c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object mVar = nVar.d.get(i13);
                if (mVar == null) {
                    mVar = new m(i10);
                }
                nVar3.d.set(nVar3.f18503c & i10, mVar);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18499f;
            long j10 = atomicLongFieldUpdater.get(nVarC);
            if ((j10 & 1152921504606846976L) != 0) {
                return f18500g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = nVarC.f18503c;
            int i13 = i10 & i12;
            if ((i11 & i12) != i13) {
                AtomicReferenceArray atomicReferenceArray = nVarC.d;
                Object obj = atomicReferenceArray.get(i13);
                boolean z10 = nVarC.f18502b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (!(obj instanceof m)) {
                    long j11 = (i10 + 1) & 1073741823;
                    if (f18499f.compareAndSet(nVarC, j10, (j10 & (-1073741824)) | j11)) {
                        atomicReferenceArray.set(i13, null);
                        return obj;
                    }
                    nVarC = this;
                    if (z10) {
                        while (true) {
                            long j12 = atomicLongFieldUpdater.get(nVarC);
                            int i14 = (int) (j12 & 1073741823);
                            if ((j12 & 1152921504606846976L) != 0) {
                                nVarC = nVarC.c();
                            } else {
                                n nVar = nVarC;
                                if (f18499f.compareAndSet(nVar, j12, (j12 & (-1073741824)) | j11)) {
                                    nVar.d.set(i14 & nVar.f18503c, null);
                                    nVarC = null;
                                } else {
                                    nVarC = nVar;
                                }
                            }
                            if (nVarC == null) {
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
