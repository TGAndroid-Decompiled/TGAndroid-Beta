package md;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n {
    public static final AtomicReferenceFieldUpdater f17662e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f17663f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");
    public static final e5.c f17664g = new e5.c("REMOVE_FROZEN", 2);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f17665a;
    public final boolean f17666b;
    public final int f17667c;
    public final AtomicReferenceArray d;

    public n(int i9, boolean z10) {
        this.f17665a = i9;
        this.f17666b = z10;
        int i10 = i9 - 1;
        this.f17667c = i10;
        this.d = new AtomicReferenceArray(i9);
        if (i10 <= 1073741823) {
            if ((i9 & i10) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17663f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i9 = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = this.f17667c;
            if (((i10 + 2) & i11) != (i9 & i11)) {
                boolean z10 = this.f17666b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z10 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f17665a;
                    if (i12 < 1024 || ((i10 - i9) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f17663f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        n nVar = this;
                        while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = nVar.d;
                            int i13 = nVar.f17667c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof m) && ((m) obj2).f17661a == i10) {
                                atomicReferenceArray2.set(i13, obj);
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
            atomicLongFieldUpdater = f17663f;
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
            atomicLongFieldUpdater = f17663f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17662e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f17665a * 2, nVar.f17666b);
            int i9 = (int) (1073741823 & j10);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i11 = nVar.f17667c;
                int i12 = i9 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = nVar.d.get(i12);
                if (obj == null) {
                    obj = new m(i9);
                }
                nVar3.d.set(nVar3.f17667c & i9, obj);
                i9++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17663f;
            long j10 = atomicLongFieldUpdater.get(nVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return f17664g;
            }
            int i9 = (int) (j10 & 1073741823);
            int i10 = (int) ((1152921503533105152L & j10) >> 30);
            int i11 = nVar.f17667c;
            int i12 = i9 & i11;
            if ((i10 & i11) == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = nVar.f17666b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof m) {
                break;
            } else {
                long j11 = (i9 + 1) & 1073741823;
                if (f17663f.compareAndSet(nVar, j10, (j10 & (-1073741824)) | j11)) {
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
                            if (f17663f.compareAndSet(nVar2, j12, (j12 & (-1073741824)) | j11)) {
                                nVar2.d.set(i13 & nVar2.f17667c, null);
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
