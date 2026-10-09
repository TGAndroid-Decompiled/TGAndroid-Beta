package ae;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends m1 {
    public static final AtomicReferenceFieldUpdater f429n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f430e;
    public q0 f431f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f430e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        m mVar = this.f430e;
        if (th2 != null) {
            mVar.getClass();
            da.a F = mVar.F(null, new v(th2, false));
            if (F != null) {
                mVar.e(F);
                d dVar = (d) f429n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f436b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            j0[] j0VarArr = eVar.f437a;
            ArrayList arrayList = new ArrayList(j0VarArr.length);
            for (j0 j0Var : j0VarArr) {
                arrayList.add(j0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
