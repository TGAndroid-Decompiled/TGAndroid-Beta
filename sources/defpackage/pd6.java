package defpackage;

import sun.misc.Unsafe;
public abstract class pd6 {
    public static final long a;
    public static final long b;
    public static final long c;
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    static {
        Unsafe unsafe = fy.a;
        a = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_prev$volatile"));
        c = unsafe.objectFieldOffset(pd6.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean c(pd6 pd6Var, int i) {
        pd6 pd6Var2;
        pd6 pd6Var3;
        while (true) {
            pd6 h = this.h();
            if (h instanceof c76) {
                if ((((c76) h).d & i) == 0 && h.c(pd6Var, i)) {
                    return true;
                }
                return false;
            }
            Unsafe unsafe = fy.a;
            unsafe.putObjectVolatile(pd6Var, b, h);
            long j = a;
            unsafe.putObjectVolatile(pd6Var, j, this);
            while (true) {
                Unsafe unsafe2 = fy.a;
                pd6Var2 = this;
                pd6Var3 = pd6Var;
                if (unsafe2.compareAndSwapObject(h, a, pd6Var2, pd6Var3)) {
                    pd6Var3.e(pd6Var2);
                    return true;
                } else if (unsafe2.getObjectVolatile(h, j) != pd6Var2) {
                    break;
                } else {
                    this = pd6Var2;
                    pd6Var = pd6Var3;
                }
            }
            this = pd6Var2;
            pd6Var = pd6Var3;
        }
    }

    public final defpackage.pd6 d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd6.d():pd6");
    }

    public final void e(pd6 pd6Var) {
        pd6 pd6Var2;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            pd6 pd6Var3 = (pd6) unsafe.getObjectVolatile(pd6Var, j);
            if (this.f() != pd6Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                pd6Var2 = this;
                pd6 pd6Var4 = pd6Var;
                if (unsafe2.compareAndSwapObject(pd6Var4, b, pd6Var3, pd6Var2)) {
                    if (pd6Var2.i()) {
                        pd6Var4.d();
                        return;
                    }
                    return;
                }
                pd6Var = pd6Var4;
                if (unsafe2.getObjectVolatile(pd6Var4, j) != pd6Var3) {
                    break;
                }
                this = pd6Var2;
            }
            this = pd6Var2;
        }
    }

    public final Object f() {
        return fy.a.getObjectVolatile(this, a);
    }

    public final pd6 g() {
        u89 u89Var;
        Object f = f();
        if (f instanceof u89) {
            u89Var = (u89) f;
        } else {
            u89Var = null;
        }
        if (u89Var != null) {
            return u89Var.a;
        }
        f.getClass();
        return (pd6) f;
    }

    public final pd6 h() {
        pd6 d = d();
        if (d == null) {
            Unsafe unsafe = fy.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            while (true) {
                pd6 pd6Var = (pd6) objectVolatile;
                if (!pd6Var.i()) {
                    return pd6Var;
                }
                objectVolatile = fy.a.getObjectVolatile(pd6Var, j);
            }
        } else {
            return d;
        }
    }

    public boolean i() {
        return f() instanceof u89;
    }

    public String toString() {
        return new av8(this, ea3.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + ea3.a(this);
    }
}
