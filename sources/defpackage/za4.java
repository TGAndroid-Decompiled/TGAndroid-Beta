package defpackage;
public final class za4 implements Runnable {
    public final byte a;
    public final hb4 b;
    public final int c;

    public za4(hb4 hb4Var, int i, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                vb4 vb4Var = hb4Var.g0;
                if (vb4Var != null) {
                    vb4Var.b(hb4Var, i);
                }
                hb4Var.g();
                return;
            case 1:
                hb4Var.F0.add(Integer.valueOf(i));
                return;
            case 2:
                hb4Var.F0.remove(Integer.valueOf(i));
                return;
            default:
                hb4Var.F0.remove(Integer.valueOf(i));
                return;
        }
    }
}
