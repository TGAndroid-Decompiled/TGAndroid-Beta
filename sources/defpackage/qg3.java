package defpackage;
public final class qg3 implements ef7 {
    public final byte a;
    public final uj3 b;

    public qg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        boolean z = true;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    z = false;
                }
                uj3Var.W1 = z;
                uc7.f1().edit().putBoolean("askAboutContacts", uj3Var.W1).apply();
                uj3Var.C2(false);
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                uj3Var.W1 = z;
                uc7.f1().edit().putBoolean("askAboutContacts", uj3Var.W1).commit();
                uj3Var.C2(false);
                return;
        }
    }
}
