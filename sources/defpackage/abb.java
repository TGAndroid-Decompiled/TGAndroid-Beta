package defpackage;
public final class abb implements hf3 {
    @Override
    public final void a(vib vibVar, vib vibVar2, int i) {
        ui6 ui6Var = new ui6();
        for (ui6 ui6Var2 = (ui6) vibVar.f; ui6Var2 != null && ui6Var2 != vibVar2; ui6Var2 = (ui6) ui6Var2.f) {
            ui6Var.b(ui6Var2);
        }
        ui6Var.g();
        ui6 ui6Var3 = (ui6) vibVar.f;
        ui6Var.f = ui6Var3;
        if (ui6Var3 != null) {
            ui6Var3.e = ui6Var;
        }
        ui6Var.e = vibVar;
        vibVar.f = ui6Var;
        ui6 ui6Var4 = (ui6) vibVar.b;
        ui6Var.b = ui6Var4;
        if (((ui6) ui6Var.f) == null) {
            ui6Var4.d = ui6Var;
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
    public final int d(gf3 gf3Var, gf3 gf3Var2) {
        if (gf3Var.g >= 2 && gf3Var2.g >= 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final char e() {
        return '~';
    }
}
