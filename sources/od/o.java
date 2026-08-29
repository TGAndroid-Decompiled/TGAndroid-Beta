package od;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o {
    public static final AtomicReferenceFieldUpdater f19528e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f19529f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");
    public static final fc.a f19530g = new fc.a("REMOVE_FROZEN", 2);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f19531a;
    public final boolean f19532b;
    public final int f19533c;
    public final AtomicReferenceArray d;

    public o(int i10, boolean z10) {
        this.f19531a = i10;
        this.f19532b = z10;
        int i11 = i10 - 1;
        this.f19533c = i11;
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19529f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f19533c;
            if (((i11 + 2) & i12) != (i10 & i12)) {
                boolean z10 = this.f19532b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z10 && atomicReferenceArray.get(i11 & i12) != null) {
                    int i13 = this.f19531a;
                    if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f19529f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i11 & i12, obj);
                        o oVar = this;
                        while ((atomicLongFieldUpdater.get(oVar) & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = oVar.d;
                            int i14 = oVar.f19533c & i11;
                            Object obj2 = atomicReferenceArray2.get(i14);
                            if ((obj2 instanceof n) && ((n) obj2).f19527a == i11) {
                                atomicReferenceArray2.set(i14, obj);
                                continue;
                            } else {
                                oVar = null;
                                continue;
                            }
                            if (oVar == null) {
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
            atomicLongFieldUpdater = f19529f;
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

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        o oVar;
        while (true) {
            atomicLongFieldUpdater = f19529f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                oVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            oVar = this;
            if (atomicLongFieldUpdater.compareAndSet(oVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19528e;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o(oVar.f19531a * 2, oVar.f19532b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = oVar.f19533c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = oVar.d.get(i13);
                if (obj == null) {
                    obj = new n(i10);
                }
                oVar3.d.set(oVar3.f19533c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(oVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        o oVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19529f;
            long j10 = atomicLongFieldUpdater.get(oVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return f19530g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = oVar.f19533c;
            int i13 = i10 & i12;
            if ((i11 & i12) == i13) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = oVar.d;
            Object obj = atomicReferenceArray.get(i13);
            boolean z10 = oVar.f19532b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof n) {
                break;
            } else {
                long j11 = (i10 + 1) & 1073741823;
                if (f19529f.compareAndSet(oVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i13, null);
                    return obj;
                }
                oVar = this;
                if (z10) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(oVar);
                        int i14 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                        } else {
                            o oVar2 = oVar;
                            if (f19529f.compareAndSet(oVar2, j12, (j12 & (-1073741824)) | j11)) {
                                oVar2.d.set(i14 & oVar2.f19533c, null);
                                oVar = null;
                            } else {
                                oVar = oVar2;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
