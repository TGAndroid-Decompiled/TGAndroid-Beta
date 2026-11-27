package defpackage;
public abstract class hu4 implements Cloneable {
    public final ju4 a;
    public ju4 b;

    public hu4(ju4 ju4Var) {
        this.a = ju4Var;
        if (!ju4Var.g()) {
            this.b = ju4Var.i();
        } else {
            lq5.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final ju4 a() {
        ju4 b = b();
        b.getClass();
        if (ju4.f(b, true)) {
            return b;
        }
        throw new f9c();
    }

    public final ju4 b() {
        boolean g = this.b.g();
        ju4 ju4Var = this.b;
        if (!g) {
            return ju4Var;
        }
        ju4Var.getClass();
        ow8 ow8Var = ow8.c;
        ow8Var.getClass();
        ow8Var.a(ju4Var.getClass()).c(ju4Var);
        ju4Var.h();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            ju4 i = this.a.i();
            ju4 ju4Var = this.b;
            ow8 ow8Var = ow8.c;
            ow8Var.getClass();
            ow8Var.a(i.getClass()).b(i, ju4Var);
            this.b = i;
        }
    }

    public final Object clone() {
        hu4 hu4Var = (hu4) this.a.c(5);
        hu4Var.b = b();
        return hu4Var;
    }
}
