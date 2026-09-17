package ee;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class l {
    public static final AtomicReferenceFieldUpdater f9110a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9110a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a2 = nVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9110a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f9110a.get(this);
        nVar.getClass();
        long j3 = n.f9113f.get(nVar);
        return 1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9110a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d = nVar.d();
            if (d != n.f9114g) {
                return d;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
