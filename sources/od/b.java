package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends q {
    public static final AtomicReferenceFieldUpdater f19506a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f19501a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19506a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        fc.a aVar = a.f19501a;
        if (obj2 == aVar) {
            fc.a c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == aVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, c3)) {
                        obj2 = c3;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
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

    public abstract fc.a c(Object obj);
}
