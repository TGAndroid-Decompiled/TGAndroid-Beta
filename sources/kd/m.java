package kd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends ld.b implements k, b {
    public static final AtomicReferenceFieldUpdater f14791e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = f14791e.get(this);
        if (obj == ld.e.f16843a) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object c(Object obj, sc.c cVar) {
        d(obj);
        return oc.i.f19197a;
    }

    public final void d(Object obj) {
        int i9;
        o[] oVarArr;
        e5.c cVar;
        if (obj == null) {
            obj = ld.e.f16843a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14791e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i10 = this.d;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.d = i11;
                o[] oVarArr2 = this.f16837a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f14794a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (cVar = n.f14793b)) {
                                        e5.c cVar2 = n.f14792a;
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
                                            ((hd.m) obj2).resumeWith(oc.i.f19197a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i9 = this.d;
                        if (i9 == i11) {
                            this.d = i11 + 1;
                            return;
                        }
                        oVarArr = this.f16837a;
                    }
                    oVarArr2 = oVarArr;
                    i11 = i9;
                }
            } else {
                this.d = i10 + 2;
            }
        }
    }

    @Override
    public final java.lang.Object q(kd.c r18, sc.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: kd.m.q(kd.c, sc.c):java.lang.Object");
    }
}
