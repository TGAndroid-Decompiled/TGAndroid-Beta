package ce;

import ee.v;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n extends de.b implements l, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        d(obj);
        return gd.i.f9621a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == de.e.f7718a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        p[] pVarArr;
        v vVar;
        if (obj == null) {
            obj = de.e.f7718a;
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
                p[] pVarArr2 = this.f7712a;
                while (true) {
                    if (pVarArr2 != null) {
                        for (p pVar : pVarArr2) {
                            if (pVar != null) {
                                AtomicReference atomicReference = pVar.f4260a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (vVar = o.f4259b)) {
                                        v vVar2 = o.f4258a;
                                        if (obj2 == vVar2) {
                                            while (!atomicReference.compareAndSet(obj2, vVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, vVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((zd.m) obj2).resumeWith(gd.i.f9621a);
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
                        pVarArr = this.f7712a;
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
    public final java.lang.Object s(ce.c r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ce.n.s(ce.c, kd.c):java.lang.Object");
    }
}
