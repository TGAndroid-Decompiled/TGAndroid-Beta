package defpackage;
public final class wcb implements pe3 {
    @Override
    public final void a(qkb qkbVar, qkb qkbVar2, int i) {
        yi6 yi6Var = new yi6();
        for (yi6 yi6Var2 = (yi6) qkbVar.f; yi6Var2 != null && yi6Var2 != qkbVar2; yi6Var2 = (yi6) yi6Var2.f) {
            yi6Var.b(yi6Var2);
        }
        yi6Var.g();
        yi6 yi6Var3 = (yi6) qkbVar.f;
        yi6Var.f = yi6Var3;
        if (yi6Var3 != null) {
            yi6Var3.e = yi6Var;
        }
        yi6Var.e = qkbVar;
        qkbVar.f = yi6Var;
        yi6 yi6Var4 = (yi6) qkbVar.b;
        yi6Var.b = yi6Var4;
        if (((yi6) yi6Var.f) == null) {
            yi6Var4.d = yi6Var;
        }
    }

    @Override
    public final char b() {
        return '~';
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final int d(oe3 oe3Var, oe3 oe3Var2) {
        if (oe3Var.g >= 2 && oe3Var2.g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char e() {
        return '~';
    }
}
