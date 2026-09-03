package od;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends pd.b implements k, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = e.get(this);
        if (obj == pd.e.f41216a) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        d(obj);
        return sc.i.f44318a;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        o3.c cVar;
        if (obj == null) {
            obj = pd.e.f41216a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (kotlin.jvm.internal.j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                o[] oVarArr2 = this.f41210a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f16556a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (cVar = n.f16555b)) {
                                        o3.c cVar2 = n.f16554a;
                                        if (obj2 == cVar2) {
                                            while (!atomicReference.compareAndSet(obj2, cVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, cVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((ld.m) obj2).resumeWith(sc.i.f44318a);
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
                        oVarArr = this.f41210a;
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
    public final java.lang.Object z(od.c r18, wc.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: od.m.z(od.c, wc.c):java.lang.Object");
    }
}
