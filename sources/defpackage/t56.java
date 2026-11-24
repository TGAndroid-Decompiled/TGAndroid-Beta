package defpackage;
public final class t56 implements Runnable {
    public final byte a;
    public final a66 b;
    public final String c;

    public t56(a66 a66Var, String str, byte b) {
        this.a = b;
        this.b = a66Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        a66 a66Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    a66Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a66Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    a66Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    a66Var.x("fingerprintRow");
                    return;
                }
                return;
            case 1:
                a66Var.w(str);
                return;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    a66Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    a66Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    a66Var.x("emailRow");
                    return;
                }
                return;
            default:
                if (a66Var.a()) {
                    a66Var.w(str);
                    return;
                }
                return;
        }
    }
}
