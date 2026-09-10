package ce;

import ee.v;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class o extends de.b implements l, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public o(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        d(obj);
        return gd.i.f8748a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == de.e.f6489a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        q[] qVarArr;
        v vVar;
        if (obj == null) {
            obj = de.e.f6489a;
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
                q[] qVarArr2 = this.f6483a;
                while (true) {
                    if (qVarArr2 != null) {
                        for (q qVar : qVarArr2) {
                            if (qVar != null) {
                                AtomicReference atomicReference = qVar.f4674a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (vVar = p.f4673b)) {
                                        v vVar2 = p.f4672a;
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
                                            ((zd.m) obj2).resumeWith(gd.i.f8748a);
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
                        qVarArr = this.f6483a;
                    }
                    qVarArr2 = qVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }

    @Override
    public final java.lang.Object u(ce.c r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ce.o.u(ce.c, kd.c):java.lang.Object");
    }
}
