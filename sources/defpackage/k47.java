package defpackage;
public final class k47 implements nq9 {
    public final fs4 a;
    public final t5c b;
    public final c74 c;

    public k47(t5c t5cVar, c74 c74Var, fs4 fs4Var) {
        this.b = t5cVar;
        c74Var.getClass();
        this.c = c74Var;
        this.a = fs4Var;
    }

    @Override
    public final fs4 a() {
        fs4 fs4Var = this.a;
        if (ug8.A(fs4Var)) {
            return fs4Var.i();
        }
        return ((ds4) fs4Var.c(5)).b();
    }

    @Override
    public final void b(Object obj, Object obj2) {
        qq9.k(this.b, obj, obj2);
    }

    @Override
    public final void c(Object obj) {
        this.b.getClass();
        s5c s5cVar = ((fs4) obj).unknownFields;
        if (s5cVar.e) {
            s5cVar.e = false;
        }
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    @Override
    public final boolean d(Object obj) {
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    @Override
    public final boolean e(fs4 fs4Var, fs4 fs4Var2) {
        this.b.getClass();
        if (!fs4Var.unknownFields.equals(fs4Var2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override
    public final int f(fs4 fs4Var) {
        this.b.getClass();
        return fs4Var.unknownFields.hashCode();
    }

    @Override
    public final int g(fs4 fs4Var) {
        this.b.getClass();
        s5c s5cVar = fs4Var.unknownFields;
        int i = s5cVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < s5cVar.a; i3++) {
            int h = ck2.h(s5cVar.b[i3] >>> 3) + ck2.g(2);
            int g = ck2.g(3);
            int size = ((f51) s5cVar.c[i3]).size();
            i2 += ck2.h(size) + size + g + h + (ck2.g(1) << 1);
        }
        s5cVar.d = i2;
        return i2;
    }

    @Override
    public final void h(Object obj, af0 af0Var, b74 b74Var) {
        this.b.getClass();
        t5c.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void i(Object obj, l69 l69Var) {
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }
}
