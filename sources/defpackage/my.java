package defpackage;
public final class my implements hf3 {
    public final char a;

    public my(byte b) {
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
    public final void a(vib vibVar, vib vibVar2, int i) {
        f34 f34Var;
        String.valueOf(this.a);
        if (i == 1) {
            f34Var = new f34((byte) 0);
        } else {
            f34Var = new f34((byte) 3);
        }
        for (ui6 ui6Var = (ui6) vibVar.f; ui6Var != null && ui6Var != vibVar2; ui6Var = (ui6) ui6Var.f) {
            f34Var.b(ui6Var);
        }
        f34Var.g();
        ui6 ui6Var2 = (ui6) vibVar.f;
        f34Var.f = ui6Var2;
        if (ui6Var2 != null) {
            ui6Var2.e = f34Var;
        }
        f34Var.e = vibVar;
        vibVar.f = f34Var;
        ui6 ui6Var3 = (ui6) vibVar.b;
        f34Var.b = ui6Var3;
        if (((ui6) f34Var.f) == null) {
            ui6Var3.d = f34Var;
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
    public final int d(gf3 gf3Var, gf3 gf3Var2) {
        if (gf3Var.d || gf3Var2.c) {
            int i = gf3Var2.h;
            if (i % 3 != 0 && (gf3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        if (gf3Var.g >= 2 && gf3Var2.g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override
    public final char e() {
        return this.a;
    }

    public my(char c) {
        this.a = c;
    }
}
