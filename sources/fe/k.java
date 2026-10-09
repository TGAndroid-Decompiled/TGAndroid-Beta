package fe;

import ae.g0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class k {
    public static final AtomicReferenceFieldUpdater f9902a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f9903b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f9904c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final fe.k d() {
        throw new UnsupportedOperationException("Method not decompiled: fe.k.d():fe.k");
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9903b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() == kVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                        break;
                    }
                }
                if (h()) {
                    kVar.d();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f9902a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        q qVar;
        k kVar;
        Object f7 = f();
        if (f7 instanceof q) {
            qVar = (q) f7;
        } else {
            qVar = null;
        }
        if (qVar != null && (kVar = qVar.f9914a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f7;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new kotlin.jvm.internal.m(this, g0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + g0.k(this);
    }
}
