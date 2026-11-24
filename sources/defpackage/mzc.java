package defpackage;
public abstract class mzc {
    public final wzc a;
    public iq5[] b;

    public mzc() {
        this(new wzc());
    }

    public final void a() {
        iq5[] iq5VarArr = this.b;
        if (iq5VarArr != null) {
            iq5 iq5Var = iq5VarArr[0];
            iq5 iq5Var2 = iq5VarArr[1];
            wzc wzcVar = this.a;
            if (iq5Var2 == null) {
                iq5Var2 = wzcVar.a.f(2);
            }
            if (iq5Var == null) {
                iq5Var = wzcVar.a.f(1);
            }
            g(iq5.a(iq5Var, iq5Var2));
            iq5 iq5Var3 = this.b[j0f.a(16)];
            if (iq5Var3 != null) {
                f(iq5Var3);
            }
            iq5 iq5Var4 = this.b[j0f.a(32)];
            if (iq5Var4 != null) {
                d(iq5Var4);
            }
            iq5 iq5Var5 = this.b[j0f.a(64)];
            if (iq5Var5 != null) {
                h(iq5Var5);
            }
        }
    }

    public abstract wzc b();

    public void c(int i, iq5 iq5Var) {
        if (this.b == null) {
            this.b = new iq5[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[j0f.a(i2)] = iq5Var;
            }
        }
    }

    public abstract void e(iq5 iq5Var);

    public abstract void g(iq5 iq5Var);

    public mzc(wzc wzcVar) {
        this.a = wzcVar;
    }

    public void d(iq5 iq5Var) {
    }

    public void f(iq5 iq5Var) {
    }

    public void h(iq5 iq5Var) {
    }

    public void i(int i, boolean z) {
    }
}
