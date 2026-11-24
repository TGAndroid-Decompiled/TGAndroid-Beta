package defpackage;
public abstract class lxc {
    public final vxc a;
    public io5[] b;

    public lxc() {
        this(new vxc());
    }

    public final void a() {
        io5[] io5VarArr = this.b;
        if (io5VarArr != null) {
            io5 io5Var = io5VarArr[0];
            io5 io5Var2 = io5VarArr[1];
            vxc vxcVar = this.a;
            if (io5Var2 == null) {
                io5Var2 = vxcVar.a.f(2);
            }
            if (io5Var == null) {
                io5Var = vxcVar.a.f(1);
            }
            g(io5.a(io5Var, io5Var2));
            io5 io5Var3 = this.b[hye.a(16)];
            if (io5Var3 != null) {
                f(io5Var3);
            }
            io5 io5Var4 = this.b[hye.a(32)];
            if (io5Var4 != null) {
                d(io5Var4);
            }
            io5 io5Var5 = this.b[hye.a(64)];
            if (io5Var5 != null) {
                h(io5Var5);
            }
        }
    }

    public abstract vxc b();

    public void c(int i, io5 io5Var) {
        if (this.b == null) {
            this.b = new io5[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[hye.a(i2)] = io5Var;
            }
        }
    }

    public abstract void e(io5 io5Var);

    public abstract void g(io5 io5Var);

    public lxc(vxc vxcVar) {
        this.a = vxcVar;
    }

    public void d(io5 io5Var) {
    }

    public void f(io5 io5Var) {
    }

    public void h(io5 io5Var) {
    }

    public void i(int i, boolean z) {
    }
}
