package defpackage;

import sun.misc.Unsafe;
public abstract class iv5 extends ud6 implements ep3, hp5 {
    public sv5 d;

    @Override
    public final qm7 b() {
        return null;
    }

    @Override
    public final void dispose() {
        iv5 iv5Var;
        Unsafe unsafe;
        long j;
        sv5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof iv5) {
                if (v == this) {
                    do {
                        unsafe = fx.a;
                        j = sv5.b;
                        if (unsafe.compareAndSwapObject(j2, j, v, yed.g)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(j2, j) == v);
                } else {
                    return;
                }
            } else if (!(v instanceof hp5) || ((hp5) v).b() == null) {
                return;
            } else {
                while (true) {
                    Object f = this.f();
                    if (!(f instanceof fa9)) {
                        if (f == this) {
                            ud6 ud6Var = (ud6) f;
                            return;
                        }
                        f.getClass();
                        ud6 ud6Var2 = (ud6) f;
                        Unsafe unsafe2 = fx.a;
                        long j3 = ud6.c;
                        fa9 fa9Var = (fa9) unsafe2.getObjectVolatile(ud6Var2, j3);
                        if (fa9Var == null) {
                            fa9Var = new fa9(ud6Var2);
                            unsafe2.putObjectVolatile(ud6Var2, j3, fa9Var);
                        }
                        fa9 fa9Var2 = fa9Var;
                        while (true) {
                            Unsafe unsafe3 = fx.a;
                            long j4 = ud6.a;
                            iv5Var = this;
                            if (unsafe3.compareAndSwapObject(iv5Var, j4, f, fa9Var2)) {
                                ud6Var2.d();
                                return;
                            } else if (unsafe3.getObjectVolatile(iv5Var, j4) != f) {
                                break;
                            } else {
                                this = iv5Var;
                            }
                        }
                    } else {
                        return;
                    }
                    this = iv5Var;
                }
            }
        }
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    public final sv5 j() {
        sv5 sv5Var = this.d;
        if (sv5Var != null) {
            return sv5Var;
        }
        ur5.e("job");
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
        return getClass().getSimpleName() + '@' + l93.a(this) + "[job@" + l93.a(j()) + ']';
    }
}
