package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class k {
    public static final AtomicReferenceFieldUpdater f3272a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3272a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a10 = mVar.a(runnable);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                m c2 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3272a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f3272a.get(this);
        mVar.getClass();
        long j10 = m.f3275f.get(mVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3272a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d = mVar.d();
            if (d != m.f3276g) {
                return d;
            }
            m c2 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c2) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
