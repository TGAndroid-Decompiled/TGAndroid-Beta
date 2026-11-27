package defpackage;
public final class bq7 implements hx5 {
    public final hx5 a;
    public final p8a b;

    public bq7(hx5 hx5Var) {
        hx5Var.getClass();
        this.a = hx5Var;
        this.b = new p8a(hx5Var.d());
    }

    @Override
    public final void b(d30 d30Var, Object obj) {
        if (obj != null) {
            d30Var.j(this.a, obj);
        } else {
            d30Var.g();
        }
    }

    @Override
    public final Object c(ykf ykfVar) {
        if (ykfVar.i()) {
            return ykfVar.l(this.a);
        }
        return null;
    }

    @Override
    public final o8a d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bq7.class == obj.getClass() && ur5.a(this.a, ((bq7) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
