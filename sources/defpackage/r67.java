package defpackage;
public final class r67 implements fu9 {
    public final ju4 a;
    public final t9c b;
    public final w74 c;

    public r67(t9c t9cVar, w74 w74Var, ju4 ju4Var) {
        this.b = t9cVar;
        w74Var.getClass();
        this.c = w74Var;
        this.a = ju4Var;
    }

    @Override
    public final ju4 a() {
        ju4 ju4Var = this.a;
        if (ik8.A(ju4Var)) {
            return ju4Var.i();
        }
        return ((hu4) ju4Var.c(5)).b();
    }

    @Override
    public final void b(Object obj, Object obj2) {
        iu9.k(this.b, obj, obj2);
    }

    @Override
    public final void c(Object obj) {
        this.b.getClass();
        s9c s9cVar = ((ju4) obj).unknownFields;
        if (s9cVar.e) {
            s9cVar.e = false;
        }
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final boolean d(Object obj) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final boolean e(ju4 ju4Var, ju4 ju4Var2) {
        this.b.getClass();
        if (!ju4Var.unknownFields.equals(ju4Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override
    public final int f(ju4 ju4Var) {
        this.b.getClass();
        return ju4Var.unknownFields.hashCode();
    }

    @Override
    public final void g(Object obj, z8d z8dVar) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final int h(ju4 ju4Var) {
        this.b.getClass();
        s9c s9cVar = ju4Var.unknownFields;
        int i = s9cVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < s9cVar.a; i3++) {
            int h = xk2.h(s9cVar.b[i3] >>> 3) + xk2.g(2);
            int g = xk2.g(3);
            int size = ((n51) s9cVar.c[i3]).size();
            i2 += xk2.h(size) + size + g + h + (xk2.g(1) << 1);
        }
        s9cVar.d = i2;
        return i2;
    }

    @Override
    public final void i(Object obj, cf0 cf0Var, v74 v74Var) {
        this.b.getClass();
        t9c.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
