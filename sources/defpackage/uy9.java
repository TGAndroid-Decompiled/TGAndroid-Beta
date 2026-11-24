package defpackage;
public final class uy9 implements Runnable {
    public final byte a;
    public final zy9 b;

    public uy9(zy9 zy9Var, byte b) {
        this.a = b;
        this.b = zy9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zy9 zy9Var = this.b;
        switch (b) {
            case 0:
                zy9Var.d1(true);
                return;
            case 1:
                zy9Var.i1(true, false);
                return;
            case 2:
                zy9Var.Y0();
                return;
            case 3:
                zy9Var.i1(true, false);
                return;
            case 4:
                zy9Var.i1(true, false);
                return;
            case 5:
                zy9Var.i1(true, false);
                return;
            case 6:
                zy9Var.Z1.clear();
                zy9Var.a2.clear();
                zy9Var.dismiss();
                return;
            default:
                zy9Var.dismiss();
                return;
        }
    }
}
