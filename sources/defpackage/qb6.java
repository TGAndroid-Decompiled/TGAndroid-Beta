package defpackage;

import sun.misc.Unsafe;
public abstract class qb6 {
    public static final long a;
    public static final long b;
    public static final long c;
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    static {
        Unsafe unsafe = ex.a;
        a = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(qb6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(qb6 qb6Var, int i) {
        qb6 qb6Var2;
        qb6 qb6Var3;
        while (true) {
            qb6 h = this.h();
            if (h instanceof c56) {
                if ((((c56) h).d & i) == 0 && h.c(qb6Var, i)) {
                    return true;
                }
                return false;
            }
            Unsafe unsafe = ex.a;
            unsafe.putObjectVolatile(qb6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(qb6Var, j, this);
            while (true) {
                Unsafe unsafe2 = ex.a;
                qb6Var2 = this;
                qb6Var3 = qb6Var;
                if (unsafe2.compareAndSwapObject(h, a, qb6Var2, qb6Var3)) {
                    qb6Var3.e(qb6Var2);
                    return true;
                } else if (unsafe2.getObjectVolatile(h, j) != qb6Var2) {
                    break;
                } else {
                    this = qb6Var2;
                    qb6Var = qb6Var3;
                }
            }
            this = qb6Var2;
            qb6Var = qb6Var3;
        }
    }

    public final defpackage.qb6 d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb6.d():qb6");
    }

    public final void e(qb6 qb6Var) {
        qb6 qb6Var2;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            qb6 qb6Var3 = (qb6) unsafe.getObjectVolatile(qb6Var, j);
            if (this.f() != qb6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                qb6Var2 = this;
                qb6 qb6Var4 = qb6Var;
                if (unsafe2.compareAndSwapObject(qb6Var4, b, qb6Var3, qb6Var2)) {
                    if (qb6Var2.i()) {
                        qb6Var4.d();
                        return;
                    }
                    return;
                }
                qb6Var = qb6Var4;
                if (unsafe2.getObjectVolatile(qb6Var4, j) != qb6Var3) {
                    break;
                }
                this = qb6Var2;
            }
            this = qb6Var2;
        }
    }

    public final Object f() {
        return ex.a.getObjectVolatile(this, a);
    }

    public final qb6 g() {
        s69 s69Var;
        Object f = f();
        if (f instanceof s69) {
            s69Var = (s69) f;
        } else {
            s69Var = null;
        }
        if (s69Var != null) {
            return s69Var.a;
        }
        f.getClass();
        return (qb6) f;
    }

    public final qb6 h() {
        qb6 d = d();
        if (d == null) {
            Unsafe unsafe = ex.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            while (true) {
                qb6 qb6Var = (qb6) objectVolatile;
                if (!qb6Var.i()) {
                    return qb6Var;
                }
                objectVolatile = ex.a.getObjectVolatile(qb6Var, j);
            }
        } else {
            return d;
        }
    }

    public boolean i() {
        return f() instanceof s69;
    }

    public String toString() {
        return new zs8(this, s83.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + s83.a(this);
    }
}
