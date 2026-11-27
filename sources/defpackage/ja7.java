package defpackage;
public final class ja7 implements Runnable {
    public final byte a;
    public final pt2 b;
    public final int c;

    public ja7(pt2 pt2Var, int i, byte b) {
        this.a = b;
        this.b = pt2Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pt2 pt2Var = this.b;
        switch (b) {
            case 0:
                pt2Var.accept(Integer.valueOf(i));
                return;
            default:
                pt2Var.accept(Integer.valueOf(i));
                return;
        }
    }
}
