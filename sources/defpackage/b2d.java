package defpackage;
public abstract class b2d {
    public final l2d a;
    public mq5[] b;

    public b2d() {
        this(new l2d());
    }

    public final void a() {
        mq5[] mq5VarArr = this.b;
        if (mq5VarArr != null) {
            mq5 mq5Var = mq5VarArr[0];
            mq5 mq5Var2 = mq5VarArr[1];
            l2d l2dVar = this.a;
            if (mq5Var2 == null) {
                mq5Var2 = l2dVar.a.f(2);
            }
            if (mq5Var == null) {
                mq5Var = l2dVar.a.f(1);
            }
            g(mq5.a(mq5Var, mq5Var2));
            mq5 mq5Var3 = this.b[b3f.a(16)];
            if (mq5Var3 != null) {
                f(mq5Var3);
            }
            mq5 mq5Var4 = this.b[b3f.a(32)];
            if (mq5Var4 != null) {
                d(mq5Var4);
            }
            mq5 mq5Var5 = this.b[b3f.a(64)];
            if (mq5Var5 != null) {
                h(mq5Var5);
            }
        }
    }

    public abstract l2d b();

    public void c(int i, mq5 mq5Var) {
        if (this.b == null) {
            this.b = new mq5[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[b3f.a(i2)] = mq5Var;
            }
        }
    }

    public abstract void e(mq5 mq5Var);

    public abstract void g(mq5 mq5Var);

    public b2d(l2d l2dVar) {
        this.a = l2dVar;
    }

    public void d(mq5 mq5Var) {
    }

    public void f(mq5 mq5Var) {
    }

    public void h(mq5 mq5Var) {
    }

    public void i(int i, boolean z) {
    }
}
