package defpackage;
public final class w56 implements Runnable {
    public final byte a;
    public final e66 b;
    public final String c;

    public w56(e66 e66Var, String str, byte b) {
        this.a = b;
        this.b = e66Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                if ("disable".equalsIgnoreCase(str)) {
                    e66Var.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    e66Var.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str)) {
                    e66Var.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str)) {
                    e66Var.x("fingerprintRow");
                    return;
                }
                return;
            case 1:
                e66Var.w(str);
                return;
            case 2:
                if ("disable".equalsIgnoreCase(str)) {
                    e66Var.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    e66Var.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    e66Var.x("emailRow");
                    return;
                }
                return;
            default:
                if (e66Var.a()) {
                    e66Var.w(str);
                    return;
                }
                return;
        }
    }
}
