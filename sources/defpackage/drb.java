package defpackage;

import java.util.Arrays;
public abstract class drb {
    public static final long b = fx.a.objectFieldOffset(drb.class.getDeclaredField("_size$volatile"));
    private volatile int _size$volatile;
    public c54[] a;

    public final void a(c54 c54Var) {
        c54Var.d((d54) this);
        c54[] c54VarArr = this.a;
        if (c54VarArr == null) {
            c54VarArr = new c54[4];
            this.a = c54VarArr;
        } else if (b() >= c54VarArr.length) {
            c54VarArr = (c54[]) Arrays.copyOf(c54VarArr, b() << 1);
            this.a = c54VarArr;
        }
        int b2 = b();
        fx.a.putIntVolatile(this, b, b2 + 1);
        c54VarArr[b2] = c54Var;
        c54Var.b = b2;
        e(b2);
    }

    public final int b() {
        return fx.a.getIntVolatile(this, b);
    }

    public final void c(c54 c54Var) {
        synchronized (this) {
            if (c54Var.b() != null) {
                d(c54Var.b);
            }
        }
    }

    public final defpackage.c54 d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drb.d(int):c54");
    }

    public final void e(int i) {
        while (i > 0) {
            c54[] c54VarArr = this.a;
            c54VarArr.getClass();
            int i2 = (i - 1) / 2;
            c54 c54Var = c54VarArr[i2];
            c54Var.getClass();
            c54 c54Var2 = c54VarArr[i];
            c54Var2.getClass();
            if (c54Var.compareTo(c54Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        c54[] c54VarArr = this.a;
        c54VarArr.getClass();
        c54 c54Var = c54VarArr[i2];
        c54Var.getClass();
        c54 c54Var2 = c54VarArr[i];
        c54Var2.getClass();
        c54VarArr[i] = c54Var;
        c54VarArr[i2] = c54Var2;
        c54Var.b = i;
        c54Var2.b = i2;
    }
}
