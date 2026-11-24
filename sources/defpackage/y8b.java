package defpackage;
public final class y8b implements vd3 {
    @Override
    public final void a(ugb ugbVar, ugb ugbVar2, int i) {
        tg6 tg6Var = new tg6();
        for (tg6 tg6Var2 = (tg6) ugbVar.f; tg6Var2 != null && tg6Var2 != ugbVar2; tg6Var2 = (tg6) tg6Var2.f) {
            tg6Var.b(tg6Var2);
        }
        tg6Var.g();
        tg6 tg6Var3 = (tg6) ugbVar.f;
        tg6Var.f = tg6Var3;
        if (tg6Var3 != null) {
            tg6Var3.e = tg6Var;
        }
        tg6Var.e = ugbVar;
        ugbVar.f = tg6Var;
        tg6 tg6Var4 = (tg6) ugbVar.b;
        tg6Var.b = tg6Var4;
        if (((tg6) tg6Var.f) == null) {
            tg6Var4.d = tg6Var;
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
    public final int d(ud3 ud3Var, ud3 ud3Var2) {
        if (ud3Var.g >= 2 && ud3Var2.g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char e() {
        return '~';
    }
}
