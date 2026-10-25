package ce;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends l1 {
    public static final AtomicReferenceFieldUpdater f6206n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m e;
    public p0 f6207f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        m mVar = this.e;
        if (th2 != null) {
            mVar.getClass();
            he.v F = mVar.F(null, new v(th2, false));
            if (F != null) {
                mVar.f(F);
                d dVar = (d) f6206n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f6214b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f6215a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
