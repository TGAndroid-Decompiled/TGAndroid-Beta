package id;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class c extends l1 {

    public static final AtomicReferenceFieldUpdater f11123n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;

    public final m f11124e;

    public p0 f11125f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f11124e = mVar;
    }

    @Override
    public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
        m mVar = this.f11124e;
        if (th != null) {
            mVar.getClass();
            ec.a aVarF = mVar.F(null, new v(th, false));
            if (aVarF != null) {
                mVar.e(aVarF);
                d dVar = (d) f11123n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f11132b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f11133a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
