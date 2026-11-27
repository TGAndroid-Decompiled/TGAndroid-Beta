package defpackage;
public final class mm1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final mu9 c;
    public final String d;

    public mm1(zu1 zu1Var, mu9 mu9Var, String str, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = mu9Var;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        mu9 mu9Var = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131746062, null)).j();
                return;
            case 1:
                zu1Var.getClass();
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131742852, null)).j();
                return;
            case 2:
                mu9Var.dismiss();
                hl.g(str);
                d31.b0(zu1Var).i(ob6.M0(2131752534, null)).j();
                return;
            default:
                mu9Var.dismiss();
                hl.g("@".concat(str));
                d31.b0(zu1Var).i(ob6.M0(2131743320, null)).j();
                return;
        }
    }
}
