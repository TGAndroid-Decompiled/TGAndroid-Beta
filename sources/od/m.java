package od;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m {
    public static final AtomicReferenceFieldUpdater f19526a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19526a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int a2 = oVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                o c3 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19526a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) f19526a.get(this);
        oVar.getClass();
        long j10 = o.f19529f.get(oVar);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19526a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            Object d = oVar.d();
            if (d != o.f19530g) {
                return d;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
