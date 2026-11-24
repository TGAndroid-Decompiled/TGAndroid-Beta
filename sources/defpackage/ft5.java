package defpackage;

import sun.misc.Unsafe;
public abstract class ft5 extends qb6 implements no3, en5 {
    public pt5 d;

    @Override
    public final rj7 b() {
        return null;
    }

    @Override
    public final void dispose() {
        ft5 ft5Var;
        Unsafe unsafe;
        long j;
        pt5 j2 = j();
        while (true) {
            Object v = j2.v();
            if (v instanceof ft5) {
                if (v == this) {
                    do {
                        unsafe = ex.a;
                        j = pt5.b;
                        if (unsafe.compareAndSwapObject(j2, j, v, fad.g)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(j2, j) == v);
                } else {
                    return;
                }
            } else if (!(v instanceof en5) || ((en5) v).b() == null) {
                return;
            } else {
                while (true) {
                    Object f = this.f();
                    if (!(f instanceof s69)) {
                        if (f == this) {
                            qb6 qb6Var = (qb6) f;
                            return;
                        }
                        f.getClass();
                        qb6 qb6Var2 = (qb6) f;
                        Unsafe unsafe2 = ex.a;
                        long j3 = qb6.c;
                        s69 s69Var = (s69) unsafe2.getObjectVolatile(qb6Var2, j3);
                        if (s69Var == null) {
                            s69Var = new s69(qb6Var2);
                            unsafe2.putObjectVolatile(qb6Var2, j3, s69Var);
                        }
                        s69 s69Var2 = s69Var;
                        while (true) {
                            Unsafe unsafe3 = ex.a;
                            long j4 = qb6.a;
                            ft5Var = this;
                            if (unsafe3.compareAndSwapObject(ft5Var, j4, f, s69Var2)) {
                                qb6Var2.d();
                                return;
                            } else if (unsafe3.getObjectVolatile(ft5Var, j4) != f) {
                                break;
                            } else {
                                this = ft5Var;
                            }
                        }
                    } else {
                        return;
                    }
                    this = ft5Var;
                }
            }
        }
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    public final pt5 j() {
        pt5 pt5Var = this.d;
        if (pt5Var != null) {
            return pt5Var;
        }
        rp5.e("job");
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
        return getClass().getSimpleName() + '@' + s83.a(this) + "[job@" + s83.a(j()) + ']';
    }
}
