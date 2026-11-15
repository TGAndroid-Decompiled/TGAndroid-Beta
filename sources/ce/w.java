package ce;

import aa.b0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class w extends de.b implements u, c, de.e {
    public static final AtomicReferenceFieldUpdater f4979e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public w(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final java.lang.Object G(ce.d r18, kd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: ce.w.G(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public final c Q(id.h hVar, int i7, be.a aVar) {
        if ((((i7 >= 0 && i7 < 2) || i7 == -2) && aVar == be.a.f3138b) || ((i7 == 0 || i7 == -3) && aVar == be.a.f3137a)) {
            return this;
        }
        return new b(this, hVar, i7, aVar, 1);
    }

    @Override
    public final Object a(Object obj, id.c cVar) {
        if (obj == null) {
            obj = de.g.f8066a;
        }
        c(null, obj);
        return gd.k.f13173a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i7;
        y[] yVarArr;
        b0 b0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4979e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.d;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.d = i11;
                y[] yVarArr2 = this.f8056a;
                while (true) {
                    if (yVarArr2 != null) {
                        for (y yVar : yVarArr2) {
                            if (yVar != null) {
                                AtomicReference atomicReference = yVar.f4982a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (b0Var = x.f4981b)) {
                                        b0 b0Var2 = x.f4980a;
                                        if (obj4 == b0Var2) {
                                            while (!atomicReference.compareAndSet(obj4, b0Var)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, b0Var2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((zd.m) obj4).resumeWith(gd.k.f13173a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i7 = this.d;
                        if (i7 == i11) {
                            this.d = i11 + 1;
                            return true;
                        }
                        yVarArr = this.f8056a;
                    }
                    yVarArr2 = yVarArr;
                    i11 = i7;
                }
            } else {
                this.d = i10 + 2;
                return true;
            }
        }
    }
}
