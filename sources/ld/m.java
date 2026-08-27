package ld;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m extends md.b implements k, b {

    public static final AtomicReferenceFieldUpdater f15569e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    public final Object b() {
        Object obj = f15569e.get(this);
        if (obj == md.e.f18027a) {
            return null;
        }
        return obj;
    }

    @Override
    public final Object c(Object obj, tc.c cVar) {
        d(obj);
        return pc.i.f45696a;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        ec.a aVar;
        if (obj == null) {
            obj = md.e.f18027a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15569e;
            if (kotlin.jvm.internal.j.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) != 0) {
                this.d = i11 + 2;
                return;
            }
            int i12 = i11 + 1;
            this.d = i12;
            o[] oVarArr2 = this.f18021a;
            while (true) {
                if (oVarArr2 != null) {
                    for (o oVar : oVarArr2) {
                        if (oVar != null) {
                            AtomicReference atomicReference = oVar.f15572a;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 == null || obj2 == (aVar = n.f15571b)) {
                                    break;
                                }
                                ec.a aVar2 = n.f15570a;
                                if (obj2 != aVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, aVar2)) {
                                            ((id.m) obj2).resumeWith(pc.i.f45696a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, aVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
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
                    oVarArr = this.f18021a;
                }
                oVarArr2 = oVarArr;
                i12 = i10;
            }
        }
    }

    @Override
    public final java.lang.Object q(ld.c r18, tc.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ld.m.q(ld.c, tc.c):java.lang.Object");
    }
}
