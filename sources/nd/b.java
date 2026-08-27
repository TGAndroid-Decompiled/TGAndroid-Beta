package nd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends p {

    public static final AtomicReferenceFieldUpdater f18479a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f18474a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18479a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        ec.a aVar = a.f18474a;
        if (obj2 == aVar) {
            ec.a aVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == aVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = aVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract ec.a c(Object obj);
}
