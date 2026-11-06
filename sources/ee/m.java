package ee;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m {
    public static final AtomicReferenceFieldUpdater f10786e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");
    public static final AtomicLongFieldUpdater f10787f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");
    public static final com.google.android.gms.internal.clearcut.e f10788g = new com.google.android.gms.internal.clearcut.e("REMOVE_FROZEN", 1);
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int f10789a;
    public final boolean f10790b;
    public final int f10791c;
    public final AtomicReferenceArray d;

    public m(int i7, boolean z9) {
        this.f10789a = i7;
        this.f10790b = z9;
        int i10 = i7 - 1;
        this.f10791c = i10;
        this.d = new AtomicReferenceArray(i7);
        if (i10 <= 1073741823) {
            if ((i7 & i10) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10787f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                if ((2305843009213693952L & j3) != 0) {
                    return 2;
                }
                return 1;
            }
            int i7 = (int) (1073741823 & j3);
            int i10 = (int) ((1152921503533105152L & j3) >> 30);
            int i11 = this.f10791c;
            if (((i10 + 2) & i11) != (i7 & i11)) {
                boolean z9 = this.f10790b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z9 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f10789a;
                    if (i12 < 1024 || ((i10 - i7) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f10787f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        m mVar = this;
                        while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = mVar.d;
                            int i13 = mVar.f10791c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof l) && ((l) obj2).f10785a == i10) {
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
        long j3;
        do {
            atomicLongFieldUpdater = f10787f;
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

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f10787f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j3;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j3, j10)) {
                j3 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10786e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f10789a * 2, mVar.f10790b);
            int i7 = (int) (1073741823 & j3);
            int i10 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i11 = mVar.f10791c;
                int i12 = i7 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = mVar.d.get(i12);
                if (obj == null) {
                    obj = new l(i7);
                }
                mVar3.d.set(mVar3.f10791c & i7, obj);
                i7++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10787f;
            long j3 = atomicLongFieldUpdater.get(mVar);
            if ((j3 & 1152921504606846976L) != 0) {
                return f10788g;
            }
            int i7 = (int) (j3 & 1073741823);
            int i10 = mVar.f10791c;
            int i11 = i7 & i10;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z9 = mVar.f10790b;
            if (obj == null) {
                if (z9) {
                    break;
                }
            } else if (obj instanceof l) {
                break;
            } else {
                long j10 = (i7 + 1) & 1073741823;
                if (f10787f.compareAndSet(mVar, j3, (j3 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                mVar = this;
                if (z9) {
                    while (true) {
                        long j11 = atomicLongFieldUpdater.get(mVar);
                        int i12 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f10787f.compareAndSet(mVar2, j11, (j11 & (-1073741824)) | j10)) {
                                mVar2.d.set(i12 & mVar2.f10791c, null);
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
