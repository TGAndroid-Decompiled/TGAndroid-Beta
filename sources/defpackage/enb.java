package defpackage;

import java.util.Arrays;
public abstract class enb {
    public static final long b = ex.a.objectFieldOffset(enb.class.getDeclaredField("_size$volatile"));
    private volatile int _size$volatile;
    public g44[] a;

    public final void a(g44 g44Var) {
        g44Var.d((h44) this);
        g44[] g44VarArr = this.a;
        if (g44VarArr == null) {
            g44VarArr = new g44[4];
            this.a = g44VarArr;
        } else if (b() >= g44VarArr.length) {
            g44VarArr = (g44[]) Arrays.copyOf(g44VarArr, b() << 1);
            this.a = g44VarArr;
        }
        int b2 = b();
        ex.a.putIntVolatile(this, b, b2 + 1);
        g44VarArr[b2] = g44Var;
        g44Var.b = b2;
        e(b2);
    }

    public final int b() {
        return ex.a.getIntVolatile(this, b);
    }

    public final void c(g44 g44Var) {
        synchronized (this) {
            if (g44Var.b() != null) {
                d(g44Var.b);
            }
        }
    }

    public final defpackage.g44 d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enb.d(int):g44");
    }

    public final void e(int i) {
        while (i > 0) {
            g44[] g44VarArr = this.a;
            g44VarArr.getClass();
            int i2 = (i - 1) / 2;
            g44 g44Var = g44VarArr[i2];
            g44Var.getClass();
            g44 g44Var2 = g44VarArr[i];
            g44Var2.getClass();
            if (g44Var.compareTo(g44Var2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        g44[] g44VarArr = this.a;
        g44VarArr.getClass();
        g44 g44Var = g44VarArr[i2];
        g44Var.getClass();
        g44 g44Var2 = g44VarArr[i];
        g44Var2.getClass();
        g44VarArr[i] = g44Var;
        g44VarArr[i2] = g44Var2;
        g44Var.b = i;
        g44Var2.b = i2;
    }
}
