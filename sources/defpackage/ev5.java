package defpackage;

import sun.misc.Unsafe;
public abstract class ev5 extends pd6 implements xp3, ep5 {
    public ov5 d;

    @Override
    public final ul7 b() {
        return null;
    }

    @Override
    public final void dispose() {
        ev5 ev5Var;
        Unsafe unsafe;
        long j;
        ov5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof ev5) {
                if (v == this) {
                    do {
                        unsafe = fy.a;
                        j = ov5.b;
                        if (unsafe.compareAndSwapObject(j2, j, v, hcd.g)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(j2, j) == v);
                } else {
                    return;
                }
            } else if (!(v instanceof ep5) || ((ep5) v).b() == null) {
                return;
            } else {
                while (true) {
                    Object f = this.f();
                    if (!(f instanceof u89)) {
                        if (f == this) {
                            pd6 pd6Var = (pd6) f;
                            return;
                        }
                        f.getClass();
                        pd6 pd6Var2 = (pd6) f;
                        Unsafe unsafe2 = fy.a;
                        long j3 = pd6.c;
                        u89 u89Var = (u89) unsafe2.getObjectVolatile(pd6Var2, j3);
                        if (u89Var == null) {
                            u89Var = new u89(pd6Var2);
                            unsafe2.putObjectVolatile(pd6Var2, j3, u89Var);
                        }
                        u89 u89Var2 = u89Var;
                        while (true) {
                            Unsafe unsafe3 = fy.a;
                            long j4 = pd6.a;
                            ev5Var = this;
                            if (unsafe3.compareAndSwapObject(ev5Var, j4, f, u89Var2)) {
                                pd6Var2.d();
                                return;
                            } else if (unsafe3.getObjectVolatile(ev5Var, j4) != f) {
                                break;
                            } else {
                                this = ev5Var;
                            }
                        }
                    } else {
                        return;
                    }
                    this = ev5Var;
                }
            }
        }
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    public final ov5 j() {
        ov5 ov5Var = this.d;
        if (ov5Var != null) {
            return ov5Var;
        }
        rr5.e("job");
        throw null;
    }

    public boolean k() {
        return false;
    }

    public void l(Throwable th) {
        throw null;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + ea3.a(this) + "[job@" + ea3.a(j()) + ']';
    }
}
