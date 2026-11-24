package defpackage;
public final class lx implements vd3 {
    public final char a;

    public lx(byte b) {
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
    public final void a(ugb ugbVar, ugb ugbVar2, int i) {
        u14 u14Var;
        String.valueOf(this.a);
        if (i == 1) {
            u14Var = new u14((byte) 0);
        } else {
            u14Var = new u14((byte) 3);
        }
        for (tg6 tg6Var = (tg6) ugbVar.f; tg6Var != null && tg6Var != ugbVar2; tg6Var = (tg6) tg6Var.f) {
            u14Var.b(tg6Var);
        }
        u14Var.g();
        tg6 tg6Var2 = (tg6) ugbVar.f;
        u14Var.f = tg6Var2;
        if (tg6Var2 != null) {
            tg6Var2.e = u14Var;
        }
        u14Var.e = ugbVar;
        ugbVar.f = u14Var;
        tg6 tg6Var3 = (tg6) ugbVar.b;
        u14Var.b = tg6Var3;
        if (((tg6) u14Var.f) == null) {
            tg6Var3.d = u14Var;
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
    public final int d(ud3 ud3Var, ud3 ud3Var2) {
        if (ud3Var.d || ud3Var2.c) {
            int i = ud3Var2.h;
            if (i % 3 != 0 && (ud3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        if (ud3Var.g >= 2 && ud3Var2.g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char e() {
        return this.a;
    }

    public lx(char c) {
        this.a = c;
    }
}
