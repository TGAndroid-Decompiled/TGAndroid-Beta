package defpackage;

import sun.misc.Unsafe;
public abstract class ud6 {
    public static final long a;
    public static final long b;
    public static final long c;
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    static {
        Unsafe unsafe = fx.a;
        a = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(ud6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(ud6 ud6Var, int i) {
        ud6 ud6Var2;
        ud6 ud6Var3;
        while (true) {
            ud6 h = this.h();
            if (h instanceof g76) {
                if ((((g76) h).d & i) == 0 && h.c(ud6Var, i)) {
                    return true;
                }
                return false;
            }
            Unsafe unsafe = fx.a;
            unsafe.putObjectVolatile(ud6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(ud6Var, j, this);
            while (true) {
                Unsafe unsafe2 = fx.a;
                ud6Var2 = this;
                ud6Var3 = ud6Var;
                if (unsafe2.compareAndSwapObject(h, a, ud6Var2, ud6Var3)) {
                    ud6Var3.e(ud6Var2);
                    return true;
                } else if (unsafe2.getObjectVolatile(h, j) != ud6Var2) {
                    break;
                } else {
                    this = ud6Var2;
                    ud6Var = ud6Var3;
                }
            }
            this = ud6Var2;
            ud6Var = ud6Var3;
        }
    }

    public final defpackage.ud6 d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud6.d():ud6");
    }

    public final void e(ud6 ud6Var) {
        ud6 ud6Var2;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            ud6 ud6Var3 = (ud6) unsafe.getObjectVolatile(ud6Var, j);
            if (this.f() != ud6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                ud6Var2 = this;
                ud6 ud6Var4 = ud6Var;
                if (unsafe2.compareAndSwapObject(ud6Var4, b, ud6Var3, ud6Var2)) {
                    if (ud6Var2.i()) {
                        ud6Var4.d();
                        return;
                    }
                    return;
                }
                ud6Var = ud6Var4;
                if (unsafe2.getObjectVolatile(ud6Var4, j) != ud6Var3) {
                    break;
                }
                this = ud6Var2;
            }
            this = ud6Var2;
        }
    }

    public final Object f() {
        return fx.a.getObjectVolatile(this, a);
    }

    public final ud6 g() {
        fa9 fa9Var;
        Object f = f();
        if (f instanceof fa9) {
            fa9Var = (fa9) f;
        } else {
            fa9Var = null;
        }
        if (fa9Var != null) {
            return fa9Var.a;
        }
        f.getClass();
        return (ud6) f;
    }

    public final ud6 h() {
        ud6 d = d();
        if (d == null) {
            Unsafe unsafe = fx.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            while (true) {
                ud6 ud6Var = (ud6) objectVolatile;
                if (!ud6Var.i()) {
                    return ud6Var;
                }
                objectVolatile = fx.a.getObjectVolatile(ud6Var, j);
            }
        } else {
            return d;
        }
    }

    public boolean i() {
        return f() instanceof fa9;
    }

    public String toString() {
        return new iw8(this, l93.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + l93.a(this);
    }
}
