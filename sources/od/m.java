package od;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends pd.b implements k, b {
    public static final AtomicReferenceFieldUpdater f16745e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = f16745e.get(this);
        if (obj == pd.e.f44391a) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        d(obj);
        return sc.i.f47274a;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        com.google.android.gms.internal.clearcut.e eVar;
        if (obj == null) {
            obj = pd.e.f44391a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16745e;
            if (kotlin.jvm.internal.j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                o[] oVarArr2 = this.f44385a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f16748a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (eVar = n.f16747b)) {
                                        com.google.android.gms.internal.clearcut.e eVar2 = n.f16746a;
                                        if (obj2 == eVar2) {
                                            while (!atomicReference.compareAndSet(obj2, eVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, eVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((ld.m) obj2).resumeWith(sc.i.f47274a);
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
                        oVarArr = this.f44385a;
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
    public final java.lang.Object x(od.c r18, wc.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: od.m.x(od.c, wc.c):java.lang.Object");
    }
}
