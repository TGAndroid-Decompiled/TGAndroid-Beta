package defpackage;
public final class c94 implements Runnable {
    public final byte a;
    public final l94 b;
    public final int c;

    public c94(l94 l94Var, int i, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                l94Var.F0.add(Integer.valueOf(i));
                return;
            case 1:
                l94Var.F0.remove(Integer.valueOf(i));
                return;
            case 2:
                l94Var.F0.remove(Integer.valueOf(i));
                return;
            default:
                z94 z94Var = l94Var.g0;
                if (z94Var != null) {
                    z94Var.b(l94Var, i);
                }
                l94Var.g();
                return;
        }
    }
}
