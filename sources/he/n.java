package he;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f12811f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");
    public static final v f12812g = new v("REMOVE_FROZEN", 0);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f12813a;
    public final boolean f12814b;
    public final int f12815c;
    public final AtomicReferenceArray d;

    public n(int i10, boolean z10) {
        this.f12813a = i10;
        this.f12814b = z10;
        int i11 = i10 - 1;
        this.f12815c = i11;
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12811f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f12815c;
            if (((i11 + 2) & i12) != (i10 & i12)) {
                boolean z10 = this.f12814b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z10 && atomicReferenceArray.get(i11 & i12) != null) {
                    int i13 = this.f12813a;
                    if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f12811f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i11 & i12, obj);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.d;
                            int i14 = nVar.f12815c & i11;
                            Object obj2 = atomicReferenceArray2.get(i14);
                            if ((obj2 instanceof m) && ((m) obj2).f12810a == i11) {
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
        long j10;
        do {
            atomicLongFieldUpdater = f12811f;
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
            atomicLongFieldUpdater = f12811f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f12813a * 2, nVar.f12814b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = nVar.f12815c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = nVar.d.get(i13);
                if (obj == null) {
                    obj = new m(i10);
                }
                nVar3.d.set(nVar3.f12815c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12811f;
            long j10 = atomicLongFieldUpdater.get(nVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return f12812g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = nVar.f12815c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = nVar.f12814b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof m) {
                break;
            } else {
                long j11 = (i10 + 1) & 1073741823;
                if (f12811f.compareAndSet(nVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                nVar = this;
                if (z10) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(nVar);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f12811f.compareAndSet(nVar2, j12, (j12 & (-1073741824)) | j11)) {
                                nVar2.d.set(i13 & nVar2.f12815c, null);
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
