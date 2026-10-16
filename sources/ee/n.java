package ee;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n extends fe.b implements k, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        d(obj);
        return id.i.f11390a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == fe.e.f9146a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        p[] pVarArr;
        a6.i iVar;
        if (obj == null) {
            obj = fe.e.f9146a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                p[] pVarArr2 = this.f9140a;
                while (true) {
                    if (pVarArr2 != null) {
                        for (p pVar : pVarArr2) {
                            if (pVar != null) {
                                AtomicReference atomicReference = pVar.f8765a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (iVar = o.f8764b)) {
                                        a6.i iVar2 = o.f8763a;
                                        if (obj2 == iVar2) {
                                            while (!atomicReference.compareAndSet(obj2, iVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, iVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((be.m) obj2).resumeWith(id.i.f11390a);
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
                        pVarArr = this.f9140a;
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
    public final java.lang.Object g(ee.c r18, md.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ee.n.g(ee.c, md.c):java.lang.Object");
    }
}
