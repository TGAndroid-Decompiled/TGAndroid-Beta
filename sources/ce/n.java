package ce;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class n extends de.b implements l, b {
    public static final AtomicReferenceFieldUpdater f4599e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public n(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object a(Object obj, kd.c cVar) {
        e(obj);
        return gd.i.f10453a;
    }

    public final Object c() {
        Object obj = f4599e.get(this);
        if (obj == de.e.f8328a) {
            return null;
        }
        return obj;
    }

    @Override
    public final java.lang.Object d(ce.c r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ce.n.d(ce.c, kd.c):java.lang.Object");
    }

    public final void e(Object obj) {
        int i10;
        p[] pVarArr;
        com.google.android.gms.internal.clearcut.e eVar;
        if (obj == null) {
            obj = de.e.f8328a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4599e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                p[] pVarArr2 = this.f8322a;
                while (true) {
                    if (pVarArr2 != null) {
                        for (p pVar : pVarArr2) {
                            if (pVar != null) {
                                AtomicReference atomicReference = pVar.f4602a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (eVar = o.f4601b)) {
                                        com.google.android.gms.internal.clearcut.e eVar2 = o.f4600a;
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
                                            ((zd.m) obj2).resumeWith(gd.i.f10453a);
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
                        pVarArr = this.f8322a;
                    }
                    pVarArr2 = pVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }
}
