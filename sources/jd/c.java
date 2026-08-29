package jd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends k1 {
    public static final AtomicReferenceFieldUpdater f11449n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f11450e;
    public o0 f11451f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f11450e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        m mVar = this.f11450e;
        if (th2 != null) {
            mVar.getClass();
            fc.a F = mVar.F(null, new v(th2, false));
            if (F != null) {
                mVar.e(F);
                d dVar = (d) f11449n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f11458b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            h0[] h0VarArr = eVar.f11459a;
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
