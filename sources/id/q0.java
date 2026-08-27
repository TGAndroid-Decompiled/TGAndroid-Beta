package id;

import h7.k6;
import java.lang.reflect.InvocationTargetException;

public final class q0 extends l1 {

    public final int f11182e;

    public final Object f11183f;

    public q0(Object obj, int i10) {
        this.f11182e = i10;
        this.f11183f = obj;
    }

    @Override
    public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
        switch (this.f11182e) {
            case 0:
                ((p0) this.f11183f).dispose();
                return;
            case 1:
                ((e1) this.f11183f).a(th);
                return;
            case 2:
                ((v1) this.f11183f).u();
                throw null;
            case 3:
                m1 m1Var = (m1) this.f11183f;
                Object objU = i().u();
                if (objU instanceof v) {
                    m1Var.resumeWith(k6.a(((v) objU).f11204a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(objU));
                    return;
                }
            default:
                ((m) this.f11183f).resumeWith(pc.i.f45696a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.f11182e = 2;
        this.f11183f = v1Var;
    }
}
