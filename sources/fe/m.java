package fe;

import he.v;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends ge.b implements k, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final java.lang.Object C(fe.c r18, nd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: fe.m.C(fe.c, nd.c):java.lang.Object");
    }

    @Override
    public final Object b(Object obj, nd.c cVar) {
        d(obj);
        return jd.i.f15580a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == ge.e.f12478a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        v vVar;
        if (obj == null) {
            obj = ge.e.f12478a;
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
                o[] oVarArr2 = this.f12472a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f10466a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (vVar = n.f10465b)) {
                                        v vVar2 = n.f10464a;
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
                                            ((ce.m) obj2).resumeWith(jd.i.f15580a);
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
                        oVarArr = this.f12472a;
                    }
                    oVarArr2 = oVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }
}
