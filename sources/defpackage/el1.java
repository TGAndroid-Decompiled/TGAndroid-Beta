package defpackage;
public final class el1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final tq9 c;
    public final String d;

    public el1(mu1 mu1Var, tq9 tq9Var, String str, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = tq9Var;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        tq9 tq9Var = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131746142, null)).j();
                return;
            case 1:
                mu1Var.getClass();
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131742958, null)).j();
                return;
            case 2:
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131752541, null)).j();
                return;
            default:
                tq9Var.dismiss();
                gl.g("@".concat(str));
                u21.b0(mu1Var).i(k96.M0(2131743426, null)).j();
                return;
        }
    }
}
