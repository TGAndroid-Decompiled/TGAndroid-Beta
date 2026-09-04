package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f9065a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f9060a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9065a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        d9.f fVar = a.f9060a;
        if (obj2 == fVar) {
            d9.f c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == fVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != fVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract d9.f c(Object obj);
}
