package ee;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n {
    public static final AtomicReferenceFieldUpdater f9084e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f9085f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");
    public static final d9.f f9086g = new d9.f("REMOVE_FROZEN", 1);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f9087a;
    public final boolean f9088b;
    public final int f9089c;
    public final AtomicReferenceArray d;

    public n(int i10, boolean z10) {
        this.f9087a = i10;
        this.f9088b = z10;
        int i11 = i10 - 1;
        this.f9089c = i11;
        this.d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            if ((i10 & i11) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9085f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                if ((2305843009213693952L & j3) != 0) {
                    return 2;
                }
                return 1;
            }
            int i10 = (int) (1073741823 & j3);
            int i11 = (int) ((1152921503533105152L & j3) >> 30);
            int i12 = this.f9089c;
            if (((i11 + 2) & i12) != (i10 & i12)) {
                boolean z10 = this.f9088b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z10 && atomicReferenceArray.get(i11 & i12) != null) {
                    int i13 = this.f9087a;
                    if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f9085f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i11 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i11 & i12, obj);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.d;
                            int i14 = nVar.f9089c & i11;
                            Object obj2 = atomicReferenceArray2.get(i14);
                            if ((obj2 instanceof m) && ((m) obj2).f9083a == i11) {
                                atomicReferenceArray2.set(i14, obj);
                                continue;
                            } else {
                                nVar = null;
                                continue;
                            }
                            if (nVar == null) {
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
        long j3;
        do {
            atomicLongFieldUpdater = f9085f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f9085f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j3;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j3, j10)) {
                j3 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9084e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f9087a * 2, nVar.f9088b);
            int i10 = (int) (1073741823 & j3);
            int i11 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i12 = nVar.f9089c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = nVar.d.get(i13);
                if (obj == null) {
                    obj = new m(i10);
                }
                nVar3.d.set(nVar3.f9089c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9085f;
            long j3 = atomicLongFieldUpdater.get(nVar);
            if ((j3 & 1152921504606846976L) != 0) {
                return f9086g;
            }
            int i10 = (int) (j3 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j3) >> 30);
            int i12 = nVar.f9089c;
            int i13 = i10 & i12;
            if ((i11 & i12) == i13) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.d;
            Object obj = atomicReferenceArray.get(i13);
            boolean z10 = nVar.f9088b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof m) {
                break;
            } else {
                long j10 = (i10 + 1) & 1073741823;
                if (f9085f.compareAndSet(nVar, j3, (j3 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i13, null);
                    return obj;
                }
                nVar = this;
                if (z10) {
                    while (true) {
                        long j11 = atomicLongFieldUpdater.get(nVar);
                        int i14 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f9085f.compareAndSet(nVar2, j11, (j11 & (-1073741824)) | j10)) {
                                nVar2.d.set(i14 & nVar2.f9089c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
