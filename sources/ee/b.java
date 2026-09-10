package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f7475a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f7471a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7475a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        v vVar = a.f7471a;
        if (obj2 == vVar) {
            v c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == vVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != vVar) {
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

    public abstract v c(Object obj);
}
