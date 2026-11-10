package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
public class j {
    public static final AtomicReferenceFieldUpdater f10786a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f10787b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f10788c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final boolean c(j jVar, int i7) {
        while (true) {
            j d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10787b;
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d = (j) obj;
                    if (!d.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            if (d instanceof h) {
                if ((((h) d).d & i7) == 0 && d.c(jVar, i7)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(jVar, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10786a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(d) != this) {
                    break;
                }
            }
            jVar.e(this);
            return true;
        }
    }

    public final ee.j d() {
        throw new UnsupportedOperationException("Method not decompiled: ee.j.d():ee.j");
    }

    public final void e(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10787b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f10786a.get(this) == jVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                        break;
                    }
                }
                if (g()) {
                    jVar.d();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final j f() {
        o oVar;
        j jVar;
        Object obj = f10786a.get(this);
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null && (jVar = oVar.f10798a) != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean g() {
        return f10786a.get(this) instanceof o;
    }

    public String toString() {
        return new kotlin.jvm.internal.n(this, b0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + b0.j(this);
    }
}
