package defpackage;

import java.util.Arrays;
public abstract class fpb {
    public static final long b = fy.a.objectFieldOffset(fpb.class.getDeclaredField("_size$volatile"));
    private volatile int _size$volatile;
    public r54[] a;

    public final void a(r54 r54Var) {
        r54Var.d((s54) this);
        r54[] r54VarArr = this.a;
        if (r54VarArr == null) {
            r54VarArr = new r54[4];
            this.a = r54VarArr;
        } else if (b() >= r54VarArr.length) {
            r54VarArr = (r54[]) Arrays.copyOf(r54VarArr, b() << 1);
            this.a = r54VarArr;
        }
        int b2 = b();
        fy.a.putIntVolatile(this, b, b2 + 1);
        r54VarArr[b2] = r54Var;
        r54Var.b = b2;
        e(b2);
    }

    public final int b() {
        return fy.a.getIntVolatile(this, b);
    }

    public final void c(r54 r54Var) {
        synchronized (this) {
            if (r54Var.b() != null) {
                d(r54Var.b);
            }
        }
    }

    public final defpackage.r54 d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpb.d(int):r54");
    }

    public final void e(int i) {
        while (i > 0) {
            r54[] r54VarArr = this.a;
            r54VarArr.getClass();
            int i2 = (i - 1) / 2;
            r54 r54Var = r54VarArr[i2];
            r54Var.getClass();
            r54 r54Var2 = r54VarArr[i];
            r54Var2.getClass();
            if (r54Var.compareTo(r54Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        r54[] r54VarArr = this.a;
        r54VarArr.getClass();
        r54 r54Var = r54VarArr[i2];
        r54Var.getClass();
        r54 r54Var2 = r54VarArr[i];
        r54Var2.getClass();
        r54VarArr[i] = r54Var;
        r54VarArr[i2] = r54Var2;
        r54Var.b = i;
        r54Var2.b = i2;
    }
}
