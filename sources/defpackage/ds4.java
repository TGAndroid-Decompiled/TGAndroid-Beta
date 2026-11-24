package defpackage;
public abstract class ds4 implements Cloneable {
    public final fs4 a;
    public fs4 b;

    public ds4(fs4 fs4Var) {
        this.a = fs4Var;
        if (!fs4Var.g()) {
            this.b = fs4Var.i();
        } else {
            w26.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final fs4 a() {
        fs4 b = b();
        b.getClass();
        if (fs4.f(b, true)) {
            return b;
        }
        throw new f5c();
    }

    public final fs4 b() {
        boolean g = this.b.g();
        fs4 fs4Var = this.b;
        if (!g) {
            return fs4Var;
        }
        fs4Var.getClass();
        ft8 ft8Var = ft8.c;
        ft8Var.getClass();
        ft8Var.a(fs4Var.getClass()).c(fs4Var);
        fs4Var.h();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            fs4 i = this.a.i();
            fs4 fs4Var = this.b;
            ft8 ft8Var = ft8.c;
            ft8Var.getClass();
            ft8Var.a(i.getClass()).b(i, fs4Var);
            this.b = i;
        }
    }

    public final Object clone() {
        ds4 ds4Var = (ds4) this.a.c(5);
        ds4Var.b = b();
        return ds4Var;
    }
}
