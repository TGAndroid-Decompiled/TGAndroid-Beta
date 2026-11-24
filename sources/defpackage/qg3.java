package defpackage;
public final class qg3 implements uc7 {
    public final byte a;
    public final cj3 b;

    public qg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        boolean z = true;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    z = false;
                }
                cj3Var.W1 = z;
                na7.d1().edit().putBoolean("askAboutContacts", cj3Var.W1).commit();
                cj3Var.A2(false);
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                cj3Var.W1 = z;
                na7.d1().edit().putBoolean("askAboutContacts", cj3Var.W1).apply();
                cj3Var.A2(false);
                return;
        }
    }
}
