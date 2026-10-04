package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f8866a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f8861a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8866a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        com.google.android.gms.internal.clearcut.e eVar = a.f8861a;
        if (obj2 == eVar) {
            com.google.android.gms.internal.clearcut.e c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == eVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, eVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != eVar) {
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

    public abstract com.google.android.gms.internal.clearcut.e c(Object obj);
}
