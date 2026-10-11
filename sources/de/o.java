package de;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends ee.b implements l, b {
    public static final AtomicReferenceFieldUpdater f8344e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public o(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final java.lang.Object G(de.c r18, ld.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: de.o.G(de.c, ld.c):java.lang.Object");
    }

    @Override
    public final Object b(Object obj, ld.c cVar) {
        d(obj);
        return hd.i.f11091a;
    }

    public final Object c() {
        Object obj = f8344e.get(this);
        if (obj == ee.e.f8905a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        q[] qVarArr;
        da.a aVar;
        if (obj == null) {
            obj = ee.e.f8905a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8344e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                q[] qVarArr2 = this.f8899a;
                while (true) {
                    if (qVarArr2 != null) {
                        for (q qVar : qVarArr2) {
                            if (qVar != null) {
                                AtomicReference atomicReference = qVar.f8347a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (aVar = p.f8346b)) {
                                        da.a aVar2 = p.f8345a;
                                        if (obj2 == aVar2) {
                                            while (!atomicReference.compareAndSet(obj2, aVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, aVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((ae.m) obj2).resumeWith(hd.i.f11091a);
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
                        qVarArr = this.f8899a;
                    }
                    qVarArr2 = qVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }
}
