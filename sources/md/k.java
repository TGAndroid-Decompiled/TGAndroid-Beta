package md;

import hd.f0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class k {
    public static final AtomicReferenceFieldUpdater f17657a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f17658b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f17659c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final md.k d() {
        throw new UnsupportedOperationException("Method not decompiled: md.k.d():md.k");
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17658b;
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
            Object obj = f17657a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        q qVar;
        k kVar;
        Object f10 = f();
        if (f10 instanceof q) {
            qVar = (q) f10;
        } else {
            qVar = null;
        }
        if (qVar != null && (kVar = qVar.f17669a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f10;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new kotlin.jvm.internal.m(this, f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + f0.k(this);
    }
}
