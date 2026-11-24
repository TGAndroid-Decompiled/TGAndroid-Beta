package defpackage;
public final class t36 implements Runnable {
    public final byte a;
    public final a46 b;
    public final String c;

    public t36(a46 a46Var, String str, byte b) {
        this.a = b;
        this.b = a46Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    a46Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a46Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    a46Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    a46Var.x("fingerprintRow");
                    return;
                }
                return;
            case 1:
                a46Var.w(str);
                return;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    a46Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a46Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    a46Var.x("emailRow");
                    return;
                }
                return;
            default:
                if (a46Var.a()) {
                    a46Var.w(str);
                    return;
                }
                return;
        }
    }
}
