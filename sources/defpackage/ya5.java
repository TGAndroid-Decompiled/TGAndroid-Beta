package defpackage;
public final class ya5 implements Runnable {
    public final byte a;
    public final za5 b;

    public ya5(za5 za5Var, byte b) {
        this.a = b;
        this.b = za5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        za5 za5Var = this.b;
        switch (b) {
            case 0:
                int width = za5Var.getWidth();
                int height = za5Var.getHeight();
                if (za5Var.w && !za5Var.y && width > 0 && height > 0 && !za5Var.a.isEmpty() && za5Var.F > 0.0f && za5Var.b() && Math.abs(Math.log((width / height) / za5Var.F)) > 0.06d) {
                    za5Var.f(true);
                    return;
                }
                return;
            default:
                if (za5Var.y) {
                    za5Var.g();
                    za5Var.post(new ya5(za5Var, (byte) 0));
                    return;
                }
                return;
        }
    }
}
