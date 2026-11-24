package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class uc0 extends ft5 {
    public static final long n = ex.a.objectFieldOffset(uc0.class.getDeclaredField("_disposer$volatile"));
    private volatile Object _disposer$volatile;
    public final na1 e;
    public no3 f;
    public final wc0 h;

    public uc0(wc0 wc0Var, na1 na1Var) {
        this.h = wc0Var;
        this.e = na1Var;
    }

    @Override
    public final void l(Throwable th) {
        na1 na1Var = this.e;
        if (th != null) {
            lo5 E = na1Var.E(new fp2(th, false), null);
            if (E != null) {
                na1Var.e(E);
                vc0 vc0Var = (vc0) ex.a.getObjectVolatile(this, n);
                if (vc0Var != null) {
                    vc0Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = wc0.b;
        wc0 wc0Var = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(wc0Var) == 0) {
            zc3[] zc3VarArr = wc0Var.a;
            ArrayList arrayList = new ArrayList(zc3VarArr.length);
            for (zc3 zc3Var : zc3VarArr) {
                arrayList.add(zc3Var.getCompleted());
            }
            na1Var.resumeWith(arrayList);
        }
    }
}
