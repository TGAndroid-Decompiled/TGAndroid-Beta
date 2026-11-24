package defpackage;
public final class nm1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final vs9 c;
    public final String d;

    public nm1(yv1 yv1Var, vs9 vs9Var, String str, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = vs9Var;
        this.d = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.d;
        vs9 vs9Var = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131746068, null)).j();
                return;
            case 1:
                yv1Var.getClass();
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131742884, null)).j();
                return;
            case 2:
                vs9Var.dismiss();
                gm.g("@".concat(str));
                c41.b0(yv1Var).i(jb6.M0(2131743352, null)).j();
                return;
            default:
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131752506, null)).j();
                return;
        }
    }
}
