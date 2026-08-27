package nd;

import id.f0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k {

    public static final AtomicReferenceFieldUpdater f18493a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    public static final AtomicReferenceFieldUpdater f18494b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    public static final AtomicReferenceFieldUpdater f18495c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final k d() {
        k kVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18494b;
            k kVar2 = (k) atomicReferenceFieldUpdater2.get(this);
            kVar = kVar2;
            while (true) {
                k kVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f18493a;
                    obj = atomicReferenceFieldUpdater.get(kVar);
                    if (obj == this) {
                        if (kVar2 != kVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar2, kVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != kVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (h()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(kVar);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar;
                        kVar = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar = (k) atomicReferenceFieldUpdater2.get(kVar);
                    }
                }
                k kVar4 = ((q) obj).f18505a;
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar3, kVar, kVar4)) {
                    if (atomicReferenceFieldUpdater.get(kVar3) != kVar) {
                        break;
                    }
                }
                kVar = kVar3;
            }
        }
        return kVar;
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18494b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() != kVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (h()) {
                        kVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(kVar) == kVar2);
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f18493a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        k kVar;
        Object objF = f();
        q qVar = objF instanceof q ? (q) objF : null;
        if (qVar != null && (kVar = qVar.f18505a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.j.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) objF;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new j(this, f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + f0.k(this);
    }
}
