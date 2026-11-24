package defpackage;
public final class ci3 implements we7 {
    public final byte a;
    public final nk3 b;

    public ci3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void a(int i) {
        byte b = this.a;
        boolean z = true;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    z = false;
                }
                nk3Var.W1 = z;
                oc7.e1().edit().putBoolean("askAboutContacts", nk3Var.W1).commit();
                nk3Var.C2(false);
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                nk3Var.W1 = z;
                oc7.e1().edit().putBoolean("askAboutContacts", nk3Var.W1).apply();
                nk3Var.C2(false);
                return;
        }
    }
}
