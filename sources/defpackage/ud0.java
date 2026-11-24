package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class ud0 extends ev5 {
    public static final long n = fy.a.objectFieldOffset(ud0.class.getDeclaredField("_disposer$volatile"));
    private volatile Object _disposer$volatile;
    public final vb1 e;
    public xp3 f;
    public final wd0 h;

    public ud0(wd0 wd0Var, vb1 vb1Var) {
        this.h = wd0Var;
        this.e = vb1Var;
    }

    @Override
    public final void l(Throwable th) {
        vb1 vb1Var = this.e;
        if (th != null) {
            du2 E = vb1Var.E(new qq2(th, false), null);
            if (E != null) {
                vb1Var.e(E);
                vd0 vd0Var = (vd0) fy.a.getObjectVolatile(this, n);
                if (vd0Var != null) {
                    vd0Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = wd0.b;
        wd0 wd0Var = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(wd0Var) == 0) {
            le3[] le3VarArr = wd0Var.a;
            ArrayList arrayList = new ArrayList(le3VarArr.length);
            for (le3 le3Var : le3VarArr) {
                arrayList.add(le3Var.getCompleted());
            }
            vb1Var.resumeWith(arrayList);
        }
    }
}
