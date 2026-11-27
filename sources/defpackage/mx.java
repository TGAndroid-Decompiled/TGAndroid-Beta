package defpackage;
public final class mx implements pe3 {
    public final char a;

    public mx(byte b) {
        this('*');
        switch (b) {
            case 1:
                this('_');
                return;
            default:
                return;
        }
    }

    @Override
    public final void a(qkb qkbVar, qkb qkbVar2, int i) {
        p24 p24Var;
        String.valueOf(this.a);
        if (i == 1) {
            p24Var = new p24((byte) 0);
        } else {
            p24Var = new p24((byte) 3);
        }
        for (yi6 yi6Var = (yi6) qkbVar.f; yi6Var != null && yi6Var != qkbVar2; yi6Var = (yi6) yi6Var.f) {
            p24Var.b(yi6Var);
        }
        p24Var.g();
        yi6 yi6Var2 = (yi6) qkbVar.f;
        p24Var.f = yi6Var2;
        if (yi6Var2 != null) {
            yi6Var2.e = p24Var;
        }
        p24Var.e = qkbVar;
        qkbVar.f = p24Var;
        yi6 yi6Var3 = (yi6) qkbVar.b;
        p24Var.b = yi6Var3;
        if (((yi6) p24Var.f) == null) {
            yi6Var3.d = p24Var;
        }
    }

    @Override
    public final char b() {
        return this.a;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final int d(oe3 oe3Var, oe3 oe3Var2) {
        if (oe3Var.d || oe3Var2.c) {
            int i = oe3Var2.h;
            if (i % 3 != 0 && (oe3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        if (oe3Var.g >= 2 && oe3Var2.g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char e() {
        return this.a;
    }

    public mx(char c) {
        this.a = c;
    }
}
