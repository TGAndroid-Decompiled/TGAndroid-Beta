package defpackage;
public abstract class eu4 implements Cloneable {
    public final gu4 a;
    public gu4 b;

    public eu4(gu4 gu4Var) {
        this.a = gu4Var;
        if (!gu4Var.g()) {
            this.b = gu4Var.i();
        } else {
            u36.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final gu4 a() {
        gu4 b = b();
        b.getClass();
        if (gu4.f(b, true)) {
            return b;
        }
        throw new f7c();
    }

    public final gu4 b() {
        boolean g = this.b.g();
        gu4 gu4Var = this.b;
        if (!g) {
            return gu4Var;
        }
        gu4Var.getClass();
        gv8 gv8Var = gv8.c;
        gv8Var.getClass();
        gv8Var.a(gu4Var.getClass()).c(gu4Var);
        gu4Var.h();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            gu4 i = this.a.i();
            gu4 gu4Var = this.b;
            gv8 gv8Var = gv8.c;
            gv8Var.getClass();
            gv8Var.a(i.getClass()).b(i, gu4Var);
            this.b = i;
        }
    }

    public final Object clone() {
        eu4 eu4Var = (eu4) this.a.c(5);
        eu4Var.b = b();
        return eu4Var;
    }
}
