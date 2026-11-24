package defpackage;
public final class cb4 implements Runnable {
    public final byte a;
    public final lb4 b;
    public final int c;

    public cb4(lb4 lb4Var, int i, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                lb4Var.F0.add(Integer.valueOf(i));
                return;
            case 1:
                lb4Var.F0.remove(Integer.valueOf(i));
                return;
            case 2:
                lb4Var.F0.remove(Integer.valueOf(i));
                return;
            default:
                zb4 zb4Var = lb4Var.g0;
                if (zb4Var != null) {
                    zb4Var.b(lb4Var, i);
                }
                lb4Var.g();
                return;
        }
    }
}
