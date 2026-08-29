package md;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends nd.b implements k, b {
    public static final AtomicReferenceFieldUpdater f17009e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = f17009e.get(this);
        if (obj == nd.e.f17310a) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object c(Object obj, uc.c cVar) {
        d(obj);
        return qc.i.f46603a;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        fc.a aVar;
        if (obj == null) {
            obj = nd.e.f17310a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17009e;
            if (kotlin.jvm.internal.j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                o[] oVarArr2 = this.f17304a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f17012a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (aVar = n.f17011b)) {
                                        fc.a aVar2 = n.f17010a;
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
                                            ((jd.m) obj2).resumeWith(qc.i.f46603a);
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
                        oVarArr = this.f17304a;
                    }
                    oVarArr2 = oVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }

    @Override
    public final java.lang.Object e(md.c r18, uc.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: md.m.e(md.c, uc.c):java.lang.Object");
    }
}
