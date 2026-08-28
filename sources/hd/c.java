package hd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends l1 {
    public static final AtomicReferenceFieldUpdater f10414n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f10415e;
    public p0 f10416f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f10415e = mVar;
    }

    @Override
    public final void a(Throwable th) {
        m mVar = this.f10415e;
        if (th != null) {
            mVar.getClass();
            e5.c F = mVar.F(null, new v(th, false));
            if (F != null) {
                mVar.e(F);
                d dVar = (d) f10414n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f10423b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f10424a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
