package ce;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n extends de.b implements l, b {
    public static final AtomicReferenceFieldUpdater f4792e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        d(obj);
        return gd.i.f10588a;
    }

    public final Object c() {
        Object obj = f4792e.get(this);
        if (obj == de.e.f6798a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        p[] pVarArr;
        d9.f fVar;
        if (obj == null) {
            obj = de.e.f6798a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4792e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                p[] pVarArr2 = this.f6792a;
                while (true) {
                    if (pVarArr2 != null) {
                        for (p pVar : pVarArr2) {
                            if (pVar != null) {
                                AtomicReference atomicReference = pVar.f4795a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (fVar = o.f4794b)) {
                                        d9.f fVar2 = o.f4793a;
                                        if (obj2 == fVar2) {
                                            while (!atomicReference.compareAndSet(obj2, fVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, fVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((zd.m) obj2).resumeWith(gd.i.f10588a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.d;
                        if (i10 == i12) {
                            this.d = i12 + 1;
                            return;
                        }
                        pVarArr = this.f6792a;
                    }
                    pVarArr2 = pVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }

    @Override
    public final java.lang.Object z(ce.c r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ce.n.z(ce.c, kd.c):java.lang.Object");
    }
}
