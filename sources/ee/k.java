package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class k {
    public static final AtomicReferenceFieldUpdater f10784a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10784a;
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
                m c10 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10784a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c10 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f10784a.get(this);
        mVar.getClass();
        long j3 = m.f10787f.get(mVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10784a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d = mVar.d();
            if (d != m.f10788g) {
                return d;
            }
            m c10 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c10) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
