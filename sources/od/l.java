package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.e0;
public class l {
    public static final AtomicReferenceFieldUpdater f19523a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f19524b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f19525c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final od.l d() {
        throw new UnsupportedOperationException("Method not decompiled: od.l.d():od.l");
    }

    public final void e(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19524b;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (f() == lVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                    if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                        break;
                    }
                }
                if (h()) {
                    lVar.d();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f19523a.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final l g() {
        r rVar;
        l lVar;
        Object f9 = f();
        if (f9 instanceof r) {
            rVar = (r) f9;
        } else {
            rVar = null;
        }
        if (rVar != null && (lVar = rVar.f19535a) != null) {
            return lVar;
        }
        kotlin.jvm.internal.j.c(f9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) f9;
    }

    public boolean h() {
        return f() instanceof r;
    }

    public String toString() {
        return new kotlin.jvm.internal.n(this, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + e0.k(this);
    }
}
