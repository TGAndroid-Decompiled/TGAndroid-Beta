package defpackage;
public final class nz6 extends bqb {
    public final bqb e;
    public final co5 f;
    public final co5 g;

    public nz6(bqb bqbVar, co5 co5Var, co5 co5Var2) {
        this.e = bqbVar;
        this.f = co5Var;
        this.g = co5Var2;
    }

    @Override
    public final int a(boolean z) {
        return this.e.a(z);
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        bqb bqbVar = this.e;
        if (z && (obj2 = ((x79) this.g).n.get(obj)) != null) {
            return bqbVar.b(obj2);
        }
        return bqbVar.b(obj);
    }

    @Override
    public final int c(boolean z) {
        return this.e.c(z);
    }

    @Override
    public final int e(int i, int i2, boolean z) {
        return this.e.e(i, i2, z);
    }

    @Override
    public final ypb f(int i, ypb ypbVar, boolean z) {
        String str;
        String str2;
        this.e.f(i, ypbVar, z);
        if (z) {
            Object obj = ypbVar.a;
            co5 co5Var = this.g;
            if (obj != null && (str2 = (String) co5Var.get(obj)) != null) {
                ypbVar.a = str2;
            }
            Object obj2 = ypbVar.b;
            if (obj2 != null && (str = (String) co5Var.get(obj2)) != null) {
                ypbVar.b = str;
            }
        }
        return ypbVar;
    }

    @Override
    public final int h() {
        return this.e.h();
    }

    @Override
    public final int k(int i, int i2, boolean z) {
        return this.e.k(i, i2, z);
    }

    @Override
    public final Object l(int i) {
        Object l = this.e.l(i);
        String str = (String) this.g.get(l);
        if (str == null) {
            return l;
        }
        return str;
    }

    @Override
    public final aqb m(int i, aqb aqbVar, long j) {
        String str;
        this.e.m(i, aqbVar, j);
        Object obj = aqbVar.a;
        if (obj != null && (str = (String) this.f.get(obj)) != null) {
            aqbVar.a = str;
        }
        return aqbVar;
    }

    @Override
    public final int o() {
        return this.e.o();
    }
}
