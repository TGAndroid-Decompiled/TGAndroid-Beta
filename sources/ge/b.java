package ge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f10108a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f10104a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10108a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        a6.i iVar = a.f10104a;
        if (obj2 == iVar) {
            a6.i c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == iVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, iVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != iVar) {
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

    public abstract a6.i c(Object obj);
}
